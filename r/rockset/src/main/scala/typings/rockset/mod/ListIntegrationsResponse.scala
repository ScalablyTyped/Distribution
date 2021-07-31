package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIntegrationsResponse extends StObject {
  
  // list of integration objects
  var data: js.UndefOr[js.Array[Integration]] = js.undefined
}
object ListIntegrationsResponse {
  
  @scala.inline
  def apply(): ListIntegrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIntegrationsResponse]
  }
  
  @scala.inline
  implicit class ListIntegrationsResponseMutableBuilder[Self <: ListIntegrationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Integration]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: Integration*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
