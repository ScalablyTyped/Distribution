package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RoomShard extends js.Object {
  var room: java.lang.String
  var shard: java.lang.String
}

object Anon_RoomShard {
  @scala.inline
  def apply(room: java.lang.String, shard: java.lang.String): Anon_RoomShard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("room")(room)
    __obj.updateDynamic("shard")(shard)
    __obj.asInstanceOf[Anon_RoomShard]
  }
}

