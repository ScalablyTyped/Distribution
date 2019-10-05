package typings.atPulumiKubernetes.typesInputMod.apps.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apps/v1beta1`
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated apps/v1beta1/StatefulSet is not supported by Kubernetes 1.16+ clusters. Use
  * apps/v1/StatefulSet instead.
  *
  * StatefulSet represents a set of pods with consistent identities. Identities are defined as:
  *  - Network: A single stable DNS and hostname.
  *  - Storage: As many VolumeClaims as requested.
  * The StatefulSet guarantees that a given network identity will always map to the same storage
  * identity.
  */
trait StatefulSet extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[`apps/v1beta1`]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.StatefulSet]] = js.undefined
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Spec defines the desired identities of pods in this set.
    */
  var spec: js.UndefOr[Input[StatefulSetSpec]] = js.undefined
}

object StatefulSet {
  @scala.inline
  def apply(
    apiVersion: Input[`apps/v1beta1`] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.StatefulSet] = null,
    metadata: Input[ObjectMeta] = null,
    spec: Input[StatefulSetSpec] = null
  ): StatefulSet = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSet]
  }
}

