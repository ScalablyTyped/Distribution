package typings.pulumiAws.inputMod.cloudwatch

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTargetInputTransformer extends js.Object {
  /**
    * Key value pairs specified in the form of JSONPath (for example, time = $.time)
    */
  var inputPaths: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Structure containing the template body.
    */
  var inputTemplate: Input[String] = js.native
}

object EventTargetInputTransformer {
  @scala.inline
  def apply(inputTemplate: Input[String]): EventTargetInputTransformer = {
    val __obj = js.Dynamic.literal(inputTemplate = inputTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetInputTransformer]
  }
  @scala.inline
  implicit class EventTargetInputTransformerOps[Self <: EventTargetInputTransformer] (val x: Self) extends AnyVal {
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
    def setInputTemplate(value: Input[String]): Self = this.set("inputTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputPaths(value: Input[StringDictionary[Input[String]]]): Self = this.set("inputPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputPaths: Self = this.set("inputPaths", js.undefined)
  }
  
}

