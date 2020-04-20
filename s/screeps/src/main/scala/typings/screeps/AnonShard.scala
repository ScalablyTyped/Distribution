package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShard extends js.Object {
  var room: String
  var shard: String
}

object AnonShard {
  @scala.inline
  def apply(room: String, shard: String): AnonShard = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], shard = shard.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShard]
  }
}

