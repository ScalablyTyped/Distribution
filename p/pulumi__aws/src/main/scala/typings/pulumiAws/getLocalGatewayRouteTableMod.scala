package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetLocalGatewayRouteTableFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLocalGatewayRouteTableMod {
  
  @JSImport("@pulumi/aws/ec2/getLocalGatewayRouteTable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLocalGatewayRouteTable(): js.Promise[GetLocalGatewayRouteTableResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayRouteTable")().asInstanceOf[js.Promise[GetLocalGatewayRouteTableResult]]
  inline def getLocalGatewayRouteTable(args: Unit, opts: InvokeOptions): js.Promise[GetLocalGatewayRouteTableResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayRouteTable")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLocalGatewayRouteTableResult]]
  inline def getLocalGatewayRouteTable(args: GetLocalGatewayRouteTableArgs): js.Promise[GetLocalGatewayRouteTableResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayRouteTable")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetLocalGatewayRouteTableResult]]
  inline def getLocalGatewayRouteTable(args: GetLocalGatewayRouteTableArgs, opts: InvokeOptions): js.Promise[GetLocalGatewayRouteTableResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayRouteTable")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLocalGatewayRouteTableResult]]
  
  trait GetLocalGatewayRouteTableArgs extends StObject {
    
    val filters: js.UndefOr[js.Array[GetLocalGatewayRouteTableFilter]] = js.undefined
    
    /**
      * The id of the specific local gateway route table to retrieve.
      */
    val localGatewayId: js.UndefOr[String] = js.undefined
    
    /**
      * Local Gateway Route Table Id assigned to desired local gateway route table
      */
    val localGatewayRouteTableId: js.UndefOr[String] = js.undefined
    
    /**
      * The arn of the Outpost the local gateway route table is associated with.
      */
    val outpostArn: js.UndefOr[String] = js.undefined
    
    /**
      * The state of the local gateway route table.
      */
    val state: js.UndefOr[String] = js.undefined
    
    /**
      * A mapping of tags, each pair of which must exactly match
      * a pair on the desired local gateway route table.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetLocalGatewayRouteTableArgs {
    
    inline def apply(): GetLocalGatewayRouteTableArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetLocalGatewayRouteTableArgs]
    }
    
    extension [Self <: GetLocalGatewayRouteTableArgs](x: Self) {
      
      inline def setFilters(value: js.Array[GetLocalGatewayRouteTableFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetLocalGatewayRouteTableFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setLocalGatewayId(value: String): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
      
      inline def setLocalGatewayIdUndefined: Self = StObject.set(x, "localGatewayId", js.undefined)
      
      inline def setLocalGatewayRouteTableId(value: String): Self = StObject.set(x, "localGatewayRouteTableId", value.asInstanceOf[js.Any])
      
      inline def setLocalGatewayRouteTableIdUndefined: Self = StObject.set(x, "localGatewayRouteTableId", js.undefined)
      
      inline def setOutpostArn(value: String): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      inline def setOutpostArnUndefined: Self = StObject.set(x, "outpostArn", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetLocalGatewayRouteTableResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayRouteTableFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val localGatewayId: String
    
    val localGatewayRouteTableId: String
    
    val outpostArn: String
    
    val state: String
    
    val tags: StringDictionary[String]
  }
  object GetLocalGatewayRouteTableResult {
    
    inline def apply(
      id: String,
      localGatewayId: String,
      localGatewayRouteTableId: String,
      outpostArn: String,
      state: String,
      tags: StringDictionary[String]
    ): GetLocalGatewayRouteTableResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], localGatewayId = localGatewayId.asInstanceOf[js.Any], localGatewayRouteTableId = localGatewayRouteTableId.asInstanceOf[js.Any], outpostArn = outpostArn.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLocalGatewayRouteTableResult]
    }
    
    extension [Self <: GetLocalGatewayRouteTableResult](x: Self) {
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayRouteTableFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetLocalGatewayRouteTableFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocalGatewayId(value: String): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
      
      inline def setLocalGatewayRouteTableId(value: String): Self = StObject.set(x, "localGatewayRouteTableId", value.asInstanceOf[js.Any])
      
      inline def setOutpostArn(value: String): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
