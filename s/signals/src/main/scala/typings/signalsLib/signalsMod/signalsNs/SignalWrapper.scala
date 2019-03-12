package typings
package signalsLib.signalsMod.signalsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalWrapper[T] extends js.Object {
  var Signal: signalsLib.signalsMod.signalsNs.Signal[T]
}

object SignalWrapper {
  @scala.inline
  def apply[T](Signal: Signal[T]): SignalWrapper[T] = {
    val __obj = js.Dynamic.literal(Signal = Signal)
  
    __obj.asInstanceOf[SignalWrapper[T]]
  }
}

