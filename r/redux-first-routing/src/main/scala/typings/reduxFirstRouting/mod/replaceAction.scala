package typings.reduxFirstRouting.mod

import typings.history.mod.LocationDescriptorObject
import typings.history.mod.LocationState
import typings.history.mod.Path
import typings.redux.mod.Action
import typings.reduxFirstRouting.reduxFirstRoutingStrings.ROUTERSlashREPLACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait replaceAction[T /* <: Path | LocationDescriptorObject[LocationState] */] extends Action[ROUTERSlashREPLACE] {
  var payload: T
}

object replaceAction {
  @scala.inline
  def apply[T](payload: T, `type`: ROUTERSlashREPLACE): replaceAction[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[replaceAction[T]]
  }
}

