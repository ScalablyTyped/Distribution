package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "autoscaling")
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
      extends atPulumiKubernetesLib.providerMod.autoscalingNs.v1Ns.HorizontalPodAutoscaler {
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
    }
    
    /**
      * list of horizontal pod autoscaler objects.
      */
    @js.native
    class HorizontalPodAutoscalerList protected ()
      extends atPulumiKubernetesLib.providerMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerList {
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
      extends atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscaler {
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
    }
    
    /**
      * HorizontalPodAutoscaler is a list of horizontal pod autoscaler objects.
      */
    @js.native
    class HorizontalPodAutoscalerList protected ()
      extends atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerList {
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
      extends atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler {
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
    }
    
    /**
      * HorizontalPodAutoscalerList is a list of horizontal pod autoscaler objects.
      */
    @js.native
    class HorizontalPodAutoscalerList protected ()
      extends atPulumiKubernetesLib.providerMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerList {
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

