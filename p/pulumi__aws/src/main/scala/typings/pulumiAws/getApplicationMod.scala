package typings.pulumiAws

import typings.pulumiAws.outputMod.elasticbeanstalk.GetApplicationAppversionLifecycle
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getApplicationMod {
  
  @JSImport("@pulumi/aws/elasticbeanstalk/getApplication", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getApplication(args: GetApplicationArgs): js.Promise[GetApplicationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplication")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetApplicationResult]]
  inline def getApplication(args: GetApplicationArgs, opts: InvokeOptions): js.Promise[GetApplicationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplication")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetApplicationResult]]
  
  trait GetApplicationArgs extends StObject {
    
    /**
      * The name of the application
      */
    val name: String
  }
  object GetApplicationArgs {
    
    inline def apply(name: String): GetApplicationArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetApplicationArgs]
    }
    
    extension [Self <: GetApplicationArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetApplicationResult extends StObject {
    
    val appversionLifecycle: GetApplicationAppversionLifecycle
    
    /**
      * The Amazon Resource Name (ARN) of the application.
      */
    val arn: String
    
    /**
      * Short description of the application
      */
    val description: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
  }
  object GetApplicationResult {
    
    inline def apply(
      appversionLifecycle: GetApplicationAppversionLifecycle,
      arn: String,
      description: String,
      id: String,
      name: String
    ): GetApplicationResult = {
      val __obj = js.Dynamic.literal(appversionLifecycle = appversionLifecycle.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetApplicationResult]
    }
    
    extension [Self <: GetApplicationResult](x: Self) {
      
      inline def setAppversionLifecycle(value: GetApplicationAppversionLifecycle): Self = StObject.set(x, "appversionLifecycle", value.asInstanceOf[js.Any])
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
