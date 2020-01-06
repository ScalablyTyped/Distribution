package typings.atPulumiAws.glueClassifierMod

import typings.atPulumiAws.typesInputMod.glue.ClassifierCsvClassifier
import typings.atPulumiAws.typesInputMod.glue.ClassifierGrokClassifier
import typings.atPulumiAws.typesInputMod.glue.ClassifierJsonClassifier
import typings.atPulumiAws.typesInputMod.glue.ClassifierXmlClassifier
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifierState extends js.Object {
  /**
    * A classifier for Csv content. Defined below.
    */
  val csvClassifier: js.UndefOr[Input[ClassifierCsvClassifier]] = js.native
  /**
    * A classifier that uses grok patterns. Defined below.
    */
  val grokClassifier: js.UndefOr[Input[ClassifierGrokClassifier]] = js.native
  /**
    * A classifier for JSON content. Defined below.
    */
  val jsonClassifier: js.UndefOr[Input[ClassifierJsonClassifier]] = js.native
  /**
    * The name of the classifier.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A classifier for XML content. Defined below.
    */
  val xmlClassifier: js.UndefOr[Input[ClassifierXmlClassifier]] = js.native
}

object ClassifierState {
  @scala.inline
  def apply(
    csvClassifier: Input[ClassifierCsvClassifier] = null,
    grokClassifier: Input[ClassifierGrokClassifier] = null,
    jsonClassifier: Input[ClassifierJsonClassifier] = null,
    name: Input[String] = null,
    xmlClassifier: Input[ClassifierXmlClassifier] = null
  ): ClassifierState = {
    val __obj = js.Dynamic.literal()
    if (csvClassifier != null) __obj.updateDynamic("csvClassifier")(csvClassifier.asInstanceOf[js.Any])
    if (grokClassifier != null) __obj.updateDynamic("grokClassifier")(grokClassifier.asInstanceOf[js.Any])
    if (jsonClassifier != null) __obj.updateDynamic("jsonClassifier")(jsonClassifier.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (xmlClassifier != null) __obj.updateDynamic("xmlClassifier")(xmlClassifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierState]
  }
}

