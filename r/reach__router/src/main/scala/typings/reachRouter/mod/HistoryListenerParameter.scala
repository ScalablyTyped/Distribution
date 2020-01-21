package typings.reachRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryListenerParameter extends js.Object {
  var action: HistoryActionType
  var location: HistoryLocation
}

object HistoryListenerParameter {
  @scala.inline
  def apply(action: HistoryActionType, location: HistoryLocation): HistoryListenerParameter = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HistoryListenerParameter]
  }
}

