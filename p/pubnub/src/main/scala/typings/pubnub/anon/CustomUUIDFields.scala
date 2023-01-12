package typings.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomUUIDFields extends StObject {
  
  var UUIDFields: js.UndefOr[Boolean] = js.undefined
  
  var customFields: js.UndefOr[Boolean] = js.undefined
  
  var customUUIDFields: js.UndefOr[Boolean] = js.undefined
  
  var totalCount: js.UndefOr[Boolean] = js.undefined
}
object CustomUUIDFields {
  
  inline def apply(): CustomUUIDFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomUUIDFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomUUIDFields] (val x: Self) extends AnyVal {
    
    inline def setCustomFields(value: Boolean): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    inline def setCustomUUIDFields(value: Boolean): Self = StObject.set(x, "customUUIDFields", value.asInstanceOf[js.Any])
    
    inline def setCustomUUIDFieldsUndefined: Self = StObject.set(x, "customUUIDFields", js.undefined)
    
    inline def setTotalCount(value: Boolean): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
    
    inline def setUUIDFields(value: Boolean): Self = StObject.set(x, "UUIDFields", value.asInstanceOf[js.Any])
    
    inline def setUUIDFieldsUndefined: Self = StObject.set(x, "UUIDFields", js.undefined)
  }
}
