package typings.rbx

import typings.rbx.columnMod.ColumnBreakpointOptions
import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDesktop[TAsComponent /* <: ElementType[_] */] extends js.Object {
  var as: js.UndefOr[TAsComponent] = js.undefined
  var desktop: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  var fullhd: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  var mobile: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  var tablet: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  var touch: js.UndefOr[ColumnBreakpointOptions] = js.undefined
  var widescreen: js.UndefOr[ColumnBreakpointOptions] = js.undefined
}

object AnonDesktop {
  @scala.inline
  def apply[TAsComponent /* <: ElementType[_] */](
    as: TAsComponent = null,
    desktop: ColumnBreakpointOptions = null,
    fullhd: ColumnBreakpointOptions = null,
    mobile: ColumnBreakpointOptions = null,
    tablet: ColumnBreakpointOptions = null,
    touch: ColumnBreakpointOptions = null,
    widescreen: ColumnBreakpointOptions = null
  ): AnonDesktop[TAsComponent] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (desktop != null) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (fullhd != null) __obj.updateDynamic("fullhd")(fullhd.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (tablet != null) __obj.updateDynamic("tablet")(tablet.asInstanceOf[js.Any])
    if (touch != null) __obj.updateDynamic("touch")(touch.asInstanceOf[js.Any])
    if (widescreen != null) __obj.updateDynamic("widescreen")(widescreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDesktop[TAsComponent]]
  }
}

