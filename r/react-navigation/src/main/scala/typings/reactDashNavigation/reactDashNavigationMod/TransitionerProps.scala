package typings.reactDashNavigation.reactDashNavigationMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionerProps extends js.Object {
  var descriptors: js.UndefOr[StringDictionary[NavigationDescriptor[NavigationParams]]] = js.native
  var navigation: NavigationScreenProp[NavigationState, NavigationParams] = js.native
  var onTransitionEnd: js.UndefOr[
    js.Function2[
      /* transitionProps */ NavigationTransitionProps, 
      /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps], 
      Unit
    ]
  ] = js.native
  var onTransitionStart: js.UndefOr[
    js.Function2[
      /* transitionProps */ NavigationTransitionProps, 
      /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps], 
      js.Promise[Unit] | Unit
    ]
  ] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  def configureTransition(transitionProps: NavigationTransitionProps): NavigationTransitionSpec = js.native
  def configureTransition(transitionProps: NavigationTransitionProps, prevTransitionProps: NavigationTransitionProps): NavigationTransitionSpec = js.native
  def render(transitionProps: NavigationTransitionProps): js.Any = js.native
  def render(transitionProps: NavigationTransitionProps, prevTransitionProps: NavigationTransitionProps): js.Any = js.native
}

