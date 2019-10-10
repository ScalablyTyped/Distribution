package typings.reactstrap.libDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UncontrolledDropdownProps extends DropdownProps {
  var defaultOpen: js.UndefOr[Boolean] = js.undefined
}

object UncontrolledDropdownProps {
  @scala.inline
  def apply(DropdownProps: DropdownProps = null, defaultOpen: js.UndefOr[Boolean] = js.undefined): UncontrolledDropdownProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, DropdownProps)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    __obj.asInstanceOf[UncontrolledDropdownProps]
  }
}

