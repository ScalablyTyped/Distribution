package typings.reactDashNavigationDashStack.libTypescriptViewsStackViewStackViewMod

import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackConfig
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.SceneDescriptorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var descriptors: SceneDescriptorMap
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var navigationConfig: NavigationStackConfig
  var onGestureBegin: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onGestureCanceled: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onGestureEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var screenProps: js.UndefOr[js.Any] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    descriptors: SceneDescriptorMap,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    navigationConfig: NavigationStackConfig,
    onGestureBegin: () => Unit = null,
    onGestureCanceled: () => Unit = null,
    onGestureEnd: () => Unit = null,
    onTransitionStart: () => Unit = null,
    screenProps: js.Any = null
  ): Props = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any])
    if (onGestureBegin != null) __obj.updateDynamic("onGestureBegin")(js.Any.fromFunction0(onGestureBegin))
    if (onGestureCanceled != null) __obj.updateDynamic("onGestureCanceled")(js.Any.fromFunction0(onGestureCanceled))
    if (onGestureEnd != null) __obj.updateDynamic("onGestureEnd")(js.Any.fromFunction0(onGestureEnd))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction0(onTransitionStart))
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

