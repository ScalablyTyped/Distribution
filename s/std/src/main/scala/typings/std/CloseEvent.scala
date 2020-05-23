package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A CloseEvent is sent to clients using WebSockets when the connection is closed. This is delivered to the listener indicated by the WebSocket object's onclose attribute. */
@js.native
trait CloseEvent extends Event {
  /**
    * Returns the WebSocket connection close code provided by the server.
    */
  val code: Double = js.native
  /**
    * Returns the WebSocket connection close reason provided by the server.
    */
  val reason: java.lang.String = js.native
  /**
    * Returns true if the connection closed cleanly; false otherwise.
    */
  val wasClean: scala.Boolean = js.native
}

