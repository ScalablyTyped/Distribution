package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCollectionResponse extends js.Object {
  // collection that was deleted
  var data: js.UndefOr[Collection] = js.native
}

object DeleteCollectionResponse {
  @scala.inline
  def apply(): DeleteCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCollectionResponse]
  }
  @scala.inline
  implicit class DeleteCollectionResponseOps[Self <: DeleteCollectionResponse] (val x: Self) extends AnyVal {
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
    def setData(value: Collection): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

