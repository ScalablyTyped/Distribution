package typings.pulumiAws.getPolicyDocumentMod

import typings.pulumiAws.outputMod.iam.GetPolicyDocumentStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyDocumentResult extends js.Object {
  /**
    * The provider-assigned unique ID for this managed resource.
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
  def apply(id: String, json: String): GetPolicyDocumentResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyDocumentResult]
  }
  @scala.inline
  implicit class GetPolicyDocumentResultOps[Self <: GetPolicyDocumentResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setJson(value: String): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverrideJson(value: String): Self = this.set("overrideJson", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideJson: Self = this.set("overrideJson", js.undefined)
    @scala.inline
    def setPolicyId(value: String): Self = this.set("policyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyId: Self = this.set("policyId", js.undefined)
    @scala.inline
    def setSourceJson(value: String): Self = this.set("sourceJson", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceJson: Self = this.set("sourceJson", js.undefined)
    @scala.inline
    def setStatementsVarargs(value: GetPolicyDocumentStatement*): Self = this.set("statements", js.Array(value :_*))
    @scala.inline
    def setStatements(value: js.Array[GetPolicyDocumentStatement]): Self = this.set("statements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatements: Self = this.set("statements", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

