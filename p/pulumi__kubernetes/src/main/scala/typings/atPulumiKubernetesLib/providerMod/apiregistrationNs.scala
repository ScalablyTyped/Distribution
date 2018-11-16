package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/provider", "apiregistration")
@js.native
object apiregistrationNs extends js.Object {
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
             * APIService represents a server for a particular GroupVersion. Name must be "version.group".
             */
    @js.native
    class APIService protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a apiregistration.v1beta1.APIService resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a apiregistration.v1beta1.APIService resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiregistrationNs.v1beta1Ns.APIService) = this()
      /**
                  * Create a apiregistration.v1beta1.APIService resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiregistrationNs.v1beta1Ns.APIService, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
                   * Spec contains information for locating and communicating with a server
                   */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceSpec] = js.native
      /**
                   * Status contains derived information about an API server
                   */
      val status: atPulumiPulumiLib.pulumiMod.Output[
            atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIServiceStatus
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.apiregistrationNs.v1beta1Ns.APIService = js.native
    }
    
    /**
             * APIServiceList is a list of APIService objects.
             */
    @js.native
    class APIServiceList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a apiregistration.v1beta1.APIServiceList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a apiregistration.v1beta1.APIServiceList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiregistrationNs.v1beta1Ns.APIServiceList) = this()
      /**
                  * Create a apiregistration.v1beta1.APIServiceList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.apiregistrationNs.v1beta1Ns.APIServiceList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      val items: atPulumiPulumiLib.pulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns.APIService]
          ] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.apiregistrationNs.v1beta1Ns.APIServiceList = js.native
    }
    
    /**
             * APIService represents a server for a particular GroupVersion. Name must be "version.group".
             */
    @js.native
    object APIService extends js.Object {
      /**
                   * Get the state of an existing `APIService` resource, as identified by `id`.
                   * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
                   * Kubernetes convention) the ID becomes default/<name>.
                   *
                   * Pulumi will keep track of this resource using `name` as the Pulumi ID.
                   *
                   * @param name _Unique_ name used to register this resource with Pulumi.
                   * @param id An ID for the Kubernetes resource to retrive. Takes the form
                   *  <namespace>/<name> or <name>.
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.apiregistrationNs.v1beta1Ns.APIService = js.native
    }
    
    /**
             * APIServiceList is a list of APIService objects.
             */
    @js.native
    object APIServiceList extends js.Object {
      /**
                   * Get the state of an existing `APIServiceList` resource, as identified by `id`.
                   * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
                   * Kubernetes convention) the ID becomes default/<name>.
                   *
                   * Pulumi will keep track of this resource using `name` as the Pulumi ID.
                   *
                   * @param name _Unique_ name used to register this resource with Pulumi.
                   * @param id An ID for the Kubernetes resource to retrive. Takes the form
                   *  <namespace>/<name> or <name>.
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.apiregistrationNs.v1beta1Ns.APIServiceList = js.native
    }
    
  }
  
}

