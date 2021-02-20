package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetLocalGatewayRouteTableFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLocalGatewayRouteTableMod {
  
  @JSImport("@pulumi/aws/ec2/getLocalGatewayRouteTable", "getLocalGatewayRouteTable")
  @js.native
  def getLocalGatewayRouteTable(): js.Promise[GetLocalGatewayRouteTableResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGatewayRouteTable", "getLocalGatewayRouteTable")
  @js.native
  def getLocalGatewayRouteTable(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLocalGatewayRouteTableResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGatewayRouteTable", "getLocalGatewayRouteTable")
  @js.native
  def getLocalGatewayRouteTable(args: GetLocalGatewayRouteTableArgs): js.Promise[GetLocalGatewayRouteTableResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGatewayRouteTable", "getLocalGatewayRouteTable")
  @js.native
  def getLocalGatewayRouteTable(args: GetLocalGatewayRouteTableArgs, opts: InvokeOptions): js.Promise[GetLocalGatewayRouteTableResult] = js.native
  
  @js.native
  trait GetLocalGatewayRouteTableArgs extends StObject {
    
    val filters: js.UndefOr[js.Array[GetLocalGatewayRouteTableFilter]] = js.native
    
    /**
      * The id of the specific local gateway route table to retrieve.
      */
    val localGatewayId: js.UndefOr[String] = js.native
    
    /**
      * Local Gateway Route Table Id assigned to desired local gateway route table
      */
    val localGatewayRouteTableId: js.UndefOr[String] = js.native
    
    /**
      * The arn of the Outpost the local gateway route table is associated with.
      */
    val outpostArn: js.UndefOr[String] = js.native
    
    /**
      * The state of the local gateway route table.
      */
    val state: js.UndefOr[String] = js.native
    
    /**
      * A mapping of tags, each pair of which must exactly match
      * a pair on the desired local gateway route table.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetLocalGatewayRouteTableArgs {
    
    @scala.inline
    def apply(): GetLocalGatewayRouteTableArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetLocalGatewayRouteTableArgs]
    }
    
    @scala.inline
    implicit class GetLocalGatewayRouteTableArgsMutableBuilder[Self <: GetLocalGatewayRouteTableArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetLocalGatewayRouteTableFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetLocalGatewayRouteTableFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setLocalGatewayId(value: String): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayIdUndefined: Self = StObject.set(x, "localGatewayId", js.undefined)
      
      @scala.inline
      def setLocalGatewayRouteTableId(value: String): Self = StObject.set(x, "localGatewayRouteTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayRouteTableIdUndefined: Self = StObject.set(x, "localGatewayRouteTableId", js.undefined)
      
      @scala.inline
      def setOutpostArn(value: String): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostArnUndefined: Self = StObject.set(x, "outpostArn", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetLocalGatewayRouteTableResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayRouteTableFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val localGatewayId: String = js.native
    
    val localGatewayRouteTableId: String = js.native
    
    val outpostArn: String = js.native
    
    val state: String = js.native
    
    val tags: StringDictionary[String] = js.native
  }
  object GetLocalGatewayRouteTableResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetLocalGatewayRouteTableResultMutableBuilder[Self <: GetLocalGatewayRouteTableResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayRouteTableFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetLocalGatewayRouteTableFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayId(value: String): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayRouteTableId(value: String): Self = StObject.set(x, "localGatewayRouteTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostArn(value: String): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
