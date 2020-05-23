package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.WebGLContextEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebGLContextEvent")
@js.native
class WebGLContextEvent protected ()
  extends typings.std.WebGLContextEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInit: WebGLContextEventInit) = this()
}

@JSGlobal("WebGLContextEvent")
@js.native
object WebGLContextEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.WebGLContextEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInit */ WebGLContextEventInit, 
      typings.std.WebGLContextEvent
    ]

