package typings.rbx.columnMod

import typings.rbx.rbxNumbers.`0`
import typings.rbx.rbxNumbers.`10`
import typings.rbx.rbxNumbers.`11`
import typings.rbx.rbxNumbers.`12`
import typings.rbx.rbxNumbers.`1`
import typings.rbx.rbxNumbers.`2`
import typings.rbx.rbxNumbers.`3`
import typings.rbx.rbxNumbers.`4`
import typings.rbx.rbxNumbers.`5`
import typings.rbx.rbxNumbers.`6`
import typings.rbx.rbxNumbers.`7`
import typings.rbx.rbxNumbers.`8`
import typings.rbx.rbxNumbers.`9`
import typings.rbx.rbxStrings.`four-fifths`
import typings.rbx.rbxStrings.`one-fifth`
import typings.rbx.rbxStrings.`one-quarter`
import typings.rbx.rbxStrings.`one-third`
import typings.rbx.rbxStrings.`three-fifths`
import typings.rbx.rbxStrings.`three-quarters`
import typings.rbx.rbxStrings.`two-fifths`
import typings.rbx.rbxStrings.`two-thirds`
import typings.rbx.rbxStrings.full
import typings.rbx.rbxStrings.half
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnModifierProps extends js.Object {
  var desktop: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  var fullhd: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  var mobile: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  var narrow: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[
    `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
  ] = js.undefined
  var size: js.UndefOr[
    `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full
  ] = js.undefined
  var tablet: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  var touch: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  var widescreen: js.UndefOr[ColumnBreakpointOptions] = js.undefined
}

object ColumnModifierProps {
  @scala.inline
  def apply(
    desktop: ColumnBreakpointOptions = null,
    fullhd: ColumnBreakpointOptions = null,
    mobile: ColumnBreakpointOptions = null,
    narrow: js.UndefOr[Boolean] = js.undefined,
    offset: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full = null,
    size: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `one-third` | `two-thirds` | `one-quarter` | half | `three-quarters` | `one-fifth` | `two-fifths` | `three-fifths` | `four-fifths` | full = null,
    tablet: ColumnBreakpointOptions = null,
    touch: ColumnBreakpointOptions = null,
    widescreen: ColumnBreakpointOptions = null
  ): ColumnModifierProps = {
    val __obj = js.Dynamic.literal()
    if (desktop != null) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (fullhd != null) __obj.updateDynamic("fullhd")(fullhd.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (!js.isUndefined(narrow)) __obj.updateDynamic("narrow")(narrow.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tablet != null) __obj.updateDynamic("tablet")(tablet.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (widescreen != null) __obj.updateDynamic("widescreen")(widescreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnModifierProps]
  }
}

