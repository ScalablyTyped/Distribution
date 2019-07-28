package typings.reactDashFoundation.componentsThumbnailMod

import typings.react.reactMod.ImgHTMLAttributes
import typings.reactDashFoundation.enumsMod.ExtendedBreakpoints
import typings.reactDashFoundation.enumsMod.HorizontalAlignments
import typings.reactDashFoundation.enumsMod.SpaceControls
import typings.reactDashFoundation.enumsMod.VerticalAlignments
import typings.reactDashFoundation.utilsMod.FlexboxPropTypes
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.reactDashFoundation.utilsMod.FlexboxPropTypes because var conflicts: className. Inlined alignX, alignY, selfAlignX, selfAlignY, centerAlign, flexContainer, flexDirRow, flexDirRowRev, flexDirCol, flexDirColRev, flexChild, flexOrder, flexOrderSmall, flexOrderMedium, flexOrderLarge */ trait ThumbnailProps extends ImgHTMLAttributes[HTMLImageElement] {
  var alignX: js.UndefOr[HorizontalAlignments] = js.undefined
  var alignY: js.UndefOr[VerticalAlignments] = js.undefined
  var centerAlign: js.UndefOr[Boolean] = js.undefined
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
  var selfAlignX: js.UndefOr[HorizontalAlignments] = js.undefined
  var selfAlignY: js.UndefOr[VerticalAlignments] = js.undefined
}

object ThumbnailProps {
  @scala.inline
  def apply(
    FlexboxPropTypes: FlexboxPropTypes = null,
    ImgHTMLAttributes: ImgHTMLAttributes[HTMLImageElement] = null
  ): ThumbnailProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, FlexboxPropTypes)
    js.Dynamic.global.Object.assign(__obj, ImgHTMLAttributes)
    __obj.asInstanceOf[ThumbnailProps]
  }
}

