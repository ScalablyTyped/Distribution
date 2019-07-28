package typings.atPulumiAws.lambdaGetInvocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInvocationArgs extends js.Object {
  /**
    * The name of the lambda function.
    */
  val functionName: String
  /**
    * A string in JSON format that is passed as payload to the lambda function.
    */
  val input: String
  /**
    * The qualifier (a.k.a version) of the lambda function. Defaults
    * to `$LATEST`.
    */
  val qualifier: js.UndefOr[String] = js.undefined
}

object GetInvocationArgs {
  @scala.inline
  def apply(functionName: String, input: String, qualifier: String = null): GetInvocationArgs = {
    val __obj = js.Dynamic.literal(functionName = functionName, input = input)
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier)
    __obj.asInstanceOf[GetInvocationArgs]
  }
}

