package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddDocumentsResponse extends StObject {
  
  /**
    * information about the added documents
    * @type {Array<DocumentStatus>}
    * @memberof AddDocumentsResponse
    */
  var data: js.UndefOr[js.Array[DocumentStatus]] = js.undefined
}
object AddDocumentsResponse {
  
  inline def apply(): AddDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDocumentsResponse]
  }
  
  extension [Self <: AddDocumentsResponse](x: Self) {
    
    inline def setData(value: js.Array[DocumentStatus]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: DocumentStatus*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
