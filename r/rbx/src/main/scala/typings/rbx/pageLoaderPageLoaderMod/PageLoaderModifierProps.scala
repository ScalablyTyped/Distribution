package typings.rbx.pageLoaderPageLoaderMod

import typings.rbx.rbxStrings.`left-to-right`
import typings.rbx.rbxStrings.`right-to-left`
import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageLoaderModifierProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.undefined
  var direction: js.UndefOr[`right-to-left` | `left-to-right`] = js.undefined
}

object PageLoaderModifierProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    color: primary | success | info | warning | danger | light | dark | white | black | link = null,
    direction: `right-to-left` | `left-to-right` = null
  ): PageLoaderModifierProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageLoaderModifierProps]
  }
}

