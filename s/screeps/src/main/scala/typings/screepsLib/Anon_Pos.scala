package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pos extends js.Object {
  var pos: RoomPosition
}

object Anon_Pos {
  @scala.inline
  def apply(pos: RoomPosition): Anon_Pos = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pos")(pos)
    __obj.asInstanceOf[Anon_Pos]
  }
}

