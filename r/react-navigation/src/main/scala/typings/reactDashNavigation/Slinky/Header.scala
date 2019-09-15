package typings.reactDashNavigation.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNavigation.reactDashNavigationMod.AnimatedValue
import typings.reactDashNavigation.reactDashNavigationMod.HeaderMode
import typings.reactDashNavigation.reactDashNavigationMod.HeaderProps
import typings.reactDashNavigation.reactDashNavigationMod.NavigationLayout
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRouter
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScene
import typings.reactDashNavigation.reactDashNavigationMod.NavigationSceneRendererProps
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenDetails
import typings.reactDashNavigation.reactDashNavigationMod.NavigationScreenProp
import typings.reactDashNavigation.reactDashNavigationMod.NavigationStackScreenOptions
import typings.reactDashNavigation.reactDashNavigationMod.NavigationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashNavigation.reactDashNavigationMod.Header] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNavigation.reactDashNavigationMod.Header].asInstanceOf[String | js.Object]
  def apply(
    getScreenDetails: NavigationScene => NavigationScreenDetails[NavigationStackScreenOptions],
    index: Double,
    layout: NavigationLayout,
    leftInterpolator: NavigationSceneRendererProps => js.Object,
    mode: HeaderMode,
    navigation: NavigationScreenProp[NavigationState, NavigationParams],
    position: AnimatedValue,
    progress: AnimatedValue,
    rightInterpolator: NavigationSceneRendererProps => js.Object,
    router: NavigationRouter[NavigationState, NavigationStackScreenOptions],
    scene: NavigationScene,
    scenes: js.Array[NavigationScene],
    titleInterpolator: NavigationSceneRendererProps => js.Object,
    screenProps: StringDictionary[js.Any] = null,
    style: StyleProp[ViewStyle] = null
  ): BuildingComponent[tag.type, typings.reactDashNavigation.reactDashNavigationMod.Header] = {
    val __obj = js.Dynamic.literal(getScreenDetails = js.Any.fromFunction1(getScreenDetails), index = index, layout = layout, leftInterpolator = js.Any.fromFunction1(leftInterpolator), mode = mode, navigation = navigation, position = position, progress = progress, rightInterpolator = js.Any.fromFunction1(rightInterpolator), router = router, scene = scene, scenes = scenes, titleInterpolator = js.Any.fromFunction1(titleInterpolator))
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = HeaderProps
}

