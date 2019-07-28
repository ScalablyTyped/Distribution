package typings.reactDashRouter.reactDashRouterMod

import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterProps extends js.Object {
  var history: History[LocationState]
}

object RouterProps {
  @scala.inline
  def apply(history: History[LocationState]): RouterProps = {
    val __obj = js.Dynamic.literal(history = history)
  
    __obj.asInstanceOf[RouterProps]
  }
}

