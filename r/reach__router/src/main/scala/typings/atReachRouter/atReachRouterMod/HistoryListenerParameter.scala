package typings.atReachRouter.atReachRouterMod

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
    val __obj = js.Dynamic.literal(action = action, location = location)
  
    __obj.asInstanceOf[HistoryListenerParameter]
  }
}

