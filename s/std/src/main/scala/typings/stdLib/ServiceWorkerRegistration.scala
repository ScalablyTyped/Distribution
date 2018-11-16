package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorkerRegistration extends EventTarget {
  val active: ServiceWorker | scala.Null = js.native
  val installing: ServiceWorker | scala.Null = js.native
  val navigationPreload: NavigationPreloadManager = js.native
  var onupdatefound: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  val pushManager: PushManager = js.native
  val scope: java.lang.String = js.native
  val sync: SyncManager = js.native
  val updateViaCache: ServiceWorkerUpdateViaCache = js.native
  val waiting: ServiceWorker | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: stdLib.stdLibStrings.updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: stdLib.stdLibStrings.updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: stdLib.stdLibStrings.updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def getNotifications(): Promise[js.Array[Notification]] = js.native
  def getNotifications(filter: GetNotificationOptions): Promise[js.Array[Notification]] = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: stdLib.stdLibStrings.updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: stdLib.stdLibStrings.updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: stdLib.stdLibStrings.updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def showNotification(title: java.lang.String): Promise[scala.Unit] = js.native
  def showNotification(title: java.lang.String, options: NotificationOptions): Promise[scala.Unit] = js.native
  def unregister(): Promise[scala.Boolean] = js.native
  def update(): Promise[scala.Unit] = js.native
}

@JSGlobal("ServiceWorkerRegistration")
@js.native
object ServiceWorkerRegistration
  extends ScalablyTyped.runtime.Instantiable0[ServiceWorkerRegistration]

