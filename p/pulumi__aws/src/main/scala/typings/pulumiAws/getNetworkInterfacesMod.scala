package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetNetworkInterfacesFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getNetworkInterfacesMod {
  
  @JSImport("@pulumi/aws/ec2/getNetworkInterfaces", "getNetworkInterfaces")
  @js.native
  def getNetworkInterfaces(): js.Promise[GetNetworkInterfacesResult] = js.native
  @JSImport("@pulumi/aws/ec2/getNetworkInterfaces", "getNetworkInterfaces")
  @js.native
  def getNetworkInterfaces(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetNetworkInterfacesResult] = js.native
  @JSImport("@pulumi/aws/ec2/getNetworkInterfaces", "getNetworkInterfaces")
  @js.native
  def getNetworkInterfaces(args: GetNetworkInterfacesArgs): js.Promise[GetNetworkInterfacesResult] = js.native
  @JSImport("@pulumi/aws/ec2/getNetworkInterfaces", "getNetworkInterfaces")
  @js.native
  def getNetworkInterfaces(args: GetNetworkInterfacesArgs, opts: InvokeOptions): js.Promise[GetNetworkInterfacesResult] = js.native
  
  @js.native
  trait GetNetworkInterfacesArgs extends StObject {
    
    /**
      * Custom filter block as described below.
      */
    val filters: js.UndefOr[js.Array[GetNetworkInterfacesFilter]] = js.native
    
    /**
      * A map of tags, each pair of which must exactly match
      * a pair on the desired network interfaces.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetNetworkInterfacesArgs {
    
    @scala.inline
    def apply(): GetNetworkInterfacesArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetNetworkInterfacesArgs]
    }
    
    @scala.inline
    implicit class GetNetworkInterfacesArgsMutableBuilder[Self <: GetNetworkInterfacesArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetNetworkInterfacesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetNetworkInterfacesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetNetworkInterfacesResult extends StObject {
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetNetworkInterfacesFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * A list of all the network interface ids found. This data source will fail if none are found.
      */
    val ids: js.Array[String] = js.native
    
    val tags: StringDictionary[String] = js.native
  }
  object GetNetworkInterfacesResult {
    
    @scala.inline
    def apply(id: String, ids: js.Array[String], tags: StringDictionary[String]): GetNetworkInterfacesResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetNetworkInterfacesResult]
    }
    
    @scala.inline
    implicit class GetNetworkInterfacesResultMutableBuilder[Self <: GetNetworkInterfacesResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetNetworkInterfacesFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetNetworkInterfacesFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
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
