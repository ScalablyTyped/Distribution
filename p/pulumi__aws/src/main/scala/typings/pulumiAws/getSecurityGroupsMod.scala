package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetSecurityGroupsFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSecurityGroupsMod {
  
  @JSImport("@pulumi/aws/ec2/getSecurityGroups", "getSecurityGroups")
  @js.native
  def getSecurityGroups(): js.Promise[GetSecurityGroupsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getSecurityGroups", "getSecurityGroups")
  @js.native
  def getSecurityGroups(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSecurityGroupsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getSecurityGroups", "getSecurityGroups")
  @js.native
  def getSecurityGroups(args: GetSecurityGroupsArgs): js.Promise[GetSecurityGroupsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getSecurityGroups", "getSecurityGroups")
  @js.native
  def getSecurityGroups(args: GetSecurityGroupsArgs, opts: InvokeOptions): js.Promise[GetSecurityGroupsResult] = js.native
  
  @js.native
  trait GetSecurityGroupsArgs extends StObject {
    
    /**
      * One or more name/value pairs to use as filters. There are
      * several valid keys, for a full reference, check out
      * [describe-security-groups in the AWS CLI reference][1].
      */
    val filters: js.UndefOr[js.Array[GetSecurityGroupsFilter]] = js.native
    
    /**
      * A map of tags, each pair of which must exactly match for
      * desired security groups.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetSecurityGroupsArgs {
    
    @scala.inline
    def apply(): GetSecurityGroupsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSecurityGroupsArgs]
    }
    
    @scala.inline
    implicit class GetSecurityGroupsArgsMutableBuilder[Self <: GetSecurityGroupsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetSecurityGroupsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetSecurityGroupsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetSecurityGroupsResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetSecurityGroupsFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * IDs of the matches security groups.
      */
    val ids: js.Array[String] = js.native
    
    val tags: StringDictionary[String] = js.native
    
    /**
      * The VPC IDs of the matched security groups. The data source's tag or filter *will span VPCs*
      * unless the `vpc-id` filter is also used.
      */
    val vpcIds: js.Array[String] = js.native
  }
  object GetSecurityGroupsResult {
    
    @scala.inline
    def apply(id: String, ids: js.Array[String], tags: StringDictionary[String], vpcIds: js.Array[String]): GetSecurityGroupsResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcIds = vpcIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSecurityGroupsResult]
    }
    
    @scala.inline
    implicit class GetSecurityGroupsResultMutableBuilder[Self <: GetSecurityGroupsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetSecurityGroupsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetSecurityGroupsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIds(value: js.Array[String]): Self = StObject.set(x, "vpcIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdsVarargs(value: String*): Self = StObject.set(x, "vpcIds", js.Array(value :_*))
    }
  }
}
