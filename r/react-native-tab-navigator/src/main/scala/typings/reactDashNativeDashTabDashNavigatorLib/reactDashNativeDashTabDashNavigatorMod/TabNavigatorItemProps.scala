package typings
package reactDashNativeDashTabDashNavigatorLib.reactDashNativeDashTabDashNavigatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabNavigatorItemProps extends js.Object {
  /**
    * Allow font scaling for title
    */
  var allowFontScaling: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Text for Item badge
    */
  var badgeText: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * onPress method for Item
    */
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Returns Item badge
    */
  var renderBadge: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  /**
    * Returns Item icon
    */
  var renderIcon: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  /**
    * Returns selected Item icon
    */
  var renderSelectedIcon: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  /**
    * Return whether the item is selected
    */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Styling for selected Item title
    */
  var selectedTitleStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.TextStyle] = js.undefined
  /**
    * Styling for tab
    */
  var tabStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  /**
    * Item title
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Styling for Item title
    */
  var titleStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.TextStyle] = js.undefined
}

