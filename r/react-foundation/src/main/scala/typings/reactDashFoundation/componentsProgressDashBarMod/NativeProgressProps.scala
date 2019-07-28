package typings.reactDashFoundation.componentsProgressDashBarMod

import typings.react.reactMod.ProgressHTMLAttributes
import typings.reactDashFoundation.enumsMod.ExtendedBreakpoints
import typings.reactDashFoundation.enumsMod.HorizontalAlignments
import typings.reactDashFoundation.enumsMod.ProgressColors
import typings.reactDashFoundation.enumsMod.SpaceControls
import typings.reactDashFoundation.enumsMod.VerticalAlignments
import typings.reactDashFoundation.utilsMod.FlexboxPropTypes
import typings.std.HTMLProgressElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.reactDashFoundation.utilsMod.FlexboxPropTypes because var conflicts: className. Inlined alignX, alignY, selfAlignX, selfAlignY, centerAlign, flexContainer, flexDirRow, flexDirRowRev, flexDirCol, flexDirColRev, flexChild, flexOrder, flexOrderSmall, flexOrderMedium, flexOrderLarge */ trait NativeProgressProps extends ProgressHTMLAttributes[HTMLProgressElement] {
  var alignX: js.UndefOr[HorizontalAlignments] = js.undefined
  var alignY: js.UndefOr[VerticalAlignments] = js.undefined
  var centerAlign: js.UndefOr[Boolean] = js.undefined
  @JSName("color")
  var color_NativeProgressProps: js.UndefOr[ProgressColors] = js.undefined
  var flexChild: js.UndefOr[SpaceControls] = js.undefined
  var flexContainer: js.UndefOr[Boolean] = js.undefined
  var flexDirCol: js.UndefOr[ExtendedBreakpoints] = js.undefined
  var flexDirColRev: js.UndefOr[ExtendedBreakpoints] = js.undefined
  var flexDirRow: js.UndefOr[ExtendedBreakpoints] = js.undefined
  var flexDirRowRev: js.UndefOr[ExtendedBreakpoints] = js.undefined
  var flexOrder: js.UndefOr[Double] = js.undefined
  var flexOrderLarge: js.UndefOr[Double] = js.undefined
  var flexOrderMedium: js.UndefOr[Double] = js.undefined
  var flexOrderSmall: js.UndefOr[Double] = js.undefined
  @JSName("max")
  var max_NativeProgressProps: js.UndefOr[Double] = js.undefined
  var selfAlignX: js.UndefOr[HorizontalAlignments] = js.undefined
  var selfAlignY: js.UndefOr[VerticalAlignments] = js.undefined
  @JSName("value")
  var value_NativeProgressProps: js.UndefOr[Double] = js.undefined
}

object NativeProgressProps {
  @scala.inline
  def apply(
    FlexboxPropTypes: FlexboxPropTypes = null,
    ProgressHTMLAttributes: ProgressHTMLAttributes[HTMLProgressElement] = null,
    color: ProgressColors = null,
    max: Int | Double = null,
    value: Int | Double = null
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

