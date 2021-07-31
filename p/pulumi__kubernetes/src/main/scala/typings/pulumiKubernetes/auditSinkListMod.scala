package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.auditregistration.v1alpha1.AuditSink
import typings.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.auditregistrationDotk8sDotioSlashv1alpha1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auditSinkListMod {
  
  @JSImport("@pulumi/kubernetes/auditregistration/v1alpha1/auditSinkList", "AuditSinkList")
  @js.native
  class AuditSinkList protected () extends CustomResource {
    /**
      * Create a AuditSinkList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AuditSinkListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: AuditSinkListArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[auditregistrationDotk8sDotioSlashv1alpha1] = js.native
    
    /**
      * List of audit configurations.
      */
    val items: Output_[js.Array[AuditSink]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.AuditSinkList] = js.native
    
    val metadata: Output_[ListMeta] = js.native
  }
  /* static members */
  object AuditSinkList {
    
    @JSImport("@pulumi/kubernetes/auditregistration/v1alpha1/auditSinkList", "AuditSinkList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AuditSinkList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): AuditSinkList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[AuditSinkList]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): AuditSinkList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AuditSinkList]
    
    /**
      * Returns true if the given object is an instance of AuditSinkList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/auditSinkList.AuditSinkList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/auditSinkList.AuditSinkList */ Boolean]
  }
  
  trait AuditSinkListArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[auditregistrationDotk8sDotioSlashv1alpha1]] = js.undefined
    
    /**
      * List of audit configurations.
      */
    val items: Input[
        js.Array[Input[typings.pulumiKubernetes.inputMod.auditregistration.v1alpha1.AuditSink]]
      ]
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.AuditSinkList]] = js.undefined
    
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ListMeta]] = js.undefined
  }
  object AuditSinkListArgs {
    
    @scala.inline
    def apply(
      items: Input[
          js.Array[Input[typings.pulumiKubernetes.inputMod.auditregistration.v1alpha1.AuditSink]]
        ]
    ): AuditSinkListArgs = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuditSinkListArgs]
    }
    
    @scala.inline
    implicit class AuditSinkListArgsMutableBuilder[Self <: AuditSinkListArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[auditregistrationDotk8sDotioSlashv1alpha1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setItems(
        value: Input[
              js.Array[Input[typings.pulumiKubernetes.inputMod.auditregistration.v1alpha1.AuditSink]]
            ]
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Input[typings.pulumiKubernetes.inputMod.auditregistration.v1alpha1.AuditSink]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.AuditSinkList]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ListMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
}
