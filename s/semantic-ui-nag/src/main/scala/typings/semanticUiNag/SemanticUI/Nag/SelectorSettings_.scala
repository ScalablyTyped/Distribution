package typings.semanticUiNag.SemanticUI.Nag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined semantic-ui-nag.SemanticUI.Nag.SelectorSettings.Param */
@js.native
trait SelectorSettings_ extends js.Object {
  var close: String with js.UndefOr[String] = js.native
}

object SelectorSettings_ {
  @scala.inline
  def apply(close: String with js.UndefOr[String]): SelectorSettings_ = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
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
    def setClose(value: String with js.UndefOr[String]): Self = this.set("close", value.asInstanceOf[js.Any])
  }
  
}

