package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetCustomerGatewayFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCustomerGatewayMod {
  
  @JSImport("@pulumi/aws/ec2/getCustomerGateway", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getCustomerGateway(): js.Promise[GetCustomerGatewayResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomerGateway")().asInstanceOf[js.Promise[GetCustomerGatewayResult]]
  @scala.inline
  def getCustomerGateway(args: Unit, opts: InvokeOptions): js.Promise[GetCustomerGatewayResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCustomerGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCustomerGatewayResult]]
  @scala.inline
  def getCustomerGateway(args: GetCustomerGatewayArgs): js.Promise[GetCustomerGatewayResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomerGateway")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetCustomerGatewayResult]]
  @scala.inline
  def getCustomerGateway(args: GetCustomerGatewayArgs, opts: InvokeOptions): js.Promise[GetCustomerGatewayResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCustomerGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetCustomerGatewayResult]]
  
  trait GetCustomerGatewayArgs extends StObject {
    
    /**
      * One or more [name-value pairs][dcg-filters] to filter by.
      */
    val filters: js.UndefOr[js.Array[GetCustomerGatewayFilter]] = js.undefined
    
    /**
      * The ID of the gateway.
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * Map of key-value pairs assigned to the gateway.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
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
  
  trait GetCustomerGatewayResult extends StObject {
    
    /**
      * The ARN of the customer gateway.
      */
    val arn: String
    
    /**
      * (Optional) The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
      */
    val bgpAsn: Double
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetCustomerGatewayFilter]] = js.undefined
    
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * (Optional) The IP address of the gateway's Internet-routable external interface.
      */
    val ipAddress: String
    
    /**
      * Map of key-value pairs assigned to the gateway.
      */
    val tags: StringDictionary[String]
    
    /**
      * (Optional) The type of customer gateway. The only type AWS supports at this time is "ipsec.1".
      */
    val `type`: String
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
