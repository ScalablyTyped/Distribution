package typings.reactAliceCarousel

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.reactAliceCarousel.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dotsNavigationMod {
  
  @JSImport("react-alice-carousel/lib/views/DotsNavigation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DotsNavigation(hasStateOnClickOnMouseEnterOnMouseLeave: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DotsNavigation")(hasStateOnClickOnMouseEnterOnMouseLeave.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    def onClick(index: Double): Unit
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[typings.std.Element]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[typings.std.Element]] = js.undefined
    
    var state: State
  }
  object Props {
    
    inline def apply(onClick: Double => Unit, state: State): Props = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnClick(value: Double => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnter(value: MouseEvent[typings.std.Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: MouseEvent[typings.std.Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
