package typings.propertyInformation

import typings.propertyInformation.schemaMod.Schema
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMod {
  
  @JSImport("property-information/lib/util/create", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(definition: Definition): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(definition.asInstanceOf[js.Any]).asInstanceOf[Schema]
  
  type Attributes = Record[String, String]
  
  trait Definition extends StObject {
    
    var attributes: js.UndefOr[Attributes] = js.undefined
    
    var mustUseProperty: js.UndefOr[js.Array[String]] = js.undefined
    
    var properties: Record[String, Double | Null]
    
    var space: js.UndefOr[String] = js.undefined
    
    def transform(attributes: Attributes, property: String): String
  }
  object Definition {
    
    inline def apply(properties: Record[String, Double | Null], transform: (Attributes, String) => String): Definition = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], transform = js.Any.fromFunction2(transform))
      __obj.asInstanceOf[Definition]
    }
    
    extension [Self <: Definition](x: Self) {
      
      inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setMustUseProperty(value: js.Array[String]): Self = StObject.set(x, "mustUseProperty", value.asInstanceOf[js.Any])
      
      inline def setMustUsePropertyUndefined: Self = StObject.set(x, "mustUseProperty", js.undefined)
      
      inline def setMustUsePropertyVarargs(value: String*): Self = StObject.set(x, "mustUseProperty", js.Array(value*))
      
      inline def setProperties(value: Record[String, Double | Null]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      inline def setTransform(value: (Attributes, String) => String): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    }
  }
  
  type Normal = typings.propertyInformation.schemaMod.Normal
  
  type Properties = typings.propertyInformation.schemaMod.Properties
}
