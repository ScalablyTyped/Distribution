package typings.pulumiKubernetes.mod

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "admissionregistration")
@js.native
object admissionregistration extends js.Object {
  @js.native
  object v1 extends js.Object {
    @js.native
    class MutatingWebhookConfiguration protected ()
      extends typings.pulumiKubernetes.admissionregistrationMod.v1.MutatingWebhookConfiguration {
      /**
        * Create a admissionregistration.v1.MutatingWebhookConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.admissionregistration.v1.MutatingWebhookConfiguration
      ) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.admissionregistration.v1.MutatingWebhookConfiguration,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class MutatingWebhookConfigurationList protected ()
      extends typings.pulumiKubernetes.admissionregistrationMod.v1.MutatingWebhookConfigurationList {
      /**
        * Create a admissionregistration.v1.MutatingWebhookConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.admissionregistration.v1.MutatingWebhookConfigurationList
      ) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.admissionregistration.v1.MutatingWebhookConfigurationList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class ValidatingWebhookConfiguration protected ()
      extends typings.pulumiKubernetes.admissionregistrationMod.v1.ValidatingWebhookConfiguration {
      /**
        * Create a admissionregistration.v1.ValidatingWebhookConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.admissionregistration.v1.ValidatingWebhookConfiguration
      ) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.admissionregistration.v1.ValidatingWebhookConfiguration,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class ValidatingWebhookConfigurationList protected ()
      extends typings.pulumiKubernetes.admissionregistrationMod.v1.ValidatingWebhookConfigurationList {
      /**
        * Create a admissionregistration.v1.ValidatingWebhookConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.admissionregistration.v1.ValidatingWebhookConfigurationList
      ) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.admissionregistration.v1.ValidatingWebhookConfigurationList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object MutatingWebhookConfiguration extends js.Object {
      /**
        * Get the state of an existing `MutatingWebhookConfiguration` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
      /**
        * Returns true if the given object is an instance of MutatingWebhookConfiguration.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/MutatingWebhookConfiguration.MutatingWebhookConfiguration */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object MutatingWebhookConfigurationList extends js.Object {
      /**
        * Get the state of an existing `MutatingWebhookConfigurationList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
      /**
        * Returns true if the given object is an instance of MutatingWebhookConfigurationList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/MutatingWebhookConfigurationList.MutatingWebhookConfigurationList */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object ValidatingWebhookConfiguration extends js.Object {
      /**
        * Get the state of an existing `ValidatingWebhookConfiguration` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
      /**
        * Returns true if the given object is an instance of ValidatingWebhookConfiguration.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/ValidatingWebhookConfiguration.ValidatingWebhookConfiguration */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object ValidatingWebhookConfigurationList extends js.Object {
      /**
        * Get the state of an existing `ValidatingWebhookConfigurationList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
      /**
        * Returns true if the given object is an instance of ValidatingWebhookConfigurationList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1/ValidatingWebhookConfigurationList.ValidatingWebhookConfigurationList */ Boolean = js.native
    }
    
  }
  
  @js.native
  object v1beta1 extends js.Object {
    @js.native
    class MutatingWebhookConfiguration protected ()
      extends typings.pulumiKubernetes.admissionregistrationMod.v1beta1.MutatingWebhookConfiguration {
      /**
        * Create a admissionregistration.v1beta1.MutatingWebhookConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.admissionregistration.v1beta1.MutatingWebhookConfiguration
      ) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.admissionregistration.v1beta1.MutatingWebhookConfiguration,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class MutatingWebhookConfigurationList protected ()
      extends typings.pulumiKubernetes.admissionregistrationMod.v1beta1.MutatingWebhookConfigurationList {
      /**
        * Create a admissionregistration.v1beta1.MutatingWebhookConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.admissionregistration.v1beta1.MutatingWebhookConfigurationList
      ) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.admissionregistration.v1beta1.MutatingWebhookConfigurationList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class ValidatingWebhookConfiguration protected ()
      extends typings.pulumiKubernetes.admissionregistrationMod.v1beta1.ValidatingWebhookConfiguration {
      /**
        * Create a admissionregistration.v1beta1.ValidatingWebhookConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.admissionregistration.v1beta1.ValidatingWebhookConfiguration
      ) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.admissionregistration.v1beta1.ValidatingWebhookConfiguration,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class ValidatingWebhookConfigurationList protected ()
      extends typings.pulumiKubernetes.admissionregistrationMod.v1beta1.ValidatingWebhookConfigurationList {
      /**
        * Create a admissionregistration.v1beta1.ValidatingWebhookConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.admissionregistration.v1beta1.ValidatingWebhookConfigurationList
      ) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.admissionregistration.v1beta1.ValidatingWebhookConfigurationList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object MutatingWebhookConfiguration extends js.Object {
      /**
        * Get the state of an existing `MutatingWebhookConfiguration` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.mutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.mutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
      /**
        * Returns true if the given object is an instance of MutatingWebhookConfiguration.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/MutatingWebhookConfiguration.MutatingWebhookConfiguration */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object MutatingWebhookConfigurationList extends js.Object {
      /**
        * Get the state of an existing `MutatingWebhookConfigurationList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.mutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.mutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
      /**
        * Returns true if the given object is an instance of MutatingWebhookConfigurationList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/MutatingWebhookConfigurationList.MutatingWebhookConfigurationList */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object ValidatingWebhookConfiguration extends js.Object {
      /**
        * Get the state of an existing `ValidatingWebhookConfiguration` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.validatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.validatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
      /**
        * Returns true if the given object is an instance of ValidatingWebhookConfiguration.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/ValidatingWebhookConfiguration.ValidatingWebhookConfiguration */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object ValidatingWebhookConfigurationList extends js.Object {
      /**
        * Get the state of an existing `ValidatingWebhookConfigurationList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.validatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.validatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
      /**
        * Returns true if the given object is an instance of ValidatingWebhookConfigurationList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/ValidatingWebhookConfigurationList.ValidatingWebhookConfigurationList */ Boolean = js.native
    }
    
  }
  
}

