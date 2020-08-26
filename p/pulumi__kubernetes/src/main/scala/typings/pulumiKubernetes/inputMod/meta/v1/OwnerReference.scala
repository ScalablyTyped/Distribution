package typings.pulumiKubernetes.inputMod.meta.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OwnerReference contains enough information to let you identify an owning object. An owning object must be in the same namespace as the dependent, or be cluster-scoped, so there is no namespace field.
  */
@js.native
trait OwnerReference extends js.Object {
  /**
    * API version of the referent.
    */
  var apiVersion: Input[String] = js.native
  /**
    * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
    */
  var blockOwnerDeletion: js.UndefOr[Input[Boolean]] = js.native
  /**
    * If true, this reference points to the managing controller.
    */
  var controller: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: Input[String] = js.native
  /**
    * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
    */
  var name: Input[String] = js.native
  /**
    * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  var uid: Input[String] = js.native
}

object OwnerReference {
  @scala.inline
  def apply(apiVersion: Input[String], kind: Input[String], name: Input[String], uid: Input[String]): OwnerReference = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerReference]
  }
  @scala.inline
  implicit class OwnerReferenceOps[Self <: OwnerReference] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: Input[String]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: Input[String]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: Input[String]): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockOwnerDeletion(value: Input[Boolean]): Self = this.set("blockOwnerDeletion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockOwnerDeletion: Self = this.set("blockOwnerDeletion", js.undefined)
    @scala.inline
    def setController(value: Input[Boolean]): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
  }
  
}

