package typings.reactRouterRedux.mod

import typings.history.mod.Location
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterState extends js.Object {
  var location: Location[LocationState] | Null
}

object RouterState {
  @scala.inline
  def apply(location: Location[LocationState] = null): RouterState = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterState]
  }
}

