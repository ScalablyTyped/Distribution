package typings
package reactDashMdLib.libHelpersAccessibleFakeInkedButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashMdLib.libHelpersAccessibleFakeButtonMod.AccessibleFakeButtonProps because var conflicts: disabled. Inlined noFocusOutline, tabbedClassName, onTabFocus, component, tabIndex, role, children */ trait AccessibleFakeInkedButtonProps
  extends reactDashMdLib.libInksInjectInkMod.InjectedInkProps {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var noFocusOutline: js.UndefOr[scala.Boolean] = js.undefined
  var onTabFocus: js.UndefOr[js.Function1[/* event */ reactLib.Event, scala.Unit]] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var tabbedClassName: js.UndefOr[java.lang.String] = js.undefined
  def blur(): scala.Unit
  def focus(): scala.Unit
}

