package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssignPublicIpSecurityGroups extends js.Object {
  var assignPublicIp: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var securityGroups: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var subnets: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
}

object Anon_AssignPublicIpSecurityGroups {
  @scala.inline
  def apply(
    subnets: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    assignPublicIp: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    securityGroups: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): Anon_AssignPublicIpSecurityGroups = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subnets")(subnets.asInstanceOf[js.Any])
    if (assignPublicIp != null) __obj.updateDynamic("assignPublicIp")(assignPublicIp.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AssignPublicIpSecurityGroups]
  }
}

