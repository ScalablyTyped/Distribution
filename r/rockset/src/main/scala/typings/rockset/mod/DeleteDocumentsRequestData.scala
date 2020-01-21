package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDocumentsRequestData extends js.Object {
  // unique document ID
  var _id: String
}

object DeleteDocumentsRequestData {
  @scala.inline
  def apply(_id: String): DeleteDocumentsRequestData = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDocumentsRequestData]
  }
}

