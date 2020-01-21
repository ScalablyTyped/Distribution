package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifierGrokClassifier extends js.Object {
  /**
    * An identifier of the data format that the classifier matches.
    */
  var classification: Input[String] = js.native
  /**
    * Custom grok patterns used by this classifier.
    */
  var customPatterns: js.UndefOr[Input[String]] = js.native
  /**
    * The grok pattern used by this classifier.
    */
  var grokPattern: Input[String] = js.native
}

object ClassifierGrokClassifier {
  @scala.inline
  def apply(classification: Input[String], grokPattern: Input[String], customPatterns: Input[String] = null): ClassifierGrokClassifier = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], grokPattern = grokPattern.asInstanceOf[js.Any])
    if (customPatterns != null) __obj.updateDynamic("customPatterns")(customPatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierGrokClassifier]
  }
}

