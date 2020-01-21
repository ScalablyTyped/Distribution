package typings.rest.registryMod

import typings.when.When.Promise_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registry extends js.Object {
  def lookup(mimeType: String): Promise_[MIMEConverter]
  def register(mimeType: String, converter: MIMEConverter): Unit
}

object Registry {
  @scala.inline
  def apply(lookup: String => Promise_[MIMEConverter], register: (String, MIMEConverter) => Unit): Registry = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[Registry]
  }
}

