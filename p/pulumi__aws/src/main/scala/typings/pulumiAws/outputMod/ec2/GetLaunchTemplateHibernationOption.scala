package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchTemplateHibernationOption extends StObject {
  
  var configured: Boolean
}
object GetLaunchTemplateHibernationOption {
  
  inline def apply(configured: Boolean): GetLaunchTemplateHibernationOption = {
    val __obj = js.Dynamic.literal(configured = configured.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateHibernationOption]
  }
  
  extension [Self <: GetLaunchTemplateHibernationOption](x: Self) {
    
    inline def setConfigured(value: Boolean): Self = StObject.set(x, "configured", value.asInstanceOf[js.Any])
  }
}
