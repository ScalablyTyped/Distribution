package typings.atPulumiKubernetes.typesInputMod.rbac.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ListMeta
import typings.atPulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1`]] = js.undefined
  /**
    * Items is a list of ClusterRoleBindings
    */
  var items: Input[js.Array[Input[ClusterRoleBinding]]]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleBindingList]
  ] = js.undefined
  /**
    * Standard object's metadata.
    */
  var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
}

object ClusterRoleBindingList {
  @scala.inline
  def apply(
    items: Input[js.Array[Input[ClusterRoleBinding]]],
    apiVersion: Input[`rbacDOTauthorizationDOTk8sDOTio/v1`] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleBindingList] = null,
    metadata: Input[ListMeta] = null
  ): ClusterRoleBindingList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRoleBindingList]
  }
}

