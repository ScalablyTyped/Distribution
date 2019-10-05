package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A CloseEvent is sent to clients using WebSockets when the connection is closed. This is delivered to the listener indicated by the WebSocket object's onclose attribute. */
@js.native
trait CloseEvent extends Event {
  val code: Double = js.native
  val reason: java.lang.String = js.native
  val wasClean: scala.Boolean = js.native
  /** @deprecated */
  def initCloseEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    wasCleanArg: scala.Boolean,
    codeArg: Double,
    reasonArg: java.lang.String
  ): Unit = js.native
}

@JSGlobal("CloseEvent")
@js.native
object CloseEvent
  extends Instantiable1[/* type */ java.lang.String, CloseEvent]
     with Instantiable2[/* type */ java.lang.String, /* eventInitDict */ CloseEventInit, CloseEvent]

