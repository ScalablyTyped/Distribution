package typings.pulumiKubernetes.outputMod.authorization.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SubjectAccessReviewStatus
  */
@js.native
trait SubjectAccessReviewStatus extends js.Object {
  /**
    * Allowed is required. True if the action would be allowed, false otherwise.
    */
  var allowed: Boolean = js.native
  /**
    * Denied is optional. True if the action would be denied, otherwise false. If both allowed is false and denied is false, then the authorizer has no opinion on whether to authorize the action. Denied may not be true if Allowed is true.
    */
  var denied: Boolean = js.native
  /**
    * EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
    */
  var evaluationError: String = js.native
  /**
    * Reason is optional.  It indicates why a request was allowed or denied.
    */
  var reason: String = js.native
}

object SubjectAccessReviewStatus {
  @scala.inline
  def apply(allowed: Boolean, denied: Boolean, evaluationError: String, reason: String): SubjectAccessReviewStatus = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], denied = denied.asInstanceOf[js.Any], evaluationError = evaluationError.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAccessReviewStatus]
  }
  @scala.inline
  implicit class SubjectAccessReviewStatusOps[Self <: SubjectAccessReviewStatus] (val x: Self) extends AnyVal {
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
    def setAllowed(value: Boolean): Self = this.set("allowed", value.asInstanceOf[js.Any])
    @scala.inline
    def setDenied(value: Boolean): Self = this.set("denied", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvaluationError(value: String): Self = this.set("evaluationError", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

