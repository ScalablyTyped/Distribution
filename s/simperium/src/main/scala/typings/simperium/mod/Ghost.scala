package typings.simperium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ghost[T] extends js.Object {
  var data: T
  var key: EntityId
  var version: Double
}

object Ghost {
  @scala.inline
  def apply[T](data: T, key: EntityId, version: Double): Ghost[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ghost[T]]
  }
}

