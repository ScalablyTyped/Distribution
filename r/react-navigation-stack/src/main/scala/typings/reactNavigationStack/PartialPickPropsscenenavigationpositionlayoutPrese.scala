package typings.reactNavigationStack

import typings.reactNative.mod.Animated.Value
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationStack.typesMod.HeaderLayoutPreset
import typings.reactNavigationStack.typesMod.HeaderMode
import typings.reactNavigationStack.typesMod.HeaderTransitionPreset
import typings.reactNavigationStack.typesMod.NavigationStackProp
import typings.reactNavigationStack.typesMod.Scene
import typings.reactNavigationStack.typesMod.SceneInterpolatorProps
import typings.reactNavigationStack.typesMod.TransitionerLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<react-navigation-stack.react-navigation-stack/lib/typescript/views/Header/Header.Props, 'scene' | 'navigation' | 'position' | 'layoutPreset' | 'backTitleVisible' | 'scenes' | 'layout' | 'mode' | 'transitionPreset' | 'leftInterpolator' | 'titleInterpolator' | 'rightInterpolator' | 'backgroundInterpolator' | 'leftLabelInterpolator' | 'leftButtonInterpolator' | 'titleFromLeftInterpolator' | 'layoutInterpolator' | 'theme'>> */
trait PartialPickPropsscenenavigationpositionlayoutPrese extends js.Object {
  var backTitleVisible: js.UndefOr[Boolean] = js.undefined
  var backgroundInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var layout: js.UndefOr[TransitionerLayout] = js.undefined
  var layoutInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var layoutPreset: js.UndefOr[HeaderLayoutPreset] = js.undefined
  var leftButtonInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var leftInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var leftLabelInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var mode: js.UndefOr[HeaderMode] = js.undefined
  var navigation: js.UndefOr[NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]] = js.undefined
  var position: js.UndefOr[Value] = js.undefined
  var rightInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var scene: js.UndefOr[Scene] = js.undefined
  var scenes: js.UndefOr[js.Array[Scene]] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var titleFromLeftInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var titleInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var transitionPreset: js.UndefOr[HeaderTransitionPreset] = js.undefined
}

object PartialPickPropsscenenavigationpositionlayoutPrese {
  @scala.inline
  def apply(
    backTitleVisible: js.UndefOr[Boolean] = js.undefined,
    backgroundInterpolator: /* props */ SceneInterpolatorProps => _ = null,
    layout: TransitionerLayout = null,
    layoutInterpolator: /* props */ SceneInterpolatorProps => _ = null,
    layoutPreset: HeaderLayoutPreset = null,
    leftButtonInterpolator: /* props */ SceneInterpolatorProps => _ = null,
    leftInterpolator: /* props */ SceneInterpolatorProps => _ = null,
    leftLabelInterpolator: /* props */ SceneInterpolatorProps => _ = null,
    mode: HeaderMode = null,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams] = null,
    position: Value = null,
    rightInterpolator: /* props */ SceneInterpolatorProps => _ = null,
    scene: Scene = null,
    scenes: js.Array[Scene] = null,
    theme: String = null,
    titleFromLeftInterpolator: /* props */ SceneInterpolatorProps => _ = null,
    titleInterpolator: /* props */ SceneInterpolatorProps => _ = null,
    transitionPreset: HeaderTransitionPreset = null
  ): PartialPickPropsscenenavigationpositionlayoutPrese = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backTitleVisible)) __obj.updateDynamic("backTitleVisible")(backTitleVisible.asInstanceOf[js.Any])
    if (backgroundInterpolator != null) __obj.updateDynamic("backgroundInterpolator")(js.Any.fromFunction1(backgroundInterpolator))
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (layoutInterpolator != null) __obj.updateDynamic("layoutInterpolator")(js.Any.fromFunction1(layoutInterpolator))
    if (layoutPreset != null) __obj.updateDynamic("layoutPreset")(layoutPreset.asInstanceOf[js.Any])
    if (leftButtonInterpolator != null) __obj.updateDynamic("leftButtonInterpolator")(js.Any.fromFunction1(leftButtonInterpolator))
    if (leftInterpolator != null) __obj.updateDynamic("leftInterpolator")(js.Any.fromFunction1(leftInterpolator))
    if (leftLabelInterpolator != null) __obj.updateDynamic("leftLabelInterpolator")(js.Any.fromFunction1(leftLabelInterpolator))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rightInterpolator != null) __obj.updateDynamic("rightInterpolator")(js.Any.fromFunction1(rightInterpolator))
    if (scene != null) __obj.updateDynamic("scene")(scene.asInstanceOf[js.Any])
    if (scenes != null) __obj.updateDynamic("scenes")(scenes.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (titleFromLeftInterpolator != null) __obj.updateDynamic("titleFromLeftInterpolator")(js.Any.fromFunction1(titleFromLeftInterpolator))
    if (titleInterpolator != null) __obj.updateDynamic("titleInterpolator")(js.Any.fromFunction1(titleInterpolator))
    if (transitionPreset != null) __obj.updateDynamic("transitionPreset")(transitionPreset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickPropsscenenavigationpositionlayoutPrese]
  }
}

