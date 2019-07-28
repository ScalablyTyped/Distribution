package typings.rest.mimeRegistryMod

import typings.when.WhenNs.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MIMEConverter extends js.Object {
  def read(value: String): js.Any | Promise[_]
  def write(value: js.Any): String | Promise[String]
}

object MIMEConverter {
  @scala.inline
  def apply(read: String => js.Any | Promise[_], write: js.Any => String | Promise[String]): MIMEConverter = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[MIMEConverter]
  }
}

