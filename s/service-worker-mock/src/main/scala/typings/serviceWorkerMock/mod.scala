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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("service-worker-mock", JSImport.Namespace)
  @js.native
  def apply(): WorkerGlobalScope = js.native
  
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
    @JSGlobal("snapshot")
    @js.native
    def snapshot(): Snapshot = js.native
    
    /**
      * Used to trigger active listeners.
      */
    @JSGlobal("trigger")
    @js.native
    def trigger(
      `type`: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceWorkerGlobalScopeEventMap * / any */ String
    ): js.Promise[Unit] = js.native
    @JSGlobal("trigger")
    @js.native
    def trigger_fetch(name: fetch, request: String): js.Promise[Unit] = js.native
    @JSGlobal("trigger")
    @js.native
    def trigger_fetch(name: fetch, request: Request): js.Promise[Unit] = js.native
    @JSGlobal("trigger")
    @js.native
    def trigger_message(name: message, args: PartialMessageEventany): js.Promise[Unit] = js.native
    @JSGlobal("trigger")
    @js.native
    def trigger_notificationclick(name: notificationclick, args: Notification): js.Promise[Unit] = js.native
    @JSGlobal("trigger")
    @js.native
    def trigger_notificationclose(name: notificationclose, args: Notification): js.Promise[Unit] = js.native
    @JSGlobal("trigger")
    @js.native
    def trigger_push(
      name: push,
      args: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PushEvent */ _
        ]
    ): js.Promise[Unit] = js.native
    
    @js.native
    trait WorkerGlobalScope extends StObject {
      
      var listeners: Listeners = js.native
      
      def snapshot(): Snapshot = js.native
      @JSName("snapshot")
      var snapshot_Original: js.Function0[Snapshot] = js.native
      
      def trigger(
        `type`: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceWorkerGlobalScopeEventMap * / any */ String
      ): js.Promise[Unit] = js.native
      @JSName("trigger")
      var trigger_Original: FnCall = js.native
      @JSName("trigger")
      def trigger_fetch(name: fetch, request: String): js.Promise[Unit] = js.native
      @JSName("trigger")
      def trigger_fetch(name: fetch, request: Request): js.Promise[Unit] = js.native
      @JSName("trigger")
      def trigger_message(name: message, args: PartialMessageEventany): js.Promise[Unit] = js.native
      @JSName("trigger")
      def trigger_notificationclick(name: notificationclick, args: Notification): js.Promise[Unit] = js.native
      @JSName("trigger")
      def trigger_notificationclose(name: notificationclose, args: Notification): js.Promise[Unit] = js.native
      @JSName("trigger")
      def trigger_push(
        name: push,
        args: Partial[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PushEvent */ _
            ]
      ): js.Promise[Unit] = js.native
    }
  }
  
  type Caches = StringDictionary[Cache]
  
  type Listeners = Map[
    /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceWorkerGlobalScopeEventMap * / any */ String, 
    EventListener
  ]
  
  @js.native
  trait Snapshot extends StObject {
    
    /**
      * A key/value map of current cache contents.
      */
    var caches: Caches = js.native
    
    /**
      * A list of active clients.
      */
    var clients: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ _
      ] = js.native
    
    /**
      * A list of active notifications.
      */
    var notifications: js.Array[Notification] = js.native
  }
  object Snapshot {
    
    @scala.inline
    def apply(
      caches: Caches,
      clients: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ _
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
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Client */ _
            ]
      ): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientsVarargs(value: js.Any*): Self = StObject.set(x, "clients", js.Array(value :_*))
      
      @scala.inline
      def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
    }
  }
}
