package typings.pulumiAws.classifierMod

import typings.pulumiAws.inputMod.glue.ClassifierCsvClassifier
import typings.pulumiAws.inputMod.glue.ClassifierGrokClassifier
import typings.pulumiAws.inputMod.glue.ClassifierJsonClassifier
import typings.pulumiAws.inputMod.glue.ClassifierXmlClassifier
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifierArgs extends js.Object {
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

object ClassifierArgs {
  @scala.inline
  def apply(): ClassifierArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifierArgs]
  }
  @scala.inline
  implicit class ClassifierArgsOps[Self <: ClassifierArgs] (val x: Self) extends AnyVal {
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
    def setCsvClassifier(value: Input[ClassifierCsvClassifier]): Self = this.set("csvClassifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsvClassifier: Self = this.set("csvClassifier", js.undefined)
    @scala.inline
    def setGrokClassifier(value: Input[ClassifierGrokClassifier]): Self = this.set("grokClassifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrokClassifier: Self = this.set("grokClassifier", js.undefined)
    @scala.inline
    def setJsonClassifier(value: Input[ClassifierJsonClassifier]): Self = this.set("jsonClassifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonClassifier: Self = this.set("jsonClassifier", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setXmlClassifier(value: Input[ClassifierXmlClassifier]): Self = this.set("xmlClassifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlClassifier: Self = this.set("xmlClassifier", js.undefined)
  }
  
}

