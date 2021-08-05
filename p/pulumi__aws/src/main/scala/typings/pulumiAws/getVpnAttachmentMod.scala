package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2transitgateway.GetVpnAttachmentFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVpnAttachmentMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/getVpnAttachment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getVpnAttachment(): js.Promise[GetVpnAttachmentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVpnAttachment")().asInstanceOf[js.Promise[GetVpnAttachmentResult]]
  inline def getVpnAttachment(args: Unit, opts: InvokeOptions): js.Promise[GetVpnAttachmentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVpnAttachment")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetVpnAttachmentResult]]
  inline def getVpnAttachment(args: GetVpnAttachmentArgs): js.Promise[GetVpnAttachmentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVpnAttachment")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetVpnAttachmentResult]]
  inline def getVpnAttachment(args: GetVpnAttachmentArgs, opts: InvokeOptions): js.Promise[GetVpnAttachmentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVpnAttachment")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetVpnAttachmentResult]]
  
  trait GetVpnAttachmentArgs extends StObject {
    
    /**
      * Configuration block(s) for filtering. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetVpnAttachmentFilter]] = js.undefined
    
    /**
      * A map of tags, each pair of which must exactly match a pair on the desired Transit Gateway VPN Attachment.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Identifier of the EC2 Transit Gateway.
      */
    val transitGatewayId: js.UndefOr[String] = js.undefined
    
    /**
      * Identifier of the EC2 VPN Connection.
      */
    val vpnConnectionId: js.UndefOr[String] = js.undefined
  }
  object GetVpnAttachmentArgs {
    
    inline def apply(): GetVpnAttachmentArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetVpnAttachmentArgs]
    }
    
    extension [Self <: GetVpnAttachmentArgs](x: Self) {
      
      inline def setFilters(value: js.Array[GetVpnAttachmentFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetVpnAttachmentFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTransitGatewayId(value: String): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
      
      inline def setVpnConnectionId(value: String): Self = StObject.set(x, "vpnConnectionId", value.asInstanceOf[js.Any])
      
      inline def setVpnConnectionIdUndefined: Self = StObject.set(x, "vpnConnectionId", js.undefined)
    }
  }
  
  trait GetVpnAttachmentResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2transitgateway.GetVpnAttachmentFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Key-value tags for the EC2 Transit Gateway VPN Attachment
      */
    val tags: StringDictionary[String]
    
    val transitGatewayId: js.UndefOr[String] = js.undefined
    
    val vpnConnectionId: js.UndefOr[String] = js.undefined
  }
  object GetVpnAttachmentResult {
    
    inline def apply(id: String, tags: StringDictionary[String]): GetVpnAttachmentResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVpnAttachmentResult]
    }
    
    extension [Self <: GetVpnAttachmentResult](x: Self) {
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2transitgateway.GetVpnAttachmentFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2transitgateway.GetVpnAttachmentFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayId(value: String): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
      
      inline def setVpnConnectionId(value: String): Self = StObject.set(x, "vpnConnectionId", value.asInstanceOf[js.Any])
      
      inline def setVpnConnectionIdUndefined: Self = StObject.set(x, "vpnConnectionId", js.undefined)
    }
  }
}
