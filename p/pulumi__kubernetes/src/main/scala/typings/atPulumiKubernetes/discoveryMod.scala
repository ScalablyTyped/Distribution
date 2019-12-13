package typings.atPulumiKubernetes

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/discovery", JSImport.Namespace)
@js.native
object discoveryMod extends js.Object {
  @js.native
  object v1beta1 extends js.Object {
    @js.native
    class EndpointSlice protected ()
      extends typings.atPulumiKubernetes.discoveryV1beta1Mod.EndpointSlice {
      /**
        * Create a discovery.v1beta1.EndpointSlice resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.discovery.v1beta1.EndpointSlice) = this()
      def this(
        name: String,
        args: typings.atPulumiKubernetes.typesInputMod.discovery.v1beta1.EndpointSlice,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class EndpointSliceList protected ()
      extends typings.atPulumiKubernetes.discoveryV1beta1Mod.EndpointSliceList {
      /**
        * Create a discovery.v1beta1.EndpointSliceList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.discovery.v1beta1.EndpointSliceList) = this()
      def this(
        name: String,
        args: typings.atPulumiKubernetes.typesInputMod.discovery.v1beta1.EndpointSliceList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object EndpointSlice extends js.Object {
      /**
        * Get the state of an existing `EndpointSlice` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.discoveryV1beta1EndpointSliceMod.EndpointSlice = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.discoveryV1beta1EndpointSliceMod.EndpointSlice = js.native
      /**
        * Returns true if the given object is an instance of EndpointSlice.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/EndpointSlice.EndpointSlice */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object EndpointSliceList extends js.Object {
      /**
        * Get the state of an existing `EndpointSliceList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.discoveryV1beta1EndpointSliceListMod.EndpointSliceList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.discoveryV1beta1EndpointSliceListMod.EndpointSliceList = js.native
      /**
        * Returns true if the given object is an instance of EndpointSliceList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/EndpointSliceList.EndpointSliceList */ Boolean = js.native
    }
    
  }
  
}

