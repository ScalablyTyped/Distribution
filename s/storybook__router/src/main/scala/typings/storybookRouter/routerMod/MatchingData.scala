package typings.storybookRouter.routerMod

import typings.storybookRouter.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchingData extends js.Object {
  var `match`: Null | Path
}

object MatchingData {
  @scala.inline
  def apply(`match`: Path = null): MatchingData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchingData]
  }
}

