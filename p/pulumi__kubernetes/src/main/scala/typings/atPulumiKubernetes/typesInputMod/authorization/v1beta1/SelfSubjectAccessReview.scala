package typings.atPulumiKubernetes.typesInputMod.authorization.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.authorizationDotk8sDotioSlashv1beta1
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not
  * filling in a spec.namespace means "in all namespaces".  Self is a special case, because users
  * should always be able to check whether they can perform an action
  */
trait SelfSubjectAccessReview extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[authorizationDotk8sDotioSlashv1beta1]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.SelfSubjectAccessReview]
  ] = js.undefined
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Spec holds information about the request being evaluated.  user and groups must be empty
    */
  var spec: Input[SelfSubjectAccessReviewSpec]
}

object SelfSubjectAccessReview {
  @scala.inline
  def apply(
    spec: Input[SelfSubjectAccessReviewSpec],
    apiVersion: Input[authorizationDotk8sDotioSlashv1beta1] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.SelfSubjectAccessReview] = null,
    metadata: Input[ObjectMeta] = null
  ): SelfSubjectAccessReview = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfSubjectAccessReview]
  }
}

