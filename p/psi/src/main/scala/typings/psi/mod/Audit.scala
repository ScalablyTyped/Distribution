package typings.psi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audit extends js.Object {
  var description: String
  var details: StringDictionary[js.Object]
  var displayValue: String
  var errorMessage: String
  var explanation: String
  var id: String
  var score: js.Object
  var scoreDisplayMode: String
  var title: String
  var warnings: js.Object
}

object Audit {
  @scala.inline
  def apply(
    description: String,
    details: StringDictionary[js.Object],
    displayValue: String,
    errorMessage: String,
    explanation: String,
    id: String,
    score: js.Object,
    scoreDisplayMode: String,
    title: String,
    warnings: js.Object
  ): Audit = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], displayValue = displayValue.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], explanation = explanation.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], scoreDisplayMode = scoreDisplayMode.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audit]
  }
}

