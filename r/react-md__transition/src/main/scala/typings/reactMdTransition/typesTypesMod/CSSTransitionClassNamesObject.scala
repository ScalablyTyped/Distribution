package typings.reactMdTransition.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSTransitionClassNamesObject extends StObject {
  
  /**
    * The class name to apply starting at the `"enter"` {@link TransitionStage}
    * while {@link TransitionState.appearing}.
    *
    * @defaultValue `""`
    */
  var appear: js.UndefOr[String] = js.undefined
  
  /**
    * The class name to apply starting at the `"entering"` {@link TransitionStage}
    * while {@link TransitionState.appearing}.
    *
    * @defaultValue `""`
    */
  var appearActive: js.UndefOr[String] = js.undefined
  
  /**
    * The class name to apply starting at the `"entered"` {@link TransitionStage}
    * while {@link TransitionState.appearing}.
    *
    * @defaultValue `""`
    */
  var appearDone: js.UndefOr[String] = js.undefined
  
  /**
    * The class name to apply starting at the `"enter"` {@link TransitionStage}
    *
    * @defaultValue `""`
    */
  var enter: js.UndefOr[String] = js.undefined
  
  /**
    * The class name to apply starting at the `"entering"` {@link TransitionStage}
    *
    * @defaultValue `""`
    */
  var enterActive: js.UndefOr[String] = js.undefined
  
  /**
    * The class name to apply starting at the `"entered"` {@link TransitionStage}
    *
    * @defaultValue `""`
    */
  var enterDone: js.UndefOr[String] = js.undefined
  
  /**
    * The class name to apply starting at the `"exit"` {@link TransitionStage}
    *
    * @defaultValue `""`
    */
  var exit: js.UndefOr[String] = js.undefined
  
  /**
    * The class name to apply starting at the `"exiting"` {@link TransitionStage}
    *
    * @defaultValue `""`
    */
  var exitActive: js.UndefOr[String] = js.undefined
  
  /**
    * The class name to apply starting at the `"exited"` {@link TransitionStage}
    *
    * @defaultValue `""`
    */
  var exitDone: js.UndefOr[String] = js.undefined
}
object CSSTransitionClassNamesObject {
  
  inline def apply(): CSSTransitionClassNamesObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSTransitionClassNamesObject]
  }
  
  extension [Self <: CSSTransitionClassNamesObject](x: Self) {
    
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
