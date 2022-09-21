package typings.ramlTypesystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayType
  extends StObject
     with IType {
  
  /**
    * contains description of the component type
    */
  var items: js.UndefOr[String | IType] = js.undefined
  
  /**
    * maximum amount of properties which instances of the type should have
    */
  var maxItems: js.UndefOr[Double] = js.undefined
  
  /**
    * minimum amount of properties which instances of the type should have
    */
  var minItems: js.UndefOr[Double] = js.undefined
}
object ArrayType {
  
  inline def apply(): ArrayType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayType]
  }
  
  extension [Self <: ArrayType](x: Self) {
    
    inline def setItems(value: String | IType): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    inline def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
    
    inline def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
  }
}
