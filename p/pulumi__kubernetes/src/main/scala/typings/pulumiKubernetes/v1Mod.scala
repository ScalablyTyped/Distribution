package typings.pulumiKubernetes

import typings.pulumiKubernetes.v1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationListArgs
import typings.pulumiKubernetes.v1MutatingWebhookConfigurationMod.MutatingWebhookConfigurationArgs
import typings.pulumiKubernetes.v1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationListArgs
import typings.pulumiKubernetes.v1ValidatingWebhookConfigurationMod.ValidatingWebhookConfigurationArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1Mod {
  
  @JSImport("@pulumi/kubernetes/admissionregistration/v1", "MutatingWebhookConfiguration")
  @js.native
  class MutatingWebhookConfiguration protected ()
    extends typings.pulumiKubernetes.v1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration {
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
    
    @JSImport("@pulumi/kubernetes/admissionregistration/v1", "MutatingWebhookConfiguration")
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
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration]
    
    /**
      * Returns true if the given object is an instance of MutatingWebhookConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/mutatingWebhookConfiguration.MutatingWebhookConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/mutatingWebhookConfiguration.MutatingWebhookConfiguration */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/admissionregistration/v1", "MutatingWebhookConfigurationList")
  @js.native
  class MutatingWebhookConfigurationList protected ()
    extends typings.pulumiKubernetes.v1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList {
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
    
    @JSImport("@pulumi/kubernetes/admissionregistration/v1", "MutatingWebhookConfigurationList")
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
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList]
    
    /**
      * Returns true if the given object is an instance of MutatingWebhookConfigurationList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/mutatingWebhookConfigurationList.MutatingWebhookConfigurationList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/mutatingWebhookConfigurationList.MutatingWebhookConfigurationList */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/admissionregistration/v1", "ValidatingWebhookConfiguration")
  @js.native
  class ValidatingWebhookConfiguration protected ()
    extends typings.pulumiKubernetes.v1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration {
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
    
    @JSImport("@pulumi/kubernetes/admissionregistration/v1", "ValidatingWebhookConfiguration")
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
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration]
    
    /**
      * Returns true if the given object is an instance of ValidatingWebhookConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/validatingWebhookConfiguration.ValidatingWebhookConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/validatingWebhookConfiguration.ValidatingWebhookConfiguration */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/admissionregistration/v1", "ValidatingWebhookConfigurationList")
  @js.native
  class ValidatingWebhookConfigurationList protected ()
    extends typings.pulumiKubernetes.v1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList {
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
    
    @JSImport("@pulumi/kubernetes/admissionregistration/v1", "ValidatingWebhookConfigurationList")
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
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList]
    
    /**
      * Returns true if the given object is an instance of ValidatingWebhookConfigurationList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/validatingWebhookConfigurationList.ValidatingWebhookConfigurationList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/validatingWebhookConfigurationList.ValidatingWebhookConfigurationList */ Boolean]
  }
}
