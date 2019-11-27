package typings.reactDashNavigation

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNavigation.reactDashNavigationMod.NavigationDescriptor
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  descriptors  :{[key: string] : react-navigation.react-navigation.NavigationDescriptor<react-navigation.react-navigation.NavigationParams, {}, react-navigation.react-navigation.NavigationScreenProp<react-navigation.react-navigation.NavigationRoute<react-navigation.react-navigation.NavigationParams>, react-navigation.react-navigation.NavigationParams>>},   navigationConfig  :Options,   screenProps ? :ScreenProps} & react-navigation.react-navigation.NavigationInjectedProps<react-navigation.react-navigation.NavigationParams> */
trait descriptorskeystringNavigationDescriptorNavigation[Options, ScreenProps] extends js.Object {
  var descriptors: StringDictionary[
    NavigationDescriptor[
      NavigationParams, 
      js.Object, 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ]
  var navigation: NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
  var navigationConfig: Options
  var screenProps: js.UndefOr[ScreenProps] = js.undefined
}

object descriptorskeystringNavigationDescriptorNavigation {
  @scala.inline
  def apply[Options, ScreenProps](
    descriptors: StringDictionary[
      NavigationDescriptor[
        NavigationParams, 
        js.Object, 
        NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
      ]
    ],
    navigation: NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams],
    navigationConfig: Options,
    screenProps: ScreenProps = null
  ): descriptorskeystringNavigationDescriptorNavigation[Options, ScreenProps] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[descriptorskeystringNavigationDescriptorNavigation[Options, ScreenProps]]
  }
}

