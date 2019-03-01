package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationScreenConfigProps extends js.Object {
  var navigation: NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  var screenProps: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object NavigationScreenConfigProps {
  @scala.inline
  def apply(
    navigation: NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams],
    screenProps: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): NavigationScreenConfigProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("navigation")(navigation)
    __obj.updateDynamic("screenProps")(screenProps)
    __obj.asInstanceOf[NavigationScreenConfigProps]
  }
}

