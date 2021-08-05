package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateHibernationOptions extends StObject {
  
  /**
    * If set to `true`, the launched EC2 instance will hibernation enabled.
    */
  var configured: Input[Boolean]
}
object LaunchTemplateHibernationOptions {
  
  inline def apply(configured: Input[Boolean]): LaunchTemplateHibernationOptions = {
    val __obj = js.Dynamic.literal(configured = configured.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateHibernationOptions]
  }
  
  extension [Self <: LaunchTemplateHibernationOptions](x: Self) {
    
    inline def setConfigured(value: Input[Boolean]): Self = StObject.set(x, "configured", value.asInstanceOf[js.Any])
  }
}
