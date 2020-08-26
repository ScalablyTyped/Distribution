package typings.pulumiKubernetes.endpointSliceMod

import typings.pulumiKubernetes.outputMod.discovery.v1beta1.Endpoint
import typings.pulumiKubernetes.outputMod.discovery.v1beta1.EndpointPort
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.discoveryDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/discovery/v1beta1/endpointSlice", "EndpointSlice")
@js.native
class EndpointSlice protected () extends CustomResource {
  /**
    * Create a EndpointSlice resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: EndpointSliceArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: EndpointSliceArgs, opts: CustomResourceOptions) = this()
  /**
    * addressType specifies the type of address carried by this EndpointSlice. All addresses in this slice must be the same type. This field is immutable after creation. The following address types are currently supported: * IPv4: Represents an IPv4 Address. * IPv6: Represents an IPv6 Address. * FQDN: Represents a Fully Qualified Domain Name.
    */
  val addressType: Output_[String] = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[discoveryDotk8sDotioSlashv1beta1] = js.native
  /**
    * endpoints is a list of unique endpoints in this slice. Each slice may include a maximum of 1000 endpoints.
    */
  val endpoints: Output_[js.Array[Endpoint]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.EndpointSlice] = js.native
  /**
    * Standard object's metadata.
    */
  val metadata: Output_[ObjectMeta] = js.native
  /**
    * ports specifies the list of network ports exposed by each endpoint in this slice. Each port must have a unique name. When ports is empty, it indicates that there are no defined ports. When a port is defined with a nil port value, it indicates "all ports". Each slice may include a maximum of 100 ports.
    */
  val ports: Output_[js.Array[EndpointPort]] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/discovery/v1beta1/endpointSlice", "EndpointSlice")
@js.native
object EndpointSlice extends js.Object {
  /**
    * Get an existing EndpointSlice resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): EndpointSlice = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): EndpointSlice = js.native
  /**
    * Returns true if the given object is an instance of EndpointSlice.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/discovery/v1beta1/endpointSlice.EndpointSlice */ Boolean = js.native
}

