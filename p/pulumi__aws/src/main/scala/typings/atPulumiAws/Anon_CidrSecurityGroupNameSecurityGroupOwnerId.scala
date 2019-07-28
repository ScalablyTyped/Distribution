package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CidrSecurityGroupNameSecurityGroupOwnerId extends js.Object {
  var cidr: js.UndefOr[Input[String]] = js.undefined
  var securityGroupName: js.UndefOr[Input[String]] = js.undefined
  var securityGroupOwnerId: js.UndefOr[Input[String]] = js.undefined
}

object Anon_CidrSecurityGroupNameSecurityGroupOwnerId {
  @scala.inline
  def apply(
    cidr: Input[String] = null,
    securityGroupName: Input[String] = null,
    securityGroupOwnerId: Input[String] = null
  ): Anon_CidrSecurityGroupNameSecurityGroupOwnerId = {
    val __obj = js.Dynamic.literal()
    if (cidr != null) __obj.updateDynamic("cidr")(cidr.asInstanceOf[js.Any])
    if (securityGroupName != null) __obj.updateDynamic("securityGroupName")(securityGroupName.asInstanceOf[js.Any])
    if (securityGroupOwnerId != null) __obj.updateDynamic("securityGroupOwnerId")(securityGroupOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CidrSecurityGroupNameSecurityGroupOwnerId]
  }
}

