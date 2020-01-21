package typings.pulumiAws.getDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentArgs extends js.Object {
  /**
    * Returns the document in the specified format. The document format can be either JSON or YAML. JSON is the default format.
    */
  val documentFormat: js.UndefOr[String] = js.native
  /**
    * The document version for which you want information.
    */
  val documentVersion: js.UndefOr[String] = js.native
  /**
    * The name of the Systems Manager document.
    */
  val name: String = js.native
}

object GetDocumentArgs {
  @scala.inline
  def apply(name: String, documentFormat: String = null, documentVersion: String = null): GetDocumentArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (documentFormat != null) __obj.updateDynamic("documentFormat")(documentFormat.asInstanceOf[js.Any])
    if (documentVersion != null) __obj.updateDynamic("documentVersion")(documentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentArgs]
  }
}

