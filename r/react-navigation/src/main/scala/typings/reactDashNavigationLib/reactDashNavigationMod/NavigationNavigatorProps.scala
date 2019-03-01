package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationNavigatorProps[O, S] extends js.Object {
  var detached: js.UndefOr[scala.Boolean] = js.undefined
  var navigation: js.UndefOr[NavigationProp[S]] = js.undefined
  var navigationOptions: js.UndefOr[O] = js.undefined
  var screenProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object NavigationNavigatorProps {
  @scala.inline
  def apply[O, S](
    detached: js.UndefOr[scala.Boolean] = js.undefined,
    navigation: NavigationProp[S] = null,
    navigationOptions: O = null,
    screenProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): NavigationNavigatorProps[O, S] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (navigation != null) __obj.updateDynamic("navigation")(navigation)
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps)
    __obj.asInstanceOf[NavigationNavigatorProps[O, S]]
  }
}

