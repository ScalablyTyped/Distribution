package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassifierGrokClassifier extends StObject {
  
  /**
    * An identifier of the data format that the classifier matches.
    */
  var classification: String
  
  /**
    * Custom grok patterns used by this classifier.
    */
  var customPatterns: js.UndefOr[String] = js.undefined
  
  /**
    * The grok pattern used by this classifier.
    */
  var grokPattern: String
}
object ClassifierGrokClassifier {
  
  inline def apply(classification: String, grokPattern: String): ClassifierGrokClassifier = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], grokPattern = grokPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierGrokClassifier]
  }
  
  extension [Self <: ClassifierGrokClassifier](x: Self) {
    
    inline def setClassification(value: String): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setCustomPatterns(value: String): Self = StObject.set(x, "customPatterns", value.asInstanceOf[js.Any])
    
    inline def setCustomPatternsUndefined: Self = StObject.set(x, "customPatterns", js.undefined)
    
    inline def setGrokPattern(value: String): Self = StObject.set(x, "grokPattern", value.asInstanceOf[js.Any])
  }
}
