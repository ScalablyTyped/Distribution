package typings.screeps.anon

import typings.screeps.RoomPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var pos: RoomPosition
  var range: Double
}

object Range {
  @scala.inline
  def apply(pos: RoomPosition, range: Double): Range = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

