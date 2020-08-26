package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSubaccount extends js.Object {
  /** id of the default IP pool assigned to subaccount"s transmissions */
  var ip_pool: js.UndefOr[String] = js.native
  /** user-friendly name */
  var name: String = js.native
  /** status of the subaccount */
  var status: String = js.native
}

object UpdateSubaccount {
  @scala.inline
  def apply(name: String, status: String): UpdateSubaccount = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSubaccount]
  }
  @scala.inline
  implicit class UpdateSubaccountOps[Self <: UpdateSubaccount] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setIp_pool(value: String): Self = this.set("ip_pool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIp_pool: Self = this.set("ip_pool", js.undefined)
  }
  
}

