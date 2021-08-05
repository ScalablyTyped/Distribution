package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.outputMod.rbac.v1beta1.RoleRef
import typings.pulumiKubernetes.outputMod.rbac.v1beta1.Subject
import typings.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1RoleBindingMod {
  
  @JSImport("@pulumi/kubernetes/rbac/v1beta1/roleBinding", "RoleBinding")
  @js.native
  class RoleBinding protected () extends CustomResource {
    /**
      * Create a RoleBinding resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleBindingArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleBindingArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[rbacDotauthorizationDotk8sDotioSlashv1beta1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.RoleBinding] = js.native
    
    /**
      * Standard object's metadata.
      */
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
      */
    val roleRef: Output_[RoleRef] = js.native
    
    /**
      * Subjects holds references to the objects the role applies to.
      */
    val subjects: Output_[js.Array[Subject]] = js.native
  }
  /* static members */
  object RoleBinding {
    
    @JSImport("@pulumi/kubernetes/rbac/v1beta1/roleBinding", "RoleBinding")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RoleBinding resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): RoleBinding = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RoleBinding]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): RoleBinding = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RoleBinding]
    
    /**
      * Returns true if the given object is an instance of RoleBinding.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/roleBinding.RoleBinding */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/roleBinding.RoleBinding */ Boolean]
  }
  
  trait RoleBindingArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.RoleBinding]] = js.undefined
    
    /**
      * Standard object's metadata.
      */
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.undefined
    
    /**
      * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
      */
    val roleRef: Input[typings.pulumiKubernetes.inputMod.rbac.v1beta1.RoleRef]
    
    /**
      * Subjects holds references to the objects the role applies to.
      */
    val subjects: js.UndefOr[Input[js.Array[Input[typings.pulumiKubernetes.inputMod.rbac.v1beta1.Subject]]]] = js.undefined
  }
  object RoleBindingArgs {
    
    inline def apply(roleRef: Input[typings.pulumiKubernetes.inputMod.rbac.v1beta1.RoleRef]): RoleBindingArgs = {
      val __obj = js.Dynamic.literal(roleRef = roleRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleBindingArgs]
    }
    
    extension [Self <: RoleBindingArgs](x: Self) {
      
      inline def setApiVersion(value: Input[rbacDotauthorizationDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.RoleBinding]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setRoleRef(value: Input[typings.pulumiKubernetes.inputMod.rbac.v1beta1.RoleRef]): Self = StObject.set(x, "roleRef", value.asInstanceOf[js.Any])
      
      inline def setSubjects(value: Input[js.Array[Input[typings.pulumiKubernetes.inputMod.rbac.v1beta1.Subject]]]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
      
      inline def setSubjectsUndefined: Self = StObject.set(x, "subjects", js.undefined)
      
      inline def setSubjectsVarargs(value: Input[typings.pulumiKubernetes.inputMod.rbac.v1beta1.Subject]*): Self = StObject.set(x, "subjects", js.Array(value :_*))
    }
  }
}
