package typings.pulumiAws.trafficMirrorSessionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficMirrorSessionState extends js.Object {
  
  /**
    * The ARN of the traffic mirror session.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A description of the traffic mirror session.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * ID of the source network interface. Not all network interfaces are eligible as mirror sources. On EC2 instances only nitro based instances support mirroring.
    */
  val networkInterfaceId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror.
    */
  val packetLength: js.UndefOr[Input[Double]] = js.native
  
  /**
    * - The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets.
    */
  val sessionNumber: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * ID of the traffic mirror filter to be used
    */
  val trafficMirrorFilterId: js.UndefOr[Input[String]] = js.native
  
  /**
    * ID of the traffic mirror target to be used
    */
  val trafficMirrorTargetId: js.UndefOr[Input[String]] = js.native
  
  /**
    * - The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
    */
  val virtualNetworkId: js.UndefOr[Input[Double]] = js.native
}
object TrafficMirrorSessionState {
  
  @scala.inline
  def apply(): TrafficMirrorSessionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorSessionState]
  }
  
  @scala.inline
  implicit class TrafficMirrorSessionStateOps[Self <: TrafficMirrorSessionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: Input[String]): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("networkInterfaceId", js.undefined)
    
    @scala.inline
    def setPacketLength(value: Input[Double]): Self = this.set("packetLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePacketLength: Self = this.set("packetLength", js.undefined)
    
    @scala.inline
    def setSessionNumber(value: Input[Double]): Self = this.set("sessionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionNumber: Self = this.set("sessionNumber", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTrafficMirrorFilterId(value: Input[String]): Self = this.set("trafficMirrorFilterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficMirrorFilterId: Self = this.set("trafficMirrorFilterId", js.undefined)
    
    @scala.inline
    def setTrafficMirrorTargetId(value: Input[String]): Self = this.set("trafficMirrorTargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficMirrorTargetId: Self = this.set("trafficMirrorTargetId", js.undefined)
    
    @scala.inline
    def setVirtualNetworkId(value: Input[Double]): Self = this.set("virtualNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualNetworkId: Self = this.set("virtualNetworkId", js.undefined)
  }
}
