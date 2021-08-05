package typings.reactSketchapp

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactSketchapp.propsMod.NumberProp
import typings.reactSketchapp.reactSketchappStrings.objectBoundingBox
import typings.reactSketchapp.reactSketchappStrings.userSpaceOnUse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearGradientMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/LinearGradient", JSImport.Default)
  @js.native
  class default ()
    extends Component[LinearGradientProps, js.Object, js.Any]
  
  type LinearGradient = Component[LinearGradientProps, js.Object, js.Any]
  
  trait LinearGradientProps extends StObject {
    
    var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
    
    var gradientUnits: js.UndefOr[objectBoundingBox | userSpaceOnUse] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var x1: NumberProp
    
    var x2: NumberProp
    
    var y1: NumberProp
    
    var y2: NumberProp
  }
  object LinearGradientProps {
    
    inline def apply(x1: NumberProp, x2: NumberProp, y1: NumberProp, y2: NumberProp): LinearGradientProps = {
      val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinearGradientProps]
    }
    
    extension [Self <: LinearGradientProps](x: Self) {
      
      inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setGradientUnits(value: objectBoundingBox | userSpaceOnUse): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
      
      inline def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setX1(value: NumberProp): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX2(value: NumberProp): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setY1(value: NumberProp): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY2(value: NumberProp): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
}
