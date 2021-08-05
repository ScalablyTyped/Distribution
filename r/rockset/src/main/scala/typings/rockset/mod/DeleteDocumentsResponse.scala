package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDocumentsResponse extends StObject {
  
  // information about deleted documents
  var data: js.UndefOr[js.Array[DocumentStatus]] = js.undefined
}
object DeleteDocumentsResponse {
  
  inline def apply(): DeleteDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDocumentsResponse]
  }
  
  extension [Self <: DeleteDocumentsResponse](x: Self) {
    
    inline def setData(value: js.Array[DocumentStatus]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: DocumentStatus*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
