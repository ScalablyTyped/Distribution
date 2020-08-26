package typings.pulumiKubernetes.inputMod.rbac.v1beta1

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding. Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 ClusterRole, and will no longer be served in v1.20.
  */
@js.native
trait ClusterRole extends js.Object {
  /**
    * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
    */
  var aggregationRule: js.UndefOr[Input[AggregationRule]] = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1beta1]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole]] = js.native
  /**
    * Standard object's metadata.
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  /**
    * Rules holds all the PolicyRules for this ClusterRole
    */
  var rules: js.UndefOr[Input[js.Array[Input[PolicyRule]]]] = js.native
}

object ClusterRole {
  @scala.inline
  def apply(): ClusterRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterRole]
  }
  @scala.inline
  implicit class ClusterRoleOps[Self <: ClusterRole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAggregationRule(value: Input[AggregationRule]): Self = this.set("aggregationRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregationRule: Self = this.set("aggregationRule", js.undefined)
    @scala.inline
    def setApiVersion(value: Input[rbacDotauthorizationDotk8sDotioSlashv1beta1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setRulesVarargs(value: Input[PolicyRule]*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: Input[js.Array[Input[PolicyRule]]]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
  
}

