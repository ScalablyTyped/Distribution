package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpaceInputParameters extends StObject {
  
  var custom: js.UndefOr[js.Object | Null] = js.undefined
  
  var description: js.UndefOr[String | Null] = js.undefined
  
  var id: String
  
  var include: js.UndefOr[CustomFields] = js.undefined
  
  var name: String
}
object SpaceInputParameters {
  
  inline def apply(id: String, name: String): SpaceInputParameters = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceInputParameters]
  }
  
  extension [Self <: SpaceInputParameters](x: Self) {
    
    inline def setCustom(value: js.Object): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomNull: Self = StObject.set(x, "custom", null)
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInclude(value: CustomFields): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
