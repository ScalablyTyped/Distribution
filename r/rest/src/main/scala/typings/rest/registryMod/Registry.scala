package typings.rest.registryMod

import typings.when.When.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Registry extends js.Object {
  def lookup(mimeType: String): Promise[MIMEConverter] = js.native
  def register(mimeType: String, converter: MIMEConverter): Unit = js.native
}

object Registry {
  @scala.inline
  def apply(lookup: String => Promise[MIMEConverter], register: (String, MIMEConverter) => Unit): Registry = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[Registry]
  }
  @scala.inline
  implicit class RegistryOps[Self <: Registry] (val x: Self) extends AnyVal {
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
    def setLookup(value: String => Promise[MIMEConverter]): Self = this.set("lookup", js.Any.fromFunction1(value))
    @scala.inline
    def setRegister(value: (String, MIMEConverter) => Unit): Self = this.set("register", js.Any.fromFunction2(value))
  }
  
}

