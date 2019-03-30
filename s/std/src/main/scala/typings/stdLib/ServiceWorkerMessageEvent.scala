package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ServiceWorkerMessageEvent interface of the ServiceWorker API contains information about an event sent to a ServiceWorkerContainer target. This extends the default message event to allow setting a ServiceWorker object as the source of a message. The event object is accessed via the handler function of a message event, when fired by a message received from a service worker. */
@js.native
trait ServiceWorkerMessageEvent extends Event {
  val data: js.Any = js.native
  val lastEventId: java.lang.String = js.native
  val origin: java.lang.String = js.native
  val ports: js.Array[MessagePort] | scala.Null = js.native
  val source: ServiceWorker | MessagePort | scala.Null = js.native
}

@JSGlobal("ServiceWorkerMessageEvent")
@js.native
class ServiceWorkerMessageEventCls protected () extends ServiceWorkerMessageEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: ServiceWorkerMessageEventInit) = this()
}

@JSGlobal("ServiceWorkerMessageEvent")
@js.native
object ServiceWorkerMessageEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, ServiceWorkerMessageEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ ServiceWorkerMessageEventInit, 
      ServiceWorkerMessageEvent
    ]

