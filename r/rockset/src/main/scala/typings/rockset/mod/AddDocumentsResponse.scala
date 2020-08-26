package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddDocumentsResponse extends js.Object {
  // information about the added documents
  var data: js.UndefOr[js.Array[DocumentStatus]] = js.native
}

object AddDocumentsResponse {
  @scala.inline
  def apply(): AddDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddDocumentsResponse]
  }
  @scala.inline
  implicit class AddDocumentsResponseOps[Self <: AddDocumentsResponse] (val x: Self) extends AnyVal {
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
    def setDataVarargs(value: DocumentStatus*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[DocumentStatus]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

