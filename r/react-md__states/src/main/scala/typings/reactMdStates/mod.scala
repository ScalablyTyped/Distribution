package typings.reactMdStates

import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.reactMdStates.statesConfigMod.StatesConfigContextType
import typings.reactMdStates.statesConfigMod.StatesConfigProps
import typings.reactMdStates.useInteractionStatesMod.InteractionStatesOptions
import typings.reactMdStates.useInteractionStatesMod.ReturnValue
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/states", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val DEFAULT_RIPPLE_CLASSNAMES: CSSTransitionClassNames = js.native
  val DEFAULT_RIPPLE_TIMEOUT: TransitionTimeout = js.native
  val StatesConfigContext: Context[StatesConfigContextType] = js.native
  def useInteractionStates[E /* <: HTMLElement */](): ReturnValue[E] = js.native
  def useInteractionStates[E /* <: HTMLElement */](options: InteractionStatesOptions[E]): ReturnValue[E] = js.native
  def useStatesConfigContext(): StatesConfigContextType = js.native
  @js.native
  object StatesConfig extends js.Object {
    /**
      * The `StatesConfig` component is a top-level context provider for the states
      * context configuration. It'll keep track of:
      *
      * - the current interaction mode of your user
      * - configuration for ripple effects
      * - disabling or enabling the ripple effects
      * - disabling or enabling the fix for color pollution
      */
    def apply(hasRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleChildren: StatesConfigProps): ReactElement = js.native
    @js.native
    object propTypes extends js.Object {
      var children: js.Any = js.native
      var disableProgrammaticRipple: js.Any = js.native
      var disableRipple: js.Any = js.native
      var rippleClassNames: js.Any = js.native
      var rippleTimeout: js.Any = js.native
    }
    
  }
  
}

