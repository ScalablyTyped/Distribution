package typings
package atPulumiKubernetesLib.typesOutputMod.networkingNs.v1Ns

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
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1`
  /**
    * Items is a list of schema objects.
    */
  val items: js.Array[NetworkPolicy]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NetworkPolicyList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
}

object NetworkPolicyList {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1`,
    items: js.Array[NetworkPolicy],
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.NetworkPolicyList,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
  ): NetworkPolicyList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiVersion")(apiVersion)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[NetworkPolicyList]
  }
}

