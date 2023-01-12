package typings.reactSketchapp.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradientUnits extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var gradientUnits: Requireable[String]
  
  var id: Validator[String]
  
  var x1: Validator[String | Double]
  
  var x2: Validator[String | Double]
  
  var y1: Validator[String | Double]
  
  var y2: Validator[String | Double]
}
object GradientUnits {
  
  inline def apply(
    children: Requireable[ReactNodeLike],
    gradientUnits: Requireable[String],
    id: Validator[String],
    x1: Validator[String | Double],
    x2: Validator[String | Double],
    y1: Validator[String | Double],
    y2: Validator[String | Double]
  ): GradientUnits = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], gradientUnits = gradientUnits.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientUnits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GradientUnits] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setGradientUnits(value: Requireable[String]): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
    
    inline def setId(value: Validator[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setX1(value: Validator[String | Double]): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Validator[String | Double]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Validator[String | Double]): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Validator[String | Double]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
