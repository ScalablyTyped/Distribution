package typings.screeps.anon

import typings.screeps.EventDestroyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeEventDestroyType extends js.Object {
  var `type`: EventDestroyType
}

object TypeEventDestroyType {
  @scala.inline
  def apply(`type`: EventDestroyType): TypeEventDestroyType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeEventDestroyType]
  }
}

