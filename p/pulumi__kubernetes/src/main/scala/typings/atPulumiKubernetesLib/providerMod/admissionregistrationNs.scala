package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/provider", "admissionregistration")
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
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Initializers is a list of resources and their default initializers Order-sensitive. When
        * merging multiple InitializerConfigurations, we sort the initializers from different
        * InitializerConfigurations by the name of the InitializerConfigurations; the order of the
        * initializers from the same InitializerConfiguration is preserved.
        */
      val initializers: atPulumiPulumiLib.pulumiMod.Output[
            js.Array[
              atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1alpha1Ns.Initializer
            ]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object metadata; More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1alpha1Ns.InitializerConfiguration = js.native
    }
    
    /**
      * InitializerConfigurationList is a list of InitializerConfiguration.
      */
    @js.native
    class InitializerConfigurationList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * List of InitializerConfiguration.
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[
            js.Array[
              atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1alpha1Ns.InitializerConfiguration
            ]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1alpha1Ns.InitializerConfigurationList = js.native
    }
    
    /**
      * InitializerConfiguration describes the configuration of initializers.
      */
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
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1alpha1Ns.InitializerConfiguration = js.native
    }
    
    /**
      * InitializerConfigurationList is a list of InitializerConfiguration.
      */
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
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1alpha1Ns.InitializerConfigurationList = js.native
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
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object metadata; More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Webhooks is a list of webhooks and the affected resources and operations.
        */
      val webhooks: atPulumiPulumiLib.pulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.Webhook]
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfiguration = js.native
    }
    
    /**
      * MutatingWebhookConfigurationList is a list of MutatingWebhookConfiguration.
      */
    @js.native
    class MutatingWebhookConfigurationList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * List of MutatingWebhookConfiguration.
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[
            js.Array[
              atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfiguration
            ]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfigurationList = js.native
    }
    
    /**
      * ValidatingWebhookConfiguration describes the configuration of and admission webhook that
      * accept or reject and object without changing it.
      */
    @js.native
    class ValidatingWebhookConfiguration protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object metadata; More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Webhooks is a list of webhooks and the affected resources and operations.
        */
      val webhooks: atPulumiPulumiLib.pulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.Webhook]
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfiguration = js.native
    }
    
    /**
      * ValidatingWebhookConfigurationList is a list of ValidatingWebhookConfiguration.
      */
    @js.native
    class ValidatingWebhookConfigurationList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * List of ValidatingWebhookConfiguration.
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[
            js.Array[
              atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfiguration
            ]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfigurationList = js.native
    }
    
    /**
      * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept
      * or reject and may change the object.
      */
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
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfiguration = js.native
    }
    
    /**
      * MutatingWebhookConfigurationList is a list of MutatingWebhookConfiguration.
      */
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
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfigurationList = js.native
    }
    
    /**
      * ValidatingWebhookConfiguration describes the configuration of and admission webhook that
      * accept or reject and object without changing it.
      */
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
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfiguration = js.native
    }
    
    /**
      * ValidatingWebhookConfigurationList is a list of ValidatingWebhookConfiguration.
      */
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
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.admissionregistrationNs.v1beta1Ns.ValidatingWebhookConfigurationList = js.native
    }
    
  }
  
}

