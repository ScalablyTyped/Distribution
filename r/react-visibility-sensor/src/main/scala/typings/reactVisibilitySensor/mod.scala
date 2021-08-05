package typings.reactVisibilitySensor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.reactVisibilitySensor.anon.IsVisible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-visibility-sensor", JSImport.Default)
  @js.native
  val default: StatelessComponent[Props] = js.native
  
  trait Props extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode | (js.Function1[/* args */ IsVisible, ReactNode])] = js.undefined
    
    var containment: js.UndefOr[js.Any] = js.undefined
    
    var delayedCall: js.UndefOr[Boolean] = js.undefined
    
    var intervalCheck: js.UndefOr[Boolean] = js.undefined
    
    var intervalDelay: js.UndefOr[Double] = js.undefined
    
    var minTopValue: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Shape] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* isVisible */ Boolean, Unit]] = js.undefined
    
    var partialVisibility: js.UndefOr[Boolean] = js.undefined
    
    var resizeCheck: js.UndefOr[Boolean] = js.undefined
    
    var resizeDelay: js.UndefOr[Double] = js.undefined
    
    var resizeThrottle: js.UndefOr[Double] = js.undefined
    
    var scrollCheck: js.UndefOr[Boolean] = js.undefined
    
    var scrollDelay: js.UndefOr[Double] = js.undefined
    
    var scrollThrottle: js.UndefOr[Double] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: ReactNode | (js.Function1[/* args */ IsVisible, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* args */ IsVisible => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainment(value: js.Any): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
      
      inline def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
      
      inline def setDelayedCall(value: Boolean): Self = StObject.set(x, "delayedCall", value.asInstanceOf[js.Any])
      
      inline def setDelayedCallUndefined: Self = StObject.set(x, "delayedCall", js.undefined)
      
      inline def setIntervalCheck(value: Boolean): Self = StObject.set(x, "intervalCheck", value.asInstanceOf[js.Any])
      
      inline def setIntervalCheckUndefined: Self = StObject.set(x, "intervalCheck", js.undefined)
      
      inline def setIntervalDelay(value: Double): Self = StObject.set(x, "intervalDelay", value.asInstanceOf[js.Any])
      
      inline def setIntervalDelayUndefined: Self = StObject.set(x, "intervalDelay", js.undefined)
      
      inline def setMinTopValue(value: Double): Self = StObject.set(x, "minTopValue", value.asInstanceOf[js.Any])
      
      inline def setMinTopValueUndefined: Self = StObject.set(x, "minTopValue", js.undefined)
      
      inline def setOffset(value: Shape): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnChange(value: /* isVisible */ Boolean => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPartialVisibility(value: Boolean): Self = StObject.set(x, "partialVisibility", value.asInstanceOf[js.Any])
      
      inline def setPartialVisibilityUndefined: Self = StObject.set(x, "partialVisibility", js.undefined)
      
      inline def setResizeCheck(value: Boolean): Self = StObject.set(x, "resizeCheck", value.asInstanceOf[js.Any])
      
      inline def setResizeCheckUndefined: Self = StObject.set(x, "resizeCheck", js.undefined)
      
      inline def setResizeDelay(value: Double): Self = StObject.set(x, "resizeDelay", value.asInstanceOf[js.Any])
      
      inline def setResizeDelayUndefined: Self = StObject.set(x, "resizeDelay", js.undefined)
      
      inline def setResizeThrottle(value: Double): Self = StObject.set(x, "resizeThrottle", value.asInstanceOf[js.Any])
      
      inline def setResizeThrottleUndefined: Self = StObject.set(x, "resizeThrottle", js.undefined)
      
      inline def setScrollCheck(value: Boolean): Self = StObject.set(x, "scrollCheck", value.asInstanceOf[js.Any])
      
      inline def setScrollCheckUndefined: Self = StObject.set(x, "scrollCheck", js.undefined)
      
      inline def setScrollDelay(value: Double): Self = StObject.set(x, "scrollDelay", value.asInstanceOf[js.Any])
      
      inline def setScrollDelayUndefined: Self = StObject.set(x, "scrollDelay", js.undefined)
      
      inline def setScrollThrottle(value: Double): Self = StObject.set(x, "scrollThrottle", value.asInstanceOf[js.Any])
      
      inline def setScrollThrottleUndefined: Self = StObject.set(x, "scrollThrottle", js.undefined)
    }
  }
  
  trait Shape extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object Shape {
    
    inline def apply(): Shape = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Shape]
    }
    
    extension [Self <: Shape](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  type _To = StatelessComponent[Props]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: StatelessComponent[Props] = default
}
