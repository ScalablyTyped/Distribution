package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRegionMod {
  
  @JSImport("@pulumi/aws/getRegion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRegion(): js.Promise[GetRegionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegion")().asInstanceOf[js.Promise[GetRegionResult]]
  inline def getRegion(args: Unit, opts: InvokeOptions): js.Promise[GetRegionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegion")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRegionResult]]
  inline def getRegion(args: GetRegionArgs): js.Promise[GetRegionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegion")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRegionResult]]
  inline def getRegion(args: GetRegionArgs, opts: InvokeOptions): js.Promise[GetRegionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegion")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRegionResult]]
  
  trait GetRegionArgs extends StObject {
    
    /**
      * The EC2 endpoint of the region to select.
      */
    val endpoint: js.UndefOr[String] = js.undefined
    
    /**
      * The full name of the region to select.
      */
    val name: js.UndefOr[String] = js.undefined
  }
  object GetRegionArgs {
    
    inline def apply(): GetRegionArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRegionArgs]
    }
    
    extension [Self <: GetRegionArgs](x: Self) {
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait GetRegionResult extends StObject {
    
    /**
      * The region's description in this format: "Location (Region name)".
      */
    val description: String
    
    /**
      * The EC2 endpoint for the selected region.
      */
    val endpoint: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The name of the selected region.
      */
    val name: String
  }
  object GetRegionResult {
    
    inline def apply(description: String, endpoint: String, id: String, name: String): GetRegionResult = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRegionResult]
    }
    
    extension [Self <: GetRegionResult](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
