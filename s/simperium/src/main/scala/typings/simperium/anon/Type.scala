package typings.simperium.anon

import typings.simperium.mod.EntityId
import typings.simperium.mod.LocalQueuedChange
import typings.simperium.simperiumStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type
  extends LocalQueuedChange[js.Any] {
  var id: EntityId
  var `type`: remove
}

object Type {
  @scala.inline
  def apply(id: EntityId, `type`: remove): Type = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

