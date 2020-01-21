package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeEventDestroyType extends js.Object {
  var `type`: EventDestroyType
}

object AnonTypeEventDestroyType {
  @scala.inline
  def apply(`type`: EventDestroyType): AnonTypeEventDestroyType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeEventDestroyType]
  }
}

