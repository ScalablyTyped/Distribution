package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetLocalGatewaysFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getLocalGatewaysMod {
  
  @JSImport("@pulumi/aws/ec2/getLocalGateways", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getLocalGateways(): js.Promise[GetLocalGatewaysResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGateways")().asInstanceOf[js.Promise[GetLocalGatewaysResult]]
  @scala.inline
  def getLocalGateways(args: Unit, opts: InvokeOptions): js.Promise[GetLocalGatewaysResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGateways")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLocalGatewaysResult]]
  @scala.inline
  def getLocalGateways(args: GetLocalGatewaysArgs): js.Promise[GetLocalGatewaysResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGateways")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetLocalGatewaysResult]]
  @scala.inline
  def getLocalGateways(args: GetLocalGatewaysArgs, opts: InvokeOptions): js.Promise[GetLocalGatewaysResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalGateways")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetLocalGatewaysResult]]
  
  trait GetLocalGatewaysArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetLocalGatewaysFilter]] = js.undefined
    
    /**
      * A mapping of tags, each pair of which must exactly match
      * a pair on the desired local_gateways.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetLocalGatewaysArgs {
    
    @scala.inline
    def apply(): GetLocalGatewaysArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetLocalGatewaysArgs]
    }
    
    @scala.inline
    implicit class GetLocalGatewaysArgsMutableBuilder[Self <: GetLocalGatewaysArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetLocalGatewaysFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetLocalGatewaysFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetLocalGatewaysResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewaysFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Set of all the Local Gateway identifiers
      */
    val ids: js.Array[String]
    
    val tags: StringDictionary[String]
  }
  object GetLocalGatewaysResult {
    
    @scala.inline
    def apply(id: String, ids: js.Array[String], tags: StringDictionary[String]): GetLocalGatewaysResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLocalGatewaysResult]
    }
    
    @scala.inline
    implicit class GetLocalGatewaysResultMutableBuilder[Self <: GetLocalGatewaysResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetLocalGatewaysFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetLocalGatewaysFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
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
