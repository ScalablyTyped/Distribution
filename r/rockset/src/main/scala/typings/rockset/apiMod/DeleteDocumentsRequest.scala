package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDocumentsRequest extends StObject {
  
  /**
    * array of document IDs
    * @type {Array<DeleteDocumentsRequestData>}
    * @memberof DeleteDocumentsRequest
    */
  var data: js.Array[DeleteDocumentsRequestData]
}
object DeleteDocumentsRequest {
  
  inline def apply(data: js.Array[DeleteDocumentsRequestData]): DeleteDocumentsRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentsRequest]
  }
  
  extension [Self <: DeleteDocumentsRequest](x: Self) {
    
    inline def setData(value: js.Array[DeleteDocumentsRequestData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: DeleteDocumentsRequestData*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
