package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetLocalGatewayVirtualInterfaceGroupFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLocalGatewayVirtualInterfaceGroupMod {
  
  @JSImport("@pulumi/aws/ec2/getLocalGatewayVirtualInterfaceGroup", "getLocalGatewayVirtualInterfaceGroup")
  @js.native
  def getLocalGatewayVirtualInterfaceGroup(): js.Promise[GetLocalGatewayVirtualInterfaceGroupResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGatewayVirtualInterfaceGroup", "getLocalGatewayVirtualInterfaceGroup")
  @js.native
  def getLocalGatewayVirtualInterfaceGroup(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLocalGatewayVirtualInterfaceGroupResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGatewayVirtualInterfaceGroup", "getLocalGatewayVirtualInterfaceGroup")
  @js.native
  def getLocalGatewayVirtualInterfaceGroup(args: GetLocalGatewayVirtualInterfaceGroupArgs): js.Promise[GetLocalGatewayVirtualInterfaceGroupResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGatewayVirtualInterfaceGroup", "getLocalGatewayVirtualInterfaceGroup")
  @js.native
  def getLocalGatewayVirtualInterfaceGroup(args: GetLocalGatewayVirtualInterfaceGroupArgs, opts: InvokeOptions): js.Promise[GetLocalGatewayVirtualInterfaceGroupResult] = js.native
  
  @js.native
  trait GetLocalGatewayVirtualInterfaceGroupArgs extends StObject {
    
    /**
      * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetLocalGatewayVirtualInterfaceGroupFilter]] = js.native
    
    /**
      * Identifier of EC2 Local Gateway Virtual Interface Group.
      */
    val id: js.UndefOr[String] = js.native
    
    /**
      * Identifier of EC2 Local Gateway.
      */
    val localGatewayId: js.UndefOr[String] = js.native
    
    /**
      * Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetLocalGatewayVirtualInterfaceGroupArgs {
    
    @scala.inline
    def apply(): GetLocalGatewayVirtualInterfaceGroupArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetLocalGatewayVirtualInterfaceGroupArgs]
    }
    
    @scala.inline
    implicit class GetLocalGatewayVirtualInterfaceGroupArgsMutableBuilder[Self <: GetLocalGatewayVirtualInterfaceGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetLocalGatewayVirtualInterfaceGroupFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetLocalGatewayVirtualInterfaceGroupFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLocalGatewayId(value: String): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayIdUndefined: Self = StObject.set(x, "localGatewayId", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetLocalGatewayVirtualInterfaceGroupResult extends StObject {
    
    val filters: js.UndefOr[
        js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayVirtualInterfaceGroupFilter]
      ] = js.native
    
    val id: String = js.native
    
    val localGatewayId: String = js.native
    
    /**
      * Set of EC2 Local Gateway Virtual Interface identifiers.
      */
    val localGatewayVirtualInterfaceIds: js.Array[String] = js.native
    
    val tags: StringDictionary[String] = js.native
  }
  object GetLocalGatewayVirtualInterfaceGroupResult {
    
    @scala.inline
    def apply(
      id: String,
      localGatewayId: String,
      localGatewayVirtualInterfaceIds: js.Array[String],
      tags: StringDictionary[String]
    ): GetLocalGatewayVirtualInterfaceGroupResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], localGatewayId = localGatewayId.asInstanceOf[js.Any], localGatewayVirtualInterfaceIds = localGatewayVirtualInterfaceIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLocalGatewayVirtualInterfaceGroupResult]
    }
    
    @scala.inline
    implicit class GetLocalGatewayVirtualInterfaceGroupResultMutableBuilder[Self <: GetLocalGatewayVirtualInterfaceGroupResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayVirtualInterfaceGroupFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetLocalGatewayVirtualInterfaceGroupFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayId(value: String): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayVirtualInterfaceIds(value: js.Array[String]): Self = StObject.set(x, "localGatewayVirtualInterfaceIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayVirtualInterfaceIdsVarargs(value: String*): Self = StObject.set(x, "localGatewayVirtualInterfaceIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
