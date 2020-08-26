package typings.pulumiKubernetes.inputMod.authorization.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
  */
@js.native
trait SelfSubjectAccessReviewSpec extends js.Object {
  /**
    * NonResourceAttributes describes information for a non-resource access request
    */
  var nonResourceAttributes: js.UndefOr[Input[NonResourceAttributes]] = js.native
  /**
    * ResourceAuthorizationAttributes describes information for a resource access request
    */
  var resourceAttributes: js.UndefOr[Input[ResourceAttributes]] = js.native
}

object SelfSubjectAccessReviewSpec {
  @scala.inline
  def apply(): SelfSubjectAccessReviewSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfSubjectAccessReviewSpec]
  }
  @scala.inline
  implicit class SelfSubjectAccessReviewSpecOps[Self <: SelfSubjectAccessReviewSpec] (val x: Self) extends AnyVal {
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
    def setNonResourceAttributes(value: Input[NonResourceAttributes]): Self = this.set("nonResourceAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonResourceAttributes: Self = this.set("nonResourceAttributes", js.undefined)
    @scala.inline
    def setResourceAttributes(value: Input[ResourceAttributes]): Self = this.set("resourceAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceAttributes: Self = this.set("resourceAttributes", js.undefined)
  }
  
}

