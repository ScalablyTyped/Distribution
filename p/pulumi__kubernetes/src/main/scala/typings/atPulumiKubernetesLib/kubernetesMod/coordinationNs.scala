package typings
package atPulumiKubernetesLib.kubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "coordination")
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
      extends atPulumiKubernetesLib.providerMod.coordinationNs.v1beta1Ns.Lease {
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
    }
    
    /**
      * LeaseList is a list of Lease objects.
      */
    @js.native
    class LeaseList protected ()
      extends atPulumiKubernetesLib.providerMod.coordinationNs.v1beta1Ns.LeaseList {
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

