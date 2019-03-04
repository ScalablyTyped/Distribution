package typings
package signalrLib.SignalRNs.HubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHub extends js.Object {
  def start(): scala.Unit
}

object IHub {
  @scala.inline
  def apply(start: js.Function0[scala.Unit]): IHub = {
    val __obj = js.Dynamic.literal(start = start)
  
    __obj.asInstanceOf[IHub]
  }
}

