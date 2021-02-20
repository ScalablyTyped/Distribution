package typings.pulumiAws

import typings.pulumiAws.outputMod.elasticbeanstalk.GetApplicationAppversionLifecycle
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getApplicationMod {
  
  @JSImport("@pulumi/aws/elasticbeanstalk/getApplication", "getApplication")
  @js.native
  def getApplication(args: GetApplicationArgs): js.Promise[GetApplicationResult] = js.native
  @JSImport("@pulumi/aws/elasticbeanstalk/getApplication", "getApplication")
  @js.native
  def getApplication(args: GetApplicationArgs, opts: InvokeOptions): js.Promise[GetApplicationResult] = js.native
  
  @js.native
  trait GetApplicationArgs extends StObject {
    
    /**
      * The name of the application
      */
    val name: String = js.native
  }
  object GetApplicationArgs {
    
    @scala.inline
    def apply(name: String): GetApplicationArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetApplicationArgs]
    }
    
    @scala.inline
    implicit class GetApplicationArgsMutableBuilder[Self <: GetApplicationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetApplicationResult extends StObject {
    
    val appversionLifecycle: GetApplicationAppversionLifecycle = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the application.
      */
    val arn: String = js.native
    
    /**
      * Short description of the application
      */
    val description: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
  }
  object GetApplicationResult {
    
    @scala.inline
    def apply(
      appversionLifecycle: GetApplicationAppversionLifecycle,
      arn: String,
      description: String,
      id: String,
      name: String
    ): GetApplicationResult = {
      val __obj = js.Dynamic.literal(appversionLifecycle = appversionLifecycle.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetApplicationResult]
    }
    
    @scala.inline
    implicit class GetApplicationResultMutableBuilder[Self <: GetApplicationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppversionLifecycle(value: GetApplicationAppversionLifecycle): Self = StObject.set(x, "appversionLifecycle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
