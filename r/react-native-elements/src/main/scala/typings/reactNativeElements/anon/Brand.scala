package typings.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brand extends StObject {
  
  var brand: Unit
  
  var solid: Unit
}
object Brand {
  
  inline def apply(brand: Unit, solid: Unit): Brand = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], solid = solid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brand]
  }
  
  extension [Self <: Brand](x: Self) {
    
    inline def setBrand(value: Unit): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setSolid(value: Unit): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
  }
}
