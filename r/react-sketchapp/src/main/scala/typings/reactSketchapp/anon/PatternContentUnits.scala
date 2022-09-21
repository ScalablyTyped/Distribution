package typings.reactSketchapp.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatternContentUnits extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var patternContentUnits: Requireable[String]
  
  var patternTransform: Requireable[String]
  
  var patternUnits: Requireable[String]
  
  var x1: Requireable[String | Double]
  
  var x2: Requireable[String | Double]
  
  var y1: Requireable[String | Double]
  
  var y2: Requireable[String | Double]
}
object PatternContentUnits {
  
  inline def apply(
    children: Requireable[ReactNodeLike],
    patternContentUnits: Requireable[String],
    patternTransform: Requireable[String],
    patternUnits: Requireable[String],
    x1: Requireable[String | Double],
    x2: Requireable[String | Double],
    y1: Requireable[String | Double],
    y2: Requireable[String | Double]
  ): PatternContentUnits = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], patternContentUnits = patternContentUnits.asInstanceOf[js.Any], patternTransform = patternTransform.asInstanceOf[js.Any], patternUnits = patternUnits.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternContentUnits]
  }
  
  extension [Self <: PatternContentUnits](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setPatternContentUnits(value: Requireable[String]): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
    
    inline def setPatternTransform(value: Requireable[String]): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
    
    inline def setPatternUnits(value: Requireable[String]): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Requireable[String | Double]): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Requireable[String | Double]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Requireable[String | Double]): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Requireable[String | Double]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
