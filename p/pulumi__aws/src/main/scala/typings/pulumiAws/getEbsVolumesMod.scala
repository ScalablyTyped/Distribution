package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ebs.GetEbsVolumesFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEbsVolumesMod {
  
  @JSImport("@pulumi/aws/ebs/getEbsVolumes", "getEbsVolumes")
  @js.native
  def getEbsVolumes(): js.Promise[GetEbsVolumesResult] = js.native
  @JSImport("@pulumi/aws/ebs/getEbsVolumes", "getEbsVolumes")
  @js.native
  def getEbsVolumes(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetEbsVolumesResult] = js.native
  @JSImport("@pulumi/aws/ebs/getEbsVolumes", "getEbsVolumes")
  @js.native
  def getEbsVolumes(args: GetEbsVolumesArgs): js.Promise[GetEbsVolumesResult] = js.native
  @JSImport("@pulumi/aws/ebs/getEbsVolumes", "getEbsVolumes")
  @js.native
  def getEbsVolumes(args: GetEbsVolumesArgs, opts: InvokeOptions): js.Promise[GetEbsVolumesResult] = js.native
  
  @js.native
  trait GetEbsVolumesArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetEbsVolumesFilter]] = js.native
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired volumes.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetEbsVolumesArgs {
    
    @scala.inline
    def apply(): GetEbsVolumesArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetEbsVolumesArgs]
    }
    
    @scala.inline
    implicit class GetEbsVolumesArgsMutableBuilder[Self <: GetEbsVolumesArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetEbsVolumesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetEbsVolumesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetEbsVolumesResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ebs.GetEbsVolumesFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * A set of all the EBS Volume IDs found. This data source will fail if
      * no volumes match the provided criteria.
      */
    val ids: js.Array[String] = js.native
    
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetEbsVolumesResult {
    
    @scala.inline
    def apply(id: String, ids: js.Array[String]): GetEbsVolumesResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEbsVolumesResult]
    }
    
    @scala.inline
    implicit class GetEbsVolumesResultMutableBuilder[Self <: GetEbsVolumesResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ebs.GetEbsVolumesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ebs.GetEbsVolumesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
