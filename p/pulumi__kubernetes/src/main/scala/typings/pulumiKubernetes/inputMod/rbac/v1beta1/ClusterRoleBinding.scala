package typings.pulumiKubernetes.inputMod.rbac.v1beta1

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a ClusterRole in the global namespace, and adds who information via Subject. Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 ClusterRoleBinding, and will no longer be served in v1.20.
  */
@js.native
trait ClusterRoleBinding extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1beta1]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBinding]] = js.native
  /**
    * Standard object's metadata.
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  /**
    * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
    */
  var roleRef: Input[RoleRef] = js.native
  /**
    * Subjects holds references to the objects the role applies to.
    */
  var subjects: js.UndefOr[Input[js.Array[Input[Subject]]]] = js.native
}

object ClusterRoleBinding {
  @scala.inline
  def apply(roleRef: Input[RoleRef]): ClusterRoleBinding = {
    val __obj = js.Dynamic.literal(roleRef = roleRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRoleBinding]
  }
  @scala.inline
  implicit class ClusterRoleBindingOps[Self <: ClusterRoleBinding] (val x: Self) extends AnyVal {
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
    def setRoleRef(value: Input[RoleRef]): Self = this.set("roleRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiVersion(value: Input[rbacDotauthorizationDotk8sDotioSlashv1beta1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBinding]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setSubjectsVarargs(value: Input[Subject]*): Self = this.set("subjects", js.Array(value :_*))
    @scala.inline
    def setSubjects(value: Input[js.Array[Input[Subject]]]): Self = this.set("subjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubjects: Self = this.set("subjects", js.undefined)
  }
  
}

