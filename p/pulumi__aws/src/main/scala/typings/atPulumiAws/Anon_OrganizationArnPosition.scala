package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OrganizationArnPosition extends js.Object {
  var organizationArn: Input[String]
  var position: Input[Double]
  var topicArn: js.UndefOr[Input[String]] = js.undefined
}

object Anon_OrganizationArnPosition {
  @scala.inline
  def apply(organizationArn: Input[String], position: Input[Double], topicArn: Input[String] = null): Anon_OrganizationArnPosition = {
    val __obj = js.Dynamic.literal(organizationArn = organizationArn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OrganizationArnPosition]
  }
}

