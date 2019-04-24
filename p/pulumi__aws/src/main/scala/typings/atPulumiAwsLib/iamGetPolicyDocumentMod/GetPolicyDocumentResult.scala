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
  val overrideJson: js.UndefOr[java.lang.String] = js.undefined
  val policyId: js.UndefOr[java.lang.String] = js.undefined
  val sourceJson: js.UndefOr[java.lang.String] = js.undefined
  val statements: js.UndefOr[js.Array[atPulumiAwsLib.Anon_ActionsConditions]] = js.undefined
  val version: js.UndefOr[java.lang.String] = js.undefined
}

object GetPolicyDocumentResult {
  @scala.inline
  def apply(
    id: java.lang.String,
    json: java.lang.String,
    overrideJson: java.lang.String = null,
    policyId: java.lang.String = null,
    sourceJson: java.lang.String = null,
    statements: js.Array[atPulumiAwsLib.Anon_ActionsConditions] = null,
    version: java.lang.String = null
  ): GetPolicyDocumentResult = {
    val __obj = js.Dynamic.literal(id = id, json = json)
    if (overrideJson != null) __obj.updateDynamic("overrideJson")(overrideJson)
    if (policyId != null) __obj.updateDynamic("policyId")(policyId)
    if (sourceJson != null) __obj.updateDynamic("sourceJson")(sourceJson)
    if (statements != null) __obj.updateDynamic("statements")(statements)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[GetPolicyDocumentResult]
  }
}

