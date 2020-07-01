package typings.simperium.anon

import typings.simperium.mod.EntityId
import typings.simperium.mod.LocalQueuedChange
import typings.simperium.simperiumStrings.modify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id[T] extends LocalQueuedChange[T] {
  var id: EntityId
  var `object`: T
  var `type`: modify
}

object Id {
  @scala.inline
  def apply[T](id: EntityId, `object`: T, `type`: modify): Id[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id[T]]
  }
}

