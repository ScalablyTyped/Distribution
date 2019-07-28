package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddDocumentsRequest extends js.Object {
  // Array of JSON documents
  var data: js.Array[js.Object]
}

object AddDocumentsRequest {
  @scala.inline
  def apply(data: js.Array[js.Object]): AddDocumentsRequest = {
    val __obj = js.Dynamic.literal(data = data)
  
    __obj.asInstanceOf[AddDocumentsRequest]
  }
}

