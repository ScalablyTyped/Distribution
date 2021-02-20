package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetCustomerGatewayFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCustomerGatewayMod {
  
  @JSImport("@pulumi/aws/ec2/getCustomerGateway", "getCustomerGateway")
  @js.native
  def getCustomerGateway(): js.Promise[GetCustomerGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2/getCustomerGateway", "getCustomerGateway")
  @js.native
  def getCustomerGateway(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetCustomerGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2/getCustomerGateway", "getCustomerGateway")
  @js.native
  def getCustomerGateway(args: GetCustomerGatewayArgs): js.Promise[GetCustomerGatewayResult] = js.native
  @JSImport("@pulumi/aws/ec2/getCustomerGateway", "getCustomerGateway")
  @js.native
  def getCustomerGateway(args: GetCustomerGatewayArgs, opts: InvokeOptions): js.Promise[GetCustomerGatewayResult] = js.native
  
  @js.native
  trait GetCustomerGatewayArgs extends StObject {
    
    /**
      * One or more [name-value pairs][dcg-filters] to filter by.
      */
    val filters: js.UndefOr[js.Array[GetCustomerGatewayFilter]] = js.native
    
    /**
      * The ID of the gateway.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * Map of key-value pairs assigned to the gateway.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetCustomerGatewayArgs {
    
    @scala.inline
    def apply(): GetCustomerGatewayArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetCustomerGatewayArgs]
    }
    
    @scala.inline
    implicit class GetCustomerGatewayArgsMutableBuilder[Self <: GetCustomerGatewayArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetCustomerGatewayFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetCustomerGatewayFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
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
  trait GetCustomerGatewayResult extends StObject {
    
    /**
      * The ARN of the customer gateway.
      */
    val arn: String = js.native
    
    /**
      * (Optional) The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
      */
    val bgpAsn: Double = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetCustomerGatewayFilter]] = js.native
    
    val id: js.UndefOr[String] = js.native
    
    /**
      * (Optional) The IP address of the gateway's Internet-routable external interface.
      */
    val ipAddress: String = js.native
    
    /**
      * Map of key-value pairs assigned to the gateway.
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * (Optional) The type of customer gateway. The only type AWS supports at this time is "ipsec.1".
      */
    val `type`: String = js.native
  }
  object GetCustomerGatewayResult {
    
    @scala.inline
    def apply(arn: String, bgpAsn: Double, ipAddress: String, tags: StringDictionary[String], `type`: String): GetCustomerGatewayResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], bgpAsn = bgpAsn.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCustomerGatewayResult]
    }
    
    @scala.inline
    implicit class GetCustomerGatewayResultMutableBuilder[Self <: GetCustomerGatewayResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgpAsn(value: Double): Self = StObject.set(x, "bgpAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetCustomerGatewayFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetCustomerGatewayFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
