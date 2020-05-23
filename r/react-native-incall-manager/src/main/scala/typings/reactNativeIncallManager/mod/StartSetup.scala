package typings.reactNativeIncallManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSetup extends js.Object {
  var auto: js.UndefOr[Boolean] = js.undefined
  var media: js.UndefOr[String] = js.undefined
  var ringback: js.UndefOr[String] = js.undefined
}

object StartSetup {
  @scala.inline
  def apply(auto: js.UndefOr[Boolean] = js.undefined, media: String = null, ringback: String = null): StartSetup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto.get.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (ringback != null) __obj.updateDynamic("ringback")(ringback.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSetup]
  }
}

