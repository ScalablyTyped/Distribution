package typings.atPulumiKubernetes.typesOutputMod.rbac.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RoleBinding references a role, but does not contain it.  It can reference a Role in the same
  * namespace or a ClusterRole in the global namespace. It adds who information via Subjects and
  * namespace information by which namespace it exists in.  RoleBindings in a given namespace
  * only have effect in that namespace.
  */
trait RoleBinding extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `rbacDOTauthorizationDOTk8sDOTio/v1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleBinding
  /**
    * Standard object's metadata.
    */
  val metadata: ObjectMeta
  /**
    * RoleRef can reference a Role in the current namespace or a ClusterRole in the global
    * namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
    */
  val roleRef: RoleRef
  /**
    * Subjects holds references to the objects the role applies to.
    */
  val subjects: js.Array[Subject]
}

object RoleBinding {
  @scala.inline
  def apply(
    apiVersion: `rbacDOTauthorizationDOTk8sDOTio/v1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleBinding,
    metadata: ObjectMeta,
    roleRef: RoleRef,
    subjects: js.Array[Subject]
  ): RoleBinding = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, roleRef = roleRef, subjects = subjects)
  
    __obj.asInstanceOf[RoleBinding]
  }
}

