package typings.atPulumiKubernetes.typesInputMod.authorization.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.authorizationDotk8sDotioSlashv1beta1
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SelfSubjectRulesReview enumerates the set of actions the current user can perform within a
  * namespace. The returned list of actions may be incomplete depending on the server's
  * authorization mode, and any errors experienced during the evaluation. SelfSubjectRulesReview
  * should be used by UIs to show/hide actions, or to quickly let an end user reason about their
  * permissions. It should NOT Be used by external systems to drive authorization decisions as
  * this raises confused deputy, cache lifetime/revocation, and correctness concerns.
  * SubjectAccessReview, and LocalAccessReview are the correct way to defer authorization
  * decisions to the API server.
  */
trait SelfSubjectRulesReview extends js.Object {
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
    Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.SelfSubjectRulesReview]
  ] = js.undefined
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Spec holds information about the request being evaluated.
    */
  var spec: Input[SelfSubjectRulesReviewSpec]
}

object SelfSubjectRulesReview {
  @scala.inline
  def apply(
    spec: Input[SelfSubjectRulesReviewSpec],
    apiVersion: Input[authorizationDotk8sDotioSlashv1beta1] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.SelfSubjectRulesReview] = null,
    metadata: Input[ObjectMeta] = null
  ): SelfSubjectRulesReview = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfSubjectRulesReview]
  }
}

