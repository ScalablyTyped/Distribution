package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("WebSocket")
@js.native
class WebSocket protected ()
  extends typings.std.WebSocket {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, protocols: java.lang.String) = this()
  def this(url: java.lang.String, protocols: js.Array[java.lang.String]) = this()
}
object WebSocket {
  
  @JSGlobal("WebSocket.CLOSED")
  @js.native
  val CLOSED: Double = js.native
  
  @JSGlobal("WebSocket.CLOSING")
  @js.native
  val CLOSING: Double = js.native
  
  @JSGlobal("WebSocket.CONNECTING")
  @js.native
  val CONNECTING: Double = js.native
  
  @JSGlobal("WebSocket.OPEN")
  @js.native
  val OPEN: Double = js.native
}
