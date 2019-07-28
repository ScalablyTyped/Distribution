package typings.rest.mimeRegistryMod

import typings.when.WhenNs.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registry extends js.Object {
  def lookup(mimeType: String): Promise[MIMEConverter]
  def register(mimeType: String, converter: MIMEConverter): Unit
}

object Registry {
  @scala.inline
  def apply(lookup: String => Promise[MIMEConverter], register: (String, MIMEConverter) => Unit): Registry = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[Registry]
  }
}

