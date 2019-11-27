package typings.reactDashNavigationDashStack

import typings.react.reactMod.Validator
import typings.reactDashNative.reactDashNativeMod.Animated.Value
import typings.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typings.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderLayoutPreset
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderMode
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderTransitionPreset
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.Scene
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps
import typings.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionerLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<std.Pick<react-navigation-stack.react-navigation-stack/lib/typescript/views/Header/Header.Props, 'scene' | 'navigation' | 'position' | 'layoutPreset' | 'backTitleVisible' | 'scenes' | 'layout' | 'mode' | 'transitionPreset' | 'leftInterpolator' | 'titleInterpolator' | 'rightInterpolator' | 'backgroundInterpolator' | 'leftLabelInterpolator' | 'leftButtonInterpolator' | 'titleFromLeftInterpolator' | 'layoutInterpolator' | 'theme'>> */
trait WeakValidationMapPickPropsscenenavigationpositionl extends js.Object {
  var backTitleVisible: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var backgroundInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.undefined
  var layout: js.UndefOr[Validator[js.UndefOr[Null | TransitionerLayout]]] = js.undefined
  var layoutInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.undefined
  var layoutPreset: js.UndefOr[Validator[js.UndefOr[HeaderLayoutPreset | Null]]] = js.undefined
  var leftButtonInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.undefined
  var leftInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.undefined
  var leftLabelInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.undefined
  var mode: js.UndefOr[Validator[js.UndefOr[HeaderMode | Null]]] = js.undefined
  var navigation: js.UndefOr[
    Validator[
      js.UndefOr[
        (NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]) | Null
      ]
    ]
  ] = js.undefined
  var position: js.UndefOr[Validator[js.UndefOr[Null | Value]]] = js.undefined
  var rightInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.undefined
  var scene: js.UndefOr[Validator[js.UndefOr[Null | Scene]]] = js.undefined
  var scenes: js.UndefOr[Validator[js.UndefOr[js.Array[Scene] | Null]]] = js.undefined
  var theme: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var titleFromLeftInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.undefined
  var titleInterpolator: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]]
  ] = js.undefined
  var transitionPreset: js.UndefOr[Validator[js.UndefOr[HeaderTransitionPreset | Null]]] = js.undefined
}

object WeakValidationMapPickPropsscenenavigationpositionl {
  @scala.inline
  def apply(
    backTitleVisible: Validator[js.UndefOr[Boolean | Null]] = null,
    backgroundInterpolator: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]] = null,
    layout: Validator[js.UndefOr[Null | TransitionerLayout]] = null,
    layoutInterpolator: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]] = null,
    layoutPreset: Validator[js.UndefOr[HeaderLayoutPreset | Null]] = null,
    leftButtonInterpolator: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]] = null,
    leftInterpolator: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]] = null,
    leftLabelInterpolator: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]] = null,
    mode: Validator[js.UndefOr[HeaderMode | Null]] = null,
    navigation: Validator[
      js.UndefOr[
        (NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]) | Null
      ]
    ] = null,
    position: Validator[js.UndefOr[Null | Value]] = null,
    rightInterpolator: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]] = null,
    scene: Validator[js.UndefOr[Null | Scene]] = null,
    scenes: Validator[js.UndefOr[js.Array[Scene] | Null]] = null,
    theme: Validator[js.UndefOr[Null | String]] = null,
    titleFromLeftInterpolator: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]] = null,
    titleInterpolator: Validator[js.UndefOr[(js.Function1[/* props */ SceneInterpolatorProps, _]) | Null]] = null,
    transitionPreset: Validator[js.UndefOr[HeaderTransitionPreset | Null]] = null
  ): WeakValidationMapPickPropsscenenavigationpositionl = {
    val __obj = js.Dynamic.literal()
    if (backTitleVisible != null) __obj.updateDynamic("backTitleVisible")(backTitleVisible.asInstanceOf[js.Any])
    if (backgroundInterpolator != null) __obj.updateDynamic("backgroundInterpolator")(backgroundInterpolator.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (layoutInterpolator != null) __obj.updateDynamic("layoutInterpolator")(layoutInterpolator.asInstanceOf[js.Any])
    if (layoutPreset != null) __obj.updateDynamic("layoutPreset")(layoutPreset.asInstanceOf[js.Any])
    if (leftButtonInterpolator != null) __obj.updateDynamic("leftButtonInterpolator")(leftButtonInterpolator.asInstanceOf[js.Any])
    if (leftInterpolator != null) __obj.updateDynamic("leftInterpolator")(leftInterpolator.asInstanceOf[js.Any])
    if (leftLabelInterpolator != null) __obj.updateDynamic("leftLabelInterpolator")(leftLabelInterpolator.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rightInterpolator != null) __obj.updateDynamic("rightInterpolator")(rightInterpolator.asInstanceOf[js.Any])
    if (scene != null) __obj.updateDynamic("scene")(scene.asInstanceOf[js.Any])
    if (scenes != null) __obj.updateDynamic("scenes")(scenes.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (titleFromLeftInterpolator != null) __obj.updateDynamic("titleFromLeftInterpolator")(titleFromLeftInterpolator.asInstanceOf[js.Any])
    if (titleInterpolator != null) __obj.updateDynamic("titleInterpolator")(titleInterpolator.asInstanceOf[js.Any])
    if (transitionPreset != null) __obj.updateDynamic("transitionPreset")(transitionPreset.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapPickPropsscenenavigationpositionl]
  }
}

