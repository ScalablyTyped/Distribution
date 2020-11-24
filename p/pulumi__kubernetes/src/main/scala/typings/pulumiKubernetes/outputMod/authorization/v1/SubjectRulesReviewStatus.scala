package typings.pulumiKubernetes.outputMod.authorization.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete depending on the set of authorizers the server is configured with and any errors experienced during evaluation. Because authorization rules are additive, if a rule appears in a list it's safe to assume the subject has that permission, even if that list is incomplete.
  */
@js.native
trait SubjectRulesReviewStatus extends js.Object {
  
  /**
    * EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn't support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.
    */
  var evaluationError: String = js.native
  
  /**
    * Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.
    */
  var incomplete: Boolean = js.native
  
  /**
    * NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
    */
  var nonResourceRules: js.Array[NonResourceRule] = js.native
  
  /**
    * ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
    */
  var resourceRules: js.Array[ResourceRule] = js.native
}
object SubjectRulesReviewStatus {
  
  @scala.inline
  def apply(
    evaluationError: String,
    incomplete: Boolean,
    nonResourceRules: js.Array[NonResourceRule],
    resourceRules: js.Array[ResourceRule]
  ): SubjectRulesReviewStatus = {
    val __obj = js.Dynamic.literal(evaluationError = evaluationError.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], nonResourceRules = nonResourceRules.asInstanceOf[js.Any], resourceRules = resourceRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectRulesReviewStatus]
  }
  
  @scala.inline
  implicit class SubjectRulesReviewStatusOps[Self <: SubjectRulesReviewStatus] (val x: Self) extends AnyVal {
    
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
    def setEvaluationError(value: String): Self = this.set("evaluationError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomplete(value: Boolean): Self = this.set("incomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonResourceRulesVarargs(value: NonResourceRule*): Self = this.set("nonResourceRules", js.Array(value :_*))
    
    @scala.inline
    def setNonResourceRules(value: js.Array[NonResourceRule]): Self = this.set("nonResourceRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceRulesVarargs(value: ResourceRule*): Self = this.set("resourceRules", js.Array(value :_*))
    
    @scala.inline
    def setResourceRules(value: js.Array[ResourceRule]): Self = this.set("resourceRules", value.asInstanceOf[js.Any])
  }
}
