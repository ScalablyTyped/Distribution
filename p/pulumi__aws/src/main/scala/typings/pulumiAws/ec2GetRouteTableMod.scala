package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetRouteTableFilter
import typings.pulumiAws.outputMod.ec2.GetRouteTableAssociation
import typings.pulumiAws.outputMod.ec2.GetRouteTableRoute
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2GetRouteTableMod {
  
  @JSImport("@pulumi/aws/ec2/getRouteTable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRouteTable(): js.Promise[GetRouteTableResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTable")().asInstanceOf[js.Promise[GetRouteTableResult]]
  inline def getRouteTable(args: Unit, opts: InvokeOptions): js.Promise[GetRouteTableResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTable")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRouteTableResult]]
  inline def getRouteTable(args: GetRouteTableArgs): js.Promise[GetRouteTableResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTable")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRouteTableResult]]
  inline def getRouteTable(args: GetRouteTableArgs, opts: InvokeOptions): js.Promise[GetRouteTableResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTable")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRouteTableResult]]
  
  trait GetRouteTableArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetRouteTableFilter]] = js.undefined
    
    /**
      * The id of an Internet Gateway or Virtual Private Gateway which is connected to the Route Table (not exported if not passed as a parameter).
      */
    val gatewayId: js.UndefOr[String] = js.undefined
    
    /**
      * The id of the specific Route Table to retrieve.
      */
    val routeTableId: js.UndefOr[String] = js.undefined
    
    /**
      * The id of a Subnet which is connected to the Route Table (not exported if not passed as a parameter).
      */
    val subnetId: js.UndefOr[String] = js.undefined
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired Route Table.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The id of the VPC that the desired Route Table belongs to.
      */
    val vpcId: js.UndefOr[String] = js.undefined
  }
  object GetRouteTableArgs {
    
    inline def apply(): GetRouteTableArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRouteTableArgs]
    }
    
    extension [Self <: GetRouteTableArgs](x: Self) {
      
      inline def setFilters(value: js.Array[GetRouteTableFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetRouteTableFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setGatewayId(value: String): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
      
      inline def setGatewayIdUndefined: Self = StObject.set(x, "gatewayId", js.undefined)
      
      inline def setRouteTableId(value: String): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      inline def setRouteTableIdUndefined: Self = StObject.set(x, "routeTableId", js.undefined)
      
      inline def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  trait GetRouteTableResult extends StObject {
    
    val associations: js.Array[GetRouteTableAssociation]
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetRouteTableFilter]] = js.undefined
    
    /**
      * The Gateway ID. Only set when associated with an Internet Gateway or Virtual Private Gateway.
      */
    val gatewayId: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The ID of the AWS account that owns the route table
      */
    val ownerId: String
    
    /**
      * The Route Table ID.
      */
    val routeTableId: String
    
    val routes: js.Array[GetRouteTableRoute]
    
    /**
      * The Subnet ID. Only set when associated with a Subnet.
      */
    val subnetId: String
    
    val tags: StringDictionary[String]
    
    val vpcId: String
  }
  object GetRouteTableResult {
    
    inline def apply(
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
    
    extension [Self <: GetRouteTableResult](x: Self) {
      
      inline def setAssociations(value: js.Array[GetRouteTableAssociation]): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
      
      inline def setAssociationsVarargs(value: GetRouteTableAssociation*): Self = StObject.set(x, "associations", js.Array(value :_*))
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetRouteTableFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetRouteTableFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setGatewayId(value: String): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setRouteTableId(value: String): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      inline def setRoutes(value: js.Array[GetRouteTableRoute]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: GetRouteTableRoute*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      inline def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
}
