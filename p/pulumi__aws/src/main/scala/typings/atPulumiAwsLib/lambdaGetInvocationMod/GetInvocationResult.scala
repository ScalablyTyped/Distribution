package typings
package atPulumiAwsLib.lambdaGetInvocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInvocationResult extends js.Object {
  val functionName: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val input: java.lang.String
  val qualifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * String result of the lambda function invocation.
    */
  val result: java.lang.String
  val resultMap: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object GetInvocationResult {
  @scala.inline
  def apply(
    functionName: java.lang.String,
    id: java.lang.String,
    input: java.lang.String,
    result: java.lang.String,
    resultMap: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    qualifier: java.lang.String = null
  ): GetInvocationResult = {
    val __obj = js.Dynamic.literal(functionName = functionName, id = id, input = input, result = result, resultMap = resultMap)
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier)
    __obj.asInstanceOf[GetInvocationResult]
  }
}

