package typings
package atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LocalSubjectAccessReview checks whether or not a user or group can perform an action in a
  * given namespace. Having a namespace scoped resource makes it much easier to grant namespace
  * scoped policy that includes permissions checking.
  */
trait LocalSubjectAccessReview extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.LocalSubjectAccessReview
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
    * Spec holds information about the request being evaluated.  spec.namespace must be equal to
    * the namespace you made the request against.  If empty, it is defaulted.
    */
  val spec: SubjectAccessReviewSpec
  /**
    * Status is filled in by the server and indicates whether the request is allowed or not
    */
  val status: SubjectAccessReviewStatus
}

object LocalSubjectAccessReview {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1`,
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.LocalSubjectAccessReview,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta,
    spec: SubjectAccessReviewSpec,
    status: SubjectAccessReviewStatus
  ): LocalSubjectAccessReview = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[LocalSubjectAccessReview]
  }
}

