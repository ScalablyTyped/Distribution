package typings
package reactDashNavigationLib.reactDashNavigationMod

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
      js.UndefOr[scala.Unit | scala.Null]
    ]
  ] = js.undefined
  var persistenceKey: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var renderLoadingExperimental: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[js.Object]] = js.undefined
  var screenProps: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var uriPrefix: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
}

object NavigationContainerProps {
  @scala.inline
  def apply[S, O](
    navigation: NavigationScreenProp[S, NavigationParams] = null,
    navigationOptions: O = null,
    onNavigationStateChange: js.Function3[
      /* prevNavigationState */ NavigationState, 
      /* nextNavigationState */ NavigationState, 
      /* action */ NavigationAction, 
      js.UndefOr[scala.Unit | scala.Null]
    ] = null,
    persistenceKey: java.lang.String = null,
    renderLoadingExperimental: reactLib.reactMod.ReactNs.ComponentType[js.Object] = null,
    screenProps: js.Any = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    uriPrefix: java.lang.String | stdLib.RegExp = null
  ): NavigationContainerProps[S, O] = {
    val __obj = js.Dynamic.literal()
    if (navigation != null) __obj.updateDynamic("navigation")(navigation)
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    if (onNavigationStateChange != null) __obj.updateDynamic("onNavigationStateChange")(onNavigationStateChange)
    if (persistenceKey != null) __obj.updateDynamic("persistenceKey")(persistenceKey)
    if (renderLoadingExperimental != null) __obj.updateDynamic("renderLoadingExperimental")(renderLoadingExperimental.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (uriPrefix != null) __obj.updateDynamic("uriPrefix")(uriPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationContainerProps[S, O]]
  }
}

