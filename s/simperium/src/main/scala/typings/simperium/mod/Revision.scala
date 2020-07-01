package typings.simperium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Revision[T] extends js.Object {
  var data: T
  var id: EntityId
  var version: Double
}

object Revision {
  @scala.inline
  def apply[T](data: T, id: EntityId, version: Double): Revision[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision[T]]
  }
}

