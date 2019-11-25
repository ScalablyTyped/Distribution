package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps] extends js.Object {
  var navigation: NavigationScreenPropType
  var screenProps: ScreenProps
  var theme: SupportedThemes
}

object NavigationScreenConfigProps {
  @scala.inline
  def apply[NavigationScreenPropType, ScreenProps](navigation: NavigationScreenPropType, screenProps: ScreenProps, theme: SupportedThemes): NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps]]
  }
}

