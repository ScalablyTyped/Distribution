package typings.rollupPluginutils

import typings.rollupPluginutils.rollupPluginutilsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalse extends js.Object {
  var resolve: js.UndefOr[String | `false` | Null] = js.undefined
}

object AnonFalse {
  @scala.inline
  def apply(resolve: String | `false` = null): AnonFalse = {
    val __obj = js.Dynamic.literal()
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalse]
  }
}

