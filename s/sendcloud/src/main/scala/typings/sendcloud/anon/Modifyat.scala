package typings.sendcloud.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modifyat extends js.Object {
  var address: String = js.native
  var created_at: String = js.native
  var modify_at: String = js.native
  var name: String = js.native
  var subscribed: String = js.native
  var vars: js.Object = js.native
}

object Modifyat {
  @scala.inline
  def apply(
    address: String,
    created_at: String,
    modify_at: String,
    name: String,
    subscribed: String,
    vars: js.Object
  ): Modifyat = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], modify_at = modify_at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modifyat]
  }
  @scala.inline
  implicit class ModifyatOps[Self <: Modifyat] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setModify_at(value: String): Self = this.set("modify_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscribed(value: String): Self = this.set("subscribed", value.asInstanceOf[js.Any])
    @scala.inline
    def setVars(value: js.Object): Self = this.set("vars", value.asInstanceOf[js.Any])
  }
  
}

