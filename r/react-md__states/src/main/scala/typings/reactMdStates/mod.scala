package typings.reactMdStates

import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.reactMdStates.typesStatesConfigMod.StatesConfigContextType
import typings.reactMdStates.typesStatesConfigMod.StatesConfigProps
import typings.reactMdStates.typesUseInteractionStatesMod.InteractionStatesOptions
import typings.reactMdStates.typesUseInteractionStatesMod.ReturnValue
import typings.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typings.reactMdTransition.typesTypesMod.TransitionTimeout
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
  
  inline def StatesConfig(hasRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleChildren: StatesConfigProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("StatesConfig")(hasRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/states", "StatesConfigContext")
  @js.native
  val StatesConfigContext: Context[StatesConfigContextType] = js.native
  
  inline def useInteractionStates[E /* <: HTMLElement */](): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInteractionStates")().asInstanceOf[ReturnValue[E]]
  inline def useInteractionStates[E /* <: HTMLElement */](options: InteractionStatesOptions[E]): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInteractionStates")(options.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[E]]
  
  inline def useStatesConfigContext(): StatesConfigContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useStatesConfigContext")().asInstanceOf[StatesConfigContextType]
}
