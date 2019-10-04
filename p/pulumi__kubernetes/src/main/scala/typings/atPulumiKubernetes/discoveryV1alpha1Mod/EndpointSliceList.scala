package typings.atPulumiKubernetes.discoveryV1alpha1Mod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/discovery/v1alpha1", "EndpointSliceList")
@js.native
class EndpointSliceList protected ()
  extends typings.atPulumiKubernetes.discoveryV1alpha1EndpointSliceListMod.EndpointSliceList {
  /**
    * Create a discovery.v1alpha1.EndpointSliceList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.discoveryNs.v1alpha1Ns.EndpointSliceList
  ) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.discoveryNs.v1alpha1Ns.EndpointSliceList,
    opts: CustomResourceOptions
  ) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/discovery/v1alpha1", "EndpointSliceList")
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
  def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.discoveryV1alpha1EndpointSliceListMod.EndpointSliceList = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.discoveryV1alpha1EndpointSliceListMod.EndpointSliceList = js.native
  /**
    * Returns true if the given object is an instance of EndpointSliceList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1alpha1/EndpointSliceList.EndpointSliceList */ Boolean = js.native
}

