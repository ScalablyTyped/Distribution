package typings.screeps.anon

import typings.screeps.RoomPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pos extends js.Object {
  var pos: RoomPosition
}

object Pos {
  @scala.inline
  def apply(pos: RoomPosition): Pos = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pos]
  }
}

