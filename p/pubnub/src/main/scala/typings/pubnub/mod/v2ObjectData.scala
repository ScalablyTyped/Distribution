package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait v2ObjectData[Custom /* <: ObjectCustom */] extends js.Object {
  var custom: js.UndefOr[Custom | Null] = js.native
  var eTag: String = js.native
  var id: String = js.native
  var updated: String = js.native
}

object v2ObjectData {
  @scala.inline
  def apply[/* <: typings.pubnub.mod.ObjectCustom */ Custom](eTag: String, id: String, updated: String): v2ObjectData[Custom] = {
    val __obj = js.Dynamic.literal(eTag = eTag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[v2ObjectData[Custom]]
  }
  @scala.inline
  implicit class v2ObjectDataOps[Self <: v2ObjectData[_], /* <: typings.pubnub.mod.ObjectCustom */ Custom] (val x: Self with v2ObjectData[Custom]) extends AnyVal {
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
    def setETag(value: String): Self = this.set("eTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom(value: Custom): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setCustomNull: Self = this.set("custom", null)
  }
  
}

