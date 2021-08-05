package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getHostedZoneIdMod {
  
  @JSImport("@pulumi/aws/elasticloadbalancing/getHostedZoneId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHostedZoneId(): js.Promise[GetHostedZoneIdResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostedZoneId")().asInstanceOf[js.Promise[GetHostedZoneIdResult]]
  inline def getHostedZoneId(args: Unit, opts: InvokeOptions): js.Promise[GetHostedZoneIdResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHostedZoneId")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetHostedZoneIdResult]]
  inline def getHostedZoneId(args: GetHostedZoneIdArgs): js.Promise[GetHostedZoneIdResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostedZoneId")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetHostedZoneIdResult]]
  inline def getHostedZoneId(args: GetHostedZoneIdArgs, opts: InvokeOptions): js.Promise[GetHostedZoneIdResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHostedZoneId")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetHostedZoneIdResult]]
  
  trait GetHostedZoneIdArgs extends StObject {
    
    /**
      * Name of the region whose AWS ELB HostedZoneId is desired.
      * Defaults to the region from the AWS provider configuration.
      */
    val region: js.UndefOr[String] = js.undefined
  }
  object GetHostedZoneIdArgs {
    
    inline def apply(): GetHostedZoneIdArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetHostedZoneIdArgs]
    }
    
    extension [Self <: GetHostedZoneIdArgs](x: Self) {
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
  
  trait GetHostedZoneIdResult extends StObject {
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val region: js.UndefOr[String] = js.undefined
  }
  object GetHostedZoneIdResult {
    
    inline def apply(id: String): GetHostedZoneIdResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetHostedZoneIdResult]
    }
    
    extension [Self <: GetHostedZoneIdResult](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
}
