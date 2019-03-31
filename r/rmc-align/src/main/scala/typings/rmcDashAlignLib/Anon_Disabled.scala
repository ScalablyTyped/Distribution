package typings
package rmcDashAlignLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var disabled: scala.Boolean
  var monitorBufferTime: scala.Double
  var monitorWindowResize: scala.Boolean
  def onAlign(): scala.Unit
  def target(): stdLib.Window
}

object Anon_Disabled {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    monitorBufferTime: scala.Double,
    monitorWindowResize: scala.Boolean,
    onAlign: () => scala.Unit,
    target: () => stdLib.Window
  ): Anon_Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled, monitorBufferTime = monitorBufferTime, monitorWindowResize = monitorWindowResize, onAlign = js.Any.fromFunction0(onAlign), target = js.Any.fromFunction0(target))
  
    __obj.asInstanceOf[Anon_Disabled]
  }
}

