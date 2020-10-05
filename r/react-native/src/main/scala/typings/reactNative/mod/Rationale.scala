package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rationale extends js.Object {
  var buttonNegative: js.UndefOr[String] = js.native
  var buttonNeutral: js.UndefOr[String] = js.native
  var buttonPositive: String = js.native
  var message: String = js.native
  var title: String = js.native
}

object Rationale {
  @scala.inline
  def apply(buttonPositive: String, message: String, title: String): Rationale = {
    val __obj = js.Dynamic.literal(buttonPositive = buttonPositive.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rationale]
  }
  @scala.inline
  implicit class RationaleOps[Self <: Rationale] (val x: Self) extends AnyVal {
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
    def setButtonPositive(value: String): Self = this.set("buttonPositive", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonNegative(value: String): Self = this.set("buttonNegative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonNegative: Self = this.set("buttonNegative", js.undefined)
    @scala.inline
    def setButtonNeutral(value: String): Self = this.set("buttonNeutral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonNeutral: Self = this.set("buttonNeutral", js.undefined)
  }
  
}

