package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionerProps extends js.Object {
  var descriptors: js.UndefOr[ScalablyTyped.runtime.StringDictionary[NavigationDescriptor[NavigationParams]]] = js.native
  var navigation: NavigationScreenProp[NavigationState, NavigationParams] = js.native
  var onTransitionEnd: js.UndefOr[
    js.Function2[
      /* transitionProps */ NavigationTransitionProps, 
      /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps], 
      scala.Unit
    ]
  ] = js.native
  var onTransitionStart: js.UndefOr[
    js.Function2[
      /* transitionProps */ NavigationTransitionProps, 
      /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps], 
      stdLib.Promise[scala.Unit] | scala.Unit
    ]
  ] = js.native
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.native
  def configureTransition(transitionProps: NavigationTransitionProps): NavigationTransitionSpec = js.native
  def configureTransition(transitionProps: NavigationTransitionProps, prevTransitionProps: NavigationTransitionProps): NavigationTransitionSpec = js.native
  def render(transitionProps: NavigationTransitionProps): js.Any = js.native
  def render(transitionProps: NavigationTransitionProps, prevTransitionProps: NavigationTransitionProps): js.Any = js.native
}

