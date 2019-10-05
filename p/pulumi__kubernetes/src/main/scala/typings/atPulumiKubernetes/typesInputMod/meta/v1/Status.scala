package typings.atPulumiKubernetes.typesInputMod.meta.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Status is a return value for calls that don't return other objects.
  */
trait Status extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1]] = js.undefined
  /**
    * Suggested HTTP return code for this status, 0 if not set.
    */
  var code: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Extended data associated with the reason.  Each reason may define its own extended details.
    * This field is optional and the data returned is not guaranteed to conform to any schema
    * except that defined by the reason type.
    */
  var details: js.UndefOr[Input[StatusDetails]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Status]] = js.undefined
  /**
    * A human-readable description of the status of this operation.
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
  /**
    * A machine-readable description of why this operation is in the "Failure" status. If this
    * value is empty there is no information available. A Reason clarifies an HTTP status code
    * but does not override it.
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
}

object Status {
  @scala.inline
  def apply(
    apiVersion: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1] = null,
    code: Input[Double] = null,
    details: Input[StatusDetails] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Status] = null,
    message: Input[String] = null,
    metadata: Input[ListMeta] = null,
    reason: Input[String] = null
  ): Status = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
}

