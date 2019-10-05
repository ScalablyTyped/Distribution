package typings.atPulumiAws.typesOutputMod.cloudwatch

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTargetInputTransformer extends js.Object {
  /**
    * Key value pairs specified in the form of JSONPath (for example, time = $.time)
    */
  var inputPaths: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Structure containing the template body.
    */
  var inputTemplate: String
}

object EventTargetInputTransformer {
  @scala.inline
  def apply(inputTemplate: String, inputPaths: StringDictionary[js.Any] = null): EventTargetInputTransformer = {
    val __obj = js.Dynamic.literal(inputTemplate = inputTemplate)
    if (inputPaths != null) __obj.updateDynamic("inputPaths")(inputPaths)
    __obj.asInstanceOf[EventTargetInputTransformer]
  }
}

