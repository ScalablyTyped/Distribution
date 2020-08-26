package typings.semanticUiPopup.SemanticUI.Popup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-popup.SemanticUI.Popup.SelectorSettings.Param */
@js.native
trait SelectorSettings_ extends js.Object {
  var popup: String with js.UndefOr[String] = js.native
}

object SelectorSettings_ {
  @scala.inline
  def apply(popup: String with js.UndefOr[String]): SelectorSettings_ = {
    val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorSettings_]
  }
  @scala.inline
  implicit class SelectorSettings_Ops[Self <: SelectorSettings_] (val x: Self) extends AnyVal {
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
    def setPopup(value: String with js.UndefOr[String]): Self = this.set("popup", value.asInstanceOf[js.Any])
  }
  
}

