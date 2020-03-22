package typings.rollupPluginutils

import typings.rollupPluginutils.rollupPluginutilsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResolve extends js.Object {
  var resolve: js.UndefOr[String | `false` | Null] = js.undefined
}

object AnonResolve {
  @scala.inline
  def apply(resolve: String | `false` = null): AnonResolve = {
    val __obj = js.Dynamic.literal()
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResolve]
  }
}

