package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateHibernationOptions extends StObject {
  
  /**
    * If set to `true`, the launched EC2 instance will hibernation enabled.
    */
  var configured: Boolean
}
object LaunchTemplateHibernationOptions {
  
  inline def apply(configured: Boolean): LaunchTemplateHibernationOptions = {
    val __obj = js.Dynamic.literal(configured = configured.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateHibernationOptions]
  }
  
  extension [Self <: LaunchTemplateHibernationOptions](x: Self) {
    
    inline def setConfigured(value: Boolean): Self = StObject.set(x, "configured", value.asInstanceOf[js.Any])
  }
}
