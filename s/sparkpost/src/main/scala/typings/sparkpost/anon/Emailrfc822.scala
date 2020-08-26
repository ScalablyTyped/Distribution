package typings.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emailrfc822 extends js.Object {
  var email_rfc822: String = js.native
}

object Emailrfc822 {
  @scala.inline
  def apply(email_rfc822: String): Emailrfc822 = {
    val __obj = js.Dynamic.literal(email_rfc822 = email_rfc822.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emailrfc822]
  }
  @scala.inline
  implicit class Emailrfc822Ops[Self <: Emailrfc822] (val x: Self) extends AnyVal {
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
    def setEmail_rfc822(value: String): Self = this.set("email_rfc822", value.asInstanceOf[js.Any])
  }
  
}

