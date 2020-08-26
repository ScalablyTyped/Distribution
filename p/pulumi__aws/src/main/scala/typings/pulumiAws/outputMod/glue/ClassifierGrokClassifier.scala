package typings.pulumiAws.outputMod.glue

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
  def apply(classification: String, grokPattern: String): ClassifierGrokClassifier = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], grokPattern = grokPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierGrokClassifier]
  }
  @scala.inline
  implicit class ClassifierGrokClassifierOps[Self <: ClassifierGrokClassifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassification(value: String): Self = this.set("classification", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrokPattern(value: String): Self = this.set("grokPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomPatterns(value: String): Self = this.set("customPatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomPatterns: Self = this.set("customPatterns", js.undefined)
  }
  
}

