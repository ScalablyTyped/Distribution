package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/provider", "coordination")
@js.native
object coordinationNs extends js.Object {
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * Lease defines a lease concept.
      */
    @js.native
    class Lease protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
        * Create a coordination.v1beta1.Lease resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coordinationNs.v1beta1Ns.Lease) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coordinationNs.v1beta1Ns.Lease, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
        * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Specification of the Lease. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.coordinationNs.v1beta1Ns.LeaseSpec] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coordinationNs.v1beta1Ns.Lease = js.native
    }
    
    /**
      * LeaseList is a list of Lease objects.
      */
    @js.native
    class LeaseList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
        * Create a coordination.v1beta1.LeaseList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coordinationNs.v1beta1Ns.LeaseList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coordinationNs.v1beta1Ns.LeaseList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Items is a list of schema objects.
        */
      val items: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coordinationNs.v1beta1Ns.Lease]] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.coordinationNs.v1beta1Ns.LeaseList = js.native
    }
    
    /**
      * Lease defines a lease concept.
      */
    @js.native
    object Lease extends js.Object {
      /**
        * Get the state of an existing `Lease` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coordinationNs.v1beta1Ns.Lease = js.native
    }
    
    /**
      * LeaseList is a list of Lease objects.
      */
    @js.native
    object LeaseList extends js.Object {
      /**
        * Get the state of an existing `LeaseList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.coordinationNs.v1beta1Ns.LeaseList = js.native
    }
    
  }
  
}

