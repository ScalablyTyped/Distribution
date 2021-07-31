package typings.pubnub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalCount extends StObject {
  
  var customFields: js.UndefOr[Boolean] = js.undefined
  
  var totalCount: js.UndefOr[Boolean] = js.undefined
}
object TotalCount {
  
  @scala.inline
  def apply(): TotalCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotalCount]
  }
  
  @scala.inline
  implicit class TotalCountMutableBuilder[Self <: TotalCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomFields(value: Boolean): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    @scala.inline
    def setTotalCount(value: Boolean): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
