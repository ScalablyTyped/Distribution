package typings.reactstrap.libPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UncontrolledPopoverProps extends PopoverProps {
  var defaultOpen: js.UndefOr[Boolean] = js.undefined
}

object UncontrolledPopoverProps {
  @scala.inline
  def apply(PopoverProps: PopoverProps = null, defaultOpen: js.UndefOr[Boolean] = js.undefined): UncontrolledPopoverProps = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, PopoverProps)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    __obj.asInstanceOf[UncontrolledPopoverProps]
  }
}

