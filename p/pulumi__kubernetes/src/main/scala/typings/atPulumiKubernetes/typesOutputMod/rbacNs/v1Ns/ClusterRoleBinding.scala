package typings.atPulumiKubernetes.typesOutputMod.rbacNs.v1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a
  * ClusterRole in the global namespace, and adds who information via Subject.
  */
trait ClusterRoleBinding extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: `rbacDOTauthorizationDOTk8sDOTio/v1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleBinding
  /**
    * Standard object's metadata.
    */
  val metadata: ObjectMeta
  /**
    * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be
    * resolved, the Authorizer must return an error.
    */
  val roleRef: RoleRef
  /**
    * Subjects holds references to the objects the role applies to.
    */
  val subjects: js.Array[Subject]
}

object ClusterRoleBinding {
  @scala.inline
  def apply(
    apiVersion: `rbacDOTauthorizationDOTk8sDOTio/v1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleBinding,
    metadata: ObjectMeta,
    roleRef: RoleRef,
    subjects: js.Array[Subject]
  ): ClusterRoleBinding = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, roleRef = roleRef, subjects = subjects)
  
    __obj.asInstanceOf[ClusterRoleBinding]
  }
}

