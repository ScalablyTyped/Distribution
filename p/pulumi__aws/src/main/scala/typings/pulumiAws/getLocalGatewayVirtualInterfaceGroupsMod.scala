package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetLocalGatewayVirtualInterfaceGroupsFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLocalGatewayVirtualInterfaceGroupsMod {
  
  @JSImport("@pulumi/aws/ec2/getLocalGatewayVirtualInterfaceGroups", "getLocalGatewayVirtualInterfaceGroups")
  @js.native
  def getLocalGatewayVirtualInterfaceGroups(): js.Promise[GetLocalGatewayVirtualInterfaceGroupsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGatewayVirtualInterfaceGroups", "getLocalGatewayVirtualInterfaceGroups")
  @js.native
  def getLocalGatewayVirtualInterfaceGroups(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLocalGatewayVirtualInterfaceGroupsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGatewayVirtualInterfaceGroups", "getLocalGatewayVirtualInterfaceGroups")
  @js.native
  def getLocalGatewayVirtualInterfaceGroups(args: GetLocalGatewayVirtualInterfaceGroupsArgs): js.Promise[GetLocalGatewayVirtualInterfaceGroupsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getLocalGatewayVirtualInterfaceGroups", "getLocalGatewayVirtualInterfaceGroups")
  @js.native
  def getLocalGatewayVirtualInterfaceGroups(args: GetLocalGatewayVirtualInterfaceGroupsArgs, opts: InvokeOptions): js.Promise[GetLocalGatewayVirtualInterfaceGroupsResult] = js.native
  
  @js.native
  trait GetLocalGatewayVirtualInterfaceGroupsArgs extends StObject {
    
    /**
      * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetLocalGatewayVirtualInterfaceGroupsFilter]] = js.native
    
    /**
      * Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetLocalGatewayVirtualInterfaceGroupsArgs {
    
    @scala.inline
    def apply(): GetLocalGatewayVirtualInterfaceGroupsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetLocalGatewayVirtualInterfaceGroupsArgs]
    }
    
    @scala.inline
    implicit class GetLocalGatewayVirtualInterfaceGroupsArgsMutableBuilder[Self <: GetLocalGatewayVirtualInterfaceGroupsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetLocalGatewayVirtualInterfaceGroupsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetLocalGatewayVirtualInterfaceGroupsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetLocalGatewayVirtualInterfaceGroupsResult extends StObject {
    
    val filters: js.UndefOr[
        js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayVirtualInterfaceGroupsFilter]
      ] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Set of EC2 Local Gateway Virtual Interface Group identifiers.
      */
    val ids: js.Array[String] = js.native
    
    /**
      * Set of EC2 Local Gateway Virtual Interface identifiers.
      */
    val localGatewayVirtualInterfaceIds: js.Array[String] = js.native
    
    val tags: StringDictionary[String] = js.native
  }
  object GetLocalGatewayVirtualInterfaceGroupsResult {
    
    @scala.inline
    def apply(
      id: String,
      ids: js.Array[String],
      localGatewayVirtualInterfaceIds: js.Array[String],
      tags: StringDictionary[String]
    ): GetLocalGatewayVirtualInterfaceGroupsResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], localGatewayVirtualInterfaceIds = localGatewayVirtualInterfaceIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLocalGatewayVirtualInterfaceGroupsResult]
    }
    
    @scala.inline
    implicit class GetLocalGatewayVirtualInterfaceGroupsResultMutableBuilder[Self <: GetLocalGatewayVirtualInterfaceGroupsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayVirtualInterfaceGroupsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetLocalGatewayVirtualInterfaceGroupsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setLocalGatewayVirtualInterfaceIds(value: js.Array[String]): Self = StObject.set(x, "localGatewayVirtualInterfaceIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayVirtualInterfaceIdsVarargs(value: String*): Self = StObject.set(x, "localGatewayVirtualInterfaceIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
