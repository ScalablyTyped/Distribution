package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpcPeeringConnectionsFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVpcPeeringConnectionsMod {
  
  @JSImport("@pulumi/aws/ec2/getVpcPeeringConnections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getVpcPeeringConnections(): js.Promise[GetVpcPeeringConnectionsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVpcPeeringConnections")().asInstanceOf[js.Promise[GetVpcPeeringConnectionsResult]]
  @scala.inline
  def getVpcPeeringConnections(args: Unit, opts: InvokeOptions): js.Promise[GetVpcPeeringConnectionsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVpcPeeringConnections")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetVpcPeeringConnectionsResult]]
  @scala.inline
  def getVpcPeeringConnections(args: GetVpcPeeringConnectionsArgs): js.Promise[GetVpcPeeringConnectionsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVpcPeeringConnections")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetVpcPeeringConnectionsResult]]
  @scala.inline
  def getVpcPeeringConnections(args: GetVpcPeeringConnectionsArgs, opts: InvokeOptions): js.Promise[GetVpcPeeringConnectionsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVpcPeeringConnections")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetVpcPeeringConnectionsResult]]
  
  trait GetVpcPeeringConnectionsArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetVpcPeeringConnectionsFilter]] = js.undefined
    
    /**
      * A mapping of tags, each pair of which must exactly match
      * a pair on the desired VPC Peering Connection.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetVpcPeeringConnectionsArgs {
    
    @scala.inline
    def apply(): GetVpcPeeringConnectionsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetVpcPeeringConnectionsArgs]
    }
    
    @scala.inline
    implicit class GetVpcPeeringConnectionsArgsMutableBuilder[Self <: GetVpcPeeringConnectionsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetVpcPeeringConnectionsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetVpcPeeringConnectionsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetVpcPeeringConnectionsResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetVpcPeeringConnectionsFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The IDs of the VPC Peering Connections.
      */
    val ids: js.Array[String]
    
    val tags: StringDictionary[String]
  }
  object GetVpcPeeringConnectionsResult {
    
    @scala.inline
    def apply(id: String, ids: js.Array[String], tags: StringDictionary[String]): GetVpcPeeringConnectionsResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVpcPeeringConnectionsResult]
    }
    
    @scala.inline
    implicit class GetVpcPeeringConnectionsResultMutableBuilder[Self <: GetVpcPeeringConnectionsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetVpcPeeringConnectionsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetVpcPeeringConnectionsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
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
