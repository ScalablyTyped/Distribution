package typings.pulumiKubernetes.outputMod.rbac.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding. Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 Role, and will no longer be served in v1.20.
  */
@js.native
trait Role extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: rbacDotauthorizationDotk8sDotioSlashv1beta1 = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Role = js.native
  /**
    * Standard object's metadata.
    */
  var metadata: ObjectMeta = js.native
  /**
    * Rules holds all the PolicyRules for this Role
    */
  var rules: js.Array[PolicyRule] = js.native
}

object Role {
  @scala.inline
  def apply(
    apiVersion: rbacDotauthorizationDotk8sDotioSlashv1beta1,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Role,
    metadata: ObjectMeta,
    rules: js.Array[PolicyRule]
  ): Role = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Role]
  }
  @scala.inline
  implicit class RoleOps[Self <: Role] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: rbacDotauthorizationDotk8sDotioSlashv1beta1): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.Role): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setRulesVarargs(value: PolicyRule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[PolicyRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
  }
  
}

