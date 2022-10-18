package typings.reactMdTransition

import typings.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typings.reactMdTransition.typesTypesMod.CSSTransitionHookReturnValue
import typings.reactMdTransition.typesTypesMod.PreconfiguredCSSTransitionInDefaultedOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseCrossFadeTransitionMod {
  
  @JSImport("@react-md/transition/types/useCrossFadeTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<@react-md/transition.@react-md/transition/types/types.CSSTransitionClassNamesObject> */
  object CROSS_FADE_CLASSNAMES {
    
    @JSImport("@react-md/transition/types/useCrossFadeTransition", "CROSS_FADE_CLASSNAMES.appear")
    @js.native
    val appear: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useCrossFadeTransition", "CROSS_FADE_CLASSNAMES.appearActive")
    @js.native
    val appearActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useCrossFadeTransition", "CROSS_FADE_CLASSNAMES.appearDone")
    @js.native
    val appearDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useCrossFadeTransition", "CROSS_FADE_CLASSNAMES.enter")
    @js.native
    val enter: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useCrossFadeTransition", "CROSS_FADE_CLASSNAMES.enterActive")
    @js.native
    val enterActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useCrossFadeTransition", "CROSS_FADE_CLASSNAMES.enterDone")
    @js.native
    val enterDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useCrossFadeTransition", "CROSS_FADE_CLASSNAMES.exit")
    @js.native
    val exit: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useCrossFadeTransition", "CROSS_FADE_CLASSNAMES.exitActive")
    @js.native
    val exitActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useCrossFadeTransition", "CROSS_FADE_CLASSNAMES.exitDone")
    @js.native
    val exitDone: js.UndefOr[String] = js.native
  }
  
  /* Inlined std.Readonly<@react-md/transition.@react-md/transition/types/types.TransitionTimeoutObject> */
  object CROSS_FADE_TIMEOUT {
    
    @JSImport("@react-md/transition/types/useCrossFadeTransition", "CROSS_FADE_TIMEOUT.appear")
    @js.native
    val appear: js.UndefOr[Double] = js.native
    
    @JSImport("@react-md/transition/types/useCrossFadeTransition", "CROSS_FADE_TIMEOUT.enter")
    @js.native
    val enter: js.UndefOr[Double] = js.native
    
    @JSImport("@react-md/transition/types/useCrossFadeTransition", "CROSS_FADE_TIMEOUT.exit")
    @js.native
    val exit: js.UndefOr[Double] = js.native
  }
  
  inline def useCrossFadeTransition[E /* <: HTMLElement */](): CSSTransitionHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCrossFadeTransition")().asInstanceOf[CSSTransitionHookReturnValue[E]]
  inline def useCrossFadeTransition[E /* <: HTMLElement */](hasTransitionInTimeoutClassNamesOptions: CrossFadeTransitionHookOptions[E]): CSSTransitionHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCrossFadeTransition")(hasTransitionInTimeoutClassNamesOptions.asInstanceOf[js.Any]).asInstanceOf[CSSTransitionHookReturnValue[E]]
  
  trait CrossFadeTransitionHookOptions[E /* <: HTMLElement */]
    extends StObject
       with PreconfiguredCSSTransitionInDefaultedOptions[E] {
    
    /**
      * @see {@link CSSTransitionClassNames}
      * @see {@link CROSS_FADE_CLASSNAMES}
      * @defaultValue `CROSS_FADE_CLASSNAMES`
      */
    var classNames: js.UndefOr[CSSTransitionClassNames] = js.undefined
  }
  object CrossFadeTransitionHookOptions {
    
    inline def apply[E /* <: HTMLElement */](): CrossFadeTransitionHookOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrossFadeTransitionHookOptions[E]]
    }
    
    extension [Self <: CrossFadeTransitionHookOptions[?], E /* <: HTMLElement */](x: Self & CrossFadeTransitionHookOptions[E]) {
      
      inline def setClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    }
  }
}
