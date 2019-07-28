package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionCidrBlock extends js.Object {
  var action: String
  var cidrBlock: js.UndefOr[String] = js.undefined
  var fromPort: Double
  var icmpCode: js.UndefOr[Double] = js.undefined
  var icmpType: js.UndefOr[Double] = js.undefined
  var ipv6CidrBlock: js.UndefOr[String] = js.undefined
  var protocol: String
  var ruleNo: Double
  var toPort: Double
}

object Anon_ActionCidrBlock {
  @scala.inline
  def apply(
    action: String,
    fromPort: Double,
    protocol: String,
    ruleNo: Double,
    toPort: Double,
    cidrBlock: String = null,
    icmpCode: Int | Double = null,
    icmpType: Int | Double = null,
    ipv6CidrBlock: String = null
  ): Anon_ActionCidrBlock = {
    val __obj = js.Dynamic.literal(action = action, fromPort = fromPort, protocol = protocol, ruleNo = ruleNo, toPort = toPort)
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock)
    if (icmpCode != null) __obj.updateDynamic("icmpCode")(icmpCode.asInstanceOf[js.Any])
    if (icmpType != null) __obj.updateDynamic("icmpType")(icmpType.asInstanceOf[js.Any])
    if (ipv6CidrBlock != null) __obj.updateDynamic("ipv6CidrBlock")(ipv6CidrBlock)
    __obj.asInstanceOf[Anon_ActionCidrBlock]
  }
}

