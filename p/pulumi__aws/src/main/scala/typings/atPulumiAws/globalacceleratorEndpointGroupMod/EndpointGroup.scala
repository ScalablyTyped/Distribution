package typings.atPulumiAws.globalacceleratorEndpointGroupMod

import typings.atPulumiAws.typesOutputMod.globalacceleratorNs.EndpointGroupEndpointConfiguration
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/globalaccelerator/endpointGroup", "EndpointGroup")
@js.native
class EndpointGroup protected () extends CustomResource {
  /**
    * Create a EndpointGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EndpointGroupArgs) = this()
  def this(name: String, args: EndpointGroupArgs, opts: CustomResourceOptions) = this()
  /**
    * The list of endpoint objects. Fields documented below.
    */
  val endpointConfigurations: Output[js.UndefOr[js.Array[EndpointGroupEndpointConfiguration]]] = js.native
  val endpointGroupRegion: Output[String] = js.native
  /**
    * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
    */
  val healthCheckIntervalSeconds: Output[js.UndefOr[Double]] = js.native
  /**
    * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (/).
    */
  val healthCheckPath: Output[js.UndefOr[String]] = js.native
  /**
    * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
    */
  val healthCheckPort: Output[js.UndefOr[Double]] = js.native
  /**
    * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
    */
  val healthCheckProtocol: Output[js.UndefOr[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  val listenerArn: Output[String] = js.native
  /**
    * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
    */
  val thresholdCount: Output[js.UndefOr[Double]] = js.native
  /**
    * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
    */
  val trafficDialPercentage: Output[js.UndefOr[Double]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/globalaccelerator/endpointGroup", "EndpointGroup")
@js.native
object EndpointGroup extends js.Object {
  /**
    * Get an existing EndpointGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): EndpointGroup = js.native
  def get(name: String, id: Input[ID], state: EndpointGroupState): EndpointGroup = js.native
  def get(name: String, id: Input[ID], state: EndpointGroupState, opts: CustomResourceOptions): EndpointGroup = js.native
  /**
    * Returns true if the given object is an instance of EndpointGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/endpointGroup.EndpointGroup */ Boolean = js.native
}

