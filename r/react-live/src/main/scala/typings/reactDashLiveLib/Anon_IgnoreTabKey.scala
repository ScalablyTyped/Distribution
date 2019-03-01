package typings
package reactDashLiveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnoreTabKey extends js.Object {
  var ignoreTabKey: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IgnoreTabKey {
  @scala.inline
  def apply(ignoreTabKey: js.UndefOr[scala.Boolean] = js.undefined): Anon_IgnoreTabKey = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreTabKey)) __obj.updateDynamic("ignoreTabKey")(ignoreTabKey)
    __obj.asInstanceOf[Anon_IgnoreTabKey]
  }
}

