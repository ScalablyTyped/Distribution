package typings.pulumiKubernetes.outputMod.authorization.v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
  */
@js.native
trait SubjectAccessReviewSpec extends js.Object {
  /**
    * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
    */
  var extra: StringDictionary[js.Array[String]] = js.native
  /**
    * Groups is the groups you're testing for.
    */
  var groups: js.Array[String] = js.native
  /**
    * NonResourceAttributes describes information for a non-resource access request
    */
  var nonResourceAttributes: NonResourceAttributes = js.native
  /**
    * ResourceAuthorizationAttributes describes information for a resource access request
    */
  var resourceAttributes: ResourceAttributes = js.native
  /**
    * UID information about the requesting user.
    */
  var uid: String = js.native
  /**
    * User is the user you're testing for. If you specify "User" but not "Groups", then is it interpreted as "What if User were not a member of any groups
    */
  var user: String = js.native
}

object SubjectAccessReviewSpec {
  @scala.inline
  def apply(
    extra: StringDictionary[js.Array[String]],
    groups: js.Array[String],
    nonResourceAttributes: NonResourceAttributes,
    resourceAttributes: ResourceAttributes,
    uid: String,
    user: String
  ): SubjectAccessReviewSpec = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], nonResourceAttributes = nonResourceAttributes.asInstanceOf[js.Any], resourceAttributes = resourceAttributes.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAccessReviewSpec]
  }
  @scala.inline
  implicit class SubjectAccessReviewSpecOps[Self <: SubjectAccessReviewSpec] (val x: Self) extends AnyVal {
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
    def setExtra(value: StringDictionary[js.Array[String]]): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonResourceAttributes(value: NonResourceAttributes): Self = this.set("nonResourceAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceAttributes(value: ResourceAttributes): Self = this.set("resourceAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

