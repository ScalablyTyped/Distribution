package typings.reactDashNavigation.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNavigation.reactDashNavigationMod.NavigationDescriptor
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typings.reactDashNavigation.reactDashNavigationMod.NavigationState
import typings.reactDashNavigation.reactDashNavigationMod.NavigationTransitionProps
import typings.reactDashNavigation.reactDashNavigationMod.NavigationTransitionSpec
import typings.reactDashNavigation.reactDashNavigationMod.TransitionerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Transitioner
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashNavigation.reactDashNavigationMod.Transitioner] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNavigation.reactDashNavigationMod.Transitioner].asInstanceOf[String | js.Object]
  def apply(
    configureTransition: NavigationTransitionProps => NavigationTransitionSpec,
    navigation: NavigationScreenProp[NavigationState, NavigationParams],
    render: NavigationTransitionProps => js.Any,
    descriptors: StringDictionary[NavigationDescriptor[NavigationParams]] = null,
    onTransitionEnd: (/* transitionProps */ NavigationTransitionProps, /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps]) => Unit = null,
    onTransitionStart: (/* transitionProps */ NavigationTransitionProps, /* prevTransitionProps */ js.UndefOr[NavigationTransitionProps]) => js.Promise[Unit] | Unit = null,
    style: StyleProp[ViewStyle] = null
  ): BuildingComponent[tag.type, typings.reactDashNavigation.reactDashNavigationMod.Transitioner] = {
    val __obj = js.Dynamic.literal(configureTransition = js.Any.fromFunction1(configureTransition), navigation = navigation, render = js.Any.fromFunction1(render))
    if (descriptors != null) __obj.updateDynamic("descriptors")(descriptors)
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction2(onTransitionEnd))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction2(onTransitionStart))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TransitionerProps
}

