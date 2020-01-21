package typings.pulumiKubernetes.outputMod.authorization.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete
  * depending on the set of authorizers the server is configured with and any errors experienced
  * during evaluation. Because authorization rules are additive, if a rule appears in a list it's
  * safe to assume the subject has that permission, even if that list is incomplete.
  */
trait SubjectRulesReviewStatus extends js.Object {
  /**
    * EvaluationError can appear in combination with Rules. It indicates an error occurred during
    * rule evaluation, such as an authorizer that doesn't support rule evaluation, and that
    * ResourceRules and/or NonResourceRules may be incomplete.
    */
  val evaluationError: String
  /**
    * Incomplete is true when the rules returned by this call are incomplete. This is most
    * commonly encountered when an authorizer, such as an external authorizer, doesn't support
    * rules evaluation.
    */
  val incomplete: Boolean
  /**
    * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
    * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
    */
  val nonResourceRules: js.Array[NonResourceRule]
  /**
    * ResourceRules is the list of actions the subject is allowed to perform on resources. The
    * list ordering isn't significant, may contain duplicates, and possibly be incomplete.
    */
  val resourceRules: js.Array[ResourceRule]
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
}

