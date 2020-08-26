package typings.recurlyRecurlyJs.paypalMod

import typings.recurlyRecurlyJs.anon.DisplayName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectConfig extends PayPalConfig {
  var display: js.UndefOr[DisplayName] = js.native
}

object DirectConfig {
  @scala.inline
  def apply(): DirectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectConfig]
  }
  @scala.inline
  implicit class DirectConfigOps[Self <: DirectConfig] (val x: Self) extends AnyVal {
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
    def setDisplay(value: DisplayName): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
  }
  
}

