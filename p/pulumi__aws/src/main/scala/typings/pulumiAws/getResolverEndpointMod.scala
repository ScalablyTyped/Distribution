package typings.pulumiAws

import typings.pulumiAws.inputMod.route53.GetResolverEndpointFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getResolverEndpointMod {
  
  @JSImport("@pulumi/aws/route53/getResolverEndpoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getResolverEndpoint(): js.Promise[GetResolverEndpointResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResolverEndpoint")().asInstanceOf[js.Promise[GetResolverEndpointResult]]
  @scala.inline
  def getResolverEndpoint(args: Unit, opts: InvokeOptions): js.Promise[GetResolverEndpointResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolverEndpoint")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResolverEndpointResult]]
  @scala.inline
  def getResolverEndpoint(args: GetResolverEndpointArgs): js.Promise[GetResolverEndpointResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResolverEndpoint")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetResolverEndpointResult]]
  @scala.inline
  def getResolverEndpoint(args: GetResolverEndpointArgs, opts: InvokeOptions): js.Promise[GetResolverEndpointResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResolverEndpoint")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetResolverEndpointResult]]
  
  trait GetResolverEndpointArgs extends StObject {
    
    /**
      * One or more name/value pairs to use as filters. There are
      * several valid keys, for a full reference, check out
      * [Route53resolver Filter value in the AWS API reference][1].
      */
    val filters: js.UndefOr[js.Array[GetResolverEndpointFilter]] = js.undefined
    
    /**
      * The ID of the Route53 Resolver Endpoint.
      */
    val resolverEndpointId: js.UndefOr[String] = js.undefined
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
  
  trait GetResolverEndpointResult extends StObject {
    
    val arn: String
    
    val direction: String
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.route53.GetResolverEndpointFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val ipAddresses: js.Array[String]
    
    val name: String
    
    val resolverEndpointId: js.UndefOr[String] = js.undefined
    
    val status: String
    
    val vpcId: String
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
