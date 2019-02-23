package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "admissionregistration")
@js.native
object admissionregistrationNs extends js.Object {
  @JSName("v1alpha1")
  @js.native
  object v1alpha1Ns extends js.Object {
    /**
      * InitializerConfiguration describes the configuration of initializers.
      */
    @js.native
    class InitializerConfiguration protected ()
      extends atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1alpha1Ns.InitializerConfiguration {
      /**
        * Create a admissionregistration.v1alpha1.InitializerConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1alpha1Ns.InitializerConfiguration) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1alpha1Ns.InitializerConfiguration, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * InitializerConfigurationList is a list of InitializerConfiguration.
      */
    @js.native
    class InitializerConfigurationList protected ()
      extends atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1alpha1Ns.InitializerConfigurationList {
      /**
        * Create a admissionregistration.v1alpha1.InitializerConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1alpha1Ns.InitializerConfigurationList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1alpha1Ns.InitializerConfigurationList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /* static members */
    @js.native
    object InitializerConfiguration extends js.Object {
      /**
        * Get the state of an existing `InitializerConfiguration` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1alpha1Ns.InitializerConfiguration = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1alpha1Ns.InitializerConfiguration = js.native
    }
    
    /* static members */
    @js.native
    object InitializerConfigurationList extends js.Object {
      /**
        * Get the state of an existing `InitializerConfigurationList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1alpha1Ns.InitializerConfigurationList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1alpha1Ns.InitializerConfigurationList = js.native
    }
    
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept
      * or reject and may change the object.
      */
    @js.native
    class MutatingWebhookConfiguration protected ()
      extends atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfiguration {
      /**
        * Create a admissionregistration.v1beta1.MutatingWebhookConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfiguration) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfiguration, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * MutatingWebhookConfigurationList is a list of MutatingWebhookConfiguration.
      */
    @js.native
    class MutatingWebhookConfigurationList protected ()
      extends atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfigurationList {
      /**
        * Create a admissionregistration.v1beta1.MutatingWebhookConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfigurationList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfigurationList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ValidatingWebhookConfiguration describes the configuration of and admission webhook that
      * accept or reject and object without changing it.
      */
    @js.native
    class ValidatingWebhookConfiguration protected ()
      extends atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfiguration {
      /**
        * Create a admissionregistration.v1beta1.ValidatingWebhookConfiguration resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfiguration) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfiguration, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ValidatingWebhookConfigurationList is a list of ValidatingWebhookConfiguration.
      */
    @js.native
    class ValidatingWebhookConfigurationList protected ()
      extends atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfigurationList {
      /**
        * Create a admissionregistration.v1beta1.ValidatingWebhookConfigurationList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfigurationList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfigurationList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /* static members */
    @js.native
    object MutatingWebhookConfiguration extends js.Object {
      /**
        * Get the state of an existing `MutatingWebhookConfiguration` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfiguration = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfiguration = js.native
    }
    
    /* static members */
    @js.native
    object MutatingWebhookConfigurationList extends js.Object {
      /**
        * Get the state of an existing `MutatingWebhookConfigurationList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfigurationList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfigurationList = js.native
    }
    
    /* static members */
    @js.native
    object ValidatingWebhookConfiguration extends js.Object {
      /**
        * Get the state of an existing `ValidatingWebhookConfiguration` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfiguration = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfiguration = js.native
    }
    
    /* static members */
    @js.native
    object ValidatingWebhookConfigurationList extends js.Object {
      /**
        * Get the state of an existing `ValidatingWebhookConfigurationList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfigurationList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfigurationList = js.native
    }
    
  }
  
}

