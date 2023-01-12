package typings.reactMdTransition

import typings.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typings.reactMdTransition.typesTypesMod.CSSTransitionHookReturnValue
import typings.reactMdTransition.typesTypesMod.PreconfiguredCSSTransitionOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseScaleTransitionMod {
  
  @JSImport("@react-md/transition/types/useScaleTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<@react-md/transition.@react-md/transition/types/types.CSSTransitionClassNamesObject> */
  object SCALE_CLASSNAMES {
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_CLASSNAMES.appear")
    @js.native
    val appear: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_CLASSNAMES.appearActive")
    @js.native
    val appearActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_CLASSNAMES.appearDone")
    @js.native
    val appearDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_CLASSNAMES.enter")
    @js.native
    val enter: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_CLASSNAMES.enterActive")
    @js.native
    val enterActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_CLASSNAMES.enterDone")
    @js.native
    val enterDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_CLASSNAMES.exit")
    @js.native
    val exit: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_CLASSNAMES.exitActive")
    @js.native
    val exitActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_CLASSNAMES.exitDone")
    @js.native
    val exitDone: js.UndefOr[String] = js.native
  }
  
  /* Inlined std.Readonly<@react-md/transition.@react-md/transition/types/types.TransitionTimeoutObject> */
  object SCALE_TIMEOUT {
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_TIMEOUT.appear")
    @js.native
    val appear: js.UndefOr[Double] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_TIMEOUT.enter")
    @js.native
    val enter: js.UndefOr[Double] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_TIMEOUT.exit")
    @js.native
    val exit: js.UndefOr[Double] = js.native
  }
  
  /* Inlined std.Readonly<@react-md/transition.@react-md/transition/types/types.CSSTransitionClassNamesObject> */
  object SCALE_Y_CLASSNAMES {
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_Y_CLASSNAMES.appear")
    @js.native
    val appear: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_Y_CLASSNAMES.appearActive")
    @js.native
    val appearActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_Y_CLASSNAMES.appearDone")
    @js.native
    val appearDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_Y_CLASSNAMES.enter")
    @js.native
    val enter: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_Y_CLASSNAMES.enterActive")
    @js.native
    val enterActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_Y_CLASSNAMES.enterDone")
    @js.native
    val enterDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_Y_CLASSNAMES.exit")
    @js.native
    val exit: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_Y_CLASSNAMES.exitActive")
    @js.native
    val exitActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/transition/types/useScaleTransition", "SCALE_Y_CLASSNAMES.exitDone")
    @js.native
    val exitDone: js.UndefOr[String] = js.native
  }
  
  inline def useScaleTransition[E /* <: HTMLElement */](param0: ScaleTransitionHookOptions[E]): CSSTransitionHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useScaleTransition")(param0.asInstanceOf[js.Any]).asInstanceOf[CSSTransitionHookReturnValue[E]]
  
  trait ScaleTransitionHookOptions[E /* <: HTMLElement */]
    extends StObject
       with PreconfiguredCSSTransitionOptions[E] {
    
    /**
      * @see {@link vertical}
      * @see {@link SCALE_CLASSNAMES}
      * @see {@link SCALE_Y_CLASSNAMES}
      * @defaultValue `vertical ? SCALE_Y_CLASSNAMES : SCALE_CLASSNAMES`
      */
    var classNames: js.UndefOr[CSSTransitionClassNames] = js.undefined
    
    /**
      * Boolean if the scale transition should be vertical instead of horizontal.
      * This really only changes the default value for the {@link classNames}.
      *
      * @defaultValue `false`
      */
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object ScaleTransitionHookOptions {
    
    inline def apply[E /* <: HTMLElement */](transitionIn: Boolean): ScaleTransitionHookOptions[E] = {
      val __obj = js.Dynamic.literal(transitionIn = transitionIn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleTransitionHookOptions[E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScaleTransitionHookOptions[?], E /* <: HTMLElement */] (val x: Self & ScaleTransitionHookOptions[E]) extends AnyVal {
      
      inline def setClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
