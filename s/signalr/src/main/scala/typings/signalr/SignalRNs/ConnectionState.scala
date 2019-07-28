package typings.signalr.SignalRNs

import typings.signalr.signalrNumbers.`0`
import typings.signalr.signalrNumbers.`1`
import typings.signalr.signalrNumbers.`2`
import typings.signalr.signalrNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.signalr.signalrNumbers.`0`
  - typings.signalr.signalrNumbers.`1`
  - typings.signalr.signalrNumbers.`2`
  - typings.signalr.signalrNumbers.`4`
*/
trait ConnectionState extends js.Object

object ConnectionState {
  @scala.inline
  def Connected: `1` = this.cast(1)
  @scala.inline
  def Connecting: `0` = this.cast(0)
  @scala.inline
  def Disconnected: `4` = this.cast(4)
  @scala.inline
  def Reconnecting: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

