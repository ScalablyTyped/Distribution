package typings.serverless.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Region extends js.Object {
  var region: js.UndefOr[String] = js.undefined
  var useCache: js.UndefOr[Boolean] = js.undefined
}

object Region {
  @scala.inline
  def apply(region: String = null, useCache: js.UndefOr[Boolean] = js.undefined): Region = {
    val __obj = js.Dynamic.literal()
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
}

