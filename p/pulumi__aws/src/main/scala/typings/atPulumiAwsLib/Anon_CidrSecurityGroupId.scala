package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CidrSecurityGroupId extends js.Object {
  var cidr: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var securityGroupId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var securityGroupName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var securityGroupOwnerId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_CidrSecurityGroupId {
  @scala.inline
  def apply(
    cidr: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    securityGroupId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    securityGroupName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    securityGroupOwnerId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_CidrSecurityGroupId = {
    val __obj = js.Dynamic.literal()
    if (cidr != null) __obj.updateDynamic("cidr")(cidr.asInstanceOf[js.Any])
    if (securityGroupId != null) __obj.updateDynamic("securityGroupId")(securityGroupId.asInstanceOf[js.Any])
    if (securityGroupName != null) __obj.updateDynamic("securityGroupName")(securityGroupName.asInstanceOf[js.Any])
    if (securityGroupOwnerId != null) __obj.updateDynamic("securityGroupOwnerId")(securityGroupOwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CidrSecurityGroupId]
  }
}

