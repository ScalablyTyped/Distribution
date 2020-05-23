package typings.rollupPluginutils.anon

import typings.rollupPluginutils.rollupPluginutilsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolve extends js.Object {
  var resolve: js.UndefOr[String | `false` | Null] = js.undefined
}

object Resolve {
  @scala.inline
  def apply(resolve: js.UndefOr[Null | String | `false`] = js.undefined): Resolve = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resolve)) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolve]
  }
}

