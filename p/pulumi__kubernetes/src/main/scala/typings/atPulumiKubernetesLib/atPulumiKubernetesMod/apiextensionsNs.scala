package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "apiextensions")
@js.native
object apiextensionsNs extends js.Object {
  /**
    * CustomResource represents an instance of a CustomResourceDefinition (CRD). For example, the
    * CoreOS Prometheus operator exposes a CRD `monitoring.coreos.com/ServiceMonitor`; to
    * instantiate this as a Pulumi resource, one could call `new CustomResource`, passing the
    * `ServiceMonitor` resource definition as an argument.
    */
  @js.native
  class CustomResource protected ()
    extends atPulumiKubernetesLib.providerMod.apiextensionsNs.CustomResource {
    /**
      * Create a CustomResource resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiKubernetesLib.providerMod.apiextensionsNs.CustomResourceArgs) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.providerMod.apiextensionsNs.CustomResourceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object CustomResource extends js.Object {
    /**
      * Get the state of an existing `CustomResource`, as identified by `id`.
      * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
      * Kubernetes convention) the ID becomes default/<name>.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(
      name: java.lang.String,
      opts: atPulumiKubernetesLib.providerMod.apiextensionsNs.CustomResourceGetOptions
    ): atPulumiKubernetesLib.providerMod.apiextensionsNs.CustomResource = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * CustomResourceDefinition represents a resource that should be exposed on the API server.  Its
      * name MUST be in the format <.spec.name>.<.spec.group>.
      */
    @js.native
    class CustomResourceDefinition protected ()
      extends atPulumiKubernetesLib.providerMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition {
      /**
        * Create a apiextensions.v1beta1.CustomResourceDefinition resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * CustomResourceDefinitionList is a list of CustomResourceDefinition objects.
      */
    @js.native
    class CustomResourceDefinitionList protected ()
      extends atPulumiKubernetesLib.providerMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionList {
      /**
        * Create a apiextensions.v1beta1.CustomResourceDefinitionList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /* static members */
    @js.native
    object CustomResourceDefinition extends js.Object {
      /**
        * Get the state of an existing `CustomResourceDefinition` resource, as identified by `id`.
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition = js.native
    }
    
    /* static members */
    @js.native
    object CustomResourceDefinitionList extends js.Object {
      /**
        * Get the state of an existing `CustomResourceDefinitionList` resource, as identified by `id`.
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionList = js.native
    }
    
  }
  
}

