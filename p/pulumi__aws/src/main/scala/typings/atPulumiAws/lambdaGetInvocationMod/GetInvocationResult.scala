package typings.atPulumiAws.lambdaGetInvocationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInvocationResult extends js.Object {
  val functionName: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val input: String
  val qualifier: js.UndefOr[String] = js.undefined
  /**
    * String result of the lambda function invocation.
    */
  val result: String
  val resultMap: StringDictionary[String]
}

object GetInvocationResult {
  @scala.inline
  def apply(
    functionName: String,
    id: String,
    input: String,
    result: String,
    resultMap: StringDictionary[String],
    qualifier: String = null
  ): GetInvocationResult = {
    val __obj = js.Dynamic.literal(functionName = functionName, id = id, input = input, result = result, resultMap = resultMap)
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier)
    __obj.asInstanceOf[GetInvocationResult]
  }
}

