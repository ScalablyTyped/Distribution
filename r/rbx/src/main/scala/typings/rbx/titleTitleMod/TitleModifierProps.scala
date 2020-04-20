package typings.rbx.titleTitleMod

import typings.rbx.rbxNumbers.`1`
import typings.rbx.rbxNumbers.`2`
import typings.rbx.rbxNumbers.`3`
import typings.rbx.rbxNumbers.`4`
import typings.rbx.rbxNumbers.`5`
import typings.rbx.rbxNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleModifierProps extends js.Object {
  var size: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  var spaced: js.UndefOr[Boolean] = js.undefined
  var subtitle: js.UndefOr[Boolean] = js.undefined
}

object TitleModifierProps {
  @scala.inline
  def apply(
    size: `1` | `2` | `3` | `4` | `5` | `6` = null,
    spaced: js.UndefOr[Boolean] = js.undefined,
    subtitle: js.UndefOr[Boolean] = js.undefined
  ): TitleModifierProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spaced)) __obj.updateDynamic("spaced")(spaced.asInstanceOf[js.Any])
    if (!js.isUndefined(subtitle)) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleModifierProps]
  }
}

