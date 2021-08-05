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
    
    inline def apply(): ScrollAnimationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollAnimationProps]
    }
    
    extension [Self <: ScrollAnimationProps](x: Self) {
      
      inline def setAnimateIn(value: String): Self = StObject.set(x, "animateIn", value.asInstanceOf[js.Any])
      
      inline def setAnimateInUndefined: Self = StObject.set(x, "animateIn", js.undefined)
      
      inline def setAnimateOnce(value: Boolean): Self = StObject.set(x, "animateOnce", value.asInstanceOf[js.Any])
      
      inline def setAnimateOnceUndefined: Self = StObject.set(x, "animateOnce", js.undefined)
      
      inline def setAnimateOut(value: String): Self = StObject.set(x, "animateOut", value.asInstanceOf[js.Any])
      
      inline def setAnimateOutUndefined: Self = StObject.set(x, "animateOut", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setInitiallyVisible(value: Boolean): Self = StObject.set(x, "initiallyVisible", value.asInstanceOf[js.Any])
      
      inline def setInitiallyVisibleUndefined: Self = StObject.set(x, "initiallyVisible", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setScrollableParentSelector(value: String): Self = StObject.set(x, "scrollableParentSelector", value.asInstanceOf[js.Any])
      
      inline def setScrollableParentSelectorUndefined: Self = StObject.set(x, "scrollableParentSelector", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
