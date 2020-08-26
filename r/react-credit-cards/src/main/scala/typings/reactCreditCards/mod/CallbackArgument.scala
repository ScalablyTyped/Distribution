package typings.reactCreditCards.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackArgument extends js.Object {
  var issuer: String = js.native
  var maxLength: Double = js.native
}

object CallbackArgument {
  @scala.inline
  def apply(issuer: String, maxLength: Double): CallbackArgument = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackArgument]
  }
  @scala.inline
  implicit class CallbackArgumentOps[Self <: CallbackArgument] (val x: Self) extends AnyVal {
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
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
  }
  
}

