package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PositionScopeTopicArn extends js.Object {
  var position: Input[Double]
  var scope: Input[String]
  var topicArn: js.UndefOr[Input[String]] = js.undefined
}

object Anon_PositionScopeTopicArn {
  @scala.inline
  def apply(position: Input[Double], scope: Input[String], topicArn: Input[String] = null): Anon_PositionScopeTopicArn = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PositionScopeTopicArn]
  }
}

