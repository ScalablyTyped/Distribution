package typings.atPulumiKubernetes

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1alpha1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import typings.atPulumiKubernetes.typesOutputMod.rbac.v1alpha1.RoleRef
import typings.atPulumiKubernetes.typesOutputMod.rbac.v1alpha1.Subject
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/rbac/v1alpha1/RoleBinding", JSImport.Namespace)
@js.native
object rbacV1alpha1RoleBindingMod extends js.Object {
  @js.native
  class RoleBinding protected () extends CustomResource {
    /**
      * Create a rbac.v1alpha1.RoleBinding resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.rbac.v1alpha1.RoleBinding) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.rbac.v1alpha1.RoleBinding,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output[rbacDotauthorizationDotk8sDotioSlashv1alpha1] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleBinding] = js.native
    /**
      * Standard object's metadata.
      */
    val metadata: Output[ObjectMeta] = js.native
    /**
      * RoleRef can reference a Role in the current namespace or a ClusterRole in the global
      * namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
      */
    val roleRef: Output[RoleRef] = js.native
    /**
      * Subjects holds references to the objects the role applies to.
      */
    val subjects: Output[js.Array[Subject]] = js.native
  }
  
  /* static members */
  @js.native
  object RoleBinding extends js.Object {
    /**
      * Get the state of an existing `RoleBinding` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): RoleBinding = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): RoleBinding = js.native
    /**
      * Returns true if the given object is an instance of RoleBinding.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/RoleBinding.RoleBinding */ Boolean = js.native
  }
  
}

