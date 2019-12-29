package typings.atPulumiKubernetes.typesOutputMod.networking.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.networkingDotk8sDotioSlashv1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
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
  val apiVersion: networkingDotk8sDotioSlashv1
  /**
    * Items is a list of schema objects.
    */
  val items: js.Array[NetworkPolicy]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.NetworkPolicyList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object NetworkPolicyList {
  @scala.inline
  def apply(
    apiVersion: networkingDotk8sDotioSlashv1,
    items: js.Array[NetworkPolicy],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.NetworkPolicyList,
    metadata: ListMeta
  ): NetworkPolicyList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetworkPolicyList]
  }
}

