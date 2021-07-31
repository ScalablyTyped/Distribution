package typings.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomFields extends StObject {
  
  var customFields: js.UndefOr[Boolean] = js.undefined
}
object CustomFields {
  
  @scala.inline
  def apply(): CustomFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFields]
  }
  
  @scala.inline
  implicit class CustomFieldsMutableBuilder[Self <: CustomFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomFields(value: Boolean): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
  }
}
