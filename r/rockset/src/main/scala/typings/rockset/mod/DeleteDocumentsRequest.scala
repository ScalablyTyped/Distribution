package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDocumentsRequest extends js.Object {
  // array of document IDs
  var data: js.Array[DeleteDocumentsRequestData]
}

object DeleteDocumentsRequest {
  @scala.inline
  def apply(data: js.Array[DeleteDocumentsRequestData]): DeleteDocumentsRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDocumentsRequest]
  }
}

