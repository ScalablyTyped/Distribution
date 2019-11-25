package typings.atPulumiKubernetes.typesOutputMod.authorization.v1

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
  val allowed: Boolean
  /**
    * Denied is optional. True if the action would be denied, otherwise false. If both allowed is
    * false and denied is false, then the authorizer has no opinion on whether to authorize the
    * action. Denied may not be true if Allowed is true.
    */
  val denied: Boolean
  /**
    * EvaluationError is an indication that some error occurred during the authorization check.
    * It is entirely possible to get an error and be able to continue determine authorization
    * status in spite of it. For instance, RBAC can be missing a role, but enough roles are still
    * present and bound to reason about the request.
    */
  val evaluationError: String
  /**
    * Reason is optional.  It indicates why a request was allowed or denied.
    */
  val reason: String
}

object SubjectAccessReviewStatus {
  @scala.inline
  def apply(allowed: Boolean, denied: Boolean, evaluationError: String, reason: String): SubjectAccessReviewStatus = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], denied = denied.asInstanceOf[js.Any], evaluationError = evaluationError.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubjectAccessReviewStatus]
  }
}

