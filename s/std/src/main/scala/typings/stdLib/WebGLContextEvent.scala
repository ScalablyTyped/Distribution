package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLContextEvent extends Event {
  val statusMessage: java.lang.String = js.native
}

@JSGlobal("WebGLContextEvent")
@js.native
class WebGLContextEventCls protected () extends WebGLContextEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInit: WebGLContextEventInit) = this()
}

@JSGlobal("WebGLContextEvent")
@js.native
object WebGLContextEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, WebGLContextEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInit */ WebGLContextEventInit, 
      WebGLContextEvent
    ]

