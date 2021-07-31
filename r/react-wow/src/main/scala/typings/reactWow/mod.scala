package typings.reactWow

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-wow", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReactWOWProps, js.Object, js.Any]
  
  type ReactWOW = Component[ReactWOWProps, js.Object, js.Any]
  
  trait ReactWOWProps extends StObject {
    
    /**
      * Animation css class.
      * @default animated
      */
    var animateClass: js.UndefOr[String] = js.undefined
    
    /**
      * Animation name.
      * @see https://daneden.github.io/animate.css/
      */
    var animation: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 76 */ js.Any
    
    /**
      * The callback is fired every time an animation is stoped.
      */
    var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Content you want to apply the animation to.
      */
    var children: Element
    
    /**
      * Animation delay.
      */
    var delay: js.UndefOr[String] = js.undefined
    
    /**
      * Disable the animation.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Animation duration.
      */
    var duration: js.UndefOr[String] = js.undefined
    
    /**
      * Animation iteration count.
      */
    var iteration: js.UndefOr[String] = js.undefined
    
    /**
      * Distance to the element when triggering the animation.
      * @default 0
      */
    var offset: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * If your components inside a overflow container, set this to true.
      * @default false
      */
    var overflow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Listen and react to resize event.
      * @default true
      */
    var resize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Listen and react to scroll event.
      * @default true
      */
    var scroll: js.UndefOr[Boolean] = js.undefined
  }
  object ReactWOWProps {
    
    @scala.inline
    def apply(
      animation: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 76 */ js.Any,
      children: Element
    ): ReactWOWProps = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactWOWProps]
    }
    
    @scala.inline
    implicit class ReactWOWPropsMutableBuilder[Self <: ReactWOWProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimateClass(value: String): Self = StObject.set(x, "animateClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateClassUndefined: Self = StObject.set(x, "animateClass", js.undefined)
      
      @scala.inline
      def setAnimation(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 76 */ js.Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setChildren(value: Element): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelay(value: String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setIteration(value: String): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterationUndefined: Self = StObject.set(x, "iteration", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
      
      @scala.inline
      def setOverflow(value: Boolean): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    }
  }
}
