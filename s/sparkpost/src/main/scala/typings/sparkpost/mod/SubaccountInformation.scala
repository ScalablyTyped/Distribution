package typings.sparkpost.mod

import typings.sparkpost.sparkpostStrings.active
import typings.sparkpost.sparkpostStrings.suspended
import typings.sparkpost.sparkpostStrings.terminated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubaccountInformation extends js.Object {
  var compliance_status: String = js.native
  /** ID of subaccount */
  var id: Double = js.native
  /** The ID of the default IP Pool assigned to this subaccount’s transmissions */
  var ip_pool: js.UndefOr[String] = js.native
  /** User friendly identifier for a specific subaccount */
  var name: String = js.native
  /** Status of the account */
  var status: active | suspended | terminated = js.native
}

object SubaccountInformation {
  @scala.inline
  def apply(compliance_status: String, id: Double, name: String, status: active | suspended | terminated): SubaccountInformation = {
    val __obj = js.Dynamic.literal(compliance_status = compliance_status.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubaccountInformation]
  }
  @scala.inline
  implicit class SubaccountInformationOps[Self <: SubaccountInformation] (val x: Self) extends AnyVal {
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
    def setCompliance_status(value: String): Self = this.set("compliance_status", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: active | suspended | terminated): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setIp_pool(value: String): Self = this.set("ip_pool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIp_pool: Self = this.set("ip_pool", js.undefined)
  }
  
}

