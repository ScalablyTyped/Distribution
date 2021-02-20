package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateHibernationOptions extends StObject {
  
  /**
    * If set to `true`, the launched EC2 instance will hibernation enabled.
    */
  var configured: Input[Boolean] = js.native
}
object LaunchTemplateHibernationOptions {
  
  @scala.inline
  def apply(configured: Input[Boolean]): LaunchTemplateHibernationOptions = {
    val __obj = js.Dynamic.literal(configured = configured.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateHibernationOptions]
  }
  
  @scala.inline
  implicit class LaunchTemplateHibernationOptionsMutableBuilder[Self <: LaunchTemplateHibernationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigured(value: Input[Boolean]): Self = StObject.set(x, "configured", value.asInstanceOf[js.Any])
  }
}
