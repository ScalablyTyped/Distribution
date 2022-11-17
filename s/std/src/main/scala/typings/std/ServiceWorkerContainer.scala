package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ServiceWorkerContainer interface of the ServiceWorker API provides an object representing the service worker as an overall unit in the network ecosystem, including facilities to register, unregister and update service workers, and access the state of service workers and their registrations.
  * Available only in secure contexts.
  */
@js.native
trait ServiceWorkerContainer
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_controllerchange")
  def addEventListener(`type`: "controllerchange", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_message")
  def addEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_messageerror")
  def addEventListener(
    `type`: "messageerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_controllerchange")
  def addEventListener(
    `type`: "controllerchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_message")
  def addEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_messageerror")
  def addEventListener(
    `type`: "messageerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_message")
  def addEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_messageerror")
  def addEventListener(
    `type`: "messageerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_controllerchange")
  def addEventListener(
    `type`: "controllerchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val controller: ServiceWorker | Null = js.native
  
  /* standard dom */
  def getRegistration(): js.Promise[js.UndefOr[ServiceWorkerRegistration]] = js.native
  def getRegistration(clientURL: java.lang.String): js.Promise[js.UndefOr[ServiceWorkerRegistration]] = js.native
  def getRegistration(clientURL: URL): js.Promise[js.UndefOr[ServiceWorkerRegistration]] = js.native
  
  /* standard dom */
  def getRegistrations(): js.Promise[js.Array[ServiceWorkerRegistration]] = js.native
  
  /* standard dom */
  var oncontrollerchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]) | Null = js.native
  
  /* standard dom */
  var onmessageerror: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]) | Null = js.native
  
  /* standard dom */
  val ready: js.Promise[ServiceWorkerRegistration] = js.native
  
  /* standard dom */
  def register(scriptURL: java.lang.String): js.Promise[ServiceWorkerRegistration] = js.native
  def register(scriptURL: java.lang.String, options: RegistrationOptions): js.Promise[ServiceWorkerRegistration] = js.native
  def register(scriptURL: URL): js.Promise[ServiceWorkerRegistration] = js.native
  def register(scriptURL: URL, options: RegistrationOptions): js.Promise[ServiceWorkerRegistration] = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_messageerror")
  def removeEventListener(
    `type`: "messageerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_controllerchange")
  def removeEventListener(`type`: "controllerchange", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_message")
  def removeEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_message")
  def removeEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_controllerchange")
  def removeEventListener(
    `type`: "controllerchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_messageerror")
  def removeEventListener(
    `type`: "messageerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_message")
  def removeEventListener(
    `type`: "message",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_messageerror")
  def removeEventListener(
    `type`: "messageerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_controllerchange")
  def removeEventListener(
    `type`: "controllerchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def startMessages(): Unit = js.native
}
