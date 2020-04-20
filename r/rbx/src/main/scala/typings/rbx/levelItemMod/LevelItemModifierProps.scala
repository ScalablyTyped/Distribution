package typings.rbx.levelItemMod

import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelItemModifierProps extends js.Object {
  var align: js.UndefOr[left | right] = js.undefined
}

object LevelItemModifierProps {
  @scala.inline
  def apply(align: left | right = null): LevelItemModifierProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelItemModifierProps]
  }
}

