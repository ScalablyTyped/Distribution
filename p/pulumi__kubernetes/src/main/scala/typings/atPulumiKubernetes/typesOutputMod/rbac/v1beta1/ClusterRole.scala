package typings.atPulumiKubernetes.typesOutputMod.rbac.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a
  * unit by a RoleBinding or ClusterRoleBinding.
  */
trait ClusterRole extends js.Object {
  /**
    * AggregationRule is an optional field that describes how to build the Rules for this
    * ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct
    * changes to Rules will be stomped by the controller.
    */
  val aggregationRule: AggregationRule
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `rbacDOTauthorizationDOTk8sDOTio/v1beta1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRole
  /**
    * Standard object's metadata.
    */
  val metadata: ObjectMeta
  /**
    * Rules holds all the PolicyRules for this ClusterRole
    */
  val rules: js.Array[PolicyRule]
}

object ClusterRole {
  @scala.inline
  def apply(
    aggregationRule: AggregationRule,
    apiVersion: `rbacDOTauthorizationDOTk8sDOTio/v1beta1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRole,
    metadata: ObjectMeta,
    rules: js.Array[PolicyRule]
  ): ClusterRole = {
    val __obj = js.Dynamic.literal(aggregationRule = aggregationRule, apiVersion = apiVersion, kind = kind, metadata = metadata, rules = rules)
  
    __obj.asInstanceOf[ClusterRole]
  }
}

