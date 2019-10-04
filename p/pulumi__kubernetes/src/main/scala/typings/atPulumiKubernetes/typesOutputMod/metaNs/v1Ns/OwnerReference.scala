package typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns

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
  val apiVersion: String
  /**
    * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be
    * deleted from the key-value store until this reference is removed. Defaults to false. To set
    * this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable
    * Entity) will be returned.
    */
  val blockOwnerDeletion: Boolean
  /**
    * If true, this reference points to the managing controller.
    */
  val controller: Boolean
  /**
    * Kind of the referent. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: String
  /**
    * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
    */
  val name: String
  /**
    * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  val uid: String
}

object OwnerReference {
  @scala.inline
  def apply(
    apiVersion: String,
    blockOwnerDeletion: Boolean,
    controller: Boolean,
    kind: String,
    name: String,
    uid: String
  ): OwnerReference = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, blockOwnerDeletion = blockOwnerDeletion, controller = controller, kind = kind, name = name, uid = uid)
  
    __obj.asInstanceOf[OwnerReference]
  }
}

