package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasId extends js.Object {
  var id: Id[this.type]
}

object HasId {
  @scala.inline
  def apply(id: Id[HasId]): HasId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HasId]
  }
}

