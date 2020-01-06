package typings.atPulumiAws.typesOutputMod.cloudwatch

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTargetInputTransformer extends js.Object {
  /**
    * Key value pairs specified in the form of JSONPath (for example, time = $.time)
    */
  var inputPaths: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Structure containing the template body.
    */
  var inputTemplate: String = js.native
}

object EventTargetInputTransformer {
  @scala.inline
  def apply(inputTemplate: String, inputPaths: StringDictionary[js.Any] = null): EventTargetInputTransformer = {
    val __obj = js.Dynamic.literal(inputTemplate = inputTemplate.asInstanceOf[js.Any])
    if (inputPaths != null) __obj.updateDynamic("inputPaths")(inputPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetInputTransformer]
  }
}

