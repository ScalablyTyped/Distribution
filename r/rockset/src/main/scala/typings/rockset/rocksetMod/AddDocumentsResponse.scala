package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddDocumentsResponse extends js.Object {
  // information about the added documents
  var data: js.UndefOr[js.Array[DocumentStatus]] = js.undefined
}

object AddDocumentsResponse {
  @scala.inline
  def apply(data: js.Array[DocumentStatus] = null): AddDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddDocumentsResponse]
  }
}

