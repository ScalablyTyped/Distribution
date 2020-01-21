package typings.reachRouter.mod

import typings.reachRouter.AnonPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchRenderProps[TParams] extends js.Object {
  var location: WindowLocation
  var `match`: Null | (AnonPath with TParams)
  var navigate: NavigateFn
}

object MatchRenderProps {
  @scala.inline
  def apply[TParams](location: WindowLocation, navigate: NavigateFn, `match`: AnonPath with TParams = null): MatchRenderProps[TParams] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchRenderProps[TParams]]
  }
}

