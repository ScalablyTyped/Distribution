package typings
package atReachRouterLib.atReachRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchRenderProps[TParams] extends js.Object {
  var location: WindowLocation
  var `match`: (scala.Null | atReachRouterLib.Anon_Path) with TParams
  var navigate: NavigateFn
}

object MatchRenderProps {
  @scala.inline
  def apply[TParams](
    location: WindowLocation,
    `match`: (scala.Null | atReachRouterLib.Anon_Path) with TParams,
    navigate: NavigateFn
  ): MatchRenderProps[TParams] = {
    val __obj = js.Dynamic.literal(location = location, navigate = navigate)
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchRenderProps[TParams]]
  }
}

