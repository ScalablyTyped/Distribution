package typings.reactDashNavigation.reactDashNavigationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationScreenConfigProps extends js.Object {
  var navigation: NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  var screenProps: StringDictionary[js.Any]
}

object NavigationScreenConfigProps {
  @scala.inline
  def apply(
    navigation: NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams],
    screenProps: StringDictionary[js.Any]
  ): NavigationScreenConfigProps = {
    val __obj = js.Dynamic.literal(navigation = navigation, screenProps = screenProps)
  
    __obj.asInstanceOf[NavigationScreenConfigProps]
  }
}

