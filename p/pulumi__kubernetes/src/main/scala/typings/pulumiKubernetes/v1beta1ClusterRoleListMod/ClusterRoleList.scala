package typings.pulumiKubernetes.v1beta1ClusterRoleListMod

import typings.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.outputMod.rbac.v1beta1.ClusterRole
import typings.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/rbac/v1beta1/clusterRoleList", "ClusterRoleList")
@js.native
class ClusterRoleList protected () extends CustomResource {
  /**
    * Create a ClusterRoleList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ClusterRoleListArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: ClusterRoleListArgs, opts: CustomResourceOptions) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[rbacDotauthorizationDotk8sDotioSlashv1beta1] = js.native
  /**
    * Items is a list of ClusterRoles
    */
  val items: Output_[js.Array[ClusterRole]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleList] = js.native
  /**
    * Standard object's metadata.
    */
  val metadata: Output_[ListMeta] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/rbac/v1beta1/clusterRoleList", "ClusterRoleList")
@js.native
object ClusterRoleList extends js.Object {
  /**
    * Get an existing ClusterRoleList resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ClusterRoleList = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): ClusterRoleList = js.native
  /**
    * Returns true if the given object is an instance of ClusterRoleList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/clusterRoleList.ClusterRoleList */ Boolean = js.native
}

