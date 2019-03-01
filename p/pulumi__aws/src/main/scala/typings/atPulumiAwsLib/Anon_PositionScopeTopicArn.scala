package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PositionScopeTopicArn extends js.Object {
  var position: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var scope: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var topicArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_PositionScopeTopicArn {
  @scala.inline
  def apply(
    position: atPulumiPulumiLib.outputMod.Input[scala.Double],
    scope: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    topicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_PositionScopeTopicArn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PositionScopeTopicArn]
  }
}

