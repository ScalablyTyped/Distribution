package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.outputMod.rbac.v1.AggregationRule
import typings.pulumiKubernetes.outputMod.rbac.v1.PolicyRule
import typings.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1ClusterRoleMod {
  
  @JSImport("@pulumi/kubernetes/rbac/v1/clusterRole", "ClusterRole")
  @js.native
  class ClusterRole protected () extends CustomResource {
    /**
      * Create a ClusterRole resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
      */
    val aggregationRule: Output_[AggregationRule] = js.native
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[rbacDotauthorizationDotk8sDotioSlashv1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole] = js.native
    
    /**
      * Standard object's metadata.
      */
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * Rules holds all the PolicyRules for this ClusterRole
      */
    val rules: Output_[js.Array[PolicyRule]] = js.native
  }
  /* static members */
  object ClusterRole {
    
    /**
      * Get an existing ClusterRole resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/rbac/v1/clusterRole", "ClusterRole.get")
    @js.native
    def get(name: String, id: Input[ID]): ClusterRole = js.native
    @JSImport("@pulumi/kubernetes/rbac/v1/clusterRole", "ClusterRole.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): ClusterRole = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterRole.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/rbac/v1/clusterRole", "ClusterRole.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1/clusterRole.ClusterRole */ Boolean = js.native
  }
  
  @js.native
  trait ClusterRoleArgs extends StObject {
    
    /**
      * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
      */
    val aggregationRule: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.rbac.v1.AggregationRule]] = js.native
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole]] = js.native
    
    /**
      * Standard object's metadata.
      */
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.native
    
    /**
      * Rules holds all the PolicyRules for this ClusterRole
      */
    val rules: js.UndefOr[Input[js.Array[Input[typings.pulumiKubernetes.inputMod.rbac.v1.PolicyRule]]]] = js.native
  }
  object ClusterRoleArgs {
    
    @scala.inline
    def apply(): ClusterRoleArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterRoleArgs]
    }
    
    @scala.inline
    implicit class ClusterRoleArgsMutableBuilder[Self <: ClusterRoleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAggregationRule(value: Input[typings.pulumiKubernetes.inputMod.rbac.v1.AggregationRule]): Self = StObject.set(x, "aggregationRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregationRuleUndefined: Self = StObject.set(x, "aggregationRule", js.undefined)
      
      @scala.inline
      def setApiVersion(value: Input[rbacDotauthorizationDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setRules(value: Input[js.Array[Input[typings.pulumiKubernetes.inputMod.rbac.v1.PolicyRule]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: Input[typings.pulumiKubernetes.inputMod.rbac.v1.PolicyRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
    }
  }
}
