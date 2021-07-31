package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trafficMirrorSessionMod {
  
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
  object TrafficMirrorSession {
    
    @JSImport("@pulumi/aws/ec2/trafficMirrorSession", "TrafficMirrorSession")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing TrafficMirrorSession resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): TrafficMirrorSession = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[TrafficMirrorSession]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): TrafficMirrorSession = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TrafficMirrorSession]
    @scala.inline
    def get(name: String, id: Input[ID], state: TrafficMirrorSessionState): TrafficMirrorSession = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[TrafficMirrorSession]
    @scala.inline
    def get(name: String, id: Input[ID], state: TrafficMirrorSessionState, opts: CustomResourceOptions): TrafficMirrorSession = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TrafficMirrorSession]
    
    /**
      * Returns true if the given object is an instance of TrafficMirrorSession.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/trafficMirrorSession.TrafficMirrorSession */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/trafficMirrorSession.TrafficMirrorSession */ Boolean]
  }
  
  trait TrafficMirrorSessionArgs extends StObject {
    
    /**
      * A description of the traffic mirror session.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ID of the source network interface. Not all network interfaces are eligible as mirror sources. On EC2 instances only nitro based instances support mirroring.
      */
    val networkInterfaceId: Input[String]
    
    /**
      * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror.
      */
    val packetLength: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * - The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets.
      */
    val sessionNumber: Input[Double]
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * ID of the traffic mirror filter to be used
      */
    val trafficMirrorFilterId: Input[String]
    
    /**
      * ID of the traffic mirror target to be used
      */
    val trafficMirrorTargetId: Input[String]
    
    /**
      * - The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
      */
    val virtualNetworkId: js.UndefOr[Input[Double]] = js.undefined
  }
  object TrafficMirrorSessionArgs {
    
    @scala.inline
    def apply(
      networkInterfaceId: Input[String],
      sessionNumber: Input[Double],
      trafficMirrorFilterId: Input[String],
      trafficMirrorTargetId: Input[String]
    ): TrafficMirrorSessionArgs = {
      val __obj = js.Dynamic.literal(networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], sessionNumber = sessionNumber.asInstanceOf[js.Any], trafficMirrorFilterId = trafficMirrorFilterId.asInstanceOf[js.Any], trafficMirrorTargetId = trafficMirrorTargetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrafficMirrorSessionArgs]
    }
    
    @scala.inline
    implicit class TrafficMirrorSessionArgsMutableBuilder[Self <: TrafficMirrorSessionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPacketLength(value: Input[Double]): Self = StObject.set(x, "packetLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPacketLengthUndefined: Self = StObject.set(x, "packetLength", js.undefined)
      
      @scala.inline
      def setSessionNumber(value: Input[Double]): Self = StObject.set(x, "sessionNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTrafficMirrorFilterId(value: Input[String]): Self = StObject.set(x, "trafficMirrorFilterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrafficMirrorTargetId(value: Input[String]): Self = StObject.set(x, "trafficMirrorTargetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualNetworkId(value: Input[Double]): Self = StObject.set(x, "virtualNetworkId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualNetworkIdUndefined: Self = StObject.set(x, "virtualNetworkId", js.undefined)
    }
  }
  
  trait TrafficMirrorSessionState extends StObject {
    
    /**
      * The ARN of the traffic mirror session.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A description of the traffic mirror session.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ID of the source network interface. Not all network interfaces are eligible as mirror sources. On EC2 instances only nitro based instances support mirroring.
      */
    val networkInterfaceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror.
      */
    val packetLength: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * - The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets.
      */
    val sessionNumber: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * ID of the traffic mirror filter to be used
      */
    val trafficMirrorFilterId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ID of the traffic mirror target to be used
      */
    val trafficMirrorTargetId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * - The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
      */
    val virtualNetworkId: js.UndefOr[Input[Double]] = js.undefined
  }
  object TrafficMirrorSessionState {
    
    @scala.inline
    def apply(): TrafficMirrorSessionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrafficMirrorSessionState]
    }
    
    @scala.inline
    implicit class TrafficMirrorSessionStateMutableBuilder[Self <: TrafficMirrorSessionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      @scala.inline
      def setPacketLength(value: Input[Double]): Self = StObject.set(x, "packetLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPacketLengthUndefined: Self = StObject.set(x, "packetLength", js.undefined)
      
      @scala.inline
      def setSessionNumber(value: Input[Double]): Self = StObject.set(x, "sessionNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionNumberUndefined: Self = StObject.set(x, "sessionNumber", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTrafficMirrorFilterId(value: Input[String]): Self = StObject.set(x, "trafficMirrorFilterId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrafficMirrorFilterIdUndefined: Self = StObject.set(x, "trafficMirrorFilterId", js.undefined)
      
      @scala.inline
      def setTrafficMirrorTargetId(value: Input[String]): Self = StObject.set(x, "trafficMirrorTargetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrafficMirrorTargetIdUndefined: Self = StObject.set(x, "trafficMirrorTargetId", js.undefined)
      
      @scala.inline
      def setVirtualNetworkId(value: Input[Double]): Self = StObject.set(x, "virtualNetworkId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualNetworkIdUndefined: Self = StObject.set(x, "virtualNetworkId", js.undefined)
    }
  }
}
