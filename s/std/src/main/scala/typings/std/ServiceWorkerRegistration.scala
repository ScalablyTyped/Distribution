package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This ServiceWorker API interface represents the service worker registration. You register a service worker to control one or more pages that share the same origin.
  * Available only in secure contexts.
  */
@js.native
trait ServiceWorkerRegistration
  extends StObject
     with EventTarget {
  
  /* standard dom */
  val active: ServiceWorker | Null = js.native
  
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_updatefound")
  def addEventListener(`type`: "updatefound", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_updatefound")
  def addEventListener(
    `type`: "updatefound",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_updatefound")
  def addEventListener(
    `type`: "updatefound",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def getNotifications(): js.Promise[js.Array[Notification]] = js.native
  def getNotifications(filter: GetNotificationOptions): js.Promise[js.Array[Notification]] = js.native
  
  /* standard dom */
  val installing: ServiceWorker | Null = js.native
  
  /* standard dom */
  val navigationPreload: NavigationPreloadManager = js.native
  
  /* standard dom */
  var onupdatefound: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  val pushManager: PushManager = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_updatefound")
  def removeEventListener(`type`: "updatefound", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_updatefound")
  def removeEventListener(
    `type`: "updatefound",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_updatefound")
  def removeEventListener(
    `type`: "updatefound",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val scope: java.lang.String = js.native
  
  /* standard dom */
  def showNotification(title: java.lang.String): js.Promise[Unit] = js.native
  def showNotification(title: java.lang.String, options: NotificationOptions): js.Promise[Unit] = js.native
  
  /* standard dom */
  def unregister(): js.Promise[scala.Boolean] = js.native
  
  /* standard dom */
  def update(): js.Promise[Unit] = js.native
  
  /* standard dom */
  val updateViaCache: ServiceWorkerUpdateViaCache = js.native
  
  /* standard dom */
  val waiting: ServiceWorker | Null = js.native
}
