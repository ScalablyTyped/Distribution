package typings.reactNavigationMaterialBottomTabs.typesMod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Omit<react.react.ComponentProps</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BottomNavigation * / any>, 'navigationState' | 'onIndexChange' | 'onTabPress' | 'renderScene' | 'renderLabel' | 'renderIcon' | 'getAccessibilityLabel' | 'getBadge' | 'getColor' | 'getLabelText' | 'getTestID'>> & {  activeColorLight ? :string,   activeColorDark ? :string,   inactiveColorLight ? :string,   inactiveColorDark ? :string,   barStyleLight ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>,   barStyleDark ? :react-native.react-native.StyleProp<react-native.react-native.ViewStyle>} */
trait NavigationMaterialBottomTabConfig extends js.Object {
  var activeColorDark: js.UndefOr[String] = js.undefined
  var activeColorLight: js.UndefOr[String] = js.undefined
  var barStyleDark: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var barStyleLight: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var inactiveColorDark: js.UndefOr[String] = js.undefined
  var inactiveColorLight: js.UndefOr[String] = js.undefined
}

object NavigationMaterialBottomTabConfig {
  @scala.inline
  def apply(
    activeColorDark: String = null,
    activeColorLight: String = null,
    barStyleDark: StyleProp[ViewStyle] = null,
    barStyleLight: StyleProp[ViewStyle] = null,
    inactiveColorDark: String = null,
    inactiveColorLight: String = null
  ): NavigationMaterialBottomTabConfig = {
    val __obj = js.Dynamic.literal()
    if (activeColorDark != null) __obj.updateDynamic("activeColorDark")(activeColorDark.asInstanceOf[js.Any])
    if (activeColorLight != null) __obj.updateDynamic("activeColorLight")(activeColorLight.asInstanceOf[js.Any])
    if (barStyleDark != null) __obj.updateDynamic("barStyleDark")(barStyleDark.asInstanceOf[js.Any])
    if (barStyleLight != null) __obj.updateDynamic("barStyleLight")(barStyleLight.asInstanceOf[js.Any])
    if (inactiveColorDark != null) __obj.updateDynamic("inactiveColorDark")(inactiveColorDark.asInstanceOf[js.Any])
    if (inactiveColorLight != null) __obj.updateDynamic("inactiveColorLight")(inactiveColorLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationMaterialBottomTabConfig]
  }
}

