package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OrganizationArnPosition extends js.Object {
  var organizationArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var position: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var topicArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_OrganizationArnPosition {
  @scala.inline
  def apply(
    organizationArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    position: atPulumiPulumiLib.outputMod.Input[scala.Double],
    topicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_OrganizationArnPosition = {
    val __obj = js.Dynamic.literal(organizationArn = organizationArn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OrganizationArnPosition]
  }
}

