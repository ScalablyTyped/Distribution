package typings.rcMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonManualRef extends js.Object {
  var manualRef: js.Function0[Unit]
  var onMouseEnter: js.Function0[Unit]
  var onMouseLeave: js.Function0[Unit]
  var onSelect: js.Function0[Unit]
}

object AnonManualRef {
  @scala.inline
  def apply(manualRef: () => Unit, onMouseEnter: () => Unit, onMouseLeave: () => Unit, onSelect: () => Unit): AnonManualRef = {
    val __obj = js.Dynamic.literal(manualRef = js.Any.fromFunction0(manualRef), onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave), onSelect = js.Any.fromFunction0(onSelect))
    __obj.asInstanceOf[AnonManualRef]
  }
}

