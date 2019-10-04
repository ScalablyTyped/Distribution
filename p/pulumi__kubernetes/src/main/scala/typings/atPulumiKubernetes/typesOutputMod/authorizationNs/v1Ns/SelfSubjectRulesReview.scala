package typings.atPulumiKubernetes.typesOutputMod.authorizationNs.v1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`authorizationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
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
  val apiVersion: `authorizationDOTk8sDOTio/v1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.SelfSubjectRulesReview
  val metadata: ObjectMeta
  /**
    * Spec holds information about the request being evaluated.
    */
  val spec: SelfSubjectRulesReviewSpec
  /**
    * Status is filled in by the server and indicates the set of actions a user can perform.
    */
  val status: SubjectRulesReviewStatus
}

object SelfSubjectRulesReview {
  @scala.inline
  def apply(
    apiVersion: `authorizationDOTk8sDOTio/v1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.SelfSubjectRulesReview,
    metadata: ObjectMeta,
    spec: SelfSubjectRulesReviewSpec,
    status: SubjectRulesReviewStatus
  ): SelfSubjectRulesReview = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[SelfSubjectRulesReview]
  }
}

