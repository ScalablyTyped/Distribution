package typings.rbx.inputMod

import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.color
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.date
import typings.rbx.rbxStrings.email
import typings.rbx.rbxStrings.focused
import typings.rbx.rbxStrings.hovered
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.number
import typings.rbx.rbxStrings.password
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.search
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.success
import typings.rbx.rbxStrings.tel
import typings.rbx.rbxStrings.text
import typings.rbx.rbxStrings.time
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputModifierProps extends js.Object {
  var color: js.UndefOr[
    primary | success | info | warning | danger | light | dark | white | black | link
  ] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var rounded: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
  var state: js.UndefOr[focused | hovered] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[text | email | tel | password | number | search | color | date | time] = js.undefined
}

object InputModifierProps {
  @scala.inline
  def apply(
    color: primary | success | info | warning | danger | light | dark | white | black | link = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    rounded: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large = null,
    state: focused | hovered = null,
    static: js.UndefOr[Boolean] = js.undefined,
    `type`: text | email | tel | password | number | search | color | date | time = null
  ): InputModifierProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputModifierProps]
  }
}

