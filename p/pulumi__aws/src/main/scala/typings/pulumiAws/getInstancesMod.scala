package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetInstancesFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getInstancesMod {
  
  @JSImport("@pulumi/aws/ec2/getInstances", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getInstances(): js.Promise[GetInstancesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstances")().asInstanceOf[js.Promise[GetInstancesResult]]
  @scala.inline
  def getInstances(args: Unit, opts: InvokeOptions): js.Promise[GetInstancesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstances")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetInstancesResult]]
  @scala.inline
  def getInstances(args: GetInstancesArgs): js.Promise[GetInstancesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstances")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetInstancesResult]]
  @scala.inline
  def getInstances(args: GetInstancesArgs, opts: InvokeOptions): js.Promise[GetInstancesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstances")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetInstancesResult]]
  
  trait GetInstancesArgs extends StObject {
    
    /**
      * One or more name/value pairs to use as filters. There are
      * several valid keys, for a full reference, check out
      * [describe-instances in the AWS CLI reference][1].
      */
    val filters: js.UndefOr[js.Array[GetInstancesFilter]] = js.undefined
    
    /**
      * A list of instance states that should be applicable to the desired instances. The permitted values are: `pending, running, shutting-down, stopped, stopping, terminated`. The default value is `running`.
      */
    val instanceStateNames: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A map of tags, each pair of which must
      * exactly match a pair on desired instances.
      */
    val instanceTags: js.UndefOr[StringDictionary[String]] = js.undefined
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
  
  trait GetInstancesResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetInstancesFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * IDs of instances found through the filter
      */
    val ids: js.Array[String]
    
    val instanceStateNames: js.UndefOr[js.Array[String]] = js.undefined
    
    val instanceTags: StringDictionary[String]
    
    /**
      * Private IP addresses of instances found through the filter
      */
    val privateIps: js.Array[String]
    
    /**
      * Public IP addresses of instances found through the filter
      */
    val publicIps: js.Array[String]
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
