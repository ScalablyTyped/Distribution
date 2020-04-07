package typings.reactNavigationMaterialBottomTabs

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactNavigation.mod.NavigationDescriptor
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationProp
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationScreenProp
import typings.reactNavigationMaterialBottomTabs.materialBottomTabViewMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptors extends js.Object {
  var descriptors: StringDictionary[
    NavigationDescriptor[
      _, 
      Options, 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ]
  var navigation: NavigationProp[_]
  var screenProps: js.UndefOr[js.Any] = js.undefined
  def renderIcon(options: AnonTintColor): ReactNode
}

object AnonDescriptors {
  @scala.inline
  def apply(
    descriptors: StringDictionary[
      NavigationDescriptor[
        _, 
        Options, 
        NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
      ]
    ],
    navigation: NavigationProp[_],
    renderIcon: AnonTintColor => ReactNode,
    screenProps: js.Any = null
  ): AnonDescriptors = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], renderIcon = js.Any.fromFunction1(renderIcon))
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescriptors]
  }
}

