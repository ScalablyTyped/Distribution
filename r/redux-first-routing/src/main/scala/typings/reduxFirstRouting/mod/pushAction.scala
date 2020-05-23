package typings.reduxFirstRouting.mod

import typings.history.mod.LocationDescriptorObject
import typings.history.mod.LocationState
import typings.history.mod.Path
import typings.redux.mod.Action
import typings.reduxFirstRouting.reduxFirstRoutingStrings.ROUTERSlashPUSH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pushAction[T /* <: Path | LocationDescriptorObject[LocationState] */] extends Action[ROUTERSlashPUSH] {
  var payload: T
}

object pushAction {
  @scala.inline
  def apply[T](payload: T, `type`: ROUTERSlashPUSH): pushAction[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[pushAction[T]]
  }
}

