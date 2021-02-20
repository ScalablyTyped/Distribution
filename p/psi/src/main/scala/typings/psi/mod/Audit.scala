package typings.psi.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Audit extends StObject {
  
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
  implicit class AuditMutableBuilder[Self <: Audit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: StringDictionary[js.Object]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: js.Object): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreDisplayMode(value: String): Self = StObject.set(x, "scoreDisplayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnings(value: js.Object): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
  }
}
