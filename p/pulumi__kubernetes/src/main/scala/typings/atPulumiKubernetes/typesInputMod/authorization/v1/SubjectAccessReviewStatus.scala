package typings.atPulumiKubernetes.typesInputMod.authorization.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SubjectAccessReviewStatus
  */
trait SubjectAccessReviewStatus extends js.Object {
  /**
    * Allowed is required. True if the action would be allowed, false otherwise.
    */
  var allowed: Input[Boolean]
  /**
    * Denied is optional. True if the action would be denied, otherwise false. If both allowed is
    * false and denied is false, then the authorizer has no opinion on whether to authorize the
    * action. Denied may not be true if Allowed is true.
    */
  var denied: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * EvaluationError is an indication that some error occurred during the authorization check.
    * It is entirely possible to get an error and be able to continue determine authorization
    * status in spite of it. For instance, RBAC can be missing a role, but enough roles are still
    * present and bound to reason about the request.
    */
  var evaluationError: js.UndefOr[Input[String]] = js.undefined
  /**
    * Reason is optional.  It indicates why a request was allowed or denied.
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
}

object SubjectAccessReviewStatus {
  @scala.inline
  def apply(
    allowed: Input[Boolean],
    denied: Input[Boolean] = null,
    evaluationError: Input[String] = null,
    reason: Input[String] = null
  ): SubjectAccessReviewStatus = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any])
    if (denied != null) __obj.updateDynamic("denied")(denied.asInstanceOf[js.Any])
    if (evaluationError != null) __obj.updateDynamic("evaluationError")(evaluationError.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAccessReviewStatus]
  }
}

