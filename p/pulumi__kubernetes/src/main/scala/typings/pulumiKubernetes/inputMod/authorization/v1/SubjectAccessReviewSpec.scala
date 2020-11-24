package typings.pulumiKubernetes.inputMod.authorization.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
  */
@js.native
trait SubjectAccessReviewSpec extends js.Object {
  
  /**
    * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
    */
  var extra: js.UndefOr[Input[StringDictionary[Input[js.Array[Input[String]]]]]] = js.native
  
  /**
    * Groups is the groups you're testing for.
    */
  var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * NonResourceAttributes describes information for a non-resource access request
    */
  var nonResourceAttributes: js.UndefOr[Input[NonResourceAttributes]] = js.native
  
  /**
    * ResourceAuthorizationAttributes describes information for a resource access request
    */
  var resourceAttributes: js.UndefOr[Input[ResourceAttributes]] = js.native
  
  /**
    * UID information about the requesting user.
    */
  var uid: js.UndefOr[Input[String]] = js.native
  
  /**
    * User is the user you're testing for. If you specify "User" but not "Groups", then is it interpreted as "What if User were not a member of any groups
    */
  var user: js.UndefOr[Input[String]] = js.native
}
object SubjectAccessReviewSpec {
  
  @scala.inline
  def apply(): SubjectAccessReviewSpec = {
    val __obj = js.Dynamic.literal()
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
    def setExtra(value: Input[StringDictionary[Input[js.Array[Input[String]]]]]): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: Input[String]*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: Input[js.Array[Input[String]]]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setNonResourceAttributes(value: Input[NonResourceAttributes]): Self = this.set("nonResourceAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonResourceAttributes: Self = this.set("nonResourceAttributes", js.undefined)
    
    @scala.inline
    def setResourceAttributes(value: Input[ResourceAttributes]): Self = this.set("resourceAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceAttributes: Self = this.set("resourceAttributes", js.undefined)
    
    @scala.inline
    def setUid(value: Input[String]): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    
    @scala.inline
    def setUser(value: Input[String]): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
