package typings.pulumiKubernetes.inputMod.authorization.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of
  * ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
  */
trait SelfSubjectAccessReviewSpec extends js.Object {
  /**
    * NonResourceAttributes describes information for a non-resource access request
    */
  var nonResourceAttributes: js.UndefOr[Input[NonResourceAttributes]] = js.undefined
  /**
    * ResourceAuthorizationAttributes describes information for a resource access request
    */
  var resourceAttributes: js.UndefOr[Input[ResourceAttributes]] = js.undefined
}

object SelfSubjectAccessReviewSpec {
  @scala.inline
  def apply(
    nonResourceAttributes: Input[NonResourceAttributes] = null,
    resourceAttributes: Input[ResourceAttributes] = null
  ): SelfSubjectAccessReviewSpec = {
    val __obj = js.Dynamic.literal()
    if (nonResourceAttributes != null) __obj.updateDynamic("nonResourceAttributes")(nonResourceAttributes.asInstanceOf[js.Any])
    if (resourceAttributes != null) __obj.updateDynamic("resourceAttributes")(resourceAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfSubjectAccessReviewSpec]
  }
}

