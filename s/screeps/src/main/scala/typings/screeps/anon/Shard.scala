package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shard extends js.Object {
  var room: String
  var shard: String
}

object Shard {
  @scala.inline
  def apply(room: String, shard: String): Shard = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], shard = shard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shard]
  }
}

