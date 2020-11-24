package typings.pulumiAws.organizationAdminAccountMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationAdminAccountArgs extends js.Object {
  
  /**
    * AWS account identifier to designate as a delegated administrator for GuardDuty.
    */
  val adminAccountId: Input[String] = js.native
}
object OrganizationAdminAccountArgs {
  
  @scala.inline
  def apply(adminAccountId: Input[String]): OrganizationAdminAccountArgs = {
    val __obj = js.Dynamic.literal(adminAccountId = adminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationAdminAccountArgs]
  }
  
  @scala.inline
  implicit class OrganizationAdminAccountArgsOps[Self <: OrganizationAdminAccountArgs] (val x: Self) extends AnyVal {
    
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
    def setAdminAccountId(value: Input[String]): Self = this.set("adminAccountId", value.asInstanceOf[js.Any])
  }
}
