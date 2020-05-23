package typings.serveFavicon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxAge extends js.Object {
  /**
    * The cache-control max-age directive in ms, defaulting to 1 day. This can also be a string accepted by the ms module.
    */
  var maxAge: js.UndefOr[Double] = js.undefined
}

object MaxAge {
  @scala.inline
  def apply(maxAge: js.UndefOr[Double] = js.undefined): MaxAge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAge]
  }
}

