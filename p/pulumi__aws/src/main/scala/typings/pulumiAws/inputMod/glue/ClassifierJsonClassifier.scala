package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifierJsonClassifier extends js.Object {
  /**
    * A `JsonPath` string defining the JSON data for the classifier to classify. AWS Glue supports a subset of `JsonPath`, as described in [Writing JsonPath Custom Classifiers](https://docs.aws.amazon.com/glue/latest/dg/custom-classifier.html#custom-classifier-json).
    */
  var jsonPath: Input[String] = js.native
}

object ClassifierJsonClassifier {
  @scala.inline
  def apply(jsonPath: Input[String]): ClassifierJsonClassifier = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierJsonClassifier]
  }
}

