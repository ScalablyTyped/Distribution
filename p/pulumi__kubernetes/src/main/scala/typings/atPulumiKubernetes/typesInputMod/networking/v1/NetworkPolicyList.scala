package typings.atPulumiKubernetes.typesInputMod.networking.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`networkingDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ListMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NetworkPolicyList is a list of NetworkPolicy objects.
  */
trait NetworkPolicyList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[`networkingDOTk8sDOTio/v1`]] = js.undefined
  /**
    * Items is a list of schema objects.
    */
  var items: Input[js.Array[Input[NetworkPolicy]]]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.NetworkPolicyList]] = js.undefined
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
}

object NetworkPolicyList {
  @scala.inline
  def apply(
    items: Input[js.Array[Input[NetworkPolicy]]],
    apiVersion: Input[`networkingDOTk8sDOTio/v1`] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.NetworkPolicyList] = null,
    metadata: Input[ListMeta] = null
  ): NetworkPolicyList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkPolicyList]
  }
}

