package typings.reactDashNative.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.reactDashNative.reactDashNativeMod.NavigatorIOSProps
import typings.reactDashNative.reactDashNativeMod.Route
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavigatorIOS
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashNative.reactDashNativeMod.NavigatorIOS] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNative.reactDashNativeMod.NavigatorIOS].asInstanceOf[String | js.Object]
  def apply(
    initialRoute: Route,
    barTintColor: String = null,
    interactivePopGestureEnabled: js.UndefOr[Boolean] = js.undefined,
    itemWrapperStyle: StyleProp[ViewStyle] = null,
    navigationBarHidden: js.UndefOr[Boolean] = js.undefined,
    shadowHidden: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    tintColor: String = null,
    titleTextColor: String = null,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, typings.reactDashNative.reactDashNativeMod.NavigatorIOS] = {
    val __obj = js.Dynamic.literal(initialRoute = initialRoute)
    if (barTintColor != null) __obj.updateDynamic("barTintColor")(barTintColor)
    if (!js.isUndefined(interactivePopGestureEnabled)) __obj.updateDynamic("interactivePopGestureEnabled")(interactivePopGestureEnabled)
    if (itemWrapperStyle != null) __obj.updateDynamic("itemWrapperStyle")(itemWrapperStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationBarHidden)) __obj.updateDynamic("navigationBarHidden")(navigationBarHidden)
    if (!js.isUndefined(shadowHidden)) __obj.updateDynamic("shadowHidden")(shadowHidden)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (titleTextColor != null) __obj.updateDynamic("titleTextColor")(titleTextColor)
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = NavigatorIOSProps
}

