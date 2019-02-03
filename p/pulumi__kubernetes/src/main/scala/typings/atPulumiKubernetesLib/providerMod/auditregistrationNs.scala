package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/provider", "auditregistration")
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
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1`
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.AuditSink] = js.native
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Spec defines the audit configuration spec
        */
      val spec: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.typesOutputMod.auditregistrationNs.v1alpha1Ns.AuditSinkSpec
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.auditregistrationNs.v1alpha1Ns.AuditSink = js.native
    }
    
    /**
      * AuditSinkList is a list of AuditSink items.
      */
    @js.native
    class AuditSinkList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1`
          ] = js.native
      /**
        * List of audit configurations.
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.auditregistrationNs.v1alpha1Ns.AuditSink]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.AuditSinkList] = js.native
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.auditregistrationNs.v1alpha1Ns.AuditSinkList = js.native
    }
    
    /* static members */
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
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.auditregistrationNs.v1alpha1Ns.AuditSink = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.auditregistrationNs.v1alpha1Ns.AuditSink = js.native
    }
    
    /* static members */
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
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.auditregistrationNs.v1alpha1Ns.AuditSinkList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.auditregistrationNs.v1alpha1Ns.AuditSinkList = js.native
    }
    
  }
  
}

