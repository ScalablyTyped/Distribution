package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getGatewayMod {
  
  @JSImport("@pulumi/aws/directconnect/getGateway", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getGateway(args: GetGatewayArgs): js.Promise[GetGatewayResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGateway")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetGatewayResult]]
  @scala.inline
  def getGateway(args: GetGatewayArgs, opts: InvokeOptions): js.Promise[GetGatewayResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetGatewayResult]]
  
  trait GetGatewayArgs extends StObject {
    
    /**
      * The name of the gateway to retrieve.
      */
    val name: String
  }
  object GetGatewayArgs {
    
    @scala.inline
    def apply(name: String): GetGatewayArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetGatewayArgs]
    }
    
    @scala.inline
    implicit class GetGatewayArgsMutableBuilder[Self <: GetGatewayArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetGatewayResult extends StObject {
    
    /**
      * The ASN on the Amazon side of the connection.
      */
    val amazonSideAsn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
    
    /**
      * AWS Account ID of the gateway.
      */
    val ownerAccountId: String
  }
  object GetGatewayResult {
    
    @scala.inline
    def apply(amazonSideAsn: String, id: String, name: String, ownerAccountId: String): GetGatewayResult = {
      val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerAccountId = ownerAccountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetGatewayResult]
    }
    
    @scala.inline
    implicit class GetGatewayResultMutableBuilder[Self <: GetGatewayResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmazonSideAsn(value: String): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerAccountId(value: String): Self = StObject.set(x, "ownerAccountId", value.asInstanceOf[js.Any])
    }
  }
}
