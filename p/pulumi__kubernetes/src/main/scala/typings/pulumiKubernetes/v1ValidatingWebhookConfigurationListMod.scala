package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.admissionregistration.v1.ValidatingWebhookConfiguration
import typings.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.admissionregistrationDotk8sDotioSlashv1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1ValidatingWebhookConfigurationListMod {
  
  @JSImport("@pulumi/kubernetes/admissionregistration/v1/validatingWebhookConfigurationList", "ValidatingWebhookConfigurationList")
  @js.native
  class ValidatingWebhookConfigurationList protected () extends CustomResource {
    /**
      * Create a ValidatingWebhookConfigurationList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ValidatingWebhookConfigurationListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ValidatingWebhookConfigurationListArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[admissionregistrationDotk8sDotioSlashv1] = js.native
    
    /**
      * List of ValidatingWebhookConfiguration.
      */
    val items: Output_[js.Array[ValidatingWebhookConfiguration]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[
        typings.pulumiKubernetes.pulumiKubernetesStrings.ValidatingWebhookConfigurationList
      ] = js.native
    
    /**
      * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val metadata: Output_[ListMeta] = js.native
  }
  /* static members */
  object ValidatingWebhookConfigurationList {
    
    @JSImport("@pulumi/kubernetes/admissionregistration/v1/validatingWebhookConfigurationList", "ValidatingWebhookConfigurationList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ValidatingWebhookConfigurationList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ValidatingWebhookConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ValidatingWebhookConfigurationList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): ValidatingWebhookConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ValidatingWebhookConfigurationList]
    
    /**
      * Returns true if the given object is an instance of ValidatingWebhookConfigurationList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/validatingWebhookConfigurationList.ValidatingWebhookConfigurationList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/validatingWebhookConfigurationList.ValidatingWebhookConfigurationList */ Boolean]
  }
  
  trait ValidatingWebhookConfigurationListArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[admissionregistrationDotk8sDotioSlashv1]] = js.undefined
    
    /**
      * List of ValidatingWebhookConfiguration.
      */
    val items: Input[
        js.Array[
          Input[
            typings.pulumiKubernetes.inputMod.admissionregistration.v1.ValidatingWebhookConfiguration
          ]
        ]
      ]
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[
        Input[
          typings.pulumiKubernetes.pulumiKubernetesStrings.ValidatingWebhookConfigurationList
        ]
      ] = js.undefined
    
    /**
      * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ListMeta]] = js.undefined
  }
  object ValidatingWebhookConfigurationListArgs {
    
    inline def apply(
      items: Input[
          js.Array[
            Input[
              typings.pulumiKubernetes.inputMod.admissionregistration.v1.ValidatingWebhookConfiguration
            ]
          ]
        ]
    ): ValidatingWebhookConfigurationListArgs = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidatingWebhookConfigurationListArgs]
    }
    
    extension [Self <: ValidatingWebhookConfigurationListArgs](x: Self) {
      
      inline def setApiVersion(value: Input[admissionregistrationDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setItems(
        value: Input[
              js.Array[
                Input[
                  typings.pulumiKubernetes.inputMod.admissionregistration.v1.ValidatingWebhookConfiguration
                ]
              ]
            ]
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(
        value: (Input[
              typings.pulumiKubernetes.inputMod.admissionregistration.v1.ValidatingWebhookConfiguration
            ])*
      ): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setKind(
        value: Input[
              typings.pulumiKubernetes.pulumiKubernetesStrings.ValidatingWebhookConfigurationList
            ]
      ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ListMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
}
