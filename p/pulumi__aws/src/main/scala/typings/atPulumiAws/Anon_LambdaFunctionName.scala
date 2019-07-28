package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LambdaFunctionName extends js.Object {
  var lambdaFunctionName: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var webUrl: js.UndefOr[String] = js.undefined
}

object Anon_LambdaFunctionName {
  @scala.inline
  def apply(lambdaFunctionName: String = null, mode: String = null, webUrl: String = null): Anon_LambdaFunctionName = {
    val __obj = js.Dynamic.literal()
    if (lambdaFunctionName != null) __obj.updateDynamic("lambdaFunctionName")(lambdaFunctionName)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[Anon_LambdaFunctionName]
  }
}

