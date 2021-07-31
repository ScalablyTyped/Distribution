package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetNatGatewayFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getNatGatewayMod {
  
  @JSImport("@pulumi/aws/ec2/getNatGateway", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getNatGateway(): js.Promise[GetNatGatewayResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNatGateway")().asInstanceOf[js.Promise[GetNatGatewayResult]]
  @scala.inline
  def getNatGateway(args: Unit, opts: InvokeOptions): js.Promise[GetNatGatewayResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNatGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetNatGatewayResult]]
  @scala.inline
  def getNatGateway(args: GetNatGatewayArgs): js.Promise[GetNatGatewayResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNatGateway")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetNatGatewayResult]]
  @scala.inline
  def getNatGateway(args: GetNatGatewayArgs, opts: InvokeOptions): js.Promise[GetNatGatewayResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNatGateway")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetNatGatewayResult]]
  
  trait GetNatGatewayArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetNatGatewayFilter]] = js.undefined
    
    /**
      * The id of the specific Nat Gateway to retrieve.
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * The state of the NAT gateway (pending | failed | available | deleting | deleted ).
      */
    val state: js.UndefOr[String] = js.undefined
    
    /**
      * The id of subnet that the Nat Gateway resides in.
      */
    val subnetId: js.UndefOr[String] = js.undefined
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired Nat Gateway.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The id of the VPC that the Nat Gateway resides in.
      */
    val vpcId: js.UndefOr[String] = js.undefined
  }
  object GetNatGatewayArgs {
    
    @scala.inline
    def apply(): GetNatGatewayArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetNatGatewayArgs]
    }
    
    @scala.inline
    implicit class GetNatGatewayArgsMutableBuilder[Self <: GetNatGatewayArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetNatGatewayFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetNatGatewayFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  trait GetNatGatewayResult extends StObject {
    
    /**
      * The Id of the EIP allocated to the selected Nat Gateway.
      */
    val allocationId: String
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetNatGatewayFilter]] = js.undefined
    
    val id: String
    
    /**
      * The Id of the ENI allocated to the selected Nat Gateway.
      */
    val networkInterfaceId: String
    
    /**
      * The private Ip address of the selected Nat Gateway.
      */
    val privateIp: String
    
    /**
      * The public Ip (EIP) address of the selected Nat Gateway.
      */
    val publicIp: String
    
    val state: String
    
    val subnetId: String
    
    val tags: StringDictionary[String]
    
    val vpcId: String
  }
  object GetNatGatewayResult {
    
    @scala.inline
    def apply(
      allocationId: String,
      id: String,
      networkInterfaceId: String,
      privateIp: String,
      publicIp: String,
      state: String,
      subnetId: String,
      tags: StringDictionary[String],
      vpcId: String
    ): GetNatGatewayResult = {
      val __obj = js.Dynamic.literal(allocationId = allocationId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], privateIp = privateIp.asInstanceOf[js.Any], publicIp = publicIp.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetNatGatewayResult]
    }
    
    @scala.inline
    implicit class GetNatGatewayResultMutableBuilder[Self <: GetNatGatewayResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllocationId(value: String): Self = StObject.set(x, "allocationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetNatGatewayFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetNatGatewayFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceId(value: String): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIp(value: String): Self = StObject.set(x, "privateIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicIp(value: String): Self = StObject.set(x, "publicIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
