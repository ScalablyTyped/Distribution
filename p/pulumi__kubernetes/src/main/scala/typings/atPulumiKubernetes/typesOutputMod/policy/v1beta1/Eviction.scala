package typings.atPulumiKubernetes.typesOutputMod.policy.v1beta1

import typings.atPulumiKubernetes.typesOutputMod.meta.v1.DeleteOptions
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Eviction evicts a pod from its node subject to certain policies and safety constraints. This
  * is a subresource of Pod.  A request to cause such an eviction is created by POSTing to
  * .../pods/<pod name>/evictions.
  */
trait Eviction extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: String
  /**
    * DeleteOptions may be provided
    */
  val deleteOptions: DeleteOptions
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: String
  /**
    * ObjectMeta describes the pod that is being evicted.
    */
  val metadata: ObjectMeta
}

object Eviction {
  @scala.inline
  def apply(apiVersion: String, deleteOptions: DeleteOptions, kind: String, metadata: ObjectMeta): Eviction = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], deleteOptions = deleteOptions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Eviction]
  }
}

