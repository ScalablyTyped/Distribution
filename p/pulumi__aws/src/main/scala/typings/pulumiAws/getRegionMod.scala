package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRegionMod {
  
  @JSImport("@pulumi/aws/getRegion", "getRegion")
  @js.native
  def getRegion(): js.Promise[GetRegionResult] = js.native
  @JSImport("@pulumi/aws/getRegion", "getRegion")
  @js.native
  def getRegion(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetRegionResult] = js.native
  @JSImport("@pulumi/aws/getRegion", "getRegion")
  @js.native
  def getRegion(args: GetRegionArgs): js.Promise[GetRegionResult] = js.native
  @JSImport("@pulumi/aws/getRegion", "getRegion")
  @js.native
  def getRegion(args: GetRegionArgs, opts: InvokeOptions): js.Promise[GetRegionResult] = js.native
  
  @js.native
  trait GetRegionArgs extends StObject {
    
    /**
      * The EC2 endpoint of the region to select.
      */
    val endpoint: js.UndefOr[String] = js.native
    
    /**
      * The full name of the region to select.
      */
    val name: js.UndefOr[String] = js.native
  }
  object GetRegionArgs {
    
    @scala.inline
    def apply(): GetRegionArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRegionArgs]
    }
    
    @scala.inline
    implicit class GetRegionArgsMutableBuilder[Self <: GetRegionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait GetRegionResult extends StObject {
    
    /**
      * The region's description in this format: "Location (Region name)".
      */
    val description: String = js.native
    
    /**
      * The EC2 endpoint for the selected region.
      */
    val endpoint: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The name of the selected region.
      */
    val name: String = js.native
  }
  object GetRegionResult {
    
    @scala.inline
    def apply(description: String, endpoint: String, id: String, name: String): GetRegionResult = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRegionResult]
    }
    
    @scala.inline
    implicit class GetRegionResultMutableBuilder[Self <: GetRegionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
