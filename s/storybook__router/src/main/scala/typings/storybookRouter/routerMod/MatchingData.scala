package typings.storybookRouter.routerMod

import typings.storybookRouter.AnonPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchingData extends js.Object {
  var `match`: Null | AnonPath
}

object MatchingData {
  @scala.inline
  def apply(`match`: AnonPath = null): MatchingData = {
    val __obj = js.Dynamic.literal()
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchingData]
  }
}

