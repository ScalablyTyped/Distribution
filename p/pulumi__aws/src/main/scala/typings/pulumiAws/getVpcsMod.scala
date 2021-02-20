package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpcsFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVpcsMod {
  
  @JSImport("@pulumi/aws/ec2/getVpcs", "getVpcs")
  @js.native
  def getVpcs(): js.Promise[GetVpcsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpcs", "getVpcs")
  @js.native
  def getVpcs(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpcsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpcs", "getVpcs")
  @js.native
  def getVpcs(args: GetVpcsArgs): js.Promise[GetVpcsResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpcs", "getVpcs")
  @js.native
  def getVpcs(args: GetVpcsArgs, opts: InvokeOptions): js.Promise[GetVpcsResult] = js.native
  
  @js.native
  trait GetVpcsArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetVpcsFilter]] = js.native
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired vpcs.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetVpcsArgs {
    
    @scala.inline
    def apply(): GetVpcsArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetVpcsArgs]
    }
    
    @scala.inline
    implicit class GetVpcsArgsMutableBuilder[Self <: GetVpcsArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetVpcsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetVpcsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetVpcsResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetVpcsFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * A list of all the VPC Ids found. This data source will fail if none are found.
      */
    val ids: js.Array[String] = js.native
    
    val tags: StringDictionary[String] = js.native
  }
  object GetVpcsResult {
    
    @scala.inline
    def apply(id: String, ids: js.Array[String], tags: StringDictionary[String]): GetVpcsResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVpcsResult]
    }
    
    @scala.inline
    implicit class GetVpcsResultMutableBuilder[Self <: GetVpcsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetVpcsFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetVpcsFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
}
