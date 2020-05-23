package typings.std

import typings.std.stdStrings.updatefound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This ServiceWorker API interface represents the service worker registration. You register a service worker to control one or more pages that share the same origin. */
@js.native
trait ServiceWorkerRegistration extends EventTarget {
  val active: ServiceWorker | Null = js.native
  val installing: ServiceWorker | Null = js.native
  val navigationPreload: NavigationPreloadManager = js.native
  var onupdatefound: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  val pushManager: PushManager = js.native
  val scope: java.lang.String = js.native
  val sync: SyncManager = js.native
  val updateViaCache: ServiceWorkerUpdateViaCache = js.native
  val waiting: ServiceWorker | Null = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(`type`: updatefound, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def getNotifications(): js.Promise[js.Array[Notification]] = js.native
  def getNotifications(filter: GetNotificationOptions): js.Promise[js.Array[Notification]] = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(`type`: updatefound, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  def showNotification(title: java.lang.String): js.Promise[Unit] = js.native
  def showNotification(title: java.lang.String, options: NotificationOptions): js.Promise[Unit] = js.native
  def unregister(): js.Promise[scala.Boolean] = js.native
  def update(): js.Promise[Unit] = js.native
}

