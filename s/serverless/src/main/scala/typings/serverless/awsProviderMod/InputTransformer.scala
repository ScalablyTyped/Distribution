package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputTransformer extends js.Object {
  var inputPathsMap: StringDictionary[String] = js.native
  var inputTemplate: String = js.native
}

object InputTransformer {
  @scala.inline
  def apply(inputPathsMap: StringDictionary[String], inputTemplate: String): InputTransformer = {
    val __obj = js.Dynamic.literal(inputPathsMap = inputPathsMap.asInstanceOf[js.Any], inputTemplate = inputTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTransformer]
  }
  @scala.inline
  implicit class InputTransformerOps[Self <: InputTransformer] (val x: Self) extends AnyVal {
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
    def setInputPathsMap(value: StringDictionary[String]): Self = this.set("inputPathsMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputTemplate(value: String): Self = this.set("inputTemplate", value.asInstanceOf[js.Any])
  }
  
}

