package typings
package reactDashMdLib.libHelpersAccessibleFakeButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibleFakeButtonProps
  extends // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var noFocusOutline: js.UndefOr[scala.Boolean] = js.undefined
  var onTabFocus: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var tabbedClassName: js.UndefOr[java.lang.String] = js.undefined
}

object AccessibleFakeButtonProps {
  @scala.inline
  def apply(
    StringDictionary: // for the `component` prop until refactored out
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    component: reactLib.reactMod.ReactNs.ReactType[_] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    noFocusOutline: js.UndefOr[scala.Boolean] = js.undefined,
    onTabFocus: /* event */ stdLib.Event => scala.Unit = null,
    role: java.lang.String = null,
    tabIndex: scala.Int | scala.Double = null,
    tabbedClassName: java.lang.String = null
  ): AccessibleFakeButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(noFocusOutline)) __obj.updateDynamic("noFocusOutline")(noFocusOutline)
    if (onTabFocus != null) __obj.updateDynamic("onTabFocus")(js.Any.fromFunction1(onTabFocus))
    if (role != null) __obj.updateDynamic("role")(role)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tabbedClassName != null) __obj.updateDynamic("tabbedClassName")(tabbedClassName)
    __obj.asInstanceOf[AccessibleFakeButtonProps]
  }
}

