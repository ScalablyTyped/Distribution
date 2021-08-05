package typings.pulumiAws

import typings.pulumiAws.inputMod.GetRegionsFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRegionsMod {
  
  @JSImport("@pulumi/aws/getRegions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRegions(): js.Promise[GetRegionsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegions")().asInstanceOf[js.Promise[GetRegionsResult]]
  inline def getRegions(args: Unit, opts: InvokeOptions): js.Promise[GetRegionsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegions")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRegionsResult]]
  inline def getRegions(args: GetRegionsArgs): js.Promise[GetRegionsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegions")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRegionsResult]]
  inline def getRegions(args: GetRegionsArgs, opts: InvokeOptions): js.Promise[GetRegionsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegions")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRegionsResult]]
  
  trait GetRegionsArgs extends StObject {
    
    /**
      * If true the source will query all regions regardless of availability.
      */
    val allRegions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configuration block(s) to use as filters. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetRegionsFilter]] = js.undefined
  }
  object GetRegionsArgs {
    
    inline def apply(): GetRegionsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRegionsArgs]
    }
    
    extension [Self <: GetRegionsArgs](x: Self) {
      
      inline def setAllRegions(value: Boolean): Self = StObject.set(x, "allRegions", value.asInstanceOf[js.Any])
      
      inline def setAllRegionsUndefined: Self = StObject.set(x, "allRegions", js.undefined)
      
      inline def setFilters(value: js.Array[GetRegionsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetRegionsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    }
  }
  
  trait GetRegionsResult extends StObject {
    
    val allRegions: js.UndefOr[Boolean] = js.undefined
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.GetRegionsFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Names of regions that meets the criteria.
      */
    val names: js.Array[String]
  }
  object GetRegionsResult {
    
    inline def apply(id: String, names: js.Array[String]): GetRegionsResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRegionsResult]
    }
    
    extension [Self <: GetRegionsResult](x: Self) {
      
      inline def setAllRegions(value: Boolean): Self = StObject.set(x, "allRegions", value.asInstanceOf[js.Any])
      
      inline def setAllRegionsUndefined: Self = StObject.set(x, "allRegions", js.undefined)
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.GetRegionsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.GetRegionsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
    }
  }
}
