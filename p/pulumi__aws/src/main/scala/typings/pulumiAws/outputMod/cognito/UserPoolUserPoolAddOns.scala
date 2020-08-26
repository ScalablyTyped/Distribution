package typings.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolUserPoolAddOns extends js.Object {
  /**
    * The mode for advanced security, must be one of `OFF`, `AUDIT` or `ENFORCED`.
    */
  var advancedSecurityMode: String = js.native
}

object UserPoolUserPoolAddOns {
  @scala.inline
  def apply(advancedSecurityMode: String): UserPoolUserPoolAddOns = {
    val __obj = js.Dynamic.literal(advancedSecurityMode = advancedSecurityMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolUserPoolAddOns]
  }
  @scala.inline
  implicit class UserPoolUserPoolAddOnsOps[Self <: UserPoolUserPoolAddOns] (val x: Self) extends AnyVal {
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
    def setAdvancedSecurityMode(value: String): Self = this.set("advancedSecurityMode", value.asInstanceOf[js.Any])
  }
  
}

