package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FunctionArnInvocationTypePosition extends js.Object {
  var functionArn: Input[String]
  var invocationType: js.UndefOr[Input[String]] = js.undefined
  var position: Input[Double]
  var topicArn: js.UndefOr[Input[String]] = js.undefined
}

object Anon_FunctionArnInvocationTypePosition {
  @scala.inline
  def apply(
    functionArn: Input[String],
    position: Input[Double],
    invocationType: Input[String] = null,
    topicArn: Input[String] = null
  ): Anon_FunctionArnInvocationTypePosition = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    if (invocationType != null) __obj.updateDynamic("invocationType")(invocationType.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FunctionArnInvocationTypePosition]
  }
}

