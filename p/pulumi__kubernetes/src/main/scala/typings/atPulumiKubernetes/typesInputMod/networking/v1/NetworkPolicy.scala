package typings.atPulumiKubernetes.typesInputMod.networking.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.networkingDotk8sDotioSlashv1
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NetworkPolicy describes what network traffic is allowed for a set of Pods
  */
trait NetworkPolicy extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[networkingDotk8sDotioSlashv1]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.NetworkPolicy]] = js.undefined
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Specification of the desired behavior for this NetworkPolicy.
    */
  var spec: js.UndefOr[Input[NetworkPolicySpec]] = js.undefined
}

object NetworkPolicy {
  @scala.inline
  def apply(
    apiVersion: Input[networkingDotk8sDotioSlashv1] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.NetworkPolicy] = null,
    metadata: Input[ObjectMeta] = null,
    spec: Input[NetworkPolicySpec] = null
  ): NetworkPolicy = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicy]
  }
}

