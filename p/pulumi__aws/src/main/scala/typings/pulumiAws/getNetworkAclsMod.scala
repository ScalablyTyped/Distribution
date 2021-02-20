package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetNetworkAclsFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getNetworkAclsMod {
  
  @JSImport("@pulumi/aws/ec2/getNetworkAcls", "getNetworkAcls")
  @js.native
  def getNetworkAcls(): js.Promise[GetNetworkAclsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getNetworkAcls", "getNetworkAcls")
  @js.native
  def getNetworkAcls(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetNetworkAclsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getNetworkAcls", "getNetworkAcls")
  @js.native
  def getNetworkAcls(args: GetNetworkAclsArgs): js.Promise[GetNetworkAclsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getNetworkAcls", "getNetworkAcls")
  @js.native
  def getNetworkAcls(args: GetNetworkAclsArgs, opts: InvokeOptions): js.Promise[GetNetworkAclsResult] = js.native
  
  @js.native
  trait GetNetworkAclsArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetNetworkAclsFilter]] = js.native
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired network ACLs.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * The VPC ID that you want to filter from.
      */
    val vpcId: js.UndefOr[String] = js.native
  }
  object GetNetworkAclsArgs {
    
    @scala.inline
    def apply(): GetNetworkAclsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetNetworkAclsArgs]
    }
    
    @scala.inline
    implicit class GetNetworkAclsArgsMutableBuilder[Self <: GetNetworkAclsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetNetworkAclsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetNetworkAclsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  @js.native
  trait GetNetworkAclsResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetNetworkAclsFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * A list of all the network ACL ids found. This data source will fail if none are found.
      */
    val ids: js.Array[String] = js.native
    
    val tags: StringDictionary[String] = js.native
    
    val vpcId: js.UndefOr[String] = js.native
  }
  object GetNetworkAclsResult {
    
    @scala.inline
    def apply(id: String, ids: js.Array[String], tags: StringDictionary[String]): GetNetworkAclsResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetNetworkAclsResult]
    }
    
    @scala.inline
    implicit class GetNetworkAclsResultMutableBuilder[Self <: GetNetworkAclsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetNetworkAclsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetNetworkAclsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
