package typings.pulumiKubernetes

import typings.pulumiKubernetes.mutatingWebhookConfigurationListMod.MutatingWebhookConfigurationListArgs
import typings.pulumiKubernetes.mutatingWebhookConfigurationMod.MutatingWebhookConfigurationArgs
import typings.pulumiKubernetes.validatingWebhookConfigurationListMod.ValidatingWebhookConfigurationListArgs
import typings.pulumiKubernetes.validatingWebhookConfigurationMod.ValidatingWebhookConfigurationArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1Mod {
  
  @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "MutatingWebhookConfiguration")
  @js.native
  class MutatingWebhookConfiguration protected ()
    extends typings.pulumiKubernetes.mutatingWebhookConfigurationMod.MutatingWebhookConfiguration {
    /**
      * Create a MutatingWebhookConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: MutatingWebhookConfigurationArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: MutatingWebhookConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object MutatingWebhookConfiguration {
    
    @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "MutatingWebhookConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MutatingWebhookConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.mutatingWebhookConfigurationMod.MutatingWebhookConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.mutatingWebhookConfigurationMod.MutatingWebhookConfiguration]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.mutatingWebhookConfigurationMod.MutatingWebhookConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.mutatingWebhookConfigurationMod.MutatingWebhookConfiguration]
    
    /**
      * Returns true if the given object is an instance of MutatingWebhookConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/mutatingWebhookConfiguration.MutatingWebhookConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/mutatingWebhookConfiguration.MutatingWebhookConfiguration */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "MutatingWebhookConfigurationList")
  @js.native
  class MutatingWebhookConfigurationList protected ()
    extends typings.pulumiKubernetes.mutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList {
    /**
      * Create a MutatingWebhookConfigurationList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: MutatingWebhookConfigurationListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: MutatingWebhookConfigurationListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object MutatingWebhookConfigurationList {
    
    @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "MutatingWebhookConfigurationList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MutatingWebhookConfigurationList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.mutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.mutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.mutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.mutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList]
    
    /**
      * Returns true if the given object is an instance of MutatingWebhookConfigurationList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/mutatingWebhookConfigurationList.MutatingWebhookConfigurationList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/mutatingWebhookConfigurationList.MutatingWebhookConfigurationList */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "ValidatingWebhookConfiguration")
  @js.native
  class ValidatingWebhookConfiguration protected ()
    extends typings.pulumiKubernetes.validatingWebhookConfigurationMod.ValidatingWebhookConfiguration {
    /**
      * Create a ValidatingWebhookConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ValidatingWebhookConfigurationArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ValidatingWebhookConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ValidatingWebhookConfiguration {
    
    @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "ValidatingWebhookConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ValidatingWebhookConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.validatingWebhookConfigurationMod.ValidatingWebhookConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.validatingWebhookConfigurationMod.ValidatingWebhookConfiguration]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.validatingWebhookConfigurationMod.ValidatingWebhookConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.validatingWebhookConfigurationMod.ValidatingWebhookConfiguration]
    
    /**
      * Returns true if the given object is an instance of ValidatingWebhookConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfiguration.ValidatingWebhookConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfiguration.ValidatingWebhookConfiguration */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "ValidatingWebhookConfigurationList")
  @js.native
  class ValidatingWebhookConfigurationList protected ()
    extends typings.pulumiKubernetes.validatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList {
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
  }
  /* static members */
  object ValidatingWebhookConfigurationList {
    
    @JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "ValidatingWebhookConfigurationList")
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
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.validatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.validatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.validatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.validatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList]
    
    /**
      * Returns true if the given object is an instance of ValidatingWebhookConfigurationList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfigurationList.ValidatingWebhookConfigurationList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfigurationList.ValidatingWebhookConfigurationList */ Boolean]
  }
}
