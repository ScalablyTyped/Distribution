package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _HasId extends js.Object {
  var id: Id[this.type]
}

object _HasId {
  @scala.inline
  def apply(id: Id[_HasId]): _HasId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_HasId]
  }
}

