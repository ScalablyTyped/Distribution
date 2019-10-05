package typings.atPulumiAws.glueClassifierMod

import typings.atPulumiAws.typesInputMod.glue.ClassifierGrokClassifier
import typings.atPulumiAws.typesInputMod.glue.ClassifierJsonClassifier
import typings.atPulumiAws.typesInputMod.glue.ClassifierXmlClassifier
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassifierArgs extends js.Object {
  /**
    * A classifier that uses grok patterns. Defined below.
    */
  val grokClassifier: js.UndefOr[Input[ClassifierGrokClassifier]] = js.undefined
  /**
    * A classifier for JSON content. Defined below.
    */
  val jsonClassifier: js.UndefOr[Input[ClassifierJsonClassifier]] = js.undefined
  /**
    * The name of the classifier.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A classifier for XML content. Defined below.
    */
  val xmlClassifier: js.UndefOr[Input[ClassifierXmlClassifier]] = js.undefined
}

object ClassifierArgs {
  @scala.inline
  def apply(
    grokClassifier: Input[ClassifierGrokClassifier] = null,
    jsonClassifier: Input[ClassifierJsonClassifier] = null,
    name: Input[String] = null,
    xmlClassifier: Input[ClassifierXmlClassifier] = null
  ): ClassifierArgs = {
    val __obj = js.Dynamic.literal()
    if (grokClassifier != null) __obj.updateDynamic("grokClassifier")(grokClassifier.asInstanceOf[js.Any])
    if (jsonClassifier != null) __obj.updateDynamic("jsonClassifier")(jsonClassifier.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (xmlClassifier != null) __obj.updateDynamic("xmlClassifier")(xmlClassifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierArgs]
  }
}

