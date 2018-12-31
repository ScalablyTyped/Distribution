package typings
package restLib.mimeRegistryMod.registryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registry extends js.Object {
  def lookup(mimeType: java.lang.String): whenLib.WhenNs.Promise[MIMEConverter]
  def register(mimeType: java.lang.String, converter: MIMEConverter): scala.Unit
}

