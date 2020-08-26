package typings.psi.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Audit extends js.Object {
  var description: String = js.native
  var details: StringDictionary[js.Object] = js.native
  var displayValue: String = js.native
  var errorMessage: String = js.native
  var explanation: String = js.native
  var id: String = js.native
  var score: js.Object = js.native
  var scoreDisplayMode: String = js.native
  var title: String = js.native
  var warnings: js.Object = js.native
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
  @scala.inline
  implicit class AuditOps[Self <: Audit] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetails(value: StringDictionary[js.Object]): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayValue(value: String): Self = this.set("displayValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setExplanation(value: String): Self = this.set("explanation", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setScore(value: js.Object): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def setScoreDisplayMode(value: String): Self = this.set("scoreDisplayMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarnings(value: js.Object): Self = this.set("warnings", value.asInstanceOf[js.Any])
  }
  
}

