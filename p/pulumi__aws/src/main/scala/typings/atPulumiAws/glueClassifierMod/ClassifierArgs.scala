package typings.atPulumiAws.glueClassifierMod

import typings.atPulumiAws.Anon_ClassificationCustomPatterns
import typings.atPulumiAws.Anon_ClassificationRowTagInput
import typings.atPulumiAws.Anon_JsonPathInput
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassifierArgs extends js.Object {
  /**
    * A classifier that uses grok patterns. Defined below.
    */
  val grokClassifier: js.UndefOr[Input[Anon_ClassificationCustomPatterns]] = js.undefined
  /**
    * A classifier for JSON content. Defined below.
    */
  val jsonClassifier: js.UndefOr[Input[Anon_JsonPathInput]] = js.undefined
  /**
    * The name of the classifier.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A classifier for XML content. Defined below.
    */
  val xmlClassifier: js.UndefOr[Input[Anon_ClassificationRowTagInput]] = js.undefined
}

object ClassifierArgs {
  @scala.inline
  def apply(
    grokClassifier: Input[Anon_ClassificationCustomPatterns] = null,
    jsonClassifier: Input[Anon_JsonPathInput] = null,
    name: Input[String] = null,
    xmlClassifier: Input[Anon_ClassificationRowTagInput] = null
  ): ClassifierArgs = {
    val __obj = js.Dynamic.literal()
    if (grokClassifier != null) __obj.updateDynamic("grokClassifier")(grokClassifier.asInstanceOf[js.Any])
    if (jsonClassifier != null) __obj.updateDynamic("jsonClassifier")(jsonClassifier.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (xmlClassifier != null) __obj.updateDynamic("xmlClassifier")(xmlClassifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierArgs]
  }
}

