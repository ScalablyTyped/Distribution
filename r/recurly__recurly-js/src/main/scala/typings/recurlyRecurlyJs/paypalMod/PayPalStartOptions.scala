package typings.recurlyRecurlyJs.paypalMod

import typings.recurlyRecurlyJs.anon.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PayPalStartOptions extends js.Object {
  var options: Description = js.native
}

object PayPalStartOptions {
  @scala.inline
  def apply(options: Description): PayPalStartOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayPalStartOptions]
  }
  @scala.inline
  implicit class PayPalStartOptionsOps[Self <: PayPalStartOptions] (val x: Self) extends AnyVal {
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
    def setOptions(value: Description): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

