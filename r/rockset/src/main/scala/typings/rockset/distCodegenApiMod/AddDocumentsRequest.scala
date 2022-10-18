package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddDocumentsRequest extends StObject {
  
  /**
    * Array of JSON documents
    * @type {Array<any>}
    * @memberof AddDocumentsRequest
    */
  var data: js.Array[Any]
}
object AddDocumentsRequest {
  
  inline def apply(data: js.Array[Any]): AddDocumentsRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddDocumentsRequest]
  }
  
  extension [Self <: AddDocumentsRequest](x: Self) {
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
