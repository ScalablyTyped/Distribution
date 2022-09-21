package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A CloseEvent is sent to clients using WebSockets when the connection is closed. This is delivered to the listener indicated by the WebSocket object's onclose attribute. */
@js.native
trait CloseEvent
  extends StObject
     with Event {
  
  /** Returns the WebSocket connection close code provided by the server. */
  /* standard dom */
  val code: Double = js.native
  
  /** Returns the WebSocket connection close reason provided by the server. */
  /* standard dom */
  val reason: java.lang.String = js.native
  
  /** Returns true if the connection closed cleanly; false otherwise. */
  /* standard dom */
  val wasClean: scala.Boolean = js.native
}
