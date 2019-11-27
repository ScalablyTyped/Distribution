package typings.reactDashNavigationDashStack.libTypescriptViewsTransitionerMod

import typings.react.reactMod.ReactNode
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.SceneDescriptorMap
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var configureTransition: js.UndefOr[
    js.Function2[
      /* current */ TransitionProps, 
      /* previous */ js.UndefOr[TransitionProps], 
      TransitionSpec
    ]
  ] = js.native
  var descriptors: SceneDescriptorMap = js.native
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams] = js.native
  var onTransitionEnd: js.UndefOr[
    js.Function2[
      /* current */ TransitionProps, 
      /* previous */ js.UndefOr[TransitionProps], 
      Unit | js.Promise[_]
    ]
  ] = js.native
  var onTransitionStart: js.UndefOr[
    js.Function2[
      /* current */ TransitionProps, 
      /* previous */ js.UndefOr[TransitionProps], 
      Unit | js.Promise[_]
    ]
  ] = js.native
  var screenProps: js.UndefOr[js.Any] = js.native
  def render(current: TransitionProps): ReactNode = js.native
  def render(current: TransitionProps, previous: TransitionProps): ReactNode = js.native
}

