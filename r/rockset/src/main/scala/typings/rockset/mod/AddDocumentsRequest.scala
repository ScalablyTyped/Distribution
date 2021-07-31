package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddDocumentsRequest extends StObject {
  
  // Array of JSON documents
  var data: js.Array[js.Object]
}
object AddDocumentsRequest {
  
  @scala.inline
  def apply(data: js.Array[js.Object]): AddDocumentsRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddDocumentsRequest]
  }
  
  @scala.inline
  implicit class AddDocumentsRequestMutableBuilder[Self <: AddDocumentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
