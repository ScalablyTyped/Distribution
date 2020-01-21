package typings.senchaTouch.Ext.tab

import typings.senchaTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanel extends IContainer {
  /** [Method] Updates this container with the new active item
  		* @param tabBar Object
  		* @param newTab Object
  		* @returns Boolean
  		*/
  var doTabChange: js.UndefOr[
    js.Function2[/* tabBar */ js.UndefOr[js.Any], /* newTab */ js.UndefOr[js.Any], Boolean]
  ] = js.undefined
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  @JSName("getCls")
  var getCls_IPanel: js.UndefOr[js.Function0[String]] = js.undefined
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
  var getTabBarPosition: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  @JSName("setCls")
  var setCls_IPanel: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of tabBar
  		* @param tabBar Object The new value.
  		*/
  var setTabBar: js.UndefOr[js.Function1[/* tabBar */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of tabBarPosition
  		* @param tabBarPosition String The new value.
  		*/
  var setTabBarPosition: js.UndefOr[js.Function1[/* tabBarPosition */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (Object) */
  var tabBar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var tabBarDock: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var tabBarPosition: js.UndefOr[String] = js.undefined
  /** [Method] Updates the Ui for this component and the tabBar
  		* @param newUi Object
  		* @param oldUi Object
  		*/
  var updateUi: js.UndefOr[
    js.Function2[/* newUi */ js.UndefOr[js.Any], /* oldUi */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
}

object IPanel {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    doTabChange: (/* tabBar */ js.UndefOr[js.Any], /* newTab */ js.UndefOr[js.Any]) => Boolean = null,
    getCls: () => String = null,
    getLayout: () => _ = null,
    getTabBar: () => _ = null,
    getTabBarPosition: () => String = null,
    setCls: /* cls */ js.UndefOr[String] => Unit = null,
    setTabBar: /* tabBar */ js.UndefOr[js.Any] => Unit = null,
    setTabBarPosition: /* tabBarPosition */ js.UndefOr[String] => Unit = null,
    tabBar: js.Any = null,
    tabBarDock: js.UndefOr[Boolean] = js.undefined,
    tabBarPosition: String = null,
    updateUi: (/* newUi */ js.UndefOr[js.Any], /* oldUi */ js.UndefOr[js.Any]) => Unit = null
  ): IPanel = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (doTabChange != null) __obj.updateDynamic("doTabChange")(js.Any.fromFunction2(doTabChange))
    if (getCls != null) __obj.updateDynamic("getCls")(js.Any.fromFunction0(getCls))
    if (getLayout != null) __obj.updateDynamic("getLayout")(js.Any.fromFunction0(getLayout))
    if (getTabBar != null) __obj.updateDynamic("getTabBar")(js.Any.fromFunction0(getTabBar))
    if (getTabBarPosition != null) __obj.updateDynamic("getTabBarPosition")(js.Any.fromFunction0(getTabBarPosition))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1(setCls))
    if (setTabBar != null) __obj.updateDynamic("setTabBar")(js.Any.fromFunction1(setTabBar))
    if (setTabBarPosition != null) __obj.updateDynamic("setTabBarPosition")(js.Any.fromFunction1(setTabBarPosition))
    if (tabBar != null) __obj.updateDynamic("tabBar")(tabBar.asInstanceOf[js.Any])
    if (!js.isUndefined(tabBarDock)) __obj.updateDynamic("tabBarDock")(tabBarDock.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (updateUi != null) __obj.updateDynamic("updateUi")(js.Any.fromFunction2(updateUi))
    __obj.asInstanceOf[IPanel]
  }
}

