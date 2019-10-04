package typings.atPulumiAws.typesInputMod.cloudwatchNs

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTargetInputTransformer extends js.Object {
  /**
    * Key value pairs specified in the form of JSONPath (for example, time = $.time)
    */
  var inputPaths: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Structure containing the template body.
    */
  var inputTemplate: Input[String]
}

object EventTargetInputTransformer {
  @scala.inline
  def apply(inputTemplate: Input[String], inputPaths: Input[StringDictionary[_]] = null): EventTargetInputTransformer = {
    val __obj = js.Dynamic.literal(inputTemplate = inputTemplate.asInstanceOf[js.Any])
    if (inputPaths != null) __obj.updateDynamic("inputPaths")(inputPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetInputTransformer]
  }
}

