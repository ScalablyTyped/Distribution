package typings
package signalrLib.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectionState extends js.Object

@JSGlobal("SignalR.ConnectionState")
@js.native
object ConnectionState extends js.Object {
  @js.native
  sealed trait Connected
    extends signalrLib.SignalRNs.ConnectionState
  
  @js.native
  sealed trait Connecting
    extends signalrLib.SignalRNs.ConnectionState
  
  @js.native
  sealed trait Disconnected
    extends signalrLib.SignalRNs.ConnectionState
  
  @js.native
  sealed trait Reconnecting
    extends signalrLib.SignalRNs.ConnectionState
  
  /* 1 */ val Connected: Connected with scala.Double = js.native
  /* 0 */ val Connecting: Connecting with scala.Double = js.native
  /* 4 */ val Disconnected: Disconnected with scala.Double = js.native
  /* 2 */ val Reconnecting: Reconnecting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[signalrLib.SignalRNs.ConnectionState with scala.Double] = js.native
}

