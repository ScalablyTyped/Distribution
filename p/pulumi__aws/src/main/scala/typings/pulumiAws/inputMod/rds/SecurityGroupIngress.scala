package typings.pulumiAws.inputMod.rds

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityGroupIngress extends js.Object {
  /**
    * The CIDR block to accept
    */
  var cidr: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the security group to authorize
    */
  var securityGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the security group to authorize
    */
  var securityGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The owner Id of the security group provided
    * by `securityGroupName`.
    */
  var securityGroupOwnerId: js.UndefOr[Input[String]] = js.native
}

object SecurityGroupIngress {
  @scala.inline
  def apply(): SecurityGroupIngress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupIngress]
  }
  @scala.inline
  implicit class SecurityGroupIngressOps[Self <: SecurityGroupIngress] (val x: Self) extends AnyVal {
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
    def setCidr(value: Input[String]): Self = this.set("cidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidr: Self = this.set("cidr", js.undefined)
    @scala.inline
    def setSecurityGroupId(value: Input[String]): Self = this.set("securityGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupId: Self = this.set("securityGroupId", js.undefined)
    @scala.inline
    def setSecurityGroupName(value: Input[String]): Self = this.set("securityGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupName: Self = this.set("securityGroupName", js.undefined)
    @scala.inline
    def setSecurityGroupOwnerId(value: Input[String]): Self = this.set("securityGroupOwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupOwnerId: Self = this.set("securityGroupOwnerId", js.undefined)
  }
  
}

