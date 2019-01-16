package typings
package atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns

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
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1
  /**
    * Suggested HTTP return code for this status, 0 if not set.
    */
  val code: scala.Double
  /**
    * Extended data associated with the reason.  Each reason may define its own extended details.
    * This field is optional and the data returned is not guaranteed to conform to any schema
    * except that defined by the reason type.
    */
  val details: StatusDetails
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Status
  /**
    * A human-readable description of the status of this operation.
    */
  val message: java.lang.String
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val metadata: ListMeta
  /**
    * A machine-readable description of why this operation is in the "Failure" status. If this
    * value is empty there is no information available. A Reason clarifies an HTTP status code
    * but does not override it.
    */
  val reason: java.lang.String
  /**
    * Status of the operation. One of: "Success" or "Failure". More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val status: java.lang.String
}

