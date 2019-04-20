package typings
package reactDashFoundationLib.componentsProgressDashBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashFoundationLib.utilsMod.FlexboxPropTypes because var conflicts: className. Inlined alignX, alignY, selfAlignX, selfAlignY, centerAlign, flexContainer, flexDirRow, flexDirRowRev, flexDirCol, flexDirColRev, flexChild, flexOrder, flexOrderSmall, flexOrderMedium, flexOrderLarge */ trait NativeProgressProps
  extends reactLib.reactMod.ProgressHTMLAttributes[stdLib.HTMLProgressElement] {
  var alignX: js.UndefOr[reactDashFoundationLib.enumsMod.HorizontalAlignments] = js.undefined
  var alignY: js.UndefOr[reactDashFoundationLib.enumsMod.VerticalAlignments] = js.undefined
  var centerAlign: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("color")
  var color_NativeProgressProps: js.UndefOr[reactDashFoundationLib.enumsMod.ProgressColors] = js.undefined
  var flexChild: js.UndefOr[reactDashFoundationLib.enumsMod.SpaceControls] = js.undefined
  var flexContainer: js.UndefOr[scala.Boolean] = js.undefined
  var flexDirCol: js.UndefOr[reactDashFoundationLib.enumsMod.ExtendedBreakpoints] = js.undefined
  var flexDirColRev: js.UndefOr[reactDashFoundationLib.enumsMod.ExtendedBreakpoints] = js.undefined
  var flexDirRow: js.UndefOr[reactDashFoundationLib.enumsMod.ExtendedBreakpoints] = js.undefined
  var flexDirRowRev: js.UndefOr[reactDashFoundationLib.enumsMod.ExtendedBreakpoints] = js.undefined
  var flexOrder: js.UndefOr[scala.Double] = js.undefined
  var flexOrderLarge: js.UndefOr[scala.Double] = js.undefined
  var flexOrderMedium: js.UndefOr[scala.Double] = js.undefined
  var flexOrderSmall: js.UndefOr[scala.Double] = js.undefined
  @JSName("max")
  var max_NativeProgressProps: js.UndefOr[scala.Double] = js.undefined
  var selfAlignX: js.UndefOr[reactDashFoundationLib.enumsMod.HorizontalAlignments] = js.undefined
  var selfAlignY: js.UndefOr[reactDashFoundationLib.enumsMod.VerticalAlignments] = js.undefined
  @JSName("value")
  var value_NativeProgressProps: js.UndefOr[scala.Double] = js.undefined
}

object NativeProgressProps {
  @scala.inline
  def apply(
    FlexboxPropTypes: reactDashFoundationLib.utilsMod.FlexboxPropTypes = null,
    ProgressHTMLAttributes: reactLib.reactMod.ProgressHTMLAttributes[stdLib.HTMLProgressElement] = null,
    color: reactDashFoundationLib.enumsMod.ProgressColors = null,
    max: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): NativeProgressProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, FlexboxPropTypes)
    js.Dynamic.global.Object.assign(__obj, ProgressHTMLAttributes)
    if (color != null) __obj.updateDynamic("color")(color)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeProgressProps]
  }
}

