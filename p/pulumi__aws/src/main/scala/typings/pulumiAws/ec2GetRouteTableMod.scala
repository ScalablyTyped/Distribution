package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetRouteTableFilter
import typings.pulumiAws.outputMod.ec2.GetRouteTableAssociation
import typings.pulumiAws.outputMod.ec2.GetRouteTableRoute
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2GetRouteTableMod {
  
  @JSImport("@pulumi/aws/ec2/getRouteTable", "getRouteTable")
  @js.native
  def getRouteTable(): js.Promise[GetRouteTableResult] = js.native
  @JSImport("@pulumi/aws/ec2/getRouteTable", "getRouteTable")
  @js.native
  def getRouteTable(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetRouteTableResult] = js.native
  @JSImport("@pulumi/aws/ec2/getRouteTable", "getRouteTable")
  @js.native
  def getRouteTable(args: GetRouteTableArgs): js.Promise[GetRouteTableResult] = js.native
  @JSImport("@pulumi/aws/ec2/getRouteTable", "getRouteTable")
  @js.native
  def getRouteTable(args: GetRouteTableArgs, opts: InvokeOptions): js.Promise[GetRouteTableResult] = js.native
  
  @js.native
  trait GetRouteTableArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetRouteTableFilter]] = js.native
    
    /**
      * The id of an Internet Gateway or Virtual Private Gateway which is connected to the Route Table (not exported if not passed as a parameter).
      */
    val gatewayId: js.UndefOr[String] = js.native
    
    /**
      * The id of the specific Route Table to retrieve.
      */
    val routeTableId: js.UndefOr[String] = js.native
    
    /**
      * The id of a Subnet which is connected to the Route Table (not exported if not passed as a parameter).
      */
    val subnetId: js.UndefOr[String] = js.native
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired Route Table.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * The id of the VPC that the desired Route Table belongs to.
      */
    val vpcId: js.UndefOr[String] = js.native
  }
  object GetRouteTableArgs {
    
    @scala.inline
    def apply(): GetRouteTableArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRouteTableArgs]
    }
    
    @scala.inline
    implicit class GetRouteTableArgsMutableBuilder[Self <: GetRouteTableArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetRouteTableFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetRouteTableFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setGatewayId(value: String): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayIdUndefined: Self = StObject.set(x, "gatewayId", js.undefined)
      
      @scala.inline
      def setRouteTableId(value: String): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteTableIdUndefined: Self = StObject.set(x, "routeTableId", js.undefined)
      
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
  
  @js.native
  trait GetRouteTableResult extends StObject {
    
    val associations: js.Array[GetRouteTableAssociation] = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetRouteTableFilter]] = js.native
    
    /**
      * The Gateway ID. Only set when associated with an Internet Gateway or Virtual Private Gateway.
      */
    val gatewayId: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The ID of the AWS account that owns the route table
      */
    val ownerId: String = js.native
    
    /**
      * The Route Table ID.
      */
    val routeTableId: String = js.native
    
    val routes: js.Array[GetRouteTableRoute] = js.native
    
    /**
      * The Subnet ID. Only set when associated with a Subnet.
      */
    val subnetId: String = js.native
    
    val tags: StringDictionary[String] = js.native
    
    val vpcId: String = js.native
  }
  object GetRouteTableResult {
    
    @scala.inline
    def apply(
      associations: js.Array[GetRouteTableAssociation],
      gatewayId: String,
      id: String,
      ownerId: String,
      routeTableId: String,
      routes: js.Array[GetRouteTableRoute],
      subnetId: String,
      tags: StringDictionary[String],
      vpcId: String
    ): GetRouteTableResult = {
      val __obj = js.Dynamic.literal(associations = associations.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], routeTableId = routeTableId.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRouteTableResult]
    }
    
    @scala.inline
    implicit class GetRouteTableResultMutableBuilder[Self <: GetRouteTableResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssociations(value: js.Array[GetRouteTableAssociation]): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociationsVarargs(value: GetRouteTableAssociation*): Self = StObject.set(x, "associations", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetRouteTableFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetRouteTableFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setGatewayId(value: String): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteTableId(value: String): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutes(value: js.Array[GetRouteTableRoute]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesVarargs(value: GetRouteTableRoute*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      @scala.inline
      def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
