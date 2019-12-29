package typings.atPulumiKubernetes.typesInputMod.rbac.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
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
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Role]] = js.undefined
  /**
    * Standard object's metadata.
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Rules holds all the PolicyRules for this Role
    */
  var rules: js.UndefOr[Input[js.Array[Input[PolicyRule]]]] = js.undefined
}

object Role {
  @scala.inline
  def apply(
    apiVersion: Input[rbacDotauthorizationDotk8sDotioSlashv1] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Role] = null,
    metadata: Input[ObjectMeta] = null,
    rules: Input[js.Array[Input[PolicyRule]]] = null
  ): Role = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Role]
  }
}

