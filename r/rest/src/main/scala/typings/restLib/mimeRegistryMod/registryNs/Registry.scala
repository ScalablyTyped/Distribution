package typings
package restLib.mimeRegistryMod.registryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registry extends js.Object {
  def lookup(mimeType: java.lang.String): whenLib.WhenNs.Promise[MIMEConverter]
  def register(mimeType: java.lang.String, converter: MIMEConverter): scala.Unit
}

object Registry {
  @scala.inline
  def apply(
    lookup: java.lang.String => whenLib.WhenNs.Promise[MIMEConverter],
    register: (java.lang.String, MIMEConverter) => scala.Unit
  ): Registry = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[Registry]
  }
}

