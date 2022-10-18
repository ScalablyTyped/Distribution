package typings.reactAliceCarousel

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.reactAliceCarousel.anon.IsActive
import typings.reactAliceCarousel.libTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libViewsDotsNavigationMod {
  
  @JSImport("react-alice-carousel/lib/views/DotsNavigation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DotsNavigation(hasStateOnClickOnMouseEnterOnMouseLeaveControlsStrategyRenderDotsItem: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DotsNavigation")(hasStateOnClickOnMouseEnterOnMouseLeaveControlsStrategyRenderDotsItem.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var controlsStrategy: js.UndefOr[String] = js.undefined
    
    def onClick(index: Double): Unit
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[typings.std.Element]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[typings.std.Element]] = js.undefined
    
    var renderDotsItem: js.UndefOr[js.Function1[/* hasIsActiveActiveIndex */ IsActive, Any]] = js.undefined
    
    var state: State
  }
  object Props {
    
    inline def apply(onClick: Double => Unit, state: State): Props = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setControlsStrategy(value: String): Self = StObject.set(x, "controlsStrategy", value.asInstanceOf[js.Any])
      
      inline def setControlsStrategyUndefined: Self = StObject.set(x, "controlsStrategy", js.undefined)
      
      inline def setOnClick(value: Double => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnter(value: MouseEvent[typings.std.Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[typings.std.Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setRenderDotsItem(value: /* hasIsActiveActiveIndex */ IsActive => Any): Self = StObject.set(x, "renderDotsItem", js.Any.fromFunction1(value))
      
      inline def setRenderDotsItemUndefined: Self = StObject.set(x, "renderDotsItem", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
