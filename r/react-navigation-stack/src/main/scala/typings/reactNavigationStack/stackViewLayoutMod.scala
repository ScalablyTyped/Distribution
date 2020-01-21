package typings.reactNavigationStack

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNavigationStack.reactNavigationStackStrings.card
import typings.reactNavigationStack.reactNavigationStackStrings.modal
import typings.reactNavigationStack.typesMod.HeaderBackgroundTransitionPreset
import typings.reactNavigationStack.typesMod.HeaderLayoutPreset
import typings.reactNavigationStack.typesMod.HeaderMode
import typings.reactNavigationStack.typesMod.HeaderTransitionPreset
import typings.reactNavigationStack.typesMod.TransitionConfig
import typings.reactNavigationStack.typesMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation-stack/lib/typescript/views/StackView/StackViewLayout", JSImport.Namespace)
@js.native
object stackViewLayoutMod extends js.Object {
  /* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/types.NavigationStackConfig & {  isLandscape  :boolean,   transitionProps  :react-navigation-stack.react-navigation-stack/lib/typescript/types.TransitionProps,   lastTransitionProps ? :react-navigation-stack.react-navigation-stack/lib/typescript/types.TransitionProps, transitionConfig ? (transitionProps : react-navigation-stack.react-navigation-stack/lib/typescript/types.TransitionProps, prevTransitionProps ? : react-navigation-stack.react-navigation-stack/lib/typescript/types.TransitionProps, isModal ? : boolean): react-navigation-stack.react-navigation-stack/lib/typescript/types.TransitionConfig, onGestureBegin ? (): void, onGestureEnd ? (): void, onGestureCanceled ? (): void,   screenProps ? :unknown} */
  @js.native
  trait Props extends js.Object {
    var cardOverlayEnabled: js.UndefOr[Boolean] = js.native
    var cardShadowEnabled: js.UndefOr[Boolean] = js.native
    var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    var disableKeyboardHandling: js.UndefOr[Boolean] = js.native
    var headerBackTitleVisible: js.UndefOr[Boolean] = js.native
    var headerBackgroundTransitionPreset: js.UndefOr[HeaderBackgroundTransitionPreset] = js.native
    var headerLayoutPreset: js.UndefOr[HeaderLayoutPreset] = js.native
    var headerMode: js.UndefOr[HeaderMode] = js.native
    var headerTransitionPreset: js.UndefOr[HeaderTransitionPreset] = js.native
    var isLandscape: Boolean = js.native
    var lastTransitionProps: js.UndefOr[TransitionProps] = js.native
    var mode: js.UndefOr[card | modal] = js.native
    var onGestureBegin: js.UndefOr[js.Function0[Unit]] = js.native
    var onGestureCanceled: js.UndefOr[js.Function0[Unit]] = js.native
    var onGestureEnd: js.UndefOr[js.Function0[Unit]] = js.native
    var onTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.native
    var onTransitionStart: js.UndefOr[js.Function0[Unit]] = js.native
    var screenProps: js.UndefOr[js.Any] = js.native
    var transitionConfig: js.UndefOr[
        js.Function3[
          /* transitionProps */ TransitionProps, 
          js.UndefOr[TransitionProps], 
          js.UndefOr[Boolean], 
          TransitionConfig | TransitionConfigHeaderTransitionConfig
        ]
      ] = js.native
    var transitionProps: TransitionProps = js.native
    var transparentCard: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  class default protected ()
    extends Component[PickPropsmodeheaderModeheaderLayoutPresetheaderTra, ComponentState, js.Any] {
    def this(props: PickPropsmodeheaderModeheaderLayoutPresetheaderTra) = this()
    def this(props: PickPropsmodeheaderModeheaderLayoutPresetheaderTra, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentType[PickPropsmodeheaderModeheaderLayoutPresetheaderTra]]
  
}

