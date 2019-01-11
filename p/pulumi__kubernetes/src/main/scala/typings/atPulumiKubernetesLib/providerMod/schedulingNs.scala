package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/provider", "scheduling")
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
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
      /**
        * description is an arbitrary string that usually provides guidelines on when this priority
        * class should be used.
        */
      val description: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
      /**
        * globalDefault specifies whether this PriorityClass should be considered as the default
        * priority for pods that do not have any priority class. Only one PriorityClass can be marked
        * as `globalDefault`. However, if more than one PriorityClasses exists with their
        * `globalDefault` field set to true, the smallest value of such global default
        * PriorityClasses will be used as the default priority.
        */
      val globalDefault: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Boolean] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * The value of this priority class. This is the actual priority that pods receive when they
        * have the name of this class in their pod spec.
        */
      val value: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.schedulingNs.v1alpha1Ns.PriorityClass = js.native
    }
    
    /**
      * PriorityClassList is a collection of priority classes.
      */
    @js.native
    class PriorityClassList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
      /**
        * items is the list of PriorityClasses
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.schedulingNs.v1alpha1Ns.PriorityClass]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.schedulingNs.v1alpha1Ns.PriorityClassList = js.native
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
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
      /**
        * description is an arbitrary string that usually provides guidelines on when this priority
        * class should be used.
        */
      val description: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
      /**
        * globalDefault specifies whether this PriorityClass should be considered as the default
        * priority for pods that do not have any priority class. Only one PriorityClass can be marked
        * as `globalDefault`. However, if more than one PriorityClasses exists with their
        * `globalDefault` field set to true, the smallest value of such global default
        * PriorityClasses will be used as the default priority.
        */
      val globalDefault: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Boolean] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * The value of this priority class. This is the actual priority that pods receive when they
        * have the name of this class in their pod spec.
        */
      val value: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.schedulingNs.v1beta1Ns.PriorityClass = js.native
    }
    
    /**
      * PriorityClassList is a collection of priority classes.
      */
    @js.native
    class PriorityClassList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
      /**
        * items is the list of PriorityClasses
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.schedulingNs.v1beta1Ns.PriorityClass]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.schedulingNs.v1beta1Ns.PriorityClassList = js.native
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

