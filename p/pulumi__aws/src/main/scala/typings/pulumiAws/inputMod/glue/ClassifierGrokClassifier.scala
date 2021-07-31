package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassifierGrokClassifier extends StObject {
  
  /**
    * An identifier of the data format that the classifier matches.
    */
  var classification: Input[String]
  
  /**
    * Custom grok patterns used by this classifier.
    */
  var customPatterns: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The grok pattern used by this classifier.
    */
  var grokPattern: Input[String]
}
object ClassifierGrokClassifier {
  
  @scala.inline
  def apply(classification: Input[String], grokPattern: Input[String]): ClassifierGrokClassifier = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], grokPattern = grokPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierGrokClassifier]
  }
  
  @scala.inline
  implicit class ClassifierGrokClassifierMutableBuilder[Self <: ClassifierGrokClassifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassification(value: Input[String]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomPatterns(value: Input[String]): Self = StObject.set(x, "customPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomPatternsUndefined: Self = StObject.set(x, "customPatterns", js.undefined)
    
    @scala.inline
    def setGrokPattern(value: Input[String]): Self = StObject.set(x, "grokPattern", value.asInstanceOf[js.Any])
  }
}
