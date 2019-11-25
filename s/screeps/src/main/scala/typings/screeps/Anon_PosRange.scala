package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PosRange extends js.Object {
  var pos: RoomPosition
  var range: Double
}

object Anon_PosRange {
  @scala.inline
  def apply(pos: RoomPosition, range: Double): Anon_PosRange = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PosRange]
  }
}

