package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait v2ObjectParam[Custom /* <: ObjectCustom */] extends js.Object {
  var custom: js.UndefOr[Custom] = js.native
}

object v2ObjectParam {
  @scala.inline
  def apply[/* <: typings.pubnub.mod.ObjectCustom */ Custom](): v2ObjectParam[Custom] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[v2ObjectParam[Custom]]
  }
  @scala.inline
  implicit class v2ObjectParamOps[Self <: v2ObjectParam[_], /* <: typings.pubnub.mod.ObjectCustom */ Custom] (val x: Self with v2ObjectParam[Custom]) extends AnyVal {
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
    def setCustom(value: Custom): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
  }
  
}

