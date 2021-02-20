package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDocumentsRequest extends StObject {
  
  // array of document IDs
  var data: js.Array[DeleteDocumentsRequestData] = js.native
}
object DeleteDocumentsRequest {
  
  @scala.inline
  def apply(data: js.Array[DeleteDocumentsRequestData]): DeleteDocumentsRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentsRequest]
  }
  
  @scala.inline
  implicit class DeleteDocumentsRequestMutableBuilder[Self <: DeleteDocumentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[DeleteDocumentsRequestData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: DeleteDocumentsRequestData*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
