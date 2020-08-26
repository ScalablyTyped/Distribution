package typings.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassifierXmlClassifier extends js.Object {
  /**
    * An identifier of the data format that the classifier matches.
    */
  var classification: String = js.native
  /**
    * The XML tag designating the element that contains each record in an XML document being parsed. Note that this cannot identify a self-closing element (closed by `/>`). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, `<row item_a="A" item_b="B"></row>` is okay, but `<row item_a="A" item_b="B" />` is not).
    */
  var rowTag: String = js.native
}

object ClassifierXmlClassifier {
  @scala.inline
  def apply(classification: String, rowTag: String): ClassifierXmlClassifier = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], rowTag = rowTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifierXmlClassifier]
  }
  @scala.inline
  implicit class ClassifierXmlClassifierOps[Self <: ClassifierXmlClassifier] (val x: Self) extends AnyVal {
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
    def setRowTag(value: String): Self = this.set("rowTag", value.asInstanceOf[js.Any])
  }
  
}

