package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentStatus extends js.Object {
  // collection name
  var _collection: js.UndefOr[java.lang.String] = js.undefined
  // unique document ID
  var _id: js.UndefOr[java.lang.String] = js.undefined
  // error message, if any
  var error: js.UndefOr[ErrorModel] = js.undefined
  // status, one of ADDED, REPLACED, DELETED, ERROR
  var status: js.UndefOr[
    rocksetLib.rocksetLibStrings.ADDED | rocksetLib.rocksetLibStrings.REPLACED | rocksetLib.rocksetLibStrings.DELETED | rocksetLib.rocksetLibStrings.ERROR
  ] = js.undefined
}

object DocumentStatus {
  @scala.inline
  def apply(
    _collection: java.lang.String = null,
    _id: java.lang.String = null,
    error: ErrorModel = null,
    status: rocksetLib.rocksetLibStrings.ADDED | rocksetLib.rocksetLibStrings.REPLACED | rocksetLib.rocksetLibStrings.DELETED | rocksetLib.rocksetLibStrings.ERROR = null
  ): DocumentStatus = {
    val __obj = js.Dynamic.literal()
    if (_collection != null) __obj.updateDynamic("_collection")(_collection)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (error != null) __obj.updateDynamic("error")(error)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentStatus]
  }
}

