package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssignPublicIpSecurityGroups extends js.Object {
  var assignPublicIp: js.UndefOr[Input[Boolean]] = js.undefined
  var securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var subnets: Input[js.Array[Input[String]]]
}

object Anon_AssignPublicIpSecurityGroups {
  @scala.inline
  def apply(
    subnets: Input[js.Array[Input[String]]],
    assignPublicIp: Input[Boolean] = null,
    securityGroups: Input[js.Array[Input[String]]] = null
  ): Anon_AssignPublicIpSecurityGroups = {
    val __obj = js.Dynamic.literal(subnets = subnets.asInstanceOf[js.Any])
    if (assignPublicIp != null) __obj.updateDynamic("assignPublicIp")(assignPublicIp.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AssignPublicIpSecurityGroups]
  }
}

