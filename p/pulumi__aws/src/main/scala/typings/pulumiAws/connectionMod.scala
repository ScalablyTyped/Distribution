package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionMod {
  
  @JSImport("@pulumi/aws/directconnect/connection", "Connection")
  @js.native
  class Connection protected () extends CustomResource {
    /**
      * Create a Connection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConnectionArgs) = this()
    def this(name: String, args: ConnectionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the connection.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The Direct Connect endpoint on which the physical connection terminates.
      */
    val awsDevice: Output_[String] = js.native
    
    /**
      * The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
      */
    val bandwidth: Output_[String] = js.native
    
    /**
      * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
      */
    val hasLogicalRedundancy: Output_[String] = js.native
    
    /**
      * Boolean value representing if jumbo frames have been enabled for this connection.
      */
    val jumboFrameCapable: Output_[Boolean] = js.native
    
    /**
      * The AWS Direct Connect location where the connection is located. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
      */
    val location: Output_[String] = js.native
    
    /**
      * The name of the connection.
      */
    val name: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Connection {
    
    /**
      * Get an existing Connection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect/connection", "Connection.get")
    @js.native
    def get(name: String, id: Input[ID]): Connection = js.native
    @JSImport("@pulumi/aws/directconnect/connection", "Connection.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Connection = js.native
    @JSImport("@pulumi/aws/directconnect/connection", "Connection.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConnectionState): Connection = js.native
    @JSImport("@pulumi/aws/directconnect/connection", "Connection.get")
    @js.native
    def get(name: String, id: Input[ID], state: ConnectionState, opts: CustomResourceOptions): Connection = js.native
    
    /**
      * Returns true if the given object is an instance of Connection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect/connection", "Connection.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/connection.Connection */ Boolean = js.native
  }
  
  @js.native
  trait ConnectionArgs extends StObject {
    
    /**
      * The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
      */
    val bandwidth: Input[String] = js.native
    
    /**
      * The AWS Direct Connect location where the connection is located. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
      */
    val location: Input[String] = js.native
    
    /**
      * The name of the connection.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ConnectionArgs {
    
    @scala.inline
    def apply(bandwidth: Input[String], location: Input[String]): ConnectionArgs = {
      val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionArgs]
    }
    
    @scala.inline
    implicit class ConnectionArgsMutableBuilder[Self <: ConnectionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBandwidth(value: Input[String]): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Input[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ConnectionState extends StObject {
    
    /**
      * The ARN of the connection.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Direct Connect endpoint on which the physical connection terminates.
      */
    val awsDevice: js.UndefOr[Input[String]] = js.native
    
    /**
      * The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
      */
    val bandwidth: js.UndefOr[Input[String]] = js.native
    
    /**
      * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
      */
    val hasLogicalRedundancy: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean value representing if jumbo frames have been enabled for this connection.
      */
    val jumboFrameCapable: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The AWS Direct Connect location where the connection is located. See [DescribeLocations](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLocations.html) for the list of AWS Direct Connect locations. Use `locationCode`.
      */
    val location: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the connection.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ConnectionState {
    
    @scala.inline
    def apply(): ConnectionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionState]
    }
    
    @scala.inline
    implicit class ConnectionStateMutableBuilder[Self <: ConnectionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAwsDevice(value: Input[String]): Self = StObject.set(x, "awsDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsDeviceUndefined: Self = StObject.set(x, "awsDevice", js.undefined)
      
      @scala.inline
      def setBandwidth(value: Input[String]): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
      
      @scala.inline
      def setHasLogicalRedundancy(value: Input[String]): Self = StObject.set(x, "hasLogicalRedundancy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasLogicalRedundancyUndefined: Self = StObject.set(x, "hasLogicalRedundancy", js.undefined)
      
      @scala.inline
      def setJumboFrameCapable(value: Input[Boolean]): Self = StObject.set(x, "jumboFrameCapable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumboFrameCapableUndefined: Self = StObject.set(x, "jumboFrameCapable", js.undefined)
      
      @scala.inline
      def setLocation(value: Input[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
