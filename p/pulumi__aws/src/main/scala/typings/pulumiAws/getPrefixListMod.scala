package typings.pulumiAws

import typings.pulumiAws.inputMod.GetPrefixListFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPrefixListMod {
  
  @JSImport("@pulumi/aws/getPrefixList", "getPrefixList")
  @js.native
  def getPrefixList(): js.Promise[GetPrefixListResult] = js.native
  @JSImport("@pulumi/aws/getPrefixList", "getPrefixList")
  @js.native
  def getPrefixList(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetPrefixListResult] = js.native
  @JSImport("@pulumi/aws/getPrefixList", "getPrefixList")
  @js.native
  def getPrefixList(args: GetPrefixListArgs): js.Promise[GetPrefixListResult] = js.native
  @JSImport("@pulumi/aws/getPrefixList", "getPrefixList")
  @js.native
  def getPrefixList(args: GetPrefixListArgs, opts: InvokeOptions): js.Promise[GetPrefixListResult] = js.native
  
  @js.native
  trait GetPrefixListArgs extends StObject {
    
    /**
      * Configuration block(s) for filtering. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetPrefixListFilter]] = js.native
    
    /**
      * The name of the filter field. Valid values can be found in the [EC2 DescribePrefixLists API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribePrefixLists.html).
      */
    val name: js.UndefOr[String] = js.native
    
    /**
      * The ID of the prefix list to select.
      */
    val prefixListId: js.UndefOr[String] = js.native
  }
  object GetPrefixListArgs {
    
    @scala.inline
    def apply(): GetPrefixListArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPrefixListArgs]
    }
    
    @scala.inline
    implicit class GetPrefixListArgsMutableBuilder[Self <: GetPrefixListArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetPrefixListFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetPrefixListFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPrefixListId(value: String): Self = StObject.set(x, "prefixListId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixListIdUndefined: Self = StObject.set(x, "prefixListId", js.undefined)
    }
  }
  
  @js.native
  trait GetPrefixListResult extends StObject {
    
    /**
      * The list of CIDR blocks for the AWS service associated with the prefix list.
      */
    val cidrBlocks: js.Array[String] = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.GetPrefixListFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The name of the selected prefix list.
      */
    val name: String = js.native
    
    val prefixListId: js.UndefOr[String] = js.native
  }
  object GetPrefixListResult {
    
    @scala.inline
    def apply(cidrBlocks: js.Array[String], id: String, name: String): GetPrefixListResult = {
      val __obj = js.Dynamic.literal(cidrBlocks = cidrBlocks.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPrefixListResult]
    }
    
    @scala.inline
    implicit class GetPrefixListResultMutableBuilder[Self <: GetPrefixListResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidrBlocks(value: js.Array[String]): Self = StObject.set(x, "cidrBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlocksVarargs(value: String*): Self = StObject.set(x, "cidrBlocks", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.GetPrefixListFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.GetPrefixListFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixListId(value: String): Self = StObject.set(x, "prefixListId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixListIdUndefined: Self = StObject.set(x, "prefixListId", js.undefined)
    }
  }
}
