package typings.pulumiAws.trafficMirrorSessionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/trafficMirrorSession", "TrafficMirrorSession")
@js.native
class TrafficMirrorSession protected () extends CustomResource {
  /**
    * Create a TrafficMirrorSession resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TrafficMirrorSessionArgs) = this()
  def this(name: String, args: TrafficMirrorSessionArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the traffic mirror session.
    */
  val arn: Output_[String] = js.native
  /**
    * A description of the traffic mirror session.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * ID of the source network interface. Not all network interfaces are eligible as mirror sources. On EC2 instances only nitro based instances support mirroring.
    */
  val networkInterfaceId: Output_[String] = js.native
  /**
    * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror.
    */
  val packetLength: Output_[js.UndefOr[Double]] = js.native
  /**
    * - The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets.
    */
  val sessionNumber: Output_[Double] = js.native
  /**
    * Key-value map of resource tags.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * ID of the traffic mirror filter to be used
    */
  val trafficMirrorFilterId: Output_[String] = js.native
  /**
    * ID of the traffic mirror target to be used
    */
  val trafficMirrorTargetId: Output_[String] = js.native
  /**
    * - The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
    */
  val virtualNetworkId: Output_[Double] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/trafficMirrorSession", "TrafficMirrorSession")
@js.native
object TrafficMirrorSession extends js.Object {
  /**
    * Get an existing TrafficMirrorSession resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): TrafficMirrorSession = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): TrafficMirrorSession = js.native
  def get(name: String, id: Input[ID], state: TrafficMirrorSessionState): TrafficMirrorSession = js.native
  def get(name: String, id: Input[ID], state: TrafficMirrorSessionState, opts: CustomResourceOptions): TrafficMirrorSession = js.native
  /**
    * Returns true if the given object is an instance of TrafficMirrorSession.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/trafficMirrorSession.TrafficMirrorSession */ Boolean = js.native
}

