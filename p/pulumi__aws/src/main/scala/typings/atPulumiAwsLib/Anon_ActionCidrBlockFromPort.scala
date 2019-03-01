package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionCidrBlockFromPort extends js.Object {
  var action: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var cidrBlock: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var fromPort: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var icmpCode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var icmpType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var ipv6CidrBlock: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var protocol: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var ruleNo: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var toPort: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object Anon_ActionCidrBlockFromPort {
  @scala.inline
  def apply(
    action: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    fromPort: atPulumiPulumiLib.outputMod.Input[scala.Double],
    protocol: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    ruleNo: atPulumiPulumiLib.outputMod.Input[scala.Double],
    toPort: atPulumiPulumiLib.outputMod.Input[scala.Double],
    cidrBlock: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    icmpCode: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    icmpType: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    ipv6CidrBlock: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_ActionCidrBlockFromPort = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("fromPort")(fromPort.asInstanceOf[js.Any])
    __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.updateDynamic("ruleNo")(ruleNo.asInstanceOf[js.Any])
    __obj.updateDynamic("toPort")(toPort.asInstanceOf[js.Any])
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock.asInstanceOf[js.Any])
    if (icmpCode != null) __obj.updateDynamic("icmpCode")(icmpCode.asInstanceOf[js.Any])
    if (icmpType != null) __obj.updateDynamic("icmpType")(icmpType.asInstanceOf[js.Any])
    if (ipv6CidrBlock != null) __obj.updateDynamic("ipv6CidrBlock")(ipv6CidrBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionCidrBlockFromPort]
  }
}

