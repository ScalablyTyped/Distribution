package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpnGatewayFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVpnGatewayMod {
  
  @JSImport("@pulumi/aws/ec2/getVpnGateway", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getVpnGateway(): js.Promise[GetVpnGatewayResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVpnGateway")().asInstanceOf[js.Promise[GetVpnGatewayResult]]
  inline def getVpnGateway(args: Unit, opts: InvokeOptions): js.Promise[GetVpnGatewayResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVpnGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetVpnGatewayResult]]
  inline def getVpnGateway(args: GetVpnGatewayArgs): js.Promise[GetVpnGatewayResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVpnGateway")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetVpnGatewayResult]]
  inline def getVpnGateway(args: GetVpnGatewayArgs, opts: InvokeOptions): js.Promise[GetVpnGatewayResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVpnGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetVpnGatewayResult]]
  
  trait GetVpnGatewayArgs extends StObject {
    
    /**
      * The Autonomous System Number (ASN) for the Amazon side of the specific VPN Gateway to retrieve.
      */
    val amazonSideAsn: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of a VPC attached to the specific VPN Gateway to retrieve.
      */
    val attachedVpcId: js.UndefOr[String] = js.undefined
    
    /**
      * The Availability Zone of the specific VPN Gateway to retrieve.
      */
    val availabilityZone: js.UndefOr[String] = js.undefined
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetVpnGatewayFilter]] = js.undefined
    
    /**
      * The ID of the specific VPN Gateway to retrieve.
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * The state of the specific VPN Gateway to retrieve.
      */
    val state: js.UndefOr[String] = js.undefined
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired VPN Gateway.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetVpnGatewayArgs {
    
    inline def apply(): GetVpnGatewayArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetVpnGatewayArgs]
    }
    
    extension [Self <: GetVpnGatewayArgs](x: Self) {
      
      inline def setAmazonSideAsn(value: String): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      inline def setAmazonSideAsnUndefined: Self = StObject.set(x, "amazonSideAsn", js.undefined)
      
      inline def setAttachedVpcId(value: String): Self = StObject.set(x, "attachedVpcId", value.asInstanceOf[js.Any])
      
      inline def setAttachedVpcIdUndefined: Self = StObject.set(x, "attachedVpcId", js.undefined)
      
      inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      inline def setFilters(value: js.Array[GetVpnGatewayFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetVpnGatewayFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetVpnGatewayResult extends StObject {
    
    val amazonSideAsn: String
    
    val arn: String
    
    val attachedVpcId: String
    
    val availabilityZone: String
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetVpnGatewayFilter]] = js.undefined
    
    val id: String
    
    val state: String
    
    val tags: StringDictionary[String]
  }
  object GetVpnGatewayResult {
    
    inline def apply(
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
    
    extension [Self <: GetVpnGatewayResult](x: Self) {
      
      inline def setAmazonSideAsn(value: String): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setAttachedVpcId(value: String): Self = StObject.set(x, "attachedVpcId", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetVpnGatewayFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetVpnGatewayFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
