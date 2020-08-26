package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetCustom[Custom /* <: ObjectCustom */] extends js.Object {
  var custom: js.UndefOr[Custom] = js.native
  var id: String = js.native
}

object SetCustom {
  @scala.inline
  def apply[/* <: typings.pubnub.mod.ObjectCustom */ Custom](id: String): SetCustom[Custom] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCustom[Custom]]
  }
  @scala.inline
  implicit class SetCustomOps[Self <: SetCustom[_], /* <: typings.pubnub.mod.ObjectCustom */ Custom] (val x: Self with SetCustom[Custom]) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom(value: Custom): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
  }
  
}

