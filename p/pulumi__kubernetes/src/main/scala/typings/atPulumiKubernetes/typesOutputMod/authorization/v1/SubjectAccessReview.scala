package typings.atPulumiKubernetes.typesOutputMod.authorization.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`authorizationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SubjectAccessReview checks whether or not a user or group can perform an action.
  */
trait SubjectAccessReview extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `authorizationDOTk8sDOTio/v1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.SubjectAccessReview
  val metadata: ObjectMeta
  /**
    * Spec holds information about the request being evaluated
    */
  val spec: SubjectAccessReviewSpec
  /**
    * Status is filled in by the server and indicates whether the request is allowed or not
    */
  val status: SubjectAccessReviewStatus
}

object SubjectAccessReview {
  @scala.inline
  def apply(
    apiVersion: `authorizationDOTk8sDOTio/v1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.SubjectAccessReview,
    metadata: ObjectMeta,
    spec: SubjectAccessReviewSpec,
    status: SubjectAccessReviewStatus
  ): SubjectAccessReview = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[SubjectAccessReview]
  }
}

