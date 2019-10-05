package typings.atPulumiKubernetes.typesInputMod.rbac.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1beta1`]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleBinding]] = js.undefined
  /**
    * Standard object's metadata.
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * RoleRef can reference a Role in the current namespace or a ClusterRole in the global
    * namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
    */
  var roleRef: Input[RoleRef]
  /**
    * Subjects holds references to the objects the role applies to.
    */
  var subjects: js.UndefOr[Input[js.Array[Input[Subject]]]] = js.undefined
}

object RoleBinding {
  @scala.inline
  def apply(
    roleRef: Input[RoleRef],
    apiVersion: Input[`rbacDOTauthorizationDOTk8sDOTio/v1beta1`] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleBinding] = null,
    metadata: Input[ObjectMeta] = null,
    subjects: Input[js.Array[Input[Subject]]] = null
  ): RoleBinding = {
    val __obj = js.Dynamic.literal(roleRef = roleRef.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (subjects != null) __obj.updateDynamic("subjects")(subjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleBinding]
  }
}

