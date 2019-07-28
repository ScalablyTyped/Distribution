package typings.atPulumiAws.ssmGetDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDocumentResult extends js.Object {
  /**
    * The ARN of the document.
    */
  val arn: String
  /**
    * The contents of the document.
    */
  val content: String
  val documentFormat: js.UndefOr[String] = js.undefined
  /**
    * The type of the document.
    */
  val documentType: String
  val documentVersion: js.UndefOr[String] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
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
    val __obj = js.Dynamic.literal(arn = arn, content = content, documentType = documentType, id = id, name = name)
    if (documentFormat != null) __obj.updateDynamic("documentFormat")(documentFormat)
    if (documentVersion != null) __obj.updateDynamic("documentVersion")(documentVersion)
    __obj.asInstanceOf[GetDocumentResult]
  }
}

