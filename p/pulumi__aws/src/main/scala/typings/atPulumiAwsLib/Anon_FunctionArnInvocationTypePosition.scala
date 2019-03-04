package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FunctionArnInvocationTypePosition extends js.Object {
  var functionArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var invocationType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var position: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var topicArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_FunctionArnInvocationTypePosition {
  @scala.inline
  def apply(
    functionArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    position: atPulumiPulumiLib.outputMod.Input[scala.Double],
    invocationType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    topicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_FunctionArnInvocationTypePosition = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    if (invocationType != null) __obj.updateDynamic("invocationType")(invocationType.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FunctionArnInvocationTypePosition]
  }
}

