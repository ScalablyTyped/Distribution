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
  
  inline def cssTransition(hasEnterExitAppendPositionCollapseCollapseDuration: CSSTransitionProps): js.Function1[
    /* hasChildrenPositionPreventExitTransitionDoneNodeRefIsIn */ ToastTransitionProps, 
    Element
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("cssTransition")(hasEnterExitAppendPositionCollapseCollapseDuration.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* hasChildrenPositionPreventExitTransitionDoneNodeRefIsIn */ ToastTransitionProps, 
    Element
  ]]
  
  trait CSSTransitionProps extends StObject {
    
    /**
      * Append current toast position to the classname.
      * If multiple classes are provided, only the last one will get the position
      * For instance `myclass--top-center`...
      * `Default: false`
      */
    var appendPosition: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Collapse toast smoothly when exit animation end
      * `Default: true`
      */
    var collapse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Collapse transition duration
      * `Default: 300`
      */
    var collapseDuration: js.UndefOr[Double] = js.undefined
    
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
      
      inline def setEnter(value: String): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setExit(value: String): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    }
  }
}
