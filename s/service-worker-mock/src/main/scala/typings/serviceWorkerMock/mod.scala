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
  
  @scala.inline
  def apply(): WorkerGlobalScope = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[WorkerGlobalScope]
  
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
    @scala.inline
    def snapshot(): Snapshot = js.Dynamic.global.applyDynamic("snapshot")().asInstanceOf[Snapshot]
    
    /**
      * Used to trigger active listeners.
      */
    @scala.inline
    def trigger(
      `type`: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceWorkerGlobalScopeEventMap * / any */ String
    ): js.Promise[Unit] = js.Dynamic.global.applyDynamic("trigger")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def trigger_fetch(name: fetch, request: String): js.Promise[Unit] = (js.Dynamic.global.applyDynamic("trigger")(name.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def trigger_fetch(name: fetch, request: Request): js.Promise[Unit] = (js.Dynamic.global.applyDynamic("trigger")(name.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def trigger_message(name: message, args: PartialMessageEventany): js.Promise[Unit] = (js.Dynamic.global.applyDynamic("trigger")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def trigger_notificationclick(name: notificationclick, args: Notification): js.Promise[Unit] = (js.Dynamic.global.applyDynamic("trigger")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def trigger_notificationclose(name: notificationclose, args: Notification): js.Promise[Unit] = (js.Dynamic.global.applyDynamic("trigger")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @scala.inline
    def trigger_push(
      name: push,
      args: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PushEvent */ js.Any
        ]
    ): js.Promise[Unit] = (js.Dynamic.global.applyDynamic("trigger")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    trait WorkerGlobalScope extends StObject {
      
      var listeners: Listeners
      
      def snapshot(): Snapshot
      @JSName("snapshot")
      var snapshot_Original: js.Function0[Snapshot]
      
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
      def trigger_notificationclick(name: notificationclick, args: Notification): js.Promise[Unit]
      @JSName("trigger")
      def trigger_notificationclose(name: notificationclose, args: Notification): js.Promise[Unit]
      @JSName("trigger")
      def trigger_push(
        name: push,
        args: Partial[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PushEvent */ js.Any
            ]
      ): js.Promise[Unit]
    }
    object WorkerGlobalScope {
      
      @scala.inline
      def apply(listeners: Listeners, snapshot: () => Snapshot, trigger: FnCall): WorkerGlobalScope = {
        val __obj = js.Dynamic.literal(listeners = listeners.asInstanceOf[js.Any], snapshot = js.Any.fromFunction0(snapshot), trigger = trigger.asInstanceOf[js.Any])
        __obj.asInstanceOf[WorkerGlobalScope]
      }
      
      @scala.inline
      implicit class WorkerGlobalScopeMutableBuilder[Self <: WorkerGlobalScope] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setListeners(value: Listeners): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSnapshot(value: () => Snapshot): Self = StObject.set(x, "snapshot", js.Any.fromFunction0(value))
        
        @scala.inline
        def setTrigger(value: FnCall): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
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
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ js.Any
      ]
    
    /**
      * A list of active notifications.
      */
    var notifications: js.Array[Notification]
  }
  object Snapshot {
    
    @scala.inline
    def apply(
      caches: Caches,
      clients: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ js.Any
        ],
      notifications: js.Array[Notification]
    ): Snapshot = {
      val __obj = js.Dynamic.literal(caches = caches.asInstanceOf[js.Any], clients = clients.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any])
      __obj.asInstanceOf[Snapshot]
    }
    
    @scala.inline
    implicit class SnapshotMutableBuilder[Self <: Snapshot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaches(value: Caches): Self = StObject.set(x, "caches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClients(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ js.Any
            ]
      ): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ js.Any)*
      ): Self = StObject.set(x, "clients", js.Array(value :_*))
      
      @scala.inline
      def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
    }
  }
}
