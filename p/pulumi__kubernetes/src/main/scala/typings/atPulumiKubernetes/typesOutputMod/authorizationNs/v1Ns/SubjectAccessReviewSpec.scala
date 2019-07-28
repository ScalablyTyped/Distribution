package typings.atPulumiKubernetes.typesOutputMod.authorizationNs.v1Ns

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
  val extra: js.Object
  /**
    * Groups is the groups you're testing for.
    */
  val groups: js.Array[String]
  /**
    * NonResourceAttributes describes information for a non-resource access request
    */
  val nonResourceAttributes: NonResourceAttributes
  /**
    * ResourceAuthorizationAttributes describes information for a resource access request
    */
  val resourceAttributes: ResourceAttributes
  /**
    * UID information about the requesting user.
    */
  val uid: String
  /**
    * User is the user you're testing for. If you specify "User" but not "Groups", then is it
    * interpreted as "What if User were not a member of any groups
    */
  val user: String
}

object SubjectAccessReviewSpec {
  @scala.inline
  def apply(
    extra: js.Object,
    groups: js.Array[String],
    nonResourceAttributes: NonResourceAttributes,
    resourceAttributes: ResourceAttributes,
    uid: String,
    user: String
  ): SubjectAccessReviewSpec = {
    val __obj = js.Dynamic.literal(extra = extra, groups = groups, nonResourceAttributes = nonResourceAttributes, resourceAttributes = resourceAttributes, uid = uid, user = user)
  
    __obj.asInstanceOf[SubjectAccessReviewSpec]
  }
}

