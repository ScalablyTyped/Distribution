package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnModifierProps extends js.Object {
  var desktop: js.UndefOr[ColumnSizeModifierProps] = js.undefined
  var fullhd: js.UndefOr[ColumnSizeModifierProps] = js.undefined
  var mobile: js.UndefOr[ColumnSizeModifierProps] = js.undefined
  var table: js.UndefOr[ColumnSizeModifierProps] = js.undefined
  var widescreen: js.UndefOr[ColumnSizeModifierProps] = js.undefined
}

object ColumnModifierProps {
  @scala.inline
  def apply(
    desktop: ColumnSizeModifierProps = null,
    fullhd: ColumnSizeModifierProps = null,
    mobile: ColumnSizeModifierProps = null,
    table: ColumnSizeModifierProps = null,
    widescreen: ColumnSizeModifierProps = null
  ): ColumnModifierProps = {
    val __obj = js.Dynamic.literal()
    if (desktop != null) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (fullhd != null) __obj.updateDynamic("fullhd")(fullhd.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (widescreen != null) __obj.updateDynamic("widescreen")(widescreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnModifierProps]
  }
}

