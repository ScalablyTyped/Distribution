package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "auditregistration")
@js.native
object auditregistrationNs extends js.Object {
  @JSName("v1alpha1")
  @js.native
  object v1alpha1Ns extends js.Object {
    /**
      * AuditSink represents a cluster level audit sink
      */
    @js.native
    class AuditSink protected ()
      extends atPulumiKubernetesLib.providerMod.auditregistrationNs.v1alpha1Ns.AuditSink {
      /**
        * Create a auditregistration.v1alpha1.AuditSink resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.auditregistrationNs.v1alpha1Ns.AuditSink) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.auditregistrationNs.v1alpha1Ns.AuditSink, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * AuditSinkList is a list of AuditSink items.
      */
    @js.native
    class AuditSinkList protected ()
      extends atPulumiKubernetesLib.providerMod.auditregistrationNs.v1alpha1Ns.AuditSinkList {
      /**
        * Create a auditregistration.v1alpha1.AuditSinkList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.auditregistrationNs.v1alpha1Ns.AuditSinkList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.auditregistrationNs.v1alpha1Ns.AuditSinkList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * AuditSink represents a cluster level audit sink
      */
    @js.native
    object AuditSink extends js.Object {
      /**
        * Get the state of an existing `AuditSink` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.auditregistrationNs.v1alpha1Ns.AuditSink = js.native
    }
    
    /**
      * AuditSinkList is a list of AuditSink items.
      */
    @js.native
    object AuditSinkList extends js.Object {
      /**
        * Get the state of an existing `AuditSinkList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.auditregistrationNs.v1alpha1Ns.AuditSinkList = js.native
    }
    
  }
  
}

