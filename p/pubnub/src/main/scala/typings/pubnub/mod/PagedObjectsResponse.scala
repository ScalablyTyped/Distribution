package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagedObjectsResponse[DataType]
  extends ObjectsResponse[js.Array[DataType]] {
  var next: js.UndefOr[String] = js.native
  var prev: js.UndefOr[String] = js.native
  var totalCount: js.UndefOr[Double] = js.native
}

object PagedObjectsResponse {
  @scala.inline
  def apply[DataType](data: js.Array[DataType], status: Double): PagedObjectsResponse[DataType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagedObjectsResponse[DataType]]
  }
  @scala.inline
  implicit class PagedObjectsResponseOps[Self <: PagedObjectsResponse[_], DataType] (val x: Self with PagedObjectsResponse[DataType]) extends AnyVal {
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
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setPrev(value: String): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrev: Self = this.set("prev", js.undefined)
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
  }
  
}

