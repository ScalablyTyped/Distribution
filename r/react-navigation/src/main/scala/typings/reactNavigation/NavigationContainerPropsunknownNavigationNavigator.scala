package typings.reactNavigation

import typings.react.mod.ComponentType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNavigation.mod.NavigationAction
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationProp
import typings.reactNavigation.mod.NavigationScreenProp
import typings.reactNavigation.mod.NavigationState
import typings.reactNavigation.mod.SupportedThemes
import typings.reactNavigation.reactNavigationStrings.`no-preference`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation.react-navigation.NavigationContainerProps<{}, {}, unknown> & react-navigation.react-navigation.NavigationNavigatorProps<any, {}, unknown> */
trait NavigationContainerPropsunknownNavigationNavigator extends js.Object {
  var detached: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls whether the navigation container handles URLs opened via 'Linking'
    * @see https://facebook.github.io/react-native/docs/linking
    * @see https://reactnavigation.org/docs/en/deep-linking.html
    */
  var enableURLHandling: js.UndefOr[Boolean] = js.undefined
  var loadNavigationState: js.UndefOr[js.Function0[js.Promise[_]]] = js.undefined
  var navigation: js.UndefOr[
    (NavigationScreenProp[js.Object, NavigationParams]) with NavigationProp[js.Object]
  ] = js.undefined
  var navigationOptions: js.UndefOr[js.Object with js.Any] = js.undefined
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
  var screenProps: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var theme: js.UndefOr[SupportedThemes | `no-preference`] = js.undefined
  var uriPrefix: js.UndefOr[String | RegExp] = js.undefined
}

object NavigationContainerPropsunknownNavigationNavigator {
  @scala.inline
  def apply(
    detached: js.UndefOr[Boolean] = js.undefined,
    enableURLHandling: js.UndefOr[Boolean] = js.undefined,
    loadNavigationState: () => js.Promise[_] = null,
    navigation: (NavigationScreenProp[js.Object, NavigationParams]) with NavigationProp[js.Object] = null,
    navigationOptions: js.Object with js.Any = null,
    onNavigationStateChange: (/* prevNavigationState */ NavigationState, /* nextNavigationState */ NavigationState, /* action */ NavigationAction) => js.UndefOr[Unit | Null] = null,
    persistNavigationState: /* state */ NavigationState => js.Promise[_] = null,
    persistenceKey: String = null,
    renderLoadingExperimental: ComponentType[js.Object] = null,
    screenProps: js.Any = null,
    style: StyleProp[ViewStyle] = null,
    theme: SupportedThemes | `no-preference` = null,
    uriPrefix: String | RegExp = null
  ): NavigationContainerPropsunknownNavigationNavigator = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    if (!js.isUndefined(enableURLHandling)) __obj.updateDynamic("enableURLHandling")(enableURLHandling.asInstanceOf[js.Any])
    if (loadNavigationState != null) __obj.updateDynamic("loadNavigationState")(js.Any.fromFunction0(loadNavigationState))
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions.asInstanceOf[js.Any])
    if (onNavigationStateChange != null) __obj.updateDynamic("onNavigationStateChange")(js.Any.fromFunction3(onNavigationStateChange))
    if (persistNavigationState != null) __obj.updateDynamic("persistNavigationState")(js.Any.fromFunction1(persistNavigationState))
    if (persistenceKey != null) __obj.updateDynamic("persistenceKey")(persistenceKey.asInstanceOf[js.Any])
    if (renderLoadingExperimental != null) __obj.updateDynamic("renderLoadingExperimental")(renderLoadingExperimental.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (uriPrefix != null) __obj.updateDynamic("uriPrefix")(uriPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationContainerPropsunknownNavigationNavigator]
  }
}

