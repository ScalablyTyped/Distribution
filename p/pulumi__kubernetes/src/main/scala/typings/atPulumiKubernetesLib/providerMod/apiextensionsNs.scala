package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/provider", "apiextensions")
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
    extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
    /**
      * Create a CustomResource resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: CustomResourceArgs) = this()
    def this(name: java.lang.String, args: CustomResourceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    val __inputs: js.Any = js.native
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
      */
    val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
      */
    val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
    /**
      * Standard object metadata; More info:
      * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
      */
    val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
    def getInputs(): CustomResourceArgs = js.native
  }
  
  /**
    * CustomResourceArgs represents a resource definiton we'd use to create an instance of a
    * Kubernetes CustomResourceDefinition (CRD). For example, the CoreOS Prometheus operator
    * exposes a CRD `monitoring.coreos.com/ServiceMonitor`; to create a `ServiceMonitor`, we'd
    * pass a `CustomResourceArgs` containing the `ServiceMonitor` definition to
    * `apiextensions.CustomResource`.
    *
    * NOTE: This type is fairly loose, since other than `apiVersion` and `kind`, there are no
    * fields required across all CRDs.
    */
  trait CustomResourceArgs
    extends /* othersFields */ org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[_]] {
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
      */
    var apiVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String]
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
      */
    var kind: atPulumiPulumiLib.outputMod.Input[java.lang.String]
    /**
      * Standard object metadata; More info:
      * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
      */
    var metadata: js.UndefOr[
        atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
      ] = js.undefined
  }
  
  /**
    * CustomResourceGetOptions uniquely identifies a Kubernetes CustomResource, primarily for use
    * in supplied to `apiextensions.CustomResource#get`.
    */
  trait CustomResourceGetOptions
    extends atPulumiPulumiLib.resourceMod.CustomResourceOptions {
    /**
      * apiVersion is the API version of the apiExtensions.CustomResource we wish to select,
      * as specified by the CustomResourceDefinition that defines it on the API server.
      */
    var apiVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String]
    /**
      * An ID for the Kubernetes resource to retrive. Takes the form <namespace>/<name> or
      * <name>.
      */
    @JSName("id")
    var id_CustomResourceGetOptions: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]
    /**
      * kind is the kind of the apiextensions.CustomResource we wish to select, as specified by
      * the CustomResourceDefinition that defines it on the API server.
      */
    var kind: atPulumiPulumiLib.outputMod.Input[java.lang.String]
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
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1`
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CustomResourceDefinition] = js.native
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Spec describes how the user wants the resources to appear
        */
      val spec: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionSpec
          ] = js.native
      /**
        * Status indicates the actual state of the CustomResourceDefinition
        */
      val status: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionStatus
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition = js.native
    }
    
    /**
      * CustomResourceDefinitionList is a list of CustomResourceDefinition objects.
      */
    @js.native
    class CustomResourceDefinitionList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1`
          ] = js.native
      /**
        * Items individual CustomResourceDefinitions
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            js.Array[
              atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition
            ]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CustomResourceDefinitionList] = js.native
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionList = js.native
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
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
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
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionList = js.native
    }
    
  }
  
}

