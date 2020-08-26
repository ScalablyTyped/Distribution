package typings.pulumiAws.getFunctionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionArgs extends js.Object {
  /**
    * Name of the lambda function.
    */
  val functionName: String = js.native
  /**
    * Alias name or version number of the lambda function. e.g. `$LATEST`, `my-alias`, or `1`
    */
  val qualifier: js.UndefOr[String] = js.native
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetFunctionArgs {
  @scala.inline
  def apply(functionName: String): GetFunctionArgs = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionArgs]
  }
  @scala.inline
  implicit class GetFunctionArgsOps[Self <: GetFunctionArgs] (val x: Self) extends AnyVal {
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
    def setQualifier(value: String): Self = this.set("qualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualifier: Self = this.set("qualifier", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

