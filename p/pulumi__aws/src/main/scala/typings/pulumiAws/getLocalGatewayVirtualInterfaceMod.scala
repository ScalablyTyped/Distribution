package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetLocalGatewayVirtualInterfaceFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLocalGatewayVirtualInterfaceMod {
  
  @JSImport("@pulumi/aws/ec2/getLocalGatewayVirtualInterface", "getLocalGatewayVirtualInterface")
  @js.native
  def getLocalGatewayVirtualInterface(): js.Promise[GetLocalGatewayVirtualInterfaceResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGatewayVirtualInterface", "getLocalGatewayVirtualInterface")
  @js.native
  def getLocalGatewayVirtualInterface(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLocalGatewayVirtualInterfaceResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGatewayVirtualInterface", "getLocalGatewayVirtualInterface")
  @js.native
  def getLocalGatewayVirtualInterface(args: GetLocalGatewayVirtualInterfaceArgs): js.Promise[GetLocalGatewayVirtualInterfaceResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGatewayVirtualInterface", "getLocalGatewayVirtualInterface")
  @js.native
  def getLocalGatewayVirtualInterface(args: GetLocalGatewayVirtualInterfaceArgs, opts: InvokeOptions): js.Promise[GetLocalGatewayVirtualInterfaceResult] = js.native
  
  @js.native
  trait GetLocalGatewayVirtualInterfaceArgs extends StObject {
    
    /**
      * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaces.html) for supported filters. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetLocalGatewayVirtualInterfaceFilter]] = js.native
    
    /**
      * Identifier of EC2 Local Gateway Virtual Interface.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetLocalGatewayVirtualInterfaceArgs {
    
    @scala.inline
    def apply(): GetLocalGatewayVirtualInterfaceArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetLocalGatewayVirtualInterfaceArgs]
    }
    
    @scala.inline
    implicit class GetLocalGatewayVirtualInterfaceArgsMutableBuilder[Self <: GetLocalGatewayVirtualInterfaceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetLocalGatewayVirtualInterfaceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetLocalGatewayVirtualInterfaceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetLocalGatewayVirtualInterfaceResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayVirtualInterfaceFilter]] = js.native
    
    val id: String = js.native
    
    /**
      * Local address.
      */
    val localAddress: String = js.native
    
    /**
      * Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the EC2 Local Gateway.
      */
    val localBgpAsn: Double = js.native
    
    /**
      * Identifier of the EC2 Local Gateway.
      */
    val localGatewayId: String = js.native
    
    val localGatewayVirtualInterfaceIds: js.Array[String] = js.native
    
    /**
      * Peer address.
      */
    val peerAddress: String = js.native
    
    /**
      * Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the peer.
      */
    val peerBgpAsn: Double = js.native
    
    val tags: StringDictionary[String] = js.native
    
    /**
      * Virtual Local Area Network.
      */
    val vlan: Double = js.native
  }
  object GetLocalGatewayVirtualInterfaceResult {
    
    @scala.inline
    def apply(
      id: String,
      localAddress: String,
      localBgpAsn: Double,
      localGatewayId: String,
      localGatewayVirtualInterfaceIds: js.Array[String],
      peerAddress: String,
      peerBgpAsn: Double,
      tags: StringDictionary[String],
      vlan: Double
    ): GetLocalGatewayVirtualInterfaceResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], localBgpAsn = localBgpAsn.asInstanceOf[js.Any], localGatewayId = localGatewayId.asInstanceOf[js.Any], localGatewayVirtualInterfaceIds = localGatewayVirtualInterfaceIds.asInstanceOf[js.Any], peerAddress = peerAddress.asInstanceOf[js.Any], peerBgpAsn = peerBgpAsn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vlan = vlan.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLocalGatewayVirtualInterfaceResult]
    }
    
    @scala.inline
    implicit class GetLocalGatewayVirtualInterfaceResultMutableBuilder[Self <: GetLocalGatewayVirtualInterfaceResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayVirtualInterfaceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetLocalGatewayVirtualInterfaceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalBgpAsn(value: Double): Self = StObject.set(x, "localBgpAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayId(value: String): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayVirtualInterfaceIds(value: js.Array[String]): Self = StObject.set(x, "localGatewayVirtualInterfaceIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayVirtualInterfaceIdsVarargs(value: String*): Self = StObject.set(x, "localGatewayVirtualInterfaceIds", js.Array(value :_*))
      
      @scala.inline
      def setPeerAddress(value: String): Self = StObject.set(x, "peerAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerBgpAsn(value: Double): Self = StObject.set(x, "peerBgpAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVlan(value: Double): Self = StObject.set(x, "vlan", value.asInstanceOf[js.Any])
    }
  }
}
