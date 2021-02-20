package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.admissionregistration.v1beta1.ValidatingWebhook
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.admissionregistrationDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatingWebhookConfigurationMod {
  
  @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfiguration", "ValidatingWebhookConfiguration")
  @js.native
  class ValidatingWebhookConfiguration protected () extends CustomResource {
    /**
      * Create a ValidatingWebhookConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ValidatingWebhookConfigurationArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ValidatingWebhookConfigurationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[admissionregistrationDotk8sDotioSlashv1beta1] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.ValidatingWebhookConfiguration] = js.native
    
    /**
      * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
      */
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * Webhooks is a list of webhooks and the affected resources and operations.
      */
    val webhooks: Output_[js.Array[ValidatingWebhook]] = js.native
  }
  /* static members */
  object ValidatingWebhookConfiguration {
    
    /**
      * Get an existing ValidatingWebhookConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfiguration", "ValidatingWebhookConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): ValidatingWebhookConfiguration = js.native
    @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfiguration", "ValidatingWebhookConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): ValidatingWebhookConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of ValidatingWebhookConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfiguration", "ValidatingWebhookConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfiguration.ValidatingWebhookConfiguration */ Boolean = js.native
  }
  
  @js.native
  trait ValidatingWebhookConfigurationArgs extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[admissionregistrationDotk8sDotioSlashv1beta1]] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[
        Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ValidatingWebhookConfiguration]
      ] = js.native
    
    /**
      * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
      */
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.native
    
    /**
      * Webhooks is a list of webhooks and the affected resources and operations.
      */
    val webhooks: js.UndefOr[
        Input[
          js.Array[
            Input[
              typings.pulumiKubernetes.inputMod.admissionregistration.v1beta1.ValidatingWebhook
            ]
          ]
        ]
      ] = js.native
  }
  object ValidatingWebhookConfigurationArgs {
    
    @scala.inline
    def apply(): ValidatingWebhookConfigurationArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidatingWebhookConfigurationArgs]
    }
    
    @scala.inline
    implicit class ValidatingWebhookConfigurationArgsMutableBuilder[Self <: ValidatingWebhookConfigurationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: Input[admissionregistrationDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ValidatingWebhookConfiguration]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setWebhooks(
        value: Input[
              js.Array[
                Input[
                  typings.pulumiKubernetes.inputMod.admissionregistration.v1beta1.ValidatingWebhook
                ]
              ]
            ]
      ): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebhooksUndefined: Self = StObject.set(x, "webhooks", js.undefined)
      
      @scala.inline
      def setWebhooksVarargs(
        value: (Input[
              typings.pulumiKubernetes.inputMod.admissionregistration.v1beta1.ValidatingWebhook
            ])*
      ): Self = StObject.set(x, "webhooks", js.Array(value :_*))
    }
  }
}
