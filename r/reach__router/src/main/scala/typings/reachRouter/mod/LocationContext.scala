package typings.reachRouter.mod

import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationContext extends js.Object {
  var location: WindowLocation[LocationState]
  var navigate: NavigateFn
}

object LocationContext {
  @scala.inline
  def apply(location: WindowLocation[LocationState], navigate: NavigateFn): LocationContext = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationContext]
  }
}

