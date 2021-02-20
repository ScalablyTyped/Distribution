package typings.reactToastify

import typings.react.mod.global.JSX.Element
import typings.reactToastify.typesMod.ToastTransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssTransitionMod {
  
  @JSImport("react-toastify/dist/utils/cssTransition", "cssTransition")
  @js.native
  def cssTransition(hasEnterExitDurationAppendPositionCollapseCollapseDuration: CSSTransitionProps): js.Function1[
    /* hasChildrenPositionPreventExitTransitionDoneProps */ ToastTransitionProps, 
    Element
  ] = js.native
  
  @js.native
  trait CSSTransitionProps extends StObject {
    
    /**
      * Append current toast position to the classname.
      * For instance `myclass--top-center`...
      * `Default: false`
      */
    var appendPosition: js.UndefOr[Boolean] = js.native
    
    /**
      * Collapse toast smoothly when animation end
      * `Default: true`
      */
    var collapse: js.UndefOr[Boolean] = js.native
    
    /**
      * Collapse transition duration
      * `Default: 300`
      */
    var collapseDuration: js.UndefOr[Double] = js.native
    
    /**
      * Define the duration of the transition in ms
      * You can also pass an array `[enterDuration, exitDuration]`
      * `Default: 750`
      */
    var duration: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.native
    
    /**
      * Css class to apply when toast enter
      */
    var enter: String = js.native
    
    /**
      * Css class to apply when toast leave
      */
    var exit: String = js.native
  }
  object CSSTransitionProps {
    
    @scala.inline
    def apply(enter: String, exit: String): CSSTransitionProps = {
      val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSSTransitionProps]
    }
    
    @scala.inline
    implicit class CSSTransitionPropsMutableBuilder[Self <: CSSTransitionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendPosition(value: Boolean): Self = StObject.set(x, "appendPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendPositionUndefined: Self = StObject.set(x, "appendPosition", js.undefined)
      
      @scala.inline
      def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseDuration(value: Double): Self = StObject.set(x, "collapseDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseDurationUndefined: Self = StObject.set(x, "collapseDuration", js.undefined)
      
      @scala.inline
      def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      @scala.inline
      def setDuration(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEnter(value: String): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExit(value: String): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    }
  }
}
