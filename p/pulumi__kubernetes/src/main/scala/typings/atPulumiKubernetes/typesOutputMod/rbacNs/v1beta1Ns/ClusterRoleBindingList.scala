package typings.atPulumiKubernetes.typesOutputMod.rbacNs.v1beta1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterRoleBindingList is a collection of ClusterRoleBindings
  */
trait ClusterRoleBindingList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  /**
    * Items is a list of ClusterRoleBindings
    */
  val items: js.Array[ClusterRoleBinding]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleBindingList
  /**
    * Standard object's metadata.
    */
  val metadata: ListMeta
}

object ClusterRoleBindingList {
  @scala.inline
  def apply(
    apiVersion: `rbacDOTauthorizationDOTk8sDOTio/v1beta1`,
    items: js.Array[ClusterRoleBinding],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleBindingList,
    metadata: ListMeta
  ): ClusterRoleBindingList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[ClusterRoleBindingList]
  }
}

