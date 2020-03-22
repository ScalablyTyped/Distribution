package typings.serverless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRegion extends js.Object {
  var region: js.UndefOr[String] = js.undefined
  var useCache: js.UndefOr[Boolean] = js.undefined
}

object AnonRegion {
  @scala.inline
  def apply(region: String = null, useCache: js.UndefOr[Boolean] = js.undefined): AnonRegion = {
    val __obj = js.Dynamic.literal()
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRegion]
  }
}

