package typings.reactToastify

import typings.react.mod.global.JSX.Element
import typings.reactToastify.typesMod.ToastTransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssTransitionMod {
  
  @JSImport("react-toastify/dist/utils/cssTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cssTransition(hasEnterExitDurationAppendPositionCollapseCollapseDuration: CSSTransitionProps): js.Function1[
    /* hasChildrenPositionPreventExitTransitionDoneProps */ ToastTransitionProps, 
    Element
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("cssTransition")(hasEnterExitDurationAppendPositionCollapseCollapseDuration.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* hasChildrenPositionPreventExitTransitionDoneProps */ ToastTransitionProps, 
    Element
  ]]
  
  trait CSSTransitionProps extends StObject {
    
    /**
      * Append current toast position to the classname.
      * For instance `myclass--top-center`...
      * `Default: false`
      */
    var appendPosition: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Collapse toast smoothly when animation end
      * `Default: true`
      */
    var collapse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Collapse transition duration
      * `Default: 300`
      */
    var collapseDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * Define the duration of the transition in ms
      * You can also pass an array `[enterDuration, exitDuration]`
      * `Default: 750`
      */
    var duration: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.undefined
    
    /**
      * Css class to apply when toast enter
      */
    var enter: String
    
    /**
      * Css class to apply when toast leave
      */
    var exit: String
  }
  object CSSTransitionProps {
    
    inline def apply(enter: String, exit: String): CSSTransitionProps = {
      val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSSTransitionProps]
    }
    
    extension [Self <: CSSTransitionProps](x: Self) {
      
      inline def setAppendPosition(value: Boolean): Self = StObject.set(x, "appendPosition", value.asInstanceOf[js.Any])
      
      inline def setAppendPositionUndefined: Self = StObject.set(x, "appendPosition", js.undefined)
      
      inline def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      inline def setCollapseDuration(value: Double): Self = StObject.set(x, "collapseDuration", value.asInstanceOf[js.Any])
      
      inline def setCollapseDurationUndefined: Self = StObject.set(x, "collapseDuration", js.undefined)
      
      inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      inline def setDuration(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEnter(value: String): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setExit(value: String): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    }
  }
}
