package typings.atPulumiAws.typesInputMod.glueNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassifierGrokClassifier extends js.Object {
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
  def apply(classification: Input[String], grokPattern: Input[String], customPatterns: Input[String] = null): ClassifierGrokClassifier = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], grokPattern = grokPattern.asInstanceOf[js.Any])
    if (customPatterns != null) __obj.updateDynamic("customPatterns")(customPatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierGrokClassifier]
  }
}

