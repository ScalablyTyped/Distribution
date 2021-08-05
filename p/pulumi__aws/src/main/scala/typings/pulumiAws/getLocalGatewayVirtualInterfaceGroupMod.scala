package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetLocalGatewayVirtualInterfaceGroupFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLocalGatewayVirtualInterfaceGroupMod {
  
  @JSImport("@pulumi/aws/ec2/getLocalGatewayVirtualInterfaceGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLocalGatewayVirtualInterfaceGroup(): js.Promise[GetLocalGatewayVirtualInterfaceGroupResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayVirtualInterfaceGroup")().asInstanceOf[js.Promise[GetLocalGatewayVirtualInterfaceGroupResult]]
  inline def getLocalGatewayVirtualInterfaceGroup(args: Unit, opts: InvokeOptions): js.Promise[GetLocalGatewayVirtualInterfaceGroupResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayVirtualInterfaceGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLocalGatewayVirtualInterfaceGroupResult]]
  inline def getLocalGatewayVirtualInterfaceGroup(args: GetLocalGatewayVirtualInterfaceGroupArgs): js.Promise[GetLocalGatewayVirtualInterfaceGroupResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayVirtualInterfaceGroup")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetLocalGatewayVirtualInterfaceGroupResult]]
  inline def getLocalGatewayVirtualInterfaceGroup(args: GetLocalGatewayVirtualInterfaceGroupArgs, opts: InvokeOptions): js.Promise[GetLocalGatewayVirtualInterfaceGroupResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGatewayVirtualInterfaceGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLocalGatewayVirtualInterfaceGroupResult]]
  
  trait GetLocalGatewayVirtualInterfaceGroupArgs extends StObject {
    
    /**
      * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetLocalGatewayVirtualInterfaceGroupFilter]] = js.undefined
    
    /**
      * Identifier of EC2 Local Gateway Virtual Interface Group.
      */
    val id: js.UndefOr[String] = js.undefined
    
    /**
      * Identifier of EC2 Local Gateway.
      */
    val localGatewayId: js.UndefOr[String] = js.undefined
    
    /**
      * Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetLocalGatewayVirtualInterfaceGroupArgs {
    
    inline def apply(): GetLocalGatewayVirtualInterfaceGroupArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetLocalGatewayVirtualInterfaceGroupArgs]
    }
    
    extension [Self <: GetLocalGatewayVirtualInterfaceGroupArgs](x: Self) {
      
      inline def setFilters(value: js.Array[GetLocalGatewayVirtualInterfaceGroupFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetLocalGatewayVirtualInterfaceGroupFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLocalGatewayId(value: String): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
      
      inline def setLocalGatewayIdUndefined: Self = StObject.set(x, "localGatewayId", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetLocalGatewayVirtualInterfaceGroupResult extends StObject {
    
    val filters: js.UndefOr[
        js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayVirtualInterfaceGroupFilter]
      ] = js.undefined
    
    val id: String
    
    val localGatewayId: String
    
    /**
      * Set of EC2 Local Gateway Virtual Interface identifiers.
      */
    val localGatewayVirtualInterfaceIds: js.Array[String]
    
    val tags: StringDictionary[String]
  }
  object GetLocalGatewayVirtualInterfaceGroupResult {
    
    inline def apply(
      id: String,
      localGatewayId: String,
      localGatewayVirtualInterfaceIds: js.Array[String],
      tags: StringDictionary[String]
    ): GetLocalGatewayVirtualInterfaceGroupResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], localGatewayId = localGatewayId.asInstanceOf[js.Any], localGatewayVirtualInterfaceIds = localGatewayVirtualInterfaceIds.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLocalGatewayVirtualInterfaceGroupResult]
    }
    
    extension [Self <: GetLocalGatewayVirtualInterfaceGroupResult](x: Self) {
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewayVirtualInterfaceGroupFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetLocalGatewayVirtualInterfaceGroupFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocalGatewayId(value: String): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
      
      inline def setLocalGatewayVirtualInterfaceIds(value: js.Array[String]): Self = StObject.set(x, "localGatewayVirtualInterfaceIds", value.asInstanceOf[js.Any])
      
      inline def setLocalGatewayVirtualInterfaceIdsVarargs(value: String*): Self = StObject.set(x, "localGatewayVirtualInterfaceIds", js.Array(value :_*))
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
