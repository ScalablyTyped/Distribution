package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PosRange extends js.Object {
  var pos: RoomPosition
  var range: scala.Double
}

object Anon_PosRange {
  @scala.inline
  def apply(pos: RoomPosition, range: scala.Double): Anon_PosRange = {
    val __obj = js.Dynamic.literal(pos = pos, range = range)
  
    __obj.asInstanceOf[Anon_PosRange]
  }
}

