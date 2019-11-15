package typings.reactDashNavigation.reactDashNavigationMod

import typings.react.reactMod.ComponentType
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationContainerProps[State, Options, ScreenProps] extends js.Object {
  /**
    * Controls whether the navigation container handles URLs opened via 'Linking'
    * @see https://facebook.github.io/react-native/docs/linking
    * @see https://reactnavigation.org/docs/en/deep-linking.html
    */
  var enableURLHandling: js.UndefOr[Boolean] = js.undefined
  var loadNavigationState: js.UndefOr[js.Function0[js.Promise[_]]] = js.undefined
  var navigation: js.UndefOr[NavigationScreenProp[State, NavigationParams]] = js.undefined
  var navigationOptions: js.UndefOr[Options] = js.undefined
   // defaults to true
  var onNavigationStateChange: js.UndefOr[
    js.Function3[
      /* prevNavigationState */ NavigationState, 
      /* nextNavigationState */ NavigationState, 
      /* action */ NavigationAction, 
      js.UndefOr[Unit | Null]
    ]
  ] = js.undefined
  var persistNavigationState: js.UndefOr[js.Function1[/* state */ NavigationState, js.Promise[_]]] = js.undefined
  /*
    * This prop is no longer supported. Use `loadNavigationState` and
    * `persistNavigationState` instead.
    */
  var persistenceKey: js.UndefOr[String | Null] = js.undefined
  var renderLoadingExperimental: js.UndefOr[ComponentType[js.Object]] = js.undefined
  var screenProps: js.UndefOr[ScreenProps] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var uriPrefix: js.UndefOr[String | RegExp] = js.undefined
}

object NavigationContainerProps {
  @scala.inline
  def apply[State, Options, ScreenProps](
    enableURLHandling: js.UndefOr[Boolean] = js.undefined,
    loadNavigationState: () => js.Promise[_] = null,
    navigation: NavigationScreenProp[State, NavigationParams] = null,
    navigationOptions: Options = null,
    onNavigationStateChange: (/* prevNavigationState */ NavigationState, /* nextNavigationState */ NavigationState, /* action */ NavigationAction) => js.UndefOr[Unit | Null] = null,
    persistNavigationState: /* state */ NavigationState => js.Promise[_] = null,
    persistenceKey: String = null,
    renderLoadingExperimental: ComponentType[js.Object] = null,
    screenProps: ScreenProps = null,
    style: StyleProp[ViewStyle] = null,
    uriPrefix: String | RegExp = null
  ): NavigationContainerProps[State, Options, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableURLHandling)) __obj.updateDynamic("enableURLHandling")(enableURLHandling)
    if (loadNavigationState != null) __obj.updateDynamic("loadNavigationState")(js.Any.fromFunction0(loadNavigationState))
    if (navigation != null) __obj.updateDynamic("navigation")(navigation)
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    if (onNavigationStateChange != null) __obj.updateDynamic("onNavigationStateChange")(js.Any.fromFunction3(onNavigationStateChange))
    if (persistNavigationState != null) __obj.updateDynamic("persistNavigationState")(js.Any.fromFunction1(persistNavigationState))
    if (persistenceKey != null) __obj.updateDynamic("persistenceKey")(persistenceKey)
    if (renderLoadingExperimental != null) __obj.updateDynamic("renderLoadingExperimental")(renderLoadingExperimental.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (uriPrefix != null) __obj.updateDynamic("uriPrefix")(uriPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationContainerProps[State, Options, ScreenProps]]
  }
}

