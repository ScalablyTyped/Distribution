package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDocumentsResponse extends js.Object {
  // information about deleted documents
  var data: js.UndefOr[js.Array[DocumentStatus]] = js.undefined
}

object DeleteDocumentsResponse {
  @scala.inline
  def apply(data: js.Array[DocumentStatus] = null): DeleteDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDocumentsResponse]
  }
}

