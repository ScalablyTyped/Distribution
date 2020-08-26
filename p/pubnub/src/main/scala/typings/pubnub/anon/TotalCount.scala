package typings.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TotalCount extends js.Object {
  var customFields: js.UndefOr[Boolean] = js.native
  var totalCount: js.UndefOr[Boolean] = js.native
}

object TotalCount {
  @scala.inline
  def apply(): TotalCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotalCount]
  }
  @scala.inline
  implicit class TotalCountOps[Self <: TotalCount] (val x: Self) extends AnyVal {
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
    def setCustomFields(value: Boolean): Self = this.set("customFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomFields: Self = this.set("customFields", js.undefined)
    @scala.inline
    def setTotalCount(value: Boolean): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalCount: Self = this.set("totalCount", js.undefined)
  }
  
}

