package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetLocalGatewayRouteTablesFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLocalGatewayRouteTablesMod {
  
  @JSImport("@pulumi/aws/ec2/getLocalGatewayRouteTables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLocalGatewayRouteTables(): js.Promise[GetLocalGatewayRouteTablesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayRouteTables")().asInstanceOf[js.Promise[GetLocalGatewayRouteTablesResult]]
  inline def getLocalGatewayRouteTables(args: Unit, opts: InvokeOptions): js.Promise[GetLocalGatewayRouteTablesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayRouteTables")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLocalGatewayRouteTablesResult]]
  inline def getLocalGatewayRouteTables(args: GetLocalGatewayRouteTablesArgs): js.Promise[GetLocalGatewayRouteTablesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayRouteTables")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetLocalGatewayRouteTablesResult]]
  inline def getLocalGatewayRouteTables(args: GetLocalGatewayRouteTablesArgs, opts: InvokeOptions): js.Promise[GetLocalGatewayRouteTablesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayRouteTables")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLocalGatewayRouteTablesResult]]
  
  trait GetLocalGatewayRouteTablesArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetLocalGatewayRouteTablesFilter]] = js.undefined
    
    /**
      * A mapping of tags, each pair of which must exactly match
      * a pair on the desired local gateway route table.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetLocalGatewayRouteTablesArgs {
    
    inline def apply(): GetLocalGatewayRouteTablesArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetLocalGatewayRouteTablesArgs]
    }
    
    extension [Self <: GetLocalGatewayRouteTablesArgs](x: Self) {
      
      inline def setFilters(value: js.Array[GetLocalGatewayRouteTablesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetLocalGatewayRouteTablesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetLocalGatewayRouteTablesResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayRouteTablesFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Set of Local Gateway Route Table identifiers
      */
    val ids: js.Array[String]
    
    val tags: StringDictionary[String]
  }
  object GetLocalGatewayRouteTablesResult {
    
    inline def apply(id: String, ids: js.Array[String], tags: StringDictionary[String]): GetLocalGatewayRouteTablesResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLocalGatewayRouteTablesResult]
    }
    
    extension [Self <: GetLocalGatewayRouteTablesResult](x: Self) {
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayRouteTablesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetLocalGatewayRouteTablesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
