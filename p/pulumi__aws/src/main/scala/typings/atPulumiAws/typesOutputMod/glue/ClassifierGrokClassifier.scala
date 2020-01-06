package typings.atPulumiAws.typesOutputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifierGrokClassifier extends js.Object {
  /**
    * An identifier of the data format that the classifier matches.
    */
  var classification: String = js.native
  /**
    * Custom grok patterns used by this classifier.
    */
  var customPatterns: js.UndefOr[String] = js.native
  /**
    * The grok pattern used by this classifier.
    */
  var grokPattern: String = js.native
}

object ClassifierGrokClassifier {
  @scala.inline
  def apply(classification: String, grokPattern: String, customPatterns: String = null): ClassifierGrokClassifier = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], grokPattern = grokPattern.asInstanceOf[js.Any])
    if (customPatterns != null) __obj.updateDynamic("customPatterns")(customPatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierGrokClassifier]
  }
}

