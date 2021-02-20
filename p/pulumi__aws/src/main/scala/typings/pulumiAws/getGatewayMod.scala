package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getGatewayMod {
  
  @JSImport("@pulumi/aws/directconnect/getGateway", "getGateway")
  @js.native
  def getGateway(args: GetGatewayArgs): js.Promise[GetGatewayResult] = js.native
  @JSImport("@pulumi/aws/directconnect/getGateway", "getGateway")
  @js.native
  def getGateway(args: GetGatewayArgs, opts: InvokeOptions): js.Promise[GetGatewayResult] = js.native
  
  @js.native
  trait GetGatewayArgs extends StObject {
    
    /**
      * The name of the gateway to retrieve.
      */
    val name: String = js.native
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
  
  @js.native
  trait GetGatewayResult extends StObject {
    
    /**
      * The ASN on the Amazon side of the connection.
      */
    val amazonSideAsn: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
    
    /**
      * AWS Account ID of the gateway.
      */
    val ownerAccountId: String = js.native
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
