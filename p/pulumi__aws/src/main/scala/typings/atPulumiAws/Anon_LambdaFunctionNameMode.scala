package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LambdaFunctionNameMode extends js.Object {
  var lambdaFunctionName: js.UndefOr[Input[String]] = js.undefined
  var mode: js.UndefOr[Input[String]] = js.undefined
  var webUrl: js.UndefOr[Input[String]] = js.undefined
}

object Anon_LambdaFunctionNameMode {
  @scala.inline
  def apply(lambdaFunctionName: Input[String] = null, mode: Input[String] = null, webUrl: Input[String] = null): Anon_LambdaFunctionNameMode = {
    val __obj = js.Dynamic.literal()
    if (lambdaFunctionName != null) __obj.updateDynamic("lambdaFunctionName")(lambdaFunctionName.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LambdaFunctionNameMode]
  }
}

