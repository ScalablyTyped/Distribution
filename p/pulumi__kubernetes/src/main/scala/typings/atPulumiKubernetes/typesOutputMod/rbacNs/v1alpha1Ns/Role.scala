package typings.atPulumiKubernetes.typesOutputMod.rbacNs.v1alpha1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a
  * RoleBinding.
  */
trait Role extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: `rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.Role
  /**
    * Standard object's metadata.
    */
  val metadata: ObjectMeta
  /**
    * Rules holds all the PolicyRules for this Role
    */
  val rules: js.Array[PolicyRule]
}

object Role {
  @scala.inline
  def apply(
    apiVersion: `rbacDOTauthorizationDOTk8sDOTio/v1alpha1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.Role,
    metadata: ObjectMeta,
    rules: js.Array[PolicyRule]
  ): Role = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, rules = rules)
  
    __obj.asInstanceOf[Role]
  }
}

