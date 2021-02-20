package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpnGatewayFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVpnGatewayMod {
  
  @JSImport("@pulumi/aws/ec2/getVpnGateway", "getVpnGateway")
  @js.native
  def getVpnGateway(): js.Promise[GetVpnGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpnGateway", "getVpnGateway")
  @js.native
  def getVpnGateway(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpnGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpnGateway", "getVpnGateway")
  @js.native
  def getVpnGateway(args: GetVpnGatewayArgs): js.Promise[GetVpnGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpnGateway", "getVpnGateway")
  @js.native
  def getVpnGateway(args: GetVpnGatewayArgs, opts: InvokeOptions): js.Promise[GetVpnGatewayResult] = js.native
  
  @js.native
  trait GetVpnGatewayArgs extends StObject {
    
    /**
      * The Autonomous System Number (ASN) for the Amazon side of the specific VPN Gateway to retrieve.
      */
    val amazonSideAsn: js.UndefOr[String] = js.native
    
    /**
      * The ID of a VPC attached to the specific VPN Gateway to retrieve.
      */
    val attachedVpcId: js.UndefOr[String] = js.native
    
    /**
      * The Availability Zone of the specific VPN Gateway to retrieve.
      */
    val availabilityZone: js.UndefOr[String] = js.native
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetVpnGatewayFilter]] = js.native
    
    /**
      * The ID of the specific VPN Gateway to retrieve.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * The state of the specific VPN Gateway to retrieve.
      */
    val state: js.UndefOr[String] = js.native
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired VPN Gateway.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetVpnGatewayArgs {
    
    @scala.inline
    def apply(): GetVpnGatewayArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetVpnGatewayArgs]
    }
    
    @scala.inline
    implicit class GetVpnGatewayArgsMutableBuilder[Self <: GetVpnGatewayArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmazonSideAsn(value: String): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmazonSideAsnUndefined: Self = StObject.set(x, "amazonSideAsn", js.undefined)
      
      @scala.inline
      def setAttachedVpcId(value: String): Self = StObject.set(x, "attachedVpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachedVpcIdUndefined: Self = StObject.set(x, "attachedVpcId", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[GetVpnGatewayFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetVpnGatewayFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetVpnGatewayResult extends StObject {
    
    val amazonSideAsn: String = js.native
    
    val arn: String = js.native
    
    val attachedVpcId: String = js.native
    
    val availabilityZone: String = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetVpnGatewayFilter]] = js.native
    
    val id: String = js.native
    
    val state: String = js.native
    
    val tags: StringDictionary[String] = js.native
  }
  object GetVpnGatewayResult {
    
    @scala.inline
    def apply(
      amazonSideAsn: String,
      arn: String,
      attachedVpcId: String,
      availabilityZone: String,
      id: String,
      state: String,
      tags: StringDictionary[String]
    ): GetVpnGatewayResult = {
      val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], attachedVpcId = attachedVpcId.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVpnGatewayResult]
    }
    
    @scala.inline
    implicit class GetVpnGatewayResultMutableBuilder[Self <: GetVpnGatewayResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmazonSideAsn(value: String): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachedVpcId(value: String): Self = StObject.set(x, "attachedVpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetVpnGatewayFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetVpnGatewayFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
