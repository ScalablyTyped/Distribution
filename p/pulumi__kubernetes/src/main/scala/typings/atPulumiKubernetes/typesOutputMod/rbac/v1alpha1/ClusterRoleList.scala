package typings.atPulumiKubernetes.typesOutputMod.rbac.v1alpha1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterRoleList is a collection of ClusterRoles
  */
trait ClusterRoleList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  /**
    * Items is a list of ClusterRoles
    */
  val items: js.Array[ClusterRole]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleList
  /**
    * Standard object's metadata.
    */
  val metadata: ListMeta
}

object ClusterRoleList {
  @scala.inline
  def apply(
    apiVersion: `rbacDOTauthorizationDOTk8sDOTio/v1alpha1`,
    items: js.Array[ClusterRole],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleList,
    metadata: ListMeta
  ): ClusterRoleList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[ClusterRoleList]
  }
}

