package typings.std

import typings.std.stdStrings.updatefound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This ServiceWorker API interface represents the service worker registration. You register a service worker to control one or more pages that share the same origin. */
@js.native
trait ServiceWorkerRegistration
  extends StObject
     with EventTarget {
  
  val active: ServiceWorker | Null = js.native
  
  @JSName("addEventListener")
  def addEventListener_updatefound(`type`: updatefound, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  def getNotifications(): js.Promise[js.Array[Notification]] = js.native
  def getNotifications(filter: GetNotificationOptions): js.Promise[js.Array[Notification]] = js.native
  
  val installing: ServiceWorker | Null = js.native
  
  val navigationPreload: NavigationPreloadManager = js.native
  
  var onupdatefound: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  val pushManager: PushManager = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_updatefound(`type`: updatefound, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  val scope: java.lang.String = js.native
  
  def showNotification(title: java.lang.String): js.Promise[Unit] = js.native
  def showNotification(title: java.lang.String, options: NotificationOptions): js.Promise[Unit] = js.native
  
  val sync: SyncManager = js.native
  
  def unregister(): js.Promise[scala.Boolean] = js.native
  
  def update(): js.Promise[Unit] = js.native
  
  val updateViaCache: ServiceWorkerUpdateViaCache = js.native
  
  val waiting: ServiceWorker | Null = js.native
}
