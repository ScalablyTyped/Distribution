package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDocumentsRequestData extends StObject {
  
  // unique document ID
  var _id: String
}
object DeleteDocumentsRequestData {
  
  inline def apply(_id: String): DeleteDocumentsRequestData = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentsRequestData]
  }
  
  extension [Self <: DeleteDocumentsRequestData](x: Self) {
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
