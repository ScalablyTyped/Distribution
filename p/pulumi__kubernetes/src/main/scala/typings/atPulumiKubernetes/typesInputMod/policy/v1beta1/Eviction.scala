package typings.atPulumiKubernetes.typesInputMod.policy.v1beta1

import typings.atPulumiKubernetes.typesInputMod.meta.v1.DeleteOptions
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * DeleteOptions may be provided
    */
  var deleteOptions: js.UndefOr[Input[DeleteOptions]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[String]] = js.undefined
  /**
    * ObjectMeta describes the pod that is being evicted.
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
}

object Eviction {
  @scala.inline
  def apply(
    apiVersion: Input[String] = null,
    deleteOptions: Input[DeleteOptions] = null,
    kind: Input[String] = null,
    metadata: Input[ObjectMeta] = null
  ): Eviction = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (deleteOptions != null) __obj.updateDynamic("deleteOptions")(deleteOptions.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eviction]
  }
}

