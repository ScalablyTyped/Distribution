package typings.pulumiAws

import typings.pulumiAws.inputMod.GetRegionsFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRegionsMod {
  
  @JSImport("@pulumi/aws/getRegions", "getRegions")
  @js.native
  def getRegions(): js.Promise[GetRegionsResult] = js.native
  @JSImport("@pulumi/aws/getRegions", "getRegions")
  @js.native
  def getRegions(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetRegionsResult] = js.native
  @JSImport("@pulumi/aws/getRegions", "getRegions")
  @js.native
  def getRegions(args: GetRegionsArgs): js.Promise[GetRegionsResult] = js.native
  @JSImport("@pulumi/aws/getRegions", "getRegions")
  @js.native
  def getRegions(args: GetRegionsArgs, opts: InvokeOptions): js.Promise[GetRegionsResult] = js.native
  
  @js.native
  trait GetRegionsArgs extends StObject {
    
    /**
      * If true the source will query all regions regardless of availability.
      */
    val allRegions: js.UndefOr[Boolean] = js.native
    
    /**
      * Configuration block(s) to use as filters. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetRegionsFilter]] = js.native
  }
  object GetRegionsArgs {
    
    @scala.inline
    def apply(): GetRegionsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRegionsArgs]
    }
    
    @scala.inline
    implicit class GetRegionsArgsMutableBuilder[Self <: GetRegionsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllRegions(value: Boolean): Self = StObject.set(x, "allRegions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllRegionsUndefined: Self = StObject.set(x, "allRegions", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[GetRegionsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetRegionsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetRegionsResult extends StObject {
    
    val allRegions: js.UndefOr[Boolean] = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.GetRegionsFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Names of regions that meets the criteria.
      */
    val names: js.Array[String] = js.native
  }
  object GetRegionsResult {
    
    @scala.inline
    def apply(id: String, names: js.Array[String]): GetRegionsResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRegionsResult]
    }
    
    @scala.inline
    implicit class GetRegionsResultMutableBuilder[Self <: GetRegionsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllRegions(value: Boolean): Self = StObject.set(x, "allRegions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllRegionsUndefined: Self = StObject.set(x, "allRegions", js.undefined)
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.GetRegionsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.GetRegionsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
    }
  }
}
