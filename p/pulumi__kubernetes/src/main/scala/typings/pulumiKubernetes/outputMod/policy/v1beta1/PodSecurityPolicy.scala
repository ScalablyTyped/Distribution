package typings.pulumiKubernetes.outputMod.policy.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.policySlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodSecurityPolicy governs the ability to make requests that affect the Security Context that
  * will be applied to a pod and container.
  */
trait PodSecurityPolicy extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: policySlashv1beta1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.pulumiKubernetes.pulumiKubernetesStrings.PodSecurityPolicy
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * spec defines the policy enforced.
    */
  val spec: PodSecurityPolicySpec
}

object PodSecurityPolicy {
  @scala.inline
  def apply(
    apiVersion: policySlashv1beta1,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.PodSecurityPolicy,
    metadata: ObjectMeta,
    spec: PodSecurityPolicySpec
  ): PodSecurityPolicy = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodSecurityPolicy]
  }
}

