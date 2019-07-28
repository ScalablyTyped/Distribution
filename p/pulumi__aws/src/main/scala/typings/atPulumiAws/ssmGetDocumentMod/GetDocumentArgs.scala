package typings.atPulumiAws.ssmGetDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDocumentArgs extends js.Object {
  /**
    * Returns the document in the specified format. The document format can be either JSON or YAML. JSON is the default format.
    */
  val documentFormat: js.UndefOr[String] = js.undefined
  /**
    * The document version for which you want information.
    */
  val documentVersion: js.UndefOr[String] = js.undefined
  /**
    * The name of the Systems Manager document.
    */
  val name: String
}

object GetDocumentArgs {
  @scala.inline
  def apply(name: String, documentFormat: String = null, documentVersion: String = null): GetDocumentArgs = {
    val __obj = js.Dynamic.literal(name = name)
    if (documentFormat != null) __obj.updateDynamic("documentFormat")(documentFormat)
    if (documentVersion != null) __obj.updateDynamic("documentVersion")(documentVersion)
    __obj.asInstanceOf[GetDocumentArgs]
  }
}

