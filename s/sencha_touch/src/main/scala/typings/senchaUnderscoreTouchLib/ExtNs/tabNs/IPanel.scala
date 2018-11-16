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

