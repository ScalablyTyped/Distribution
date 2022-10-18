package typings.reactMdTransition

import typings.reactMdTransition.typesTypesMod.TransitionEnterHandler
import typings.reactMdTransition.typesTypesMod.TransitionExitHandler
import typings.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<@react-md/transition.@react-md/transition/types/types.CSSTransitionClassNamesObject> */
  trait ReadonlyCSSTransitionClas extends StObject {
    
    val appear: js.UndefOr[String] = js.undefined
    
    val appearActive: js.UndefOr[String] = js.undefined
    
    val appearDone: js.UndefOr[String] = js.undefined
    
    val enter: js.UndefOr[String] = js.undefined
    
    val enterActive: js.UndefOr[String] = js.undefined
    
    val enterDone: js.UndefOr[String] = js.undefined
    
    val exit: js.UndefOr[String] = js.undefined
    
    val exitActive: js.UndefOr[String] = js.undefined
    
    val exitDone: js.UndefOr[String] = js.undefined
  }
  object ReadonlyCSSTransitionClas {
    
    inline def apply(): ReadonlyCSSTransitionClas = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyCSSTransitionClas]
    }
    
    extension [Self <: ReadonlyCSSTransitionClas](x: Self) {
      
      inline def setAppear(value: String): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setAppearActive(value: String): Self = StObject.set(x, "appearActive", value.asInstanceOf[js.Any])
      
      inline def setAppearActiveUndefined: Self = StObject.set(x, "appearActive", js.undefined)
      
      inline def setAppearDone(value: String): Self = StObject.set(x, "appearDone", value.asInstanceOf[js.Any])
      
      inline def setAppearDoneUndefined: Self = StObject.set(x, "appearDone", js.undefined)
      
      inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      inline def setEnter(value: String): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterActive(value: String): Self = StObject.set(x, "enterActive", value.asInstanceOf[js.Any])
      
      inline def setEnterActiveUndefined: Self = StObject.set(x, "enterActive", js.undefined)
      
      inline def setEnterDone(value: String): Self = StObject.set(x, "enterDone", value.asInstanceOf[js.Any])
      
      inline def setEnterDoneUndefined: Self = StObject.set(x, "enterDone", js.undefined)
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExit(value: String): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitActive(value: String): Self = StObject.set(x, "exitActive", value.asInstanceOf[js.Any])
      
      inline def setExitActiveUndefined: Self = StObject.set(x, "exitActive", js.undefined)
      
      inline def setExitDone(value: String): Self = StObject.set(x, "exitDone", value.asInstanceOf[js.Any])
      
      inline def setExitDoneUndefined: Self = StObject.set(x, "exitDone", js.undefined)
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<std.Required<@react-md/transition.@react-md/transition/types/types.CSSTransitionClassNamesObject>> */
  trait ReadonlyRequiredCSSTransi extends StObject {
    
    val appear: String
    
    val appearActive: String
    
    val appearDone: String
    
    val enter: String
    
    val enterActive: String
    
    val enterDone: String
    
    val exit: String
    
    val exitActive: String
    
    val exitDone: String
  }
  object ReadonlyRequiredCSSTransi {
    
    inline def apply(
      appear: String,
      appearActive: String,
      appearDone: String,
      enter: String,
      enterActive: String,
      enterDone: String,
      exit: String,
      exitActive: String,
      exitDone: String
    ): ReadonlyRequiredCSSTransi = {
      val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], appearActive = appearActive.asInstanceOf[js.Any], appearDone = appearDone.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], enterActive = enterActive.asInstanceOf[js.Any], enterDone = enterDone.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], exitActive = exitActive.asInstanceOf[js.Any], exitDone = exitDone.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyRequiredCSSTransi]
    }
    
    extension [Self <: ReadonlyRequiredCSSTransi](x: Self) {
      
      inline def setAppear(value: String): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setAppearActive(value: String): Self = StObject.set(x, "appearActive", value.asInstanceOf[js.Any])
      
      inline def setAppearDone(value: String): Self = StObject.set(x, "appearDone", value.asInstanceOf[js.Any])
      
      inline def setEnter(value: String): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterActive(value: String): Self = StObject.set(x, "enterActive", value.asInstanceOf[js.Any])
      
      inline def setEnterDone(value: String): Self = StObject.set(x, "enterDone", value.asInstanceOf[js.Any])
      
      inline def setExit(value: String): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitActive(value: String): Self = StObject.set(x, "exitActive", value.asInstanceOf[js.Any])
      
      inline def setExitDone(value: String): Self = StObject.set(x, "exitDone", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<std.Required<@react-md/transition.@react-md/transition/types/types.FixedPositioningTransitionCallbacks>> */
  trait ReadonlyRequiredFixedPosi extends StObject {
    
    val onEnter: TransitionEnterHandler
    
    val onEntered: TransitionEnterHandler
    
    val onEntering: TransitionEnterHandler
    
    val onExited: TransitionExitHandler
  }
  object ReadonlyRequiredFixedPosi {
    
    inline def apply(
      onEnter: /* appearing */ Boolean => Unit,
      onEntered: /* appearing */ Boolean => Unit,
      onEntering: /* appearing */ Boolean => Unit,
      onExited: () => Unit
    ): ReadonlyRequiredFixedPosi = {
      val __obj = js.Dynamic.literal(onEnter = js.Any.fromFunction1(onEnter), onEntered = js.Any.fromFunction1(onEntered), onEntering = js.Any.fromFunction1(onEntering), onExited = js.Any.fromFunction0(onExited))
      __obj.asInstanceOf[ReadonlyRequiredFixedPosi]
    }
    
    extension [Self <: ReadonlyRequiredFixedPosi](x: Self) {
      
      inline def setOnEnter(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
      
      inline def setOnEntered(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEntered", js.Any.fromFunction1(value))
      
      inline def setOnEntering(value: /* appearing */ Boolean => Unit): Self = StObject.set(x, "onEntering", js.Any.fromFunction1(value))
      
      inline def setOnExited(value: () => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Readonly<std.Required<@react-md/transition.@react-md/transition/types/types.TransitionTimeoutObject>> */
  trait ReadonlyRequiredTransitio extends StObject {
    
    val appear: Double
    
    val enter: Double
    
    val exit: Double
  }
  object ReadonlyRequiredTransitio {
    
    inline def apply(appear: Double, enter: Double, exit: Double): ReadonlyRequiredTransitio = {
      val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyRequiredTransitio]
    }
    
    extension [Self <: ReadonlyRequiredTransitio](x: Self) {
      
      inline def setAppear(value: Double): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setExit(value: Double): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<@react-md/transition.@react-md/transition/types/types.TransitionTimeoutObject> */
  trait ReadonlyTransitionTimeout extends StObject {
    
    val appear: js.UndefOr[Double] = js.undefined
    
    val enter: js.UndefOr[Double] = js.undefined
    
    val exit: js.UndefOr[Double] = js.undefined
  }
  object ReadonlyTransitionTimeout {
    
    inline def apply(): ReadonlyTransitionTimeout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyTransitionTimeout]
    }
    
    extension [Self <: ReadonlyTransitionTimeout](x: Self) {
      
      inline def setAppear(value: Double): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      inline def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExit(value: Double): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<@react-md/transition.@react-md/transition/types/utils.TransitionTimeoutOptions> */
  trait ReadonlyTransitionTimeoutAppear extends StObject {
    
    val appear: Boolean
    
    val enter: Boolean
    
    val exit: Boolean
    
    val timeout: TransitionTimeout
  }
  object ReadonlyTransitionTimeoutAppear {
    
    inline def apply(appear: Boolean, enter: Boolean, exit: Boolean, timeout: TransitionTimeout): ReadonlyTransitionTimeoutAppear = {
      val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyTransitionTimeoutAppear]
    }
    
    extension [Self <: ReadonlyTransitionTimeoutAppear](x: Self) {
      
      inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      inline def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
