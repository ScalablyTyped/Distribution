package typings
package atStorybookRouterLib.distRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchingData extends js.Object {
  var `match`: scala.Null | atStorybookRouterLib.Anon_Path
}

object MatchingData {
  @scala.inline
  def apply(`match`: atStorybookRouterLib.Anon_Path = null): MatchingData = {
    val __obj = js.Dynamic.literal()
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[MatchingData]
  }
}

