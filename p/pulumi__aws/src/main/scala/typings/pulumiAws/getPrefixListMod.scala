package typings.pulumiAws

import typings.pulumiAws.inputMod.GetPrefixListFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPrefixListMod {
  
  @JSImport("@pulumi/aws/getPrefixList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPrefixList(): js.Promise[GetPrefixListResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrefixList")().asInstanceOf[js.Promise[GetPrefixListResult]]
  inline def getPrefixList(args: Unit, opts: InvokeOptions): js.Promise[GetPrefixListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPrefixList")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetPrefixListResult]]
  inline def getPrefixList(args: GetPrefixListArgs): js.Promise[GetPrefixListResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrefixList")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetPrefixListResult]]
  inline def getPrefixList(args: GetPrefixListArgs, opts: InvokeOptions): js.Promise[GetPrefixListResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPrefixList")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetPrefixListResult]]
  
  trait GetPrefixListArgs extends StObject {
    
    /**
      * Configuration block(s) for filtering. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetPrefixListFilter]] = js.undefined
    
    /**
      * The name of the filter field. Valid values can be found in the [EC2 DescribePrefixLists API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribePrefixLists.html).
      */
    val name: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the prefix list to select.
      */
    val prefixListId: js.UndefOr[String] = js.undefined
  }
  object GetPrefixListArgs {
    
    inline def apply(): GetPrefixListArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPrefixListArgs]
    }
    
    extension [Self <: GetPrefixListArgs](x: Self) {
      
      inline def setFilters(value: js.Array[GetPrefixListFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetPrefixListFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPrefixListId(value: String): Self = StObject.set(x, "prefixListId", value.asInstanceOf[js.Any])
      
      inline def setPrefixListIdUndefined: Self = StObject.set(x, "prefixListId", js.undefined)
    }
  }
  
  trait GetPrefixListResult extends StObject {
    
    /**
      * The list of CIDR blocks for the AWS service associated with the prefix list.
      */
    val cidrBlocks: js.Array[String]
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.GetPrefixListFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The name of the selected prefix list.
      */
    val name: String
    
    val prefixListId: js.UndefOr[String] = js.undefined
  }
  object GetPrefixListResult {
    
    inline def apply(cidrBlocks: js.Array[String], id: String, name: String): GetPrefixListResult = {
      val __obj = js.Dynamic.literal(cidrBlocks = cidrBlocks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPrefixListResult]
    }
    
    extension [Self <: GetPrefixListResult](x: Self) {
      
      inline def setCidrBlocks(value: js.Array[String]): Self = StObject.set(x, "cidrBlocks", value.asInstanceOf[js.Any])
      
      inline def setCidrBlocksVarargs(value: String*): Self = StObject.set(x, "cidrBlocks", js.Array(value :_*))
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.GetPrefixListFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.GetPrefixListFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefixListId(value: String): Self = StObject.set(x, "prefixListId", value.asInstanceOf[js.Any])
      
      inline def setPrefixListIdUndefined: Self = StObject.set(x, "prefixListId", js.undefined)
    }
  }
}
