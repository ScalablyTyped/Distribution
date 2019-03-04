package typings
package atPulumiAwsLib.iamGetPolicyDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyDocumentResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The above arguments serialized as a standard JSON policy document.
    */
  val json: java.lang.String
}

object GetPolicyDocumentResult {
  @scala.inline
  def apply(id: java.lang.String, json: java.lang.String): GetPolicyDocumentResult = {
    val __obj = js.Dynamic.literal(id = id, json = json)
  
    __obj.asInstanceOf[GetPolicyDocumentResult]
  }
}

