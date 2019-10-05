package typings.segmentDashAnalytics.SegmentAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieOptions extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var maxage: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
}

object CookieOptions {
  @scala.inline
  def apply(
    domain: String = null,
    maxage: Int | Double = null,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): CookieOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (maxage != null) __obj.updateDynamic("maxage")(maxage.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[CookieOptions]
  }
}

