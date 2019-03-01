package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionCidrBlock extends js.Object {
  var action: java.lang.String
  var cidrBlock: js.UndefOr[java.lang.String] = js.undefined
  var fromPort: scala.Double
  var icmpCode: js.UndefOr[scala.Double] = js.undefined
  var icmpType: js.UndefOr[scala.Double] = js.undefined
  var ipv6CidrBlock: js.UndefOr[java.lang.String] = js.undefined
  var protocol: java.lang.String
  var ruleNo: scala.Double
  var toPort: scala.Double
}

object Anon_ActionCidrBlock {
  @scala.inline
  def apply(
    action: java.lang.String,
    fromPort: scala.Double,
    protocol: java.lang.String,
    ruleNo: scala.Double,
    toPort: scala.Double,
    cidrBlock: java.lang.String = null,
    icmpCode: scala.Int | scala.Double = null,
    icmpType: scala.Int | scala.Double = null,
    ipv6CidrBlock: java.lang.String = null
  ): Anon_ActionCidrBlock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("fromPort")(fromPort)
    __obj.updateDynamic("protocol")(protocol)
    __obj.updateDynamic("ruleNo")(ruleNo)
    __obj.updateDynamic("toPort")(toPort)
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock)
    if (icmpCode != null) __obj.updateDynamic("icmpCode")(icmpCode.asInstanceOf[js.Any])
    if (icmpType != null) __obj.updateDynamic("icmpType")(icmpType.asInstanceOf[js.Any])
    if (ipv6CidrBlock != null) __obj.updateDynamic("ipv6CidrBlock")(ipv6CidrBlock)
    __obj.asInstanceOf[Anon_ActionCidrBlock]
  }
}

