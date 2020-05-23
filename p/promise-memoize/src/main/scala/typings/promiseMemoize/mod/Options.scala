package typings.promiseMemoize.mod

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
  def apply(
    maxAge: js.UndefOr[Double] = js.undefined,
    maxErrorAge: js.UndefOr[Double] = js.undefined,
    resolve: KeyResolver = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxErrorAge)) __obj.updateDynamic("maxErrorAge")(maxErrorAge.get.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

