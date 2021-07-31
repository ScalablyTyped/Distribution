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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/states", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/states", "DEFAULT_RIPPLE_CLASSNAMES")
  @js.native
  val DEFAULT_RIPPLE_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/states", "DEFAULT_RIPPLE_TIMEOUT")
  @js.native
  val DEFAULT_RIPPLE_TIMEOUT: TransitionTimeout = js.native
  
  object StatesConfig {
    
    @scala.inline
    def apply(hasRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleChildren: StatesConfigProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/states", "StatesConfig")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/states", "StatesConfig.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/states", "StatesConfig.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/states", "StatesConfig.propTypes.disableProgrammaticRipple")
      @js.native
      def disableProgrammaticRipple: js.Any = js.native
      @scala.inline
      def disableProgrammaticRipple_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableProgrammaticRipple")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/states", "StatesConfig.propTypes.disableRipple")
      @js.native
      def disableRipple: js.Any = js.native
      @scala.inline
      def disableRipple_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableRipple")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/states", "StatesConfig.propTypes.rippleClassNames")
      @js.native
      def rippleClassNames: js.Any = js.native
      @scala.inline
      def rippleClassNames_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rippleClassNames")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/states", "StatesConfig.propTypes.rippleTimeout")
      @js.native
      def rippleTimeout: js.Any = js.native
      @scala.inline
      def rippleTimeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rippleTimeout")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/states", "StatesConfigContext")
  @js.native
  val StatesConfigContext: Context[StatesConfigContextType] = js.native
  
  @scala.inline
  def useInteractionStates[E /* <: HTMLElement */](): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInteractionStates")().asInstanceOf[ReturnValue[E]]
  @scala.inline
  def useInteractionStates[E /* <: HTMLElement */](options: InteractionStatesOptions[E]): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInteractionStates")(options.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[E]]
  
  @scala.inline
  def useStatesConfigContext(): StatesConfigContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useStatesConfigContext")().asInstanceOf[StatesConfigContextType]
}
