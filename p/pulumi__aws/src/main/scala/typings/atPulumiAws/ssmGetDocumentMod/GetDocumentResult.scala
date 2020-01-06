package typings.atPulumiAws.ssmGetDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentResult extends js.Object {
  /**
    * The ARN of the document.
    */
  val arn: String = js.native
  /**
    * The contents of the document.
    */
  val content: String = js.native
  val documentFormat: js.UndefOr[String] = js.native
  /**
    * The type of the document.
    */
  val documentType: String = js.native
  val documentVersion: js.UndefOr[String] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
}

object GetDocumentResult {
  @scala.inline
  def apply(
    arn: String,
    content: String,
    documentType: String,
    id: String,
    name: String,
    documentFormat: String = null,
    documentVersion: String = null
  ): GetDocumentResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], documentType = documentType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (documentFormat != null) __obj.updateDynamic("documentFormat")(documentFormat.asInstanceOf[js.Any])
    if (documentVersion != null) __obj.updateDynamic("documentVersion")(documentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentResult]
  }
}

