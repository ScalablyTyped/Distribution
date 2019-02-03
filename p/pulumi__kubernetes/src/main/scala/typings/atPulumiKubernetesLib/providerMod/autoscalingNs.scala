package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/provider", "autoscaling")
@js.native
object autoscalingNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * configuration of a horizontal pod autoscaler.
      */
    @js.native
    class HorizontalPodAutoscaler protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a autoscaling.v1.HorizontalPodAutoscaler resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.autoscalingNs.v1Ns.HorizontalPodAutoscaler) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.autoscalingNs.v1Ns.HorizontalPodAutoscaler, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1`] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscaler] = js.native
      /**
        * Standard object metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * behaviour of autoscaler. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
        */
      val spec: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerSpec
          ] = js.native
      /**
        * current information about the autoscaler.
        */
      val status: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerStatus
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.autoscalingNs.v1Ns.HorizontalPodAutoscaler = js.native
    }
    
    /**
      * list of horizontal pod autoscaler objects.
      */
    @js.native
    class HorizontalPodAutoscalerList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a autoscaling.v1.HorizontalPodAutoscalerList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v1`] = js.native
      /**
        * list of horizontal pod autoscaler objects.
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v1Ns.HorizontalPodAutoscaler]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscalerList] = js.native
      /**
        * Standard list metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerList = js.native
    }
    
    /* static members */
    @js.native
    object HorizontalPodAutoscaler extends js.Object {
      /**
        * Get the state of an existing `HorizontalPodAutoscaler` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.autoscalingNs.v1Ns.HorizontalPodAutoscaler = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.autoscalingNs.v1Ns.HorizontalPodAutoscaler = js.native
    }
    
    /* static members */
    @js.native
    object HorizontalPodAutoscalerList extends js.Object {
      /**
        * Get the state of an existing `HorizontalPodAutoscalerList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerList = js.native
    }
    
  }
  
  @JSName("v2beta1")
  @js.native
  object v2beta1Ns extends js.Object {
    /**
      * HorizontalPodAutoscaler is the configuration for a horizontal pod autoscaler, which
      * automatically manages the replica count of any resource implementing the scale subresource
      * based on the metrics specified.
      */
    @js.native
    class HorizontalPodAutoscaler protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a autoscaling.v2beta1.HorizontalPodAutoscaler resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscaler) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscaler, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1`] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscaler] = js.native
      /**
        * metadata is the standard object metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * spec is the specification for the behaviour of the autoscaler. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
        */
      val spec: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerSpec
          ] = js.native
      /**
        * status is the current information about the autoscaler.
        */
      val status: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerStatus
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscaler = js.native
    }
    
    /**
      * HorizontalPodAutoscaler is a list of horizontal pod autoscaler objects.
      */
    @js.native
    class HorizontalPodAutoscalerList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a autoscaling.v2beta1.HorizontalPodAutoscalerList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta1`] = js.native
      /**
        * items is the list of horizontal pod autoscaler objects.
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            js.Array[
              atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscaler
            ]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscalerList] = js.native
      /**
        * metadata is the standard list metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerList = js.native
    }
    
    /* static members */
    @js.native
    object HorizontalPodAutoscaler extends js.Object {
      /**
        * Get the state of an existing `HorizontalPodAutoscaler` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscaler = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscaler = js.native
    }
    
    /* static members */
    @js.native
    object HorizontalPodAutoscalerList extends js.Object {
      /**
        * Get the state of an existing `HorizontalPodAutoscalerList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerList = js.native
    }
    
  }
  
  @JSName("v2beta2")
  @js.native
  object v2beta2Ns extends js.Object {
    /**
      * HorizontalPodAutoscaler is the configuration for a horizontal pod autoscaler, which
      * automatically manages the replica count of any resource implementing the scale subresource
      * based on the metrics specified.
      */
    @js.native
    class HorizontalPodAutoscaler protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a autoscaling.v2beta2.HorizontalPodAutoscaler resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2`] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscaler] = js.native
      /**
        * metadata is the standard object metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * spec is the specification for the behaviour of the autoscaler. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
        */
      val spec: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerSpec
          ] = js.native
      /**
        * status is the current information about the autoscaler.
        */
      val status: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerStatus
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler = js.native
    }
    
    /**
      * HorizontalPodAutoscalerList is a list of horizontal pod autoscaler objects.
      */
    @js.native
    class HorizontalPodAutoscalerList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a autoscaling.v2beta2.HorizontalPodAutoscalerList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2`] = js.native
      /**
        * items is the list of horizontal pod autoscaler objects.
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            js.Array[
              atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler
            ]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscalerList] = js.native
      /**
        * metadata is the standard list metadata.
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerList = js.native
    }
    
    /* static members */
    @js.native
    object HorizontalPodAutoscaler extends js.Object {
      /**
        * Get the state of an existing `HorizontalPodAutoscaler` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler = js.native
    }
    
    /* static members */
    @js.native
    object HorizontalPodAutoscalerList extends js.Object {
      /**
        * Get the state of an existing `HorizontalPodAutoscalerList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerList = js.native
    }
    
  }
  
}

