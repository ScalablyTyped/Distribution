package typings.reactScrollbarSize

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-scrollbar-size", JSImport.Default)
  @js.native
  class default ()
    extends Component[ScrollbarSizeProps, js.Object, js.Any]
  
  trait Measurement extends StObject {
    
    var scrollbarHeight: Double
    
    var scrollbarWidth: Double
  }
  object Measurement {
    
    inline def apply(scrollbarHeight: Double, scrollbarWidth: Double): Measurement = {
      val __obj = js.Dynamic.literal(scrollbarHeight = scrollbarHeight.asInstanceOf[js.Any], scrollbarWidth = scrollbarWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Measurement]
    }
    
    extension [Self <: Measurement](x: Self) {
      
      inline def setScrollbarHeight(value: Double): Self = StObject.set(x, "scrollbarHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollbarWidth(value: Double): Self = StObject.set(x, "scrollbarWidth", value.asInstanceOf[js.Any])
    }
  }
  
  type ScrollbarSize = Component[ScrollbarSizeProps, js.Object, js.Any]
  
  trait ScrollbarSizeProps extends StObject {
    
    var onChange: js.UndefOr[js.Function1[/* measurement */ Measurement, Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function1[/* measurement */ Measurement, Unit]] = js.undefined
  }
  object ScrollbarSizeProps {
    
    inline def apply(): ScrollbarSizeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollbarSizeProps]
    }
    
    extension [Self <: ScrollbarSizeProps](x: Self) {
      
      inline def setOnChange(value: /* measurement */ Measurement => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnLoad(value: /* measurement */ Measurement => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    }
  }
}
