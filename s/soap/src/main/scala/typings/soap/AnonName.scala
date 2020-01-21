package typings.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName[T] extends js.Object {
  var name: T
  var prefix: String
}

object AnonName {
  @scala.inline
  def apply[T](name: T, prefix: String): AnonName[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName[T]]
  }
}

