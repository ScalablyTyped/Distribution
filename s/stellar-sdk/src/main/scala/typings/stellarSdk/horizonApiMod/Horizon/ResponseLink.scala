package typings.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseLink extends js.Object {
  var href: String
  var templated: js.UndefOr[Boolean] = js.undefined
}

object ResponseLink {
  @scala.inline
  def apply(href: String, templated: js.UndefOr[Boolean] = js.undefined): ResponseLink = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (!js.isUndefined(templated)) __obj.updateDynamic("templated")(templated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseLink]
  }
}

