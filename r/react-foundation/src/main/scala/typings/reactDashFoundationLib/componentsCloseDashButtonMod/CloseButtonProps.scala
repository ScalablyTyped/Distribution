package typings
package reactDashFoundationLib.componentsCloseDashButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashFoundationLib.utilsMod.FlexboxPropTypes because var conflicts: className. Inlined alignX, alignY, selfAlignX, selfAlignY, centerAlign, flexContainer, flexDirRow, flexDirRowRev, flexDirCol, flexDirColRev, flexChild, flexOrder, flexOrderSmall, flexOrderMedium, flexOrderLarge */ trait CloseButtonProps
  extends reactLib.reactMod.ButtonHTMLAttributes[stdLib.HTMLButtonElement] {
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

object CloseButtonProps {
  @scala.inline
  def apply(
    ButtonHTMLAttributes: reactLib.reactMod.ButtonHTMLAttributes[stdLib.HTMLButtonElement] = null,
    FlexboxPropTypes: reactDashFoundationLib.utilsMod.FlexboxPropTypes = null
  ): CloseButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ButtonHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, FlexboxPropTypes)
    __obj.asInstanceOf[CloseButtonProps]
  }
}

