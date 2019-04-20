package typings
package reactDashFoundationLib.componentsThumbnailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashFoundationLib.utilsMod.FlexboxPropTypes because var conflicts: className. Inlined alignX, alignY, selfAlignX, selfAlignY, centerAlign, flexContainer, flexDirRow, flexDirRowRev, flexDirCol, flexDirColRev, flexChild, flexOrder, flexOrderSmall, flexOrderMedium, flexOrderLarge */ trait ThumbnailProps
  extends reactLib.reactMod.ImgHTMLAttributes[stdLib.HTMLImageElement] {
  var alignX: js.UndefOr[reactDashFoundationLib.enumsMod.HorizontalAlignments] = js.undefined
  var alignY: js.UndefOr[reactDashFoundationLib.enumsMod.VerticalAlignments] = js.undefined
  var centerAlign: js.UndefOr[scala.Boolean] = js.undefined
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
  var selfAlignX: js.UndefOr[reactDashFoundationLib.enumsMod.HorizontalAlignments] = js.undefined
  var selfAlignY: js.UndefOr[reactDashFoundationLib.enumsMod.VerticalAlignments] = js.undefined
}

object ThumbnailProps {
  @scala.inline
  def apply(
    FlexboxPropTypes: reactDashFoundationLib.utilsMod.FlexboxPropTypes = null,
    ImgHTMLAttributes: reactLib.reactMod.ImgHTMLAttributes[stdLib.HTMLImageElement] = null
  ): ThumbnailProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, FlexboxPropTypes)
    js.Dynamic.global.Object.assign(__obj, ImgHTMLAttributes)
    __obj.asInstanceOf[ThumbnailProps]
  }
}

