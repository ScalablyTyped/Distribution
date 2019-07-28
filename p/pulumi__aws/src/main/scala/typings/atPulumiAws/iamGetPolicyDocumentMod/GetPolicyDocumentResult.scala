package typings.atPulumiAws.iamGetPolicyDocumentMod

import typings.atPulumiAws.Anon_ActionsConditions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPolicyDocumentResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The above arguments serialized as a standard JSON policy document.
    */
  val json: String
  val overrideJson: js.UndefOr[String] = js.undefined
  val policyId: js.UndefOr[String] = js.undefined
  val sourceJson: js.UndefOr[String] = js.undefined
  val statements: js.UndefOr[js.Array[Anon_ActionsConditions]] = js.undefined
  val version: js.UndefOr[String] = js.undefined
}

object GetPolicyDocumentResult {
  @scala.inline
  def apply(
    id: String,
    json: String,
    overrideJson: String = null,
    policyId: String = null,
    sourceJson: String = null,
    statements: js.Array[Anon_ActionsConditions] = null,
    version: String = null
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

