package typings.rcFieldForm.formContextMod

import typings.rcFieldForm.interfaceMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormFinishInfo extends js.Object {
  var forms: Forms
  var values: Store
}

object FormFinishInfo {
  @scala.inline
  def apply(forms: Forms, values: Store): FormFinishInfo = {
    val __obj = js.Dynamic.literal(forms = forms.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FormFinishInfo]
  }
}

