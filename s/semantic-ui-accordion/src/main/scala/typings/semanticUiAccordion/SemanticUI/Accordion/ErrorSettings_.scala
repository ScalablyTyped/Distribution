package typings.semanticUiAccordion.SemanticUI.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined semantic-ui-accordion.SemanticUI.Accordion.ErrorSettings.Param */
@js.native
trait ErrorSettings_ extends js.Object {
  
  var method: String with js.UndefOr[String] = js.native
}
object ErrorSettings_ {
  
  @scala.inline
  def apply(method: String with js.UndefOr[String]): ErrorSettings_ = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorSettings_]
  }
  
  @scala.inline
  implicit class ErrorSettings_Ops[Self <: ErrorSettings_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMethod(value: String with js.UndefOr[String]): Self = this.set("method", value.asInstanceOf[js.Any])
  }
}
