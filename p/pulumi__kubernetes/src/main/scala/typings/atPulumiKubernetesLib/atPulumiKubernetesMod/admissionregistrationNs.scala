package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "admissionregistration")
@js.native
object admissionregistrationNs extends js.Object {
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    @js.native
    class MutatingWebhookConfiguration protected ()
      extends atPulumiKubernetesLib.admissionregistrationMod.v1beta1Ns.MutatingWebhookConfiguration {
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
    
    @js.native
    class MutatingWebhookConfigurationList protected ()
      extends atPulumiKubernetesLib.admissionregistrationMod.v1beta1Ns.MutatingWebhookConfigurationList {
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
    
    @js.native
    class ValidatingWebhookConfiguration protected ()
      extends atPulumiKubernetesLib.admissionregistrationMod.v1beta1Ns.ValidatingWebhookConfiguration {
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
    
    @js.native
    class ValidatingWebhookConfigurationList protected ()
      extends atPulumiKubernetesLib.admissionregistrationMod.v1beta1Ns.ValidatingWebhookConfigurationList {
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.admissionregistrationV1beta1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.admissionregistrationV1beta1MutatingWebhookConfigurationMod.MutatingWebhookConfiguration = js.native
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.admissionregistrationV1beta1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.admissionregistrationV1beta1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.admissionregistrationV1beta1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.admissionregistrationV1beta1ValidatingWebhookConfigurationMod.ValidatingWebhookConfiguration = js.native
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.admissionregistrationV1beta1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.admissionregistrationV1beta1ValidatingWebhookConfigurationListMod.ValidatingWebhookConfigurationList = js.native
    }
    
  }
  
}

