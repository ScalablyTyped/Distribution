package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSubaccountResponse extends js.Object {
  var key: String = js.native
  var label: String = js.native
  var short_key: String = js.native
  var subaccount_id: Double = js.native
}

object CreateSubaccountResponse {
  @scala.inline
  def apply(key: String, label: String, short_key: String, subaccount_id: Double): CreateSubaccountResponse = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], short_key = short_key.asInstanceOf[js.Any], subaccount_id = subaccount_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubaccountResponse]
  }
  @scala.inline
  implicit class CreateSubaccountResponseOps[Self <: CreateSubaccountResponse] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setShort_key(value: String): Self = this.set("short_key", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubaccount_id(value: Double): Self = this.set("subaccount_id", value.asInstanceOf[js.Any])
  }
  
}

