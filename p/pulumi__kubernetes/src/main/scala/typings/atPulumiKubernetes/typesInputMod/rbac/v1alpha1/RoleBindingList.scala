package typings.atPulumiKubernetes.typesInputMod.rbac.v1alpha1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ListMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RoleBindingList is a collection of RoleBindings Deprecated in v1.17 in favor of
  * rbac.authorization.k8s.io/v1 RoleBindingList, and will no longer be served in v1.20.
  */
trait RoleBindingList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`]] = js.undefined
  /**
    * Items is a list of RoleBindings
    */
  var items: Input[js.Array[Input[RoleBinding]]]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleBindingList]] = js.undefined
  /**
    * Standard object's metadata.
    */
  var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
}

object RoleBindingList {
  @scala.inline
  def apply(
    items: Input[js.Array[Input[RoleBinding]]],
    apiVersion: Input[`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleBindingList] = null,
    metadata: Input[ListMeta] = null
  ): RoleBindingList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleBindingList]
  }
}

