package typings.atPulumiAws.typesInputMod.glue

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassifierXmlClassifier extends js.Object {
  /**
    * An identifier of the data format that the classifier matches.
    */
  var classification: Input[String]
  /**
    * The XML tag designating the element that contains each record in an XML document being parsed. Note that this cannot identify a self-closing element (closed by `/>`). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, `<row item_a="A" item_b="B"></row>` is okay, but `<row item_a="A" item_b="B" />` is not).
    */
  var rowTag: Input[String]
}

object ClassifierXmlClassifier {
  @scala.inline
  def apply(classification: Input[String], rowTag: Input[String]): ClassifierXmlClassifier = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], rowTag = rowTag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClassifierXmlClassifier]
  }
}

