package typings.pulumiAws.inputMod.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPolicyDocumentStatement extends js.Object {
  
  /**
    * A list of actions that this statement either allows
    * or denies. For example, ``["ec2:RunInstances", "s3:*"]``.
    */
  var actions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A nested configuration block (described below)
    * that defines a further, possibly-service-specific condition that constrains
    * whether this statement applies.
    */
  var conditions: js.UndefOr[js.Array[GetPolicyDocumentStatementCondition]] = js.native
  
  /**
    * Either "Allow" or "Deny", to specify whether this
    * statement allows or denies the given actions. The default is "Allow".
    */
  var effect: js.UndefOr[String] = js.native
  
  /**
    * A list of actions that this statement does *not*
    * apply to. Used to apply a policy statement to all actions *except* those
    * listed.
    */
  var notActions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Like `principals` except gives principals that
    * the statement does *not* apply to.
    */
  var notPrincipals: js.UndefOr[js.Array[GetPolicyDocumentStatementNotPrincipal]] = js.native
  
  /**
    * A list of resource ARNs that this statement
    * does *not* apply to. Used to apply a policy statement to all resources
    * *except* those listed.
    */
  var notResources: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A nested configuration block (described below)
    * specifying a principal (or principal pattern) to which this statement applies.
    */
  var principals: js.UndefOr[js.Array[GetPolicyDocumentStatementPrincipal]] = js.native
  
  /**
    * A list of resource ARNs that this statement applies
    * to. This is required by AWS if used for an IAM policy.
    */
  var resources: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An ID for the policy statement.
    */
  var sid: js.UndefOr[String] = js.native
}
object GetPolicyDocumentStatement {
  
  @scala.inline
  def apply(): GetPolicyDocumentStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPolicyDocumentStatement]
  }
  
  @scala.inline
  implicit class GetPolicyDocumentStatementOps[Self <: GetPolicyDocumentStatement] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: String*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[String]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: GetPolicyDocumentStatementCondition*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[GetPolicyDocumentStatementCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setEffect(value: String): Self = this.set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    
    @scala.inline
    def setNotActionsVarargs(value: String*): Self = this.set("notActions", js.Array(value :_*))
    
    @scala.inline
    def setNotActions(value: js.Array[String]): Self = this.set("notActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotActions: Self = this.set("notActions", js.undefined)
    
    @scala.inline
    def setNotPrincipalsVarargs(value: GetPolicyDocumentStatementNotPrincipal*): Self = this.set("notPrincipals", js.Array(value :_*))
    
    @scala.inline
    def setNotPrincipals(value: js.Array[GetPolicyDocumentStatementNotPrincipal]): Self = this.set("notPrincipals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotPrincipals: Self = this.set("notPrincipals", js.undefined)
    
    @scala.inline
    def setNotResourcesVarargs(value: String*): Self = this.set("notResources", js.Array(value :_*))
    
    @scala.inline
    def setNotResources(value: js.Array[String]): Self = this.set("notResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotResources: Self = this.set("notResources", js.undefined)
    
    @scala.inline
    def setPrincipalsVarargs(value: GetPolicyDocumentStatementPrincipal*): Self = this.set("principals", js.Array(value :_*))
    
    @scala.inline
    def setPrincipals(value: js.Array[GetPolicyDocumentStatementPrincipal]): Self = this.set("principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipals: Self = this.set("principals", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setSid(value: String): Self = this.set("sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSid: Self = this.set("sid", js.undefined)
  }
}
