package typings
package atPulumiAwsLib.lambdaGetFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFunctionArgs extends js.Object {
  /**
    * Name of the lambda function.
    */
  val functionName: java.lang.String
  /**
    * Qualifier of the lambda function. Defaults to `$LATEST`.
    */
  val qualifier: js.UndefOr[java.lang.String] = js.undefined
}

object GetFunctionArgs {
  @scala.inline
  def apply(functionName: java.lang.String, qualifier: java.lang.String = null): GetFunctionArgs = {
    val __obj = js.Dynamic.literal(functionName = functionName)
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier)
    __obj.asInstanceOf[GetFunctionArgs]
  }
}

