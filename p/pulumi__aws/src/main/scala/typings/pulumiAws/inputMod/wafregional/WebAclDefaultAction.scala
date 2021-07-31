package typings.pulumiAws.inputMod.wafregional

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclDefaultAction extends StObject {
  
  /**
    * Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. e.g. `ALLOW`, `BLOCK` or `COUNT`
    */
  var `type`: Input[String]
}
object WebAclDefaultAction {
  
  @scala.inline
  def apply(`type`: Input[String]): WebAclDefaultAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclDefaultAction]
  }
  
  @scala.inline
  implicit class WebAclDefaultActionMutableBuilder[Self <: WebAclDefaultAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
