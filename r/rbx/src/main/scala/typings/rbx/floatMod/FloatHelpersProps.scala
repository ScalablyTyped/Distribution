package typings.rbx.floatMod

import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatHelpersProps extends js.Object {
  var clearfix: js.UndefOr[Boolean] = js.undefined
  var pull: js.UndefOr[left | right] = js.undefined
}

object FloatHelpersProps {
  @scala.inline
  def apply(clearfix: js.UndefOr[Boolean] = js.undefined, pull: left | right = null): FloatHelpersProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearfix)) __obj.updateDynamic("clearfix")(clearfix.get.asInstanceOf[js.Any])
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatHelpersProps]
  }
}

