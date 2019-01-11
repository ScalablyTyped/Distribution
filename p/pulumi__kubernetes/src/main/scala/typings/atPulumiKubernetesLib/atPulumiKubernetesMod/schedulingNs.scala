package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "scheduling")
@js.native
object schedulingNs extends js.Object {
  @JSName("v1alpha1")
  @js.native
  object v1alpha1Ns extends js.Object {
    /**
      * PriorityClass defines mapping from a priority class name to the priority integer value. The
      * value can be any valid integer.
      */
    @js.native
    class PriorityClass protected ()
      extends atPulumiKubernetesLib.providerMod.schedulingNs.v1alpha1Ns.PriorityClass {
      /**
        * Create a scheduling.v1alpha1.PriorityClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.schedulingNs.v1alpha1Ns.PriorityClass) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.schedulingNs.v1alpha1Ns.PriorityClass, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * PriorityClassList is a collection of priority classes.
      */
    @js.native
    class PriorityClassList protected ()
      extends atPulumiKubernetesLib.providerMod.schedulingNs.v1alpha1Ns.PriorityClassList {
      /**
        * Create a scheduling.v1alpha1.PriorityClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.schedulingNs.v1alpha1Ns.PriorityClassList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.schedulingNs.v1alpha1Ns.PriorityClassList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * PriorityClass defines mapping from a priority class name to the priority integer value. The
      * value can be any valid integer.
      */
    @js.native
    object PriorityClass extends js.Object {
      /**
        * Get the state of an existing `PriorityClass` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.schedulingNs.v1alpha1Ns.PriorityClass = js.native
    }
    
    /**
      * PriorityClassList is a collection of priority classes.
      */
    @js.native
    object PriorityClassList extends js.Object {
      /**
        * Get the state of an existing `PriorityClassList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.schedulingNs.v1alpha1Ns.PriorityClassList = js.native
    }
    
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * PriorityClass defines mapping from a priority class name to the priority integer value. The
      * value can be any valid integer.
      */
    @js.native
    class PriorityClass protected ()
      extends atPulumiKubernetesLib.providerMod.schedulingNs.v1beta1Ns.PriorityClass {
      /**
        * Create a scheduling.v1beta1.PriorityClass resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.schedulingNs.v1beta1Ns.PriorityClass) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.schedulingNs.v1beta1Ns.PriorityClass, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * PriorityClassList is a collection of priority classes.
      */
    @js.native
    class PriorityClassList protected ()
      extends atPulumiKubernetesLib.providerMod.schedulingNs.v1beta1Ns.PriorityClassList {
      /**
        * Create a scheduling.v1beta1.PriorityClassList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.schedulingNs.v1beta1Ns.PriorityClassList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.schedulingNs.v1beta1Ns.PriorityClassList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * PriorityClass defines mapping from a priority class name to the priority integer value. The
      * value can be any valid integer.
      */
    @js.native
    object PriorityClass extends js.Object {
      /**
        * Get the state of an existing `PriorityClass` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.schedulingNs.v1beta1Ns.PriorityClass = js.native
    }
    
    /**
      * PriorityClassList is a collection of priority classes.
      */
    @js.native
    object PriorityClassList extends js.Object {
      /**
        * Get the state of an existing `PriorityClassList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.schedulingNs.v1beta1Ns.PriorityClassList = js.native
    }
    
  }
  
}

