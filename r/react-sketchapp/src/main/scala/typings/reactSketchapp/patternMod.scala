package typings.reactSketchapp

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactSketchapp.propsMod.NumberProp
import typings.reactSketchapp.reactSketchappStrings.objectBoundingBox
import typings.reactSketchapp.reactSketchappStrings.userSpaceOnUse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patternMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Pattern", JSImport.Default)
  @js.native
  class default ()
    extends Component[PatternProps, js.Object, js.Any]
  
  type Pattern = Component[PatternProps, js.Object, js.Any]
  
  trait PatternProps extends StObject {
    
    var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
    
    var patternContentUnits: js.UndefOr[userSpaceOnUse | objectBoundingBox] = js.undefined
    
    var patternTransform: js.UndefOr[String] = js.undefined
    
    var patternUnits: js.UndefOr[userSpaceOnUse | objectBoundingBox] = js.undefined
    
    var x1: js.UndefOr[NumberProp] = js.undefined
    
    var x2: js.UndefOr[NumberProp] = js.undefined
    
    var y1: js.UndefOr[NumberProp] = js.undefined
    
    var y2: js.UndefOr[NumberProp] = js.undefined
  }
  object PatternProps {
    
    inline def apply(): PatternProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternProps]
    }
    
    extension [Self <: PatternProps](x: Self) {
      
      inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setPatternContentUnits(value: userSpaceOnUse | objectBoundingBox): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
      
      inline def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
      
      inline def setPatternTransform(value: String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
      
      inline def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
      
      inline def setPatternUnits(value: userSpaceOnUse | objectBoundingBox): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
      
      inline def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
      
      inline def setX1(value: NumberProp): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      inline def setX2(value: NumberProp): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      inline def setY1(value: NumberProp): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      inline def setY2(value: NumberProp): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    }
  }
}
