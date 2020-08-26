package typings.pulumiKubernetes.endpointSliceListMod

import typings.pulumiKubernetes.outputMod.discovery.v1beta1.EndpointSlice
import typings.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.discoveryDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/discovery/v1beta1/endpointSliceList", "EndpointSliceList")
@js.native
class EndpointSliceList protected () extends CustomResource {
  /**
    * Create a EndpointSliceList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: EndpointSliceListArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: EndpointSliceListArgs, opts: CustomResourceOptions) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[discoveryDotk8sDotioSlashv1beta1] = js.native
  /**
    * List of endpoint slices
    */
  val items: Output_[js.Array[EndpointSlice]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.EndpointSliceList] = js.native
  /**
    * Standard list metadata.
    */
  val metadata: Output_[ListMeta] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/discovery/v1beta1/endpointSliceList", "EndpointSliceList")
@js.native
object EndpointSliceList extends js.Object {
  /**
    * Get an existing EndpointSliceList resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): EndpointSliceList = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): EndpointSliceList = js.native
  /**
    * Returns true if the given object is an instance of EndpointSliceList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/endpointSliceList.EndpointSliceList */ Boolean = js.native
}

