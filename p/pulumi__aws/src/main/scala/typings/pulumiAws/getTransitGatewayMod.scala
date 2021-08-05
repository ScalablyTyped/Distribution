package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2transitgateway.GetTransitGatewayFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTransitGatewayMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/getTransitGateway", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTransitGateway(): js.Promise[GetTransitGatewayResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitGateway")().asInstanceOf[js.Promise[GetTransitGatewayResult]]
  inline def getTransitGateway(args: Unit, opts: InvokeOptions): js.Promise[GetTransitGatewayResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetTransitGatewayResult]]
  inline def getTransitGateway(args: GetTransitGatewayArgs): js.Promise[GetTransitGatewayResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitGateway")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetTransitGatewayResult]]
  inline def getTransitGateway(args: GetTransitGatewayArgs, opts: InvokeOptions): js.Promise[GetTransitGatewayResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetTransitGatewayResult]]
  
  trait GetTransitGatewayArgs extends StObject {
    
    /**
      * One or more configuration blocks containing name-values filters. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetTransitGatewayFilter]] = js.undefined
    
    /**
      * Identifier of the EC2 Transit Gateway.
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * Key-value tags for the EC2 Transit Gateway
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetTransitGatewayArgs {
    
    inline def apply(): GetTransitGatewayArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetTransitGatewayArgs]
    }
    
    extension [Self <: GetTransitGatewayArgs](x: Self) {
      
      inline def setFilters(value: js.Array[GetTransitGatewayFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetTransitGatewayFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetTransitGatewayResult extends StObject {
    
    /**
      * Private Autonomous System Number (ASN) for the Amazon side of a BGP session
      */
    val amazonSideAsn: Double
    
    /**
      * EC2 Transit Gateway Amazon Resource Name (ARN)
      */
    val arn: String
    
    /**
      * Identifier of the default association route table
      */
    val associationDefaultRouteTableId: String
    
    /**
      * Whether resource attachment requests are automatically accepted.
      */
    val autoAcceptSharedAttachments: String
    
    /**
      * Whether resource attachments are automatically associated with the default association route table.
      */
    val defaultRouteTableAssociation: String
    
    /**
      * Whether resource attachments automatically propagate routes to the default propagation route table.
      */
    val defaultRouteTablePropagation: String
    
    /**
      * Description of the EC2 Transit Gateway
      */
    val description: String
    
    /**
      * Whether DNS support is enabled.
      */
    val dnsSupport: String
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2transitgateway.GetTransitGatewayFilter]] = js.undefined
    
    /**
      * EC2 Transit Gateway identifier
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * Identifier of the AWS account that owns the EC2 Transit Gateway
      */
    val ownerId: String
    
    /**
      * Identifier of the default propagation route table.
      */
    val propagationDefaultRouteTableId: String
    
    /**
      * Key-value tags for the EC2 Transit Gateway
      */
    val tags: StringDictionary[String]
    
    /**
      * Whether VPN Equal Cost Multipath Protocol support is enabled.
      */
    val vpnEcmpSupport: String
  }
  object GetTransitGatewayResult {
    
    inline def apply(
      amazonSideAsn: Double,
      arn: String,
      associationDefaultRouteTableId: String,
      autoAcceptSharedAttachments: String,
      defaultRouteTableAssociation: String,
      defaultRouteTablePropagation: String,
      description: String,
      dnsSupport: String,
      ownerId: String,
      propagationDefaultRouteTableId: String,
      tags: StringDictionary[String],
      vpnEcmpSupport: String
    ): GetTransitGatewayResult = {
      val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], associationDefaultRouteTableId = associationDefaultRouteTableId.asInstanceOf[js.Any], autoAcceptSharedAttachments = autoAcceptSharedAttachments.asInstanceOf[js.Any], defaultRouteTableAssociation = defaultRouteTableAssociation.asInstanceOf[js.Any], defaultRouteTablePropagation = defaultRouteTablePropagation.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], dnsSupport = dnsSupport.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], propagationDefaultRouteTableId = propagationDefaultRouteTableId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpnEcmpSupport = vpnEcmpSupport.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTransitGatewayResult]
    }
    
    extension [Self <: GetTransitGatewayResult](x: Self) {
      
      inline def setAmazonSideAsn(value: Double): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setAssociationDefaultRouteTableId(value: String): Self = StObject.set(x, "associationDefaultRouteTableId", value.asInstanceOf[js.Any])
      
      inline def setAutoAcceptSharedAttachments(value: String): Self = StObject.set(x, "autoAcceptSharedAttachments", value.asInstanceOf[js.Any])
      
      inline def setDefaultRouteTableAssociation(value: String): Self = StObject.set(x, "defaultRouteTableAssociation", value.asInstanceOf[js.Any])
      
      inline def setDefaultRouteTablePropagation(value: String): Self = StObject.set(x, "defaultRouteTablePropagation", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDnsSupport(value: String): Self = StObject.set(x, "dnsSupport", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2transitgateway.GetTransitGatewayFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2transitgateway.GetTransitGatewayFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setPropagationDefaultRouteTableId(value: String): Self = StObject.set(x, "propagationDefaultRouteTableId", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setVpnEcmpSupport(value: String): Self = StObject.set(x, "vpnEcmpSupport", value.asInstanceOf[js.Any])
    }
  }
}
