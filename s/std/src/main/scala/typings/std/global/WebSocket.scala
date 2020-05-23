package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebSocket")
@js.native
class WebSocket protected ()
  extends typings.std.WebSocket {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, protocols: java.lang.String) = this()
  def this(url: java.lang.String, protocols: js.Array[java.lang.String]) = this()
}

@JSGlobal("WebSocket")
@js.native
object WebSocket
  extends Instantiable1[/* url */ java.lang.String, typings.std.WebSocket]
     with Instantiable2[
      /* url */ java.lang.String, 
      (/* protocols */ js.Array[java.lang.String]) | (/* protocols */ java.lang.String), 
      typings.std.WebSocket
    ] {
  val CLOSED: Double = js.native
  val CLOSING: Double = js.native
  val CONNECTING: Double = js.native
  val OPEN: Double = js.native
}

