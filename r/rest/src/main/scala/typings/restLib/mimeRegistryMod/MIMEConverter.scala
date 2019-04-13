package typings
package restLib.mimeRegistryMod

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
    read: java.lang.String => js.Any | whenLib.WhenNs.Promise[_],
    write: js.Any => java.lang.String | whenLib.WhenNs.Promise[java.lang.String]
  ): MIMEConverter = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[MIMEConverter]
  }
}

