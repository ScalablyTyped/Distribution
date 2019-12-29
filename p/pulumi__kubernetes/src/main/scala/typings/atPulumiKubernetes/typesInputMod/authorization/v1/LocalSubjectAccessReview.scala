package typings.atPulumiKubernetes.typesInputMod.authorization.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.authorizationDotk8sDotioSlashv1
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[authorizationDotk8sDotioSlashv1]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.LocalSubjectAccessReview]
  ] = js.undefined
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Spec holds information about the request being evaluated.  spec.namespace must be equal to
    * the namespace you made the request against.  If empty, it is defaulted.
    */
  var spec: Input[SubjectAccessReviewSpec]
}

object LocalSubjectAccessReview {
  @scala.inline
  def apply(
    spec: Input[SubjectAccessReviewSpec],
    apiVersion: Input[authorizationDotk8sDotioSlashv1] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.LocalSubjectAccessReview] = null,
    metadata: Input[ObjectMeta] = null
  ): LocalSubjectAccessReview = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalSubjectAccessReview]
  }
}

