package typings.reactNativeSvg.anon

import typings.react.mod.ReactElement
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.ColumnMajorTransformMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: js.Array[ReactElement]
  
  var gradient: js.Array[Double]
  
  var gradientTransform: ColumnMajorTransformMatrix | Null
  
  var gradientUnits: Double
  
  var name: String
}
object Children {
  
  inline def apply(children: js.Array[ReactElement], gradient: js.Array[Double], gradientUnits: Double, name: String): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], gradientUnits = gradientUnits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], gradientTransform = null)
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setGradient(value: js.Array[Double]): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setGradientTransform(value: ColumnMajorTransformMatrix): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
    
    inline def setGradientTransformNull: Self = StObject.set(x, "gradientTransform", null)
    
    inline def setGradientUnits(value: Double): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
    
    inline def setGradientVarargs(value: Double*): Self = StObject.set(x, "gradient", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
