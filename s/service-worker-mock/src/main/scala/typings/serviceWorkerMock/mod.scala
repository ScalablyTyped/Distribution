package typings.serviceWorkerMock

import org.scalablytyped.runtime.StringDictionary
import typings.serviceWorkerMock.anon.FnCall
import typings.serviceWorkerMock.anon.PartialMessageEventany
import typings.serviceWorkerMock.mod.global.WorkerGlobalScope
import typings.serviceWorkerMock.serviceWorkerMockStrings.fetch
import typings.serviceWorkerMock.serviceWorkerMockStrings.message
import typings.serviceWorkerMock.serviceWorkerMockStrings.notificationclick
import typings.serviceWorkerMock.serviceWorkerMockStrings.notificationclose
import typings.serviceWorkerMock.serviceWorkerMockStrings.push
import typings.std.Cache
import typings.std.EventListener
import typings.std.Map
import typings.std.Notification
import typings.std.Partial
import typings.std.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): WorkerGlobalScope = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[WorkerGlobalScope]
  
  @JSImport("service-worker-mock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object global {
    
    /**
      * A key/value map of active listeners (`install`/`activate`/`fetch`/etc).
      */
    @JSGlobal("listeners")
    @js.native
    val listeners: Listeners = js.native
    
    /**
      * Used to generate a snapshot of the service worker internals.
      */
    inline def snapshot(): Snapshot = js.Dynamic.global.applyDynamic("snapshot")().asInstanceOf[Snapshot]
    
    inline def trigger(name: notificationclick | notificationclose, args: Notification): js.Promise[Unit] = (js.Dynamic.global.applyDynamic("trigger")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    /**
      * Used to trigger active listeners.
      */
    inline def trigger(
      `type`: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceWorkerGlobalScopeEventMap * / any */ String
    ): js.Promise[Unit] = js.Dynamic.global.applyDynamic("trigger")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def trigger_fetch(name: fetch, request: String): js.Promise[Unit] = (js.Dynamic.global.applyDynamic("trigger")(name.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def trigger_fetch(name: fetch, request: Request): js.Promise[Unit] = (js.Dynamic.global.applyDynamic("trigger")(name.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def trigger_message(name: message, args: PartialMessageEventany): js.Promise[Unit] = (js.Dynamic.global.applyDynamic("trigger")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def trigger_push(
      name: push,
      args: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PushEvent */ Any
        ]
    ): js.Promise[Unit] = (js.Dynamic.global.applyDynamic("trigger")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    trait WorkerGlobalScope extends StObject {
      
      var listeners: Listeners
      
      def snapshot(): Snapshot
      @JSName("snapshot")
      var snapshot_Original: js.Function0[Snapshot]
      
      def trigger(name: notificationclick | notificationclose, args: Notification): js.Promise[Unit]
      def trigger(
        `type`: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceWorkerGlobalScopeEventMap * / any */ String
      ): js.Promise[Unit]
      @JSName("trigger")
      var trigger_Original: FnCall
      @JSName("trigger")
      def trigger_fetch(name: fetch, request: String): js.Promise[Unit]
      @JSName("trigger")
      def trigger_fetch(name: fetch, request: Request): js.Promise[Unit]
      @JSName("trigger")
      def trigger_message(name: message, args: PartialMessageEventany): js.Promise[Unit]
      @JSName("trigger")
      def trigger_push(
        name: push,
        args: Partial[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PushEvent */ Any
            ]
      ): js.Promise[Unit]
    }
    object WorkerGlobalScope {
      
      inline def apply(listeners: Listeners, snapshot: () => Snapshot, trigger: FnCall): WorkerGlobalScope = {
        val __obj = js.Dynamic.literal(listeners = listeners.asInstanceOf[js.Any], snapshot = js.Any.fromFunction0(snapshot), trigger = trigger.asInstanceOf[js.Any])
        __obj.asInstanceOf[WorkerGlobalScope]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WorkerGlobalScope] (val x: Self) extends AnyVal {
        
        inline def setListeners(value: Listeners): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
        
        inline def setSnapshot(value: () => Snapshot): Self = StObject.set(x, "snapshot", js.Any.fromFunction0(value))
        
        inline def setTrigger(value: FnCall): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      }
    }
  }
  
  type Caches = StringDictionary[Cache]
  
  type Listeners = Map[
    /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceWorkerGlobalScopeEventMap * / any */ String, 
    EventListener
  ]
  
  trait Snapshot extends StObject {
    
    /**
      * A key/value map of current cache contents.
      */
    var caches: Caches
    
    /**
      * A list of active clients.
      */
    var clients: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ Any
      ]
    
    /**
      * A list of active notifications.
      */
    var notifications: js.Array[Notification]
  }
  object Snapshot {
    
    inline def apply(
      caches: Caches,
      clients: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ Any
        ],
      notifications: js.Array[Notification]
    ): Snapshot = {
      val __obj = js.Dynamic.literal(caches = caches.asInstanceOf[js.Any], clients = clients.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any])
      __obj.asInstanceOf[Snapshot]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Snapshot] (val x: Self) extends AnyVal {
      
      inline def setCaches(value: Caches): Self = StObject.set(x, "caches", value.asInstanceOf[js.Any])
      
      inline def setClients(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ Any
            ]
      ): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
      
      inline def setClientsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ Any)*
      ): Self = StObject.set(x, "clients", js.Array(value*))
      
      inline def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value*))
    }
  }
}
