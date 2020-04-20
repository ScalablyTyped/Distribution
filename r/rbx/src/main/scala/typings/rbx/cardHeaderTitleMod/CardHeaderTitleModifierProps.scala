package typings.rbx.cardHeaderTitleMod

import typings.rbx.rbxStrings.centered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardHeaderTitleModifierProps extends js.Object {
  var align: js.UndefOr[centered] = js.undefined
}

object CardHeaderTitleModifierProps {
  @scala.inline
  def apply(align: centered = null): CardHeaderTitleModifierProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardHeaderTitleModifierProps]
  }
}

