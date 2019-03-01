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
  /**
    * The type of the document.
    */
  val documentType: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
}

object GetDocumentResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    content: java.lang.String,
    documentType: java.lang.String,
    id: java.lang.String
  ): GetDocumentResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("documentType")(documentType)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GetDocumentResult]
  }
}

