package typings.reactDashNavigation

import typings.reactDashNavigation.reactDashNavigationMod.SupportedThemes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.NavigationScreenConfigProps<NavigationScreenPropType, ScreenProps> & {  navigationOptions  :Options} */
trait NavigationScreenConfigPropsNavigationScreenPropTyp[NavigationScreenPropType, ScreenProps, Options] extends js.Object {
  var navigation: NavigationScreenPropType
  var navigationOptions: Options
  var screenProps: ScreenProps
  var theme: SupportedThemes
}

object NavigationScreenConfigPropsNavigationScreenPropTyp {
  @scala.inline
  def apply[NavigationScreenPropType, ScreenProps, Options](
    navigation: NavigationScreenPropType,
    navigationOptions: Options,
    screenProps: ScreenProps,
    theme: SupportedThemes
  ): NavigationScreenConfigPropsNavigationScreenPropTyp[NavigationScreenPropType, ScreenProps, Options] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], navigationOptions = navigationOptions.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigationScreenConfigPropsNavigationScreenPropTyp[NavigationScreenPropType, ScreenProps, Options]]
  }
}

