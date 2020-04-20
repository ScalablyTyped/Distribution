package typings.rmcAlign

import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled extends js.Object {
  var disabled: Boolean
  var monitorBufferTime: Double
  var monitorWindowResize: Boolean
  def onAlign(): Unit
  def target(): Window_
}

object AnonDisabled {
  @scala.inline
  def apply(
    disabled: Boolean,
    monitorBufferTime: Double,
    monitorWindowResize: Boolean,
    onAlign: () => Unit,
    target: () => Window_
  ): AnonDisabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], monitorBufferTime = monitorBufferTime.asInstanceOf[js.Any], monitorWindowResize = monitorWindowResize.asInstanceOf[js.Any], onAlign = js.Any.fromFunction0(onAlign), target = js.Any.fromFunction0(target))
    __obj.asInstanceOf[AnonDisabled]
  }
}

