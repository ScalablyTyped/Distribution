package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssignPublicIp extends js.Object {
  var assignPublicIp: js.UndefOr[scala.Boolean] = js.undefined
  var securityGroups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var subnets: js.Array[java.lang.String]
}

object Anon_AssignPublicIp {
  @scala.inline
  def apply(
    subnets: js.Array[java.lang.String],
    assignPublicIp: js.UndefOr[scala.Boolean] = js.undefined,
    securityGroups: js.Array[java.lang.String] = null
  ): Anon_AssignPublicIp = {
    val __obj = js.Dynamic.literal(subnets = subnets)
    if (!js.isUndefined(assignPublicIp)) __obj.updateDynamic("assignPublicIp")(assignPublicIp)
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups)
    __obj.asInstanceOf[Anon_AssignPublicIp]
  }
}

