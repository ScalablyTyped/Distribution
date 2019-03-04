package typings
package restLib.mimeRegistryMod.registryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MIMEConverter extends js.Object {
  def read(value: java.lang.String): js.Any | whenLib.WhenNs.Promise[_]
  def write(value: js.Any): java.lang.String | whenLib.WhenNs.Promise[java.lang.String]
}

object MIMEConverter {
  @scala.inline
  def apply(
    read: js.Function1[java.lang.String, js.Any | whenLib.WhenNs.Promise[_]],
    write: js.Function1[js.Any, java.lang.String | whenLib.WhenNs.Promise[java.lang.String]]
  ): MIMEConverter = {
    val __obj = js.Dynamic.literal(read = read, write = write)
  
    __obj.asInstanceOf[MIMEConverter]
  }
}

