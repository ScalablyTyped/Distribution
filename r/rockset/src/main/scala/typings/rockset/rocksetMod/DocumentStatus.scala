package typings.rockset.rocksetMod

import typings.rockset.rocksetStrings.ADDED
import typings.rockset.rocksetStrings.DELETED
import typings.rockset.rocksetStrings.ERROR
import typings.rockset.rocksetStrings.REPLACED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentStatus extends js.Object {
  // collection name
  var _collection: js.UndefOr[String] = js.undefined
  // unique document ID
  var _id: js.UndefOr[String] = js.undefined
  // error message, if any
  var error: js.UndefOr[ErrorModel] = js.undefined
  // status, one of ADDED, REPLACED, DELETED, ERROR
  var status: js.UndefOr[ADDED | REPLACED | DELETED | ERROR] = js.undefined
}

object DocumentStatus {
  @scala.inline
  def apply(
    _collection: String = null,
    _id: String = null,
    error: ErrorModel = null,
    status: ADDED | REPLACED | DELETED | ERROR = null
  ): DocumentStatus = {
    val __obj = js.Dynamic.literal()
    if (_collection != null) __obj.updateDynamic("_collection")(_collection)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (error != null) __obj.updateDynamic("error")(error)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentStatus]
  }
}

