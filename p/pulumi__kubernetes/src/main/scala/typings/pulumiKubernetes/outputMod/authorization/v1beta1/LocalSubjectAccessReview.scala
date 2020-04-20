package typings.pulumiKubernetes.outputMod.authorization.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.authorizationDotk8sDotioSlashv1beta1
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
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: authorizationDotk8sDotioSlashv1beta1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.pulumiKubernetes.pulumiKubernetesStrings.LocalSubjectAccessReview
  val metadata: ObjectMeta
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
    apiVersion: authorizationDotk8sDotioSlashv1beta1,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.LocalSubjectAccessReview,
    metadata: ObjectMeta,
    spec: SubjectAccessReviewSpec,
    status: SubjectAccessReviewStatus
  ): LocalSubjectAccessReview = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalSubjectAccessReview]
  }
}

