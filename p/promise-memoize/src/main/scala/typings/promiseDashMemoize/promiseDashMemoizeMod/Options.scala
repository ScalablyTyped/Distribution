package typings.promiseDashMemoize.promiseDashMemoizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var maxAge: js.UndefOr[Double] = js.undefined
  var maxErrorAge: js.UndefOr[Double] = js.undefined
  var resolve: js.UndefOr[KeyResolver] = js.undefined
}

object Options {
  @scala.inline
  def apply(maxAge: Int | Double = null, maxErrorAge: Int | Double = null, resolve: KeyResolver = null): Options = {
    val __obj = js.Dynamic.literal()
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (maxErrorAge != null) __obj.updateDynamic("maxErrorAge")(maxErrorAge.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

