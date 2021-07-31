package typings.reactAnimateOnScroll

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-animate-on-scroll", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[ScrollAnimationProps, js.Object, js.Any] {
    def this(props: ScrollAnimationProps) = this()
  }
  
  type ScrollAnimation = Component[ScrollAnimationProps, js.Object, js.Any]
  
  trait ScrollAnimationProps extends StObject {
    
    var animateIn: js.UndefOr[String] = js.undefined
    
    var animateOnce: js.UndefOr[Boolean] = js.undefined
    
    var animateOut: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var initiallyVisible: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var scrollableParentSelector: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object ScrollAnimationProps {
    
    @scala.inline
    def apply(): ScrollAnimationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollAnimationProps]
    }
    
    @scala.inline
    implicit class ScrollAnimationPropsMutableBuilder[Self <: ScrollAnimationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimateIn(value: String): Self = StObject.set(x, "animateIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateInUndefined: Self = StObject.set(x, "animateIn", js.undefined)
      
      @scala.inline
      def setAnimateOnce(value: Boolean): Self = StObject.set(x, "animateOnce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateOnceUndefined: Self = StObject.set(x, "animateOnce", js.undefined)
      
      @scala.inline
      def setAnimateOut(value: String): Self = StObject.set(x, "animateOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateOutUndefined: Self = StObject.set(x, "animateOut", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setInitiallyVisible(value: Boolean): Self = StObject.set(x, "initiallyVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiallyVisibleUndefined: Self = StObject.set(x, "initiallyVisible", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setScrollableParentSelector(value: String): Self = StObject.set(x, "scrollableParentSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableParentSelectorUndefined: Self = StObject.set(x, "scrollableParentSelector", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
