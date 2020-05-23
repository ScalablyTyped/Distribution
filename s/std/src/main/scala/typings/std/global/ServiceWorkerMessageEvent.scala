package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.ServiceWorkerMessageEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ServiceWorkerMessageEvent")
@js.native
class ServiceWorkerMessageEvent protected ()
  extends typings.std.ServiceWorkerMessageEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: ServiceWorkerMessageEventInit) = this()
}

@JSGlobal("ServiceWorkerMessageEvent")
@js.native
object ServiceWorkerMessageEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.ServiceWorkerMessageEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ ServiceWorkerMessageEventInit, 
      typings.std.ServiceWorkerMessageEvent
    ]

