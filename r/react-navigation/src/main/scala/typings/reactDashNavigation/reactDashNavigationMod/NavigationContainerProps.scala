package typings.reactDashNavigation.reactDashNavigationMod

import typings.react.reactMod.ComponentType
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationContainerProps[S, O] extends js.Object {
  var navigation: js.UndefOr[NavigationScreenProp[S, NavigationParams]] = js.undefined
  var navigationOptions: js.UndefOr[O] = js.undefined
  var onNavigationStateChange: js.UndefOr[
    js.Function3[
      /* prevNavigationState */ NavigationState, 
      /* nextNavigationState */ NavigationState, 
      /* action */ NavigationAction, 
      js.UndefOr[Unit | Null]
    ]
  ] = js.undefined
  var persistenceKey: js.UndefOr[String | Null] = js.undefined
  var renderLoadingExperimental: js.UndefOr[ComponentType[js.Object]] = js.undefined
  var screenProps: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var uriPrefix: js.UndefOr[String | RegExp] = js.undefined
}

object NavigationContainerProps {
  @scala.inline
  def apply[S, O](
    navigation: NavigationScreenProp[S, NavigationParams] = null,
    navigationOptions: O = null,
    onNavigationStateChange: (/* prevNavigationState */ NavigationState, /* nextNavigationState */ NavigationState, /* action */ NavigationAction) => js.UndefOr[Unit | Null] = null,
    persistenceKey: String = null,
    renderLoadingExperimental: ComponentType[js.Object] = null,
    screenProps: js.Any = null,
    style: StyleProp[ViewStyle] = null,
    uriPrefix: String | RegExp = null
  ): NavigationContainerProps[S, O] = {
    val __obj = js.Dynamic.literal()
    if (navigation != null) __obj.updateDynamic("navigation")(navigation)
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    if (onNavigationStateChange != null) __obj.updateDynamic("onNavigationStateChange")(js.Any.fromFunction3(onNavigationStateChange))
    if (persistenceKey != null) __obj.updateDynamic("persistenceKey")(persistenceKey)
    if (renderLoadingExperimental != null) __obj.updateDynamic("renderLoadingExperimental")(renderLoadingExperimental.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (uriPrefix != null) __obj.updateDynamic("uriPrefix")(uriPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationContainerProps[S, O]]
  }
}

