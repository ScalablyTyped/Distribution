package typings.semanticUiForm.SemanticUI.Form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined semantic-ui-form.SemanticUI.Form.MetadataSettings.Param */
@js.native
trait MetadataSettings_ extends js.Object {
  
  var validate: String with js.UndefOr[String] = js.native
}
object MetadataSettings_ {
  
  @scala.inline
  def apply(validate: String with js.UndefOr[String]): MetadataSettings_ = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataSettings_]
  }
  
  @scala.inline
  implicit class MetadataSettings_Ops[Self <: MetadataSettings_] (val x: Self) extends AnyVal {
    
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
    def setValidate(value: String with js.UndefOr[String]): Self = this.set("validate", value.asInstanceOf[js.Any])
  }
}
