package typings.ramlTypesystem.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectType
  extends StObject
     with IType {
  
  /**
    * allows to set constraints on the type of additional properties
    */
  var additionalProperties: js.UndefOr[Boolean] = js.undefined
  
  /**
    * if set to true type is threaten as closed type
    */
  var closed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * maximum amount of properties which instances of the type should have
    */
  var maxProperties: js.UndefOr[Double] = js.undefined
  
  /**
    * minimum amount of properties which instances of the type should have
    */
  var minProperties: js.UndefOr[Double] = js.undefined
  
  /**
    * map of property signatures to the property  declarations
    */
  var properties: js.UndefOr[StringDictionary[IType]] = js.undefined
}
object ObjectType {
  
  inline def apply(): ObjectType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectType]
  }
  
  extension [Self <: ObjectType](x: Self) {
    
    inline def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setMaxProperties(value: Double): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
    
    inline def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
    
    inline def setMinProperties(value: Double): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
    
    inline def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
    
    inline def setProperties(value: StringDictionary[IType]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
