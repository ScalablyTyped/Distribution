package typings.atPulumiAws.iamGetPolicyDocumentMod

import typings.atPulumiAws.typesOutputMod.iam.GetPolicyDocumentStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyDocumentResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The above arguments serialized as a standard JSON policy document.
    */
  val json: String = js.native
  val overrideJson: js.UndefOr[String] = js.native
  val policyId: js.UndefOr[String] = js.native
  val sourceJson: js.UndefOr[String] = js.native
  val statements: js.UndefOr[js.Array[GetPolicyDocumentStatement]] = js.native
  val version: js.UndefOr[String] = js.native
}

object GetPolicyDocumentResult {
  @scala.inline
  def apply(
    id: String,
    json: String,
    overrideJson: String = null,
    policyId: String = null,
    sourceJson: String = null,
    statements: js.Array[GetPolicyDocumentStatement] = null,
    version: String = null
  ): GetPolicyDocumentResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
    if (overrideJson != null) __obj.updateDynamic("overrideJson")(overrideJson.asInstanceOf[js.Any])
    if (policyId != null) __obj.updateDynamic("policyId")(policyId.asInstanceOf[js.Any])
    if (sourceJson != null) __obj.updateDynamic("sourceJson")(sourceJson.asInstanceOf[js.Any])
    if (statements != null) __obj.updateDynamic("statements")(statements.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyDocumentResult]
  }
}

