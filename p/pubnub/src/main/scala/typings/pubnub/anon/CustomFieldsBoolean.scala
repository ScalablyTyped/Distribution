package typings.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomFieldsBoolean extends StObject {
  
  var customFields: Boolean
}
object CustomFieldsBoolean {
  
  inline def apply(customFields: Boolean): CustomFieldsBoolean = {
    val __obj = js.Dynamic.literal(customFields = customFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFieldsBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomFieldsBoolean] (val x: Self) extends AnyVal {
    
    inline def setCustomFields(value: Boolean): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
  }
}
