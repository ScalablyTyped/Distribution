package typings.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalCount extends StObject {
  
  var customFields: js.UndefOr[Boolean] = js.undefined
  
  var totalCount: js.UndefOr[Boolean] = js.undefined
}
object TotalCount {
  
  inline def apply(): TotalCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotalCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TotalCount] (val x: Self) extends AnyVal {
    
    inline def setCustomFields(value: Boolean): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    inline def setTotalCount(value: Boolean): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
