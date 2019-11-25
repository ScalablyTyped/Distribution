package typings.reactDashNavigationDashMaterialDashBottomDashTabs.libTypescriptSrcNavigatorsCreateMaterialBottomTabNavigatorMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.reactDashNavigation.reactDashNavigationMod.NavigationDescriptor
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationProp
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.Anon_Route
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.libTypescriptSrcTypesMod.NavigationMaterialBottomTabOptions
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.libTypescriptSrcTypesMod.NavigationTabProp
import typings.reactDashNavigationDashMaterialDashBottomDashTabs.libTypescriptSrcTypesMod.NavigationTabState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationViewProps extends js.Object {
  var descriptors: StringDictionary[
    NavigationDescriptor[
      NavigationParams, 
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ]
  var navigation: NavigationProp[NavigationTabState]
  var navigationConfig: js.Any
  var screenProps: js.UndefOr[js.Any] = js.undefined
  def getAccessibilityLabel(props: Anon_Route): js.UndefOr[String]
  def getLabelText(props: Anon_Route): js.UndefOr[String]
  def getTestID(props: Anon_Route): js.UndefOr[String]
  def onIndexChange(index: Double): Unit
  def onTabPress(props: Anon_Route): Unit
  def renderIcon(props: RenderIconProps): ReactNode
  def renderScene(props: Anon_Route): ReactNode
}

object NavigationViewProps {
  @scala.inline
  def apply(
    descriptors: StringDictionary[
      NavigationDescriptor[
        NavigationParams, 
        NavigationMaterialBottomTabOptions, 
        NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
      ]
    ],
    getAccessibilityLabel: Anon_Route => js.UndefOr[String],
    getLabelText: Anon_Route => js.UndefOr[String],
    getTestID: Anon_Route => js.UndefOr[String],
    navigation: NavigationProp[NavigationTabState],
    navigationConfig: js.Any,
    onIndexChange: Double => Unit,
    onTabPress: Anon_Route => Unit,
    renderIcon: RenderIconProps => ReactNode,
    renderScene: Anon_Route => ReactNode,
    screenProps: js.Any = null
  ): NavigationViewProps = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], getAccessibilityLabel = js.Any.fromFunction1(getAccessibilityLabel), getLabelText = js.Any.fromFunction1(getLabelText), getTestID = js.Any.fromFunction1(getTestID), navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), onTabPress = js.Any.fromFunction1(onTabPress), renderIcon = js.Any.fromFunction1(renderIcon), renderScene = js.Any.fromFunction1(renderScene))
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationViewProps]
  }
}

