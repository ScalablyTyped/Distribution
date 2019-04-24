package typings
package atPulumiAwsLib.ssmGetDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDocumentResult extends js.Object {
  /**
    * The ARN of the document.
    */
  val arn: java.lang.String
  /**
    * The contents of the document.
    */
  val content: java.lang.String
  val documentFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the document.
    */
  val documentType: java.lang.String
  val documentVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val name: java.lang.String
}

object GetDocumentResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    content: java.lang.String,
    documentType: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    documentFormat: java.lang.String = null,
    documentVersion: java.lang.String = null
  ): GetDocumentResult = {
    val __obj = js.Dynamic.literal(arn = arn, content = content, documentType = documentType, id = id, name = name)
    if (documentFormat != null) __obj.updateDynamic("documentFormat")(documentFormat)
    if (documentVersion != null) __obj.updateDynamic("documentVersion")(documentVersion)
    __obj.asInstanceOf[GetDocumentResult]
  }
}

