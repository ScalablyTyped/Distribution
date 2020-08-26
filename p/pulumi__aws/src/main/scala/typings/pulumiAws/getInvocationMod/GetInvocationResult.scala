package typings.pulumiAws.getInvocationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInvocationResult extends js.Object {
  val functionName: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val input: String = js.native
  val qualifier: js.UndefOr[String] = js.native
  /**
    * String result of the lambda function invocation.
    */
  val result: String = js.native
  /**
    * (**DEPRECATED**) This field is set only if result is a map of primitive types, where the map is string keys and string values.
    *
    * @deprecated use `result` attribute with jsondecode() function
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
    resultMap: StringDictionary[String]
  ): GetInvocationResult = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], resultMap = resultMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInvocationResult]
  }
  @scala.inline
  implicit class GetInvocationResultOps[Self <: GetInvocationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultMap(value: StringDictionary[String]): Self = this.set("resultMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setQualifier(value: String): Self = this.set("qualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualifier: Self = this.set("qualifier", js.undefined)
  }
  
}

