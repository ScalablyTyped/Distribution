package typings.pulumiKubernetes.v1ClusterRoleBindingMod

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.outputMod.rbac.v1.RoleRef
import typings.pulumiKubernetes.outputMod.rbac.v1.Subject
import typings.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/rbac/v1/clusterRoleBinding", "ClusterRoleBinding")
@js.native
class ClusterRoleBinding protected () extends CustomResource {
  /**
    * Create a ClusterRoleBinding resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ClusterRoleBindingArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: ClusterRoleBindingArgs, opts: CustomResourceOptions) = this()
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[rbacDotauthorizationDotk8sDotioSlashv1] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBinding] = js.native
  
  /**
    * Standard object's metadata.
    */
  val metadata: Output_[ObjectMeta] = js.native
  
  /**
    * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
    */
  val roleRef: Output_[RoleRef] = js.native
  
  /**
    * Subjects holds references to the objects the role applies to.
    */
  val subjects: Output_[js.Array[Subject]] = js.native
}
/* static members */
@JSImport("@pulumi/kubernetes/rbac/v1/clusterRoleBinding", "ClusterRoleBinding")
@js.native
object ClusterRoleBinding extends js.Object {
  
  /**
    * Get an existing ClusterRoleBinding resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ClusterRoleBinding = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): ClusterRoleBinding = js.native
  
  /**
    * Returns true if the given object is an instance of ClusterRoleBinding.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1/clusterRoleBinding.ClusterRoleBinding */ Boolean = js.native
}
