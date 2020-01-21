package typings.pulumiKubernetes.inputMod.rbac.v1alpha1

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1alpha1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a
  * unit by a RoleBinding or ClusterRoleBinding. Deprecated in v1.17 in favor of
  * rbac.authorization.k8s.io/v1 ClusterRole, and will no longer be served in v1.20.
  */
trait ClusterRole extends js.Object {
  /**
    * AggregationRule is an optional field that describes how to build the Rules for this
    * ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct
    * changes to Rules will be stomped by the controller.
    */
  var aggregationRule: js.UndefOr[Input[AggregationRule]] = js.undefined
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1alpha1]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole]] = js.undefined
  /**
    * Standard object's metadata.
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Rules holds all the PolicyRules for this ClusterRole
    */
  var rules: js.UndefOr[Input[js.Array[Input[PolicyRule]]]] = js.undefined
}

object ClusterRole {
  @scala.inline
  def apply(
    aggregationRule: Input[AggregationRule] = null,
    apiVersion: Input[rbacDotauthorizationDotk8sDotioSlashv1alpha1] = null,
    kind: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole] = null,
    metadata: Input[ObjectMeta] = null,
    rules: Input[js.Array[Input[PolicyRule]]] = null
  ): ClusterRole = {
    val __obj = js.Dynamic.literal()
    if (aggregationRule != null) __obj.updateDynamic("aggregationRule")(aggregationRule.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRole]
  }
}

