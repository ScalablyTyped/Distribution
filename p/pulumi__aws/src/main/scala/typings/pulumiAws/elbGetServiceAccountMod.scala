package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elbGetServiceAccountMod {
  
  @JSImport("@pulumi/aws/elb/getServiceAccount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getServiceAccount(): js.Promise[GetServiceAccountResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServiceAccount")().asInstanceOf[js.Promise[GetServiceAccountResult]]
  inline def getServiceAccount(args: Unit, opts: InvokeOptions): js.Promise[GetServiceAccountResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getServiceAccount")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetServiceAccountResult]]
  inline def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServiceAccount")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetServiceAccountResult]]
  inline def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getServiceAccount")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetServiceAccountResult]]
  
  trait GetServiceAccountArgs extends StObject {
    
    /**
      * Name of the region whose AWS ELB account ID is desired.
      * Defaults to the region from the AWS provider configuration.
      */
    val region: js.UndefOr[String] = js.undefined
  }
  object GetServiceAccountArgs {
    
    inline def apply(): GetServiceAccountArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetServiceAccountArgs]
    }
    
    extension [Self <: GetServiceAccountArgs](x: Self) {
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
  
  trait GetServiceAccountResult extends StObject {
    
    /**
      * The ARN of the AWS ELB service account in the selected region.
      */
    val arn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val region: js.UndefOr[String] = js.undefined
  }
  object GetServiceAccountResult {
    
    inline def apply(arn: String, id: String): GetServiceAccountResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServiceAccountResult]
    }
    
    extension [Self <: GetServiceAccountResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
}
