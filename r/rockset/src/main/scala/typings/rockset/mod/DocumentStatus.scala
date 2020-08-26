package typings.rockset.mod

import typings.rockset.rocksetStrings.ADDED
import typings.rockset.rocksetStrings.DELETED
import typings.rockset.rocksetStrings.ERROR
import typings.rockset.rocksetStrings.REPLACED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentStatus extends js.Object {
  // collection name
  var _collection: js.UndefOr[String] = js.native
  // unique document ID
  var _id: js.UndefOr[String] = js.native
  // error message, if any
  var error: js.UndefOr[ErrorModel] = js.native
  // status, one of ADDED, REPLACED, DELETED, ERROR
  var status: js.UndefOr[ADDED | REPLACED | DELETED | ERROR] = js.native
}

object DocumentStatus {
  @scala.inline
  def apply(): DocumentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentStatus]
  }
  @scala.inline
  implicit class DocumentStatusOps[Self <: DocumentStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_collection(value: String): Self = this.set("_collection", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_collection: Self = this.set("_collection", js.undefined)
    @scala.inline
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_id: Self = this.set("_id", js.undefined)
    @scala.inline
    def setError(value: ErrorModel): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setStatus(value: ADDED | REPLACED | DELETED | ERROR): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

