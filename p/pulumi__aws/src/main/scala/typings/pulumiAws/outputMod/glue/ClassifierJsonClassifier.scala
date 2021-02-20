package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassifierJsonClassifier extends StObject {
  
  /**
    * A `JsonPath` string defining the JSON data for the classifier to classify. AWS Glue supports a subset of `JsonPath`, as described in [Writing JsonPath Custom Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json).
    */
  var jsonPath: String = js.native
}
object ClassifierJsonClassifier {
  
  @scala.inline
  def apply(jsonPath: String): ClassifierJsonClassifier = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierJsonClassifier]
  }
  
  @scala.inline
  implicit class ClassifierJsonClassifierMutableBuilder[Self <: ClassifierJsonClassifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJsonPath(value: String): Self = StObject.set(x, "jsonPath", value.asInstanceOf[js.Any])
  }
}
