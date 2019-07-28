package typings.serveDashFavicon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxAge extends js.Object {
  /**
    * The cache-control max-age directive in ms, defaulting to 1 day. This can also be a string accepted by the ms module.
    */
  var maxAge: js.UndefOr[Double] = js.undefined
}

object Anon_MaxAge {
  @scala.inline
  def apply(maxAge: Int | Double = null): Anon_MaxAge = {
    val __obj = js.Dynamic.literal()
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxAge]
  }
}

