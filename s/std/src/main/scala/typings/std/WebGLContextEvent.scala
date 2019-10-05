package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The WebContextEvent interface is part of the WebGL API and is an interface for an event that is generated in response to a status change to the WebGL rendering context. */
@js.native
trait WebGLContextEvent extends Event {
  val statusMessage: java.lang.String = js.native
}

@JSGlobal("WebGLContextEvent")
@js.native
object WebGLContextEvent
  extends Instantiable1[/* type */ java.lang.String, WebGLContextEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInit */ WebGLContextEventInit, 
      WebGLContextEvent
    ]

