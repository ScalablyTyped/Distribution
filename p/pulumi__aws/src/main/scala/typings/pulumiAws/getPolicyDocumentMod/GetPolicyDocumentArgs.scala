package typings.pulumiAws.getPolicyDocumentMod

import typings.pulumiAws.inputMod.iam.GetPolicyDocumentStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPolicyDocumentArgs extends js.Object {
  
  /**
    * An IAM policy document to import and override the
    * current policy document.  Statements with non-blank `sid`s in the override
    * document will overwrite statements with the same `sid` in the current document.
    * Statements without an `sid` cannot be overwritten.
    */
  val overrideJson: js.UndefOr[String] = js.native
  
  /**
    * An ID for the policy document.
    */
  val policyId: js.UndefOr[String] = js.native
  
  /**
    * An IAM policy document to import as a base for the
    * current policy document.  Statements with non-blank `sid`s in the current
    * policy document will overwrite statements with the same `sid` in the source
    * json.  Statements without an `sid` cannot be overwritten.
    */
  val sourceJson: js.UndefOr[String] = js.native
  
  /**
    * A nested configuration block (described below)
    * configuring one *statement* to be included in the policy document.
    */
  val statements: js.UndefOr[js.Array[GetPolicyDocumentStatement]] = js.native
  
  /**
    * IAM policy document version. Valid values: `2008-10-17`, `2012-10-17`. Defaults to `2012-10-17`. For more information, see the [AWS IAM User Guide](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_version.html).
    */
  val version: js.UndefOr[String] = js.native
}
object GetPolicyDocumentArgs {
  
  @scala.inline
  def apply(): GetPolicyDocumentArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPolicyDocumentArgs]
  }
  
  @scala.inline
  implicit class GetPolicyDocumentArgsOps[Self <: GetPolicyDocumentArgs] (val x: Self) extends AnyVal {
    
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
