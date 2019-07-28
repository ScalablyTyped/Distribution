package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RoomShard extends js.Object {
  var room: String
  var shard: String
}

object Anon_RoomShard {
  @scala.inline
  def apply(room: String, shard: String): Anon_RoomShard = {
    val __obj = js.Dynamic.literal(room = room, shard = shard)
  
    __obj.asInstanceOf[Anon_RoomShard]
  }
}

