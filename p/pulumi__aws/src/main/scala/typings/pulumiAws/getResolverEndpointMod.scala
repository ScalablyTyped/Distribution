package typings.pulumiAws

import typings.pulumiAws.inputMod.route53.GetResolverEndpointFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getResolverEndpointMod {
  
  @JSImport("@pulumi/aws/route53/getResolverEndpoint", "getResolverEndpoint")
  @js.native
  def getResolverEndpoint(): js.Promise[GetResolverEndpointResult] = js.native
  @JSImport("@pulumi/aws/route53/getResolverEndpoint", "getResolverEndpoint")
  @js.native
  def getResolverEndpoint(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetResolverEndpointResult] = js.native
  @JSImport("@pulumi/aws/route53/getResolverEndpoint", "getResolverEndpoint")
  @js.native
  def getResolverEndpoint(args: GetResolverEndpointArgs): js.Promise[GetResolverEndpointResult] = js.native
  @JSImport("@pulumi/aws/route53/getResolverEndpoint", "getResolverEndpoint")
  @js.native
  def getResolverEndpoint(args: GetResolverEndpointArgs, opts: InvokeOptions): js.Promise[GetResolverEndpointResult] = js.native
  
  @js.native
  trait GetResolverEndpointArgs extends StObject {
    
    /**
      * One or more name/value pairs to use as filters. There are
      * several valid keys, for a full reference, check out
      * [Route53resolver Filter value in the AWS API reference][1].
      */
    val filters: js.UndefOr[js.Array[GetResolverEndpointFilter]] = js.native
    
    /**
      * The ID of the Route53 Resolver Endpoint.
      */
    val resolverEndpointId: js.UndefOr[String] = js.native
  }
  object GetResolverEndpointArgs {
    
    @scala.inline
    def apply(): GetResolverEndpointArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetResolverEndpointArgs]
    }
    
    @scala.inline
    implicit class GetResolverEndpointArgsMutableBuilder[Self <: GetResolverEndpointArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetResolverEndpointFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetResolverEndpointFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setResolverEndpointId(value: String): Self = StObject.set(x, "resolverEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverEndpointIdUndefined: Self = StObject.set(x, "resolverEndpointId", js.undefined)
    }
  }
  
  @js.native
  trait GetResolverEndpointResult extends StObject {
    
    val arn: String = js.native
    
    val direction: String = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.route53.GetResolverEndpointFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val ipAddresses: js.Array[String] = js.native
    
    val name: String = js.native
    
    val resolverEndpointId: js.UndefOr[String] = js.native
    
    val status: String = js.native
    
    val vpcId: String = js.native
  }
  object GetResolverEndpointResult {
    
    @scala.inline
    def apply(
      arn: String,
      direction: String,
      id: String,
      ipAddresses: js.Array[String],
      name: String,
      status: String,
      vpcId: String
    ): GetResolverEndpointResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipAddresses = ipAddresses.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResolverEndpointResult]
    }
    
    @scala.inline
    implicit class GetResolverEndpointResultMutableBuilder[Self <: GetResolverEndpointResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.route53.GetResolverEndpointFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.route53.GetResolverEndpointFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddresses(value: js.Array[String]): Self = StObject.set(x, "ipAddresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressesVarargs(value: String*): Self = StObject.set(x, "ipAddresses", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverEndpointId(value: String): Self = StObject.set(x, "resolverEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverEndpointIdUndefined: Self = StObject.set(x, "resolverEndpointId", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
