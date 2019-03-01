package typings
package atPulumiAwsLib.lambdaGetInvocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInvocationResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * A result of the lambda function invocation.
    */
  val result: java.lang.String
  /**
    * This field is set only if result is a map of primitive types.
    */
  val resultMap: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object GetInvocationResult {
  @scala.inline
  def apply(
    id: java.lang.String,
    result: java.lang.String,
    resultMap: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): GetInvocationResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("resultMap")(resultMap)
    __obj.asInstanceOf[GetInvocationResult]
  }
}

