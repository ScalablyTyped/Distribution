package typings.pulumiKubernetes.inputMod.authorization.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SubjectAccessReviewSpec is a description of the access request.  Exactly one of
  * ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
  */
trait SubjectAccessReviewSpec extends js.Object {
  /**
    * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is
    * input to the authorizer it needs a reflection here.
    */
  var extra: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * Groups is the groups you're testing for.
    */
  var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * NonResourceAttributes describes information for a non-resource access request
    */
  var nonResourceAttributes: js.UndefOr[Input[NonResourceAttributes]] = js.undefined
  /**
    * ResourceAuthorizationAttributes describes information for a resource access request
    */
  var resourceAttributes: js.UndefOr[Input[ResourceAttributes]] = js.undefined
  /**
    * UID information about the requesting user.
    */
  var uid: js.UndefOr[Input[String]] = js.undefined
  /**
    * User is the user you're testing for. If you specify "User" but not "Groups", then is it
    * interpreted as "What if User were not a member of any groups
    */
  var user: js.UndefOr[Input[String]] = js.undefined
}

object SubjectAccessReviewSpec {
  @scala.inline
  def apply(
    extra: Input[js.Object] = null,
    groups: Input[js.Array[Input[String]]] = null,
    nonResourceAttributes: Input[NonResourceAttributes] = null,
    resourceAttributes: Input[ResourceAttributes] = null,
    uid: Input[String] = null,
    user: Input[String] = null
  ): SubjectAccessReviewSpec = {
    val __obj = js.Dynamic.literal()
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (nonResourceAttributes != null) __obj.updateDynamic("nonResourceAttributes")(nonResourceAttributes.asInstanceOf[js.Any])
    if (resourceAttributes != null) __obj.updateDynamic("resourceAttributes")(resourceAttributes.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAccessReviewSpec]
  }
}

