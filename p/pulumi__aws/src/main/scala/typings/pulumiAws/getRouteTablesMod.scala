package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetRouteTablesFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRouteTablesMod {
  
  @JSImport("@pulumi/aws/ec2/getRouteTables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRouteTables(): js.Promise[GetRouteTablesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTables")().asInstanceOf[js.Promise[GetRouteTablesResult]]
  inline def getRouteTables(args: Unit, opts: InvokeOptions): js.Promise[GetRouteTablesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTables")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRouteTablesResult]]
  inline def getRouteTables(args: GetRouteTablesArgs): js.Promise[GetRouteTablesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTables")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRouteTablesResult]]
  inline def getRouteTables(args: GetRouteTablesArgs, opts: InvokeOptions): js.Promise[GetRouteTablesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRouteTables")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRouteTablesResult]]
  
  trait GetRouteTablesArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetRouteTablesFilter]] = js.undefined
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired route tables.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * The VPC ID that you want to filter from.
      */
    val vpcId: js.UndefOr[String] = js.undefined
  }
  object GetRouteTablesArgs {
    
    inline def apply(): GetRouteTablesArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRouteTablesArgs]
    }
    
    extension [Self <: GetRouteTablesArgs](x: Self) {
      
      inline def setFilters(value: js.Array[GetRouteTablesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetRouteTablesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  trait GetRouteTablesResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetRouteTablesFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * A set of all the route table ids found. This data source will fail if none are found.
      */
    val ids: js.Array[String]
    
    val tags: StringDictionary[String]
    
    val vpcId: js.UndefOr[String] = js.undefined
  }
  object GetRouteTablesResult {
    
    inline def apply(id: String, ids: js.Array[String], tags: StringDictionary[String]): GetRouteTablesResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRouteTablesResult]
    }
    
    extension [Self <: GetRouteTablesResult](x: Self) {
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetRouteTablesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetRouteTablesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
