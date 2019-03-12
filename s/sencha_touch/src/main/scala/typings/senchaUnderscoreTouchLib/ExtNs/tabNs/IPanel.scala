package typings
package senchaUnderscoreTouchLib.ExtNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanel
  extends senchaUnderscoreTouchLib.ExtNs.IContainer {
  /** [Method] Updates this container with the new active item
  		* @param tabBar Object
  		* @param newTab Object
  		* @returns Boolean
  		*/
  var doTabChange: js.UndefOr[
    js.Function2[/* tabBar */ js.UndefOr[js.Any], /* newTab */ js.UndefOr[js.Any], scala.Boolean]
  ] = js.undefined
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_IPanel: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of layout
  		* @returns Object
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of tabBar
  		* @returns Object
  		*/
  var getTabBar: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of tabBarPosition
  		* @returns String
  		*/
  var getTabBarPosition: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_IPanel: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of tabBar
  		* @param tabBar Object The new value.
  		*/
  var setTabBar: js.UndefOr[js.Function1[/* tabBar */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of tabBarPosition
  		* @param tabBarPosition String The new value.
  		*/
  var setTabBarPosition: js.UndefOr[js.Function1[/* tabBarPosition */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var tabBar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var tabBarDock: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var tabBarPosition: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Updates the Ui for this component and the tabBar
  		* @param newUi Object
  		* @param oldUi Object
  		*/
  var updateUi: js.UndefOr[
    js.Function2[/* newUi */ js.UndefOr[js.Any], /* oldUi */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
}

object IPanel {
  @scala.inline
  def apply(
    IContainer: senchaUnderscoreTouchLib.ExtNs.IContainer = null,
    cls: js.Any = null,
    doTabChange: (/* tabBar */ js.UndefOr[js.Any], /* newTab */ js.UndefOr[js.Any]) => scala.Boolean = null,
    getCls: () => java.lang.String = null,
    getLayout: () => _ = null,
    getTabBar: () => _ = null,
    getTabBarPosition: () => java.lang.String = null,
    getUi: () => java.lang.String = null,
    initialize: () => scala.Unit = null,
    layout: js.Any = null,
    setCls: /* cls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setLayout: /* layout */ js.UndefOr[js.Any] => scala.Unit = null,
    setTabBar: /* tabBar */ js.UndefOr[js.Any] => scala.Unit = null,
    setTabBarPosition: /* tabBarPosition */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => scala.Unit = null,
    tabBar: js.Any = null,
    tabBarDock: js.UndefOr[scala.Boolean] = js.undefined,
    tabBarPosition: java.lang.String = null,
    ui: java.lang.String = null,
    updateUi: (/* newUi */ js.UndefOr[js.Any], /* oldUi */ js.UndefOr[js.Any]) => scala.Unit = null
  ): IPanel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (doTabChange != null) __obj.updateDynamic("doTabChange")(js.Any.fromFunction2(doTabChange))
    if (getCls != null) __obj.updateDynamic("getCls")(js.Any.fromFunction0(getCls))
    if (getLayout != null) __obj.updateDynamic("getLayout")(js.Any.fromFunction0(getLayout))
    if (getTabBar != null) __obj.updateDynamic("getTabBar")(js.Any.fromFunction0(getTabBar))
    if (getTabBarPosition != null) __obj.updateDynamic("getTabBarPosition")(js.Any.fromFunction0(getTabBarPosition))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1(setCls))
    if (setLayout != null) __obj.updateDynamic("setLayout")(js.Any.fromFunction1(setLayout))
    if (setTabBar != null) __obj.updateDynamic("setTabBar")(js.Any.fromFunction1(setTabBar))
    if (setTabBarPosition != null) __obj.updateDynamic("setTabBarPosition")(js.Any.fromFunction1(setTabBarPosition))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (tabBar != null) __obj.updateDynamic("tabBar")(tabBar)
    if (!js.isUndefined(tabBarDock)) __obj.updateDynamic("tabBarDock")(tabBarDock)
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    if (updateUi != null) __obj.updateDynamic("updateUi")(js.Any.fromFunction2(updateUi))
    __obj.asInstanceOf[IPanel]
  }
}

