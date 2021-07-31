package typings.pubnub.mod

import typings.pubnub.anon.CustomFields
import typings.pubnub.anon.Next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectsParameters extends StObject {
  
  var include: js.UndefOr[CustomFields] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var page: js.UndefOr[Next] = js.undefined
}
object GetObjectsParameters {
  
  @scala.inline
  def apply(): GetObjectsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectsParameters]
  }
  
  @scala.inline
  implicit class GetObjectsParametersMutableBuilder[Self <: GetObjectsParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInclude(value: CustomFields): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setPage(value: Next): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
  }
}
