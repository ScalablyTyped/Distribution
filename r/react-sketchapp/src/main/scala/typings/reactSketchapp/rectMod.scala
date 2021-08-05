package typings.reactSketchapp

import typings.react.mod.Component
import typings.reactSketchapp.propsMod.NumberProp
import typings.reactSketchapp.propsMod.PathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Rect", JSImport.Default)
  @js.native
  class default ()
    extends Component[RectProps, js.Object, js.Any]
  
  type Rect = Component[RectProps, js.Object, js.Any]
  
  trait RectProps
    extends StObject
       with PathProps {
    
    var height: NumberProp
    
    var rx: js.UndefOr[NumberProp] = js.undefined
    
    var ry: js.UndefOr[NumberProp] = js.undefined
    
    var width: NumberProp
    
    @JSName("x")
    var x_RectProps: NumberProp
    
    @JSName("y")
    var y_RectProps: NumberProp
  }
  object RectProps {
    
    inline def apply(height: NumberProp, width: NumberProp, x: NumberProp, y: NumberProp): RectProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[RectProps]
    }
    
    extension [Self <: RectProps](x: Self) {
      
      inline def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setRx(value: NumberProp): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: NumberProp): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      inline def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
