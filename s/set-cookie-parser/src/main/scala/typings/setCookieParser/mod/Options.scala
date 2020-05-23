package typings.setCookieParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var decodeValues: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(decodeValues: js.UndefOr[Boolean] = js.undefined, map: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeValues)) __obj.updateDynamic("decodeValues")(decodeValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(map)) __obj.updateDynamic("map")(map.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

