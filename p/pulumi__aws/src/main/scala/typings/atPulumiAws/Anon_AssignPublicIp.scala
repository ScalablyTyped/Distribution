package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssignPublicIp extends js.Object {
  var assignPublicIp: js.UndefOr[Boolean] = js.undefined
  var securityGroups: js.UndefOr[js.Array[String]] = js.undefined
  var subnets: js.Array[String]
}

object Anon_AssignPublicIp {
  @scala.inline
  def apply(
    subnets: js.Array[String],
    assignPublicIp: js.UndefOr[Boolean] = js.undefined,
    securityGroups: js.Array[String] = null
  ): Anon_AssignPublicIp = {
    val __obj = js.Dynamic.literal(subnets = subnets)
    if (!js.isUndefined(assignPublicIp)) __obj.updateDynamic("assignPublicIp")(assignPublicIp)
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups)
    __obj.asInstanceOf[Anon_AssignPublicIp]
  }
}

