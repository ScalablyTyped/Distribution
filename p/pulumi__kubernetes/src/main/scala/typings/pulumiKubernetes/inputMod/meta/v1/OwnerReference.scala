package typings.pulumiKubernetes.inputMod.meta.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OwnerReference contains enough information to let you identify an owning object. An owning
  * object must be in the same namespace as the dependent, or be cluster-scoped, so there is no
  * namespace field.
  */
trait OwnerReference extends js.Object {
  /**
    * API version of the referent.
    */
  var apiVersion: Input[String]
  /**
    * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be
    * deleted from the key-value store until this reference is removed. Defaults to false. To set
    * this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable
    * Entity) will be returned.
    */
  var blockOwnerDeletion: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * If true, this reference points to the managing controller.
    */
  var controller: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Kind of the referent. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: Input[String]
  /**
    * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
    */
  var name: Input[String]
  /**
    * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  var uid: Input[String]
}

object OwnerReference {
  @scala.inline
  def apply(
    apiVersion: Input[String],
    kind: Input[String],
    name: Input[String],
    uid: Input[String],
    blockOwnerDeletion: Input[Boolean] = null,
    controller: Input[Boolean] = null
  ): OwnerReference = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    if (blockOwnerDeletion != null) __obj.updateDynamic("blockOwnerDeletion")(blockOwnerDeletion.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerReference]
  }
}

