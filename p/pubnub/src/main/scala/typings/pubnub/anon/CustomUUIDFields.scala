package typings.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomUUIDFields extends StObject {
  
  var UUIDFields: js.UndefOr[Boolean] = js.native
  
  var customFields: js.UndefOr[Boolean] = js.native
  
  var customUUIDFields: js.UndefOr[Boolean] = js.native
  
  var totalCount: js.UndefOr[Boolean] = js.native
}
object CustomUUIDFields {
  
  @scala.inline
  def apply(): CustomUUIDFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomUUIDFields]
  }
  
  @scala.inline
  implicit class CustomUUIDFieldsMutableBuilder[Self <: CustomUUIDFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomFields(value: Boolean): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    @scala.inline
    def setCustomUUIDFields(value: Boolean): Self = StObject.set(x, "customUUIDFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUUIDFieldsUndefined: Self = StObject.set(x, "customUUIDFields", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Boolean): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
    
    @scala.inline
    def setUUIDFields(value: Boolean): Self = StObject.set(x, "UUIDFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUUIDFieldsUndefined: Self = StObject.set(x, "UUIDFields", js.undefined)
  }
}
