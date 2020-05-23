package typings.soap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name[T] extends js.Object {
  var name: T
  var prefix: String
}

object Name {
  @scala.inline
  def apply[T](name: T, prefix: String): Name[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name[T]]
  }
}

