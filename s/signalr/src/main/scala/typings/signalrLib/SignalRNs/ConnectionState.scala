package typings
package signalrLib.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - signalrLib.signalrLibNumbers.`0`
  - signalrLib.signalrLibNumbers.`1`
  - signalrLib.signalrLibNumbers.`2`
  - signalrLib.signalrLibNumbers.`4`
*/
trait ConnectionState extends js.Object

object ConnectionState {
  @scala.inline
  def Connected: signalrLib.signalrLibNumbers.`1` = this.cast(1)
  @scala.inline
  def Connecting: signalrLib.signalrLibNumbers.`0` = this.cast(0)
  @scala.inline
  def Disconnected: signalrLib.signalrLibNumbers.`4` = this.cast(4)
  @scala.inline
  def Reconnecting: signalrLib.signalrLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

