package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassifierJsonClassifier extends StObject {
  
  /**
    * A `JsonPath` string defining the JSON data for the classifier to classify. AWS Glue supports a subset of `JsonPath`, as described in [Writing JsonPath Custom Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json).
    */
  var jsonPath: Input[String]
}
object ClassifierJsonClassifier {
  
  @scala.inline
  def apply(jsonPath: Input[String]): ClassifierJsonClassifier = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierJsonClassifier]
  }
  
  @scala.inline
  implicit class ClassifierJsonClassifierMutableBuilder[Self <: ClassifierJsonClassifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJsonPath(value: Input[String]): Self = StObject.set(x, "jsonPath", value.asInstanceOf[js.Any])
  }
}
