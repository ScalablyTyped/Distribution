package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetLocalGatewayRouteTablesFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLocalGatewayRouteTablesMod {
  
  @JSImport("@pulumi/aws/ec2/getLocalGatewayRouteTables", "getLocalGatewayRouteTables")
  @js.native
  def getLocalGatewayRouteTables(): js.Promise[GetLocalGatewayRouteTablesResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGatewayRouteTables", "getLocalGatewayRouteTables")
  @js.native
  def getLocalGatewayRouteTables(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLocalGatewayRouteTablesResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGatewayRouteTables", "getLocalGatewayRouteTables")
  @js.native
  def getLocalGatewayRouteTables(args: GetLocalGatewayRouteTablesArgs): js.Promise[GetLocalGatewayRouteTablesResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGatewayRouteTables", "getLocalGatewayRouteTables")
  @js.native
  def getLocalGatewayRouteTables(args: GetLocalGatewayRouteTablesArgs, opts: InvokeOptions): js.Promise[GetLocalGatewayRouteTablesResult] = js.native
  
  @js.native
  trait GetLocalGatewayRouteTablesArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetLocalGatewayRouteTablesFilter]] = js.native
    
    /**
      * A mapping of tags, each pair of which must exactly match
      * a pair on the desired local gateway route table.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetLocalGatewayRouteTablesArgs {
    
    @scala.inline
    def apply(): GetLocalGatewayRouteTablesArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetLocalGatewayRouteTablesArgs]
    }
    
    @scala.inline
    implicit class GetLocalGatewayRouteTablesArgsMutableBuilder[Self <: GetLocalGatewayRouteTablesArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetLocalGatewayRouteTablesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetLocalGatewayRouteTablesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetLocalGatewayRouteTablesResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayRouteTablesFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Set of Local Gateway Route Table identifiers
      */
    val ids: js.Array[String] = js.native
    
    val tags: StringDictionary[String] = js.native
  }
  object GetLocalGatewayRouteTablesResult {
    
    @scala.inline
    def apply(id: String, ids: js.Array[String], tags: StringDictionary[String]): GetLocalGatewayRouteTablesResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLocalGatewayRouteTablesResult]
    }
    
    @scala.inline
    implicit class GetLocalGatewayRouteTablesResultMutableBuilder[Self <: GetLocalGatewayRouteTablesResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayRouteTablesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetLocalGatewayRouteTablesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
