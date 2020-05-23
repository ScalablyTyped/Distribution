package typings.reachRouter.mod

import typings.history.mod.LocationState
import typings.reachRouter.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchRenderProps[TParams] extends js.Object {
  var location: WindowLocation[LocationState]
  var `match`: Null | (Path with TParams)
  var navigate: NavigateFn
}

object MatchRenderProps {
  @scala.inline
  def apply[TParams](location: WindowLocation[LocationState], navigate: NavigateFn, `match`: Path with TParams = null): MatchRenderProps[TParams] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchRenderProps[TParams]]
  }
}

