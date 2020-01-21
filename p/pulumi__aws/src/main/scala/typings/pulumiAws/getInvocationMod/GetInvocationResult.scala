package typings.pulumiAws.getInvocationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInvocationResult extends js.Object {
  val functionName: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val input: String = js.native
  val qualifier: js.UndefOr[String] = js.native
  /**
    * String result of the lambda function invocation.
    */
  val result: String = js.native
  /**
    * This field is set only if result is a map of primitive types, where the map is string keys and string values.
    */
  val resultMap: StringDictionary[String] = js.native
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
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], resultMap = resultMap.asInstanceOf[js.Any])
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInvocationResult]
  }
}

