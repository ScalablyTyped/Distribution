package typings.atPulumiAws.typesOutputMod.glueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassifierJsonClassifier extends js.Object {
  /**
    * A `JsonPath` string defining the JSON data for the classifier to classify. AWS Glue supports a subset of `JsonPath`, as described in [Writing JsonPath Custom Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json).
    */
  var jsonPath: String
}

object ClassifierJsonClassifier {
  @scala.inline
  def apply(jsonPath: String): ClassifierJsonClassifier = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath)
  
    __obj.asInstanceOf[ClassifierJsonClassifier]
  }
}

