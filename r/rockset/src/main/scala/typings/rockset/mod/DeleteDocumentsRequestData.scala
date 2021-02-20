package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDocumentsRequestData extends StObject {
  
  // unique document ID
  var _id: String = js.native
}
object DeleteDocumentsRequestData {
  
  @scala.inline
  def apply(_id: String): DeleteDocumentsRequestData = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentsRequestData]
  }
  
  @scala.inline
  implicit class DeleteDocumentsRequestDataMutableBuilder[Self <: DeleteDocumentsRequestData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
