package typings.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Solid extends StObject {
  
  var brand: Any
  
  var solid: Any
}
object Solid {
  
  inline def apply(brand: Any, solid: Any): Solid = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], solid = solid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Solid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Solid] (val x: Self) extends AnyVal {
    
    inline def setBrand(value: Any): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setSolid(value: Any): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
  }
}
