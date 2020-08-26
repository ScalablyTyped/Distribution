package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDocumentsRequestData extends js.Object {
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
  implicit class DeleteDocumentsRequestDataOps[Self <: DeleteDocumentsRequestData] (val x: Self) extends AnyVal {
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
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
  }
  
}

