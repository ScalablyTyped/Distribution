package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionCidrBlockFromPort extends js.Object {
  var action: Input[String]
  var cidrBlock: js.UndefOr[Input[String]] = js.undefined
  var fromPort: Input[Double]
  var icmpCode: js.UndefOr[Input[Double]] = js.undefined
  var icmpType: js.UndefOr[Input[Double]] = js.undefined
  var ipv6CidrBlock: js.UndefOr[Input[String]] = js.undefined
  var protocol: Input[String]
  var ruleNo: Input[Double]
  var toPort: Input[Double]
}

object Anon_ActionCidrBlockFromPort {
  @scala.inline
  def apply(
    action: Input[String],
    fromPort: Input[Double],
    protocol: Input[String],
    ruleNo: Input[Double],
    toPort: Input[Double],
    cidrBlock: Input[String] = null,
    icmpCode: Input[Double] = null,
    icmpType: Input[Double] = null,
    ipv6CidrBlock: Input[String] = null
  ): Anon_ActionCidrBlockFromPort = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], ruleNo = ruleNo.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock.asInstanceOf[js.Any])
    if (icmpCode != null) __obj.updateDynamic("icmpCode")(icmpCode.asInstanceOf[js.Any])
    if (icmpType != null) __obj.updateDynamic("icmpType")(icmpType.asInstanceOf[js.Any])
    if (ipv6CidrBlock != null) __obj.updateDynamic("ipv6CidrBlock")(ipv6CidrBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionCidrBlockFromPort]
  }
}

