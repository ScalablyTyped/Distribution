package typings
package restLib.mimeRegistryMod.registryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MIMEConverter extends js.Object {
  def read(value: java.lang.String): js.Any | whenLib.WhenNs.Promise[_]
  def write(value: js.Any): java.lang.String | whenLib.WhenNs.Promise[java.lang.String]
}

