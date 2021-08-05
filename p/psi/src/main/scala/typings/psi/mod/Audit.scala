package typings.psi.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Audit extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: Audit](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: StringDictionary[js.Object]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setScore(value: js.Object): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreDisplayMode(value: String): Self = StObject.set(x, "scoreDisplayMode", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Object): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
  }
}
