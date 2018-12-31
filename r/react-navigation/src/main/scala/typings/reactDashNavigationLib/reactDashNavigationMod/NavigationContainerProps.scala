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

