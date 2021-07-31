package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDocumentsResponse extends StObject {
  
  // information about deleted documents
  var data: js.UndefOr[js.Array[DocumentStatus]] = js.undefined
}
object DeleteDocumentsResponse {
  
  @scala.inline
  def apply(): DeleteDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDocumentsResponse]
  }
  
  @scala.inline
  implicit class DeleteDocumentsResponseMutableBuilder[Self <: DeleteDocumentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[DocumentStatus]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: DocumentStatus*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
