package typings.rmcAlign.anon

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disabled extends js.Object {
  var disabled: Boolean
  var monitorBufferTime: Double
  var monitorWindowResize: Boolean
  def onAlign(): Unit
  def target(): Window
}

object Disabled {
  @scala.inline
  def apply(
    disabled: Boolean,
    monitorBufferTime: Double,
    monitorWindowResize: Boolean,
    onAlign: () => Unit,
    target: () => Window
  ): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], monitorBufferTime = monitorBufferTime.asInstanceOf[js.Any], monitorWindowResize = monitorWindowResize.asInstanceOf[js.Any], onAlign = js.Any.fromFunction0(onAlign), target = js.Any.fromFunction0(target))
    __obj.asInstanceOf[Disabled]
  }
}

