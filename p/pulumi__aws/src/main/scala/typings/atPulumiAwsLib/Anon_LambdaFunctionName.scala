package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LambdaFunctionName extends js.Object {
  var lambdaFunctionName: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var webUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_LambdaFunctionName {
  @scala.inline
  def apply(
    lambdaFunctionName: java.lang.String = null,
    mode: java.lang.String = null,
    webUrl: java.lang.String = null
  ): Anon_LambdaFunctionName = {
    val __obj = js.Dynamic.literal()
    if (lambdaFunctionName != null) __obj.updateDynamic("lambdaFunctionName")(lambdaFunctionName)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[Anon_LambdaFunctionName]
  }
}

