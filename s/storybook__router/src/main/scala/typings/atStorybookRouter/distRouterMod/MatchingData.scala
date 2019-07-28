package typings.atStorybookRouter.distRouterMod

import typings.atStorybookRouter.Anon_Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchingData extends js.Object {
  var `match`: Null | Anon_Path
}

object MatchingData {
  @scala.inline
  def apply(`match`: Anon_Path = null): MatchingData = {
    val __obj = js.Dynamic.literal()
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[MatchingData]
  }
}

