package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClientPagingResponse extends js.Object {
  /** ClientPagingResponse limit */
  var limit: js.UndefOr[Double | Null] = js.native
  /** ClientPagingResponse next */
  var next: js.UndefOr[String | Null] = js.native
  /** ClientPagingResponse start */
  var start: js.UndefOr[String | Null] = js.native
}

object IClientPagingResponse {
  @scala.inline
  def apply(): IClientPagingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientPagingResponse]
  }
  @scala.inline
  implicit class IClientPagingResponseOps[Self <: IClientPagingResponse] (val x: Self) extends AnyVal {
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setLimitNull: Self = this.set("limit", null)
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setNextNull: Self = this.set("next", null)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStartNull: Self = this.set("start", null)
  }
  
}

