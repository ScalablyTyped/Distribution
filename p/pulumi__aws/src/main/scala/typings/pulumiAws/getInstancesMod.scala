package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetInstancesFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInstancesMod {
  
  @JSImport("@pulumi/aws/ec2/getInstances", "getInstances")
  @js.native
  def getInstances(): js.Promise[GetInstancesResult] = js.native
  @JSImport("@pulumi/aws/ec2/getInstances", "getInstances")
  @js.native
  def getInstances(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetInstancesResult] = js.native
  @JSImport("@pulumi/aws/ec2/getInstances", "getInstances")
  @js.native
  def getInstances(args: GetInstancesArgs): js.Promise[GetInstancesResult] = js.native
  @JSImport("@pulumi/aws/ec2/getInstances", "getInstances")
  @js.native
  def getInstances(args: GetInstancesArgs, opts: InvokeOptions): js.Promise[GetInstancesResult] = js.native
  
  @js.native
  trait GetInstancesArgs extends StObject {
    
    /**
      * One or more name/value pairs to use as filters. There are
      * several valid keys, for a full reference, check out
      * [describe-instances in the AWS CLI reference][1].
      */
    val filters: js.UndefOr[js.Array[GetInstancesFilter]] = js.native
    
    /**
      * A list of instance states that should be applicable to the desired instances. The permitted values are: `pending, running, shutting-down, stopped, stopping, terminated`. The default value is `running`.
      */
    val instanceStateNames: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * A map of tags, each pair of which must
      * exactly match a pair on desired instances.
      */
    val instanceTags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetInstancesArgs {
    
    @scala.inline
    def apply(): GetInstancesArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetInstancesArgs]
    }
    
    @scala.inline
    implicit class GetInstancesArgsMutableBuilder[Self <: GetInstancesArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetInstancesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetInstancesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setInstanceStateNames(value: js.Array[String]): Self = StObject.set(x, "instanceStateNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceStateNamesUndefined: Self = StObject.set(x, "instanceStateNames", js.undefined)
      
      @scala.inline
      def setInstanceStateNamesVarargs(value: String*): Self = StObject.set(x, "instanceStateNames", js.Array(value :_*))
      
      @scala.inline
      def setInstanceTags(value: StringDictionary[String]): Self = StObject.set(x, "instanceTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTagsUndefined: Self = StObject.set(x, "instanceTags", js.undefined)
    }
  }
  
  @js.native
  trait GetInstancesResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetInstancesFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * IDs of instances found through the filter
      */
    val ids: js.Array[String] = js.native
    
    val instanceStateNames: js.UndefOr[js.Array[String]] = js.native
    
    val instanceTags: StringDictionary[String] = js.native
    
    /**
      * Private IP addresses of instances found through the filter
      */
    val privateIps: js.Array[String] = js.native
    
    /**
      * Public IP addresses of instances found through the filter
      */
    val publicIps: js.Array[String] = js.native
  }
  object GetInstancesResult {
    
    @scala.inline
    def apply(
      id: String,
      ids: js.Array[String],
      instanceTags: StringDictionary[String],
      privateIps: js.Array[String],
      publicIps: js.Array[String]
    ): GetInstancesResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], instanceTags = instanceTags.asInstanceOf[js.Any], privateIps = privateIps.asInstanceOf[js.Any], publicIps = publicIps.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInstancesResult]
    }
    
    @scala.inline
    implicit class GetInstancesResultMutableBuilder[Self <: GetInstancesResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetInstancesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetInstancesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setInstanceStateNames(value: js.Array[String]): Self = StObject.set(x, "instanceStateNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceStateNamesUndefined: Self = StObject.set(x, "instanceStateNames", js.undefined)
      
      @scala.inline
      def setInstanceStateNamesVarargs(value: String*): Self = StObject.set(x, "instanceStateNames", js.Array(value :_*))
      
      @scala.inline
      def setInstanceTags(value: StringDictionary[String]): Self = StObject.set(x, "instanceTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIps(value: js.Array[String]): Self = StObject.set(x, "privateIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIpsVarargs(value: String*): Self = StObject.set(x, "privateIps", js.Array(value :_*))
      
      @scala.inline
      def setPublicIps(value: js.Array[String]): Self = StObject.set(x, "publicIps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicIpsVarargs(value: String*): Self = StObject.set(x, "publicIps", js.Array(value :_*))
    }
  }
}
