package typings.pulumiKubernetes.inputMod.authorization.v1beta1

import typings.pulumiPulumi.outputMod.Input
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
  var evaluationError: js.UndefOr[Input[String]] = js.undefined
  /**
    * Incomplete is true when the rules returned by this call are incomplete. This is most
    * commonly encountered when an authorizer, such as an external authorizer, doesn't support
    * rules evaluation.
    */
  var incomplete: Input[Boolean]
  /**
    * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
    * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
    */
  var nonResourceRules: Input[js.Array[Input[NonResourceRule]]]
  /**
    * ResourceRules is the list of actions the subject is allowed to perform on resources. The
    * list ordering isn't significant, may contain duplicates, and possibly be incomplete.
    */
  var resourceRules: Input[js.Array[Input[ResourceRule]]]
}

object SubjectRulesReviewStatus {
  @scala.inline
  def apply(
    incomplete: Input[Boolean],
    nonResourceRules: Input[js.Array[Input[NonResourceRule]]],
    resourceRules: Input[js.Array[Input[ResourceRule]]],
    evaluationError: Input[String] = null
  ): SubjectRulesReviewStatus = {
    val __obj = js.Dynamic.literal(incomplete = incomplete.asInstanceOf[js.Any], nonResourceRules = nonResourceRules.asInstanceOf[js.Any], resourceRules = resourceRules.asInstanceOf[js.Any])
    if (evaluationError != null) __obj.updateDynamic("evaluationError")(evaluationError.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectRulesReviewStatus]
  }
}

