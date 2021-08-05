package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ebs.GetEbsVolumesFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getEbsVolumesMod {
  
  @JSImport("@pulumi/aws/ebs/getEbsVolumes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEbsVolumes(): js.Promise[GetEbsVolumesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEbsVolumes")().asInstanceOf[js.Promise[GetEbsVolumesResult]]
  inline def getEbsVolumes(args: Unit, opts: InvokeOptions): js.Promise[GetEbsVolumesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEbsVolumes")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEbsVolumesResult]]
  inline def getEbsVolumes(args: GetEbsVolumesArgs): js.Promise[GetEbsVolumesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEbsVolumes")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetEbsVolumesResult]]
  inline def getEbsVolumes(args: GetEbsVolumesArgs, opts: InvokeOptions): js.Promise[GetEbsVolumesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEbsVolumes")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEbsVolumesResult]]
  
  trait GetEbsVolumesArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetEbsVolumesFilter]] = js.undefined
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired volumes.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetEbsVolumesArgs {
    
    inline def apply(): GetEbsVolumesArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetEbsVolumesArgs]
    }
    
    extension [Self <: GetEbsVolumesArgs](x: Self) {
      
      inline def setFilters(value: js.Array[GetEbsVolumesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetEbsVolumesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetEbsVolumesResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ebs.GetEbsVolumesFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * A set of all the EBS Volume IDs found. This data source will fail if
      * no volumes match the provided criteria.
      */
    val ids: js.Array[String]
    
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetEbsVolumesResult {
    
    inline def apply(id: String, ids: js.Array[String]): GetEbsVolumesResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEbsVolumesResult]
    }
    
    extension [Self <: GetEbsVolumesResult](x: Self) {
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.ebs.GetEbsVolumesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.ebs.GetEbsVolumesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
