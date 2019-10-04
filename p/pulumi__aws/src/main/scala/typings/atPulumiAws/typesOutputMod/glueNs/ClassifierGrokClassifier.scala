package typings.atPulumiAws.typesOutputMod.glueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassifierGrokClassifier extends js.Object {
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
  @scala.inline
  def apply(classification: String, grokPattern: String, customPatterns: String = null): ClassifierGrokClassifier = {
    val __obj = js.Dynamic.literal(classification = classification, grokPattern = grokPattern)
    if (customPatterns != null) __obj.updateDynamic("customPatterns")(customPatterns)
    __obj.asInstanceOf[ClassifierGrokClassifier]
  }
}

