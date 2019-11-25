package typings.receptacle.receptacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Items[T] extends js.Object {
  var key: String
  var value: T
}

object Items {
  @scala.inline
  def apply[T](key: String, value: T): Items[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Items[T]]
  }
}

