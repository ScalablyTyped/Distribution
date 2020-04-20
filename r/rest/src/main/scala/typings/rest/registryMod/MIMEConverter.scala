package typings.rest.registryMod

import typings.when.When.Promise_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MIMEConverter extends js.Object {
  def read(value: String): js.Any | Promise_[_]
  def write(value: js.Any): String | Promise_[String]
}

object MIMEConverter {
  @scala.inline
  def apply(read: String => js.Any | Promise_[_], write: js.Any => String | Promise_[String]): MIMEConverter = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[MIMEConverter]
  }
}

