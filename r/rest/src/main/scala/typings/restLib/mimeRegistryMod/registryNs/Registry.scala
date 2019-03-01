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
    lookup: js.Function1[java.lang.String, whenLib.WhenNs.Promise[MIMEConverter]],
    register: js.Function2[java.lang.String, MIMEConverter, scala.Unit]
  ): Registry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lookup")(lookup)
    __obj.updateDynamic("register")(register)
    __obj.asInstanceOf[Registry]
  }
}

