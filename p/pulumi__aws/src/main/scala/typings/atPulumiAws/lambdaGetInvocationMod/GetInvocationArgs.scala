package typings.atPulumiAws.lambdaGetInvocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInvocationArgs extends js.Object {
  /**
    * The name of the lambda function.
    */
  val functionName: String = js.native
  /**
    * A string in JSON format that is passed as payload to the lambda function.
    */
  val input: String = js.native
  /**
    * The qualifier (a.k.a version) of the lambda function. Defaults
    * to `$LATEST`.
    */
  val qualifier: js.UndefOr[String] = js.native
}

object GetInvocationArgs {
  @scala.inline
  def apply(functionName: String, input: String, qualifier: String = null): GetInvocationArgs = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInvocationArgs]
  }
}

