package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionOptions extends js.Object {
  var position: js.UndefOr[Double] = js.undefined
}

object PositionOptions {
  @scala.inline
  def apply(position: js.UndefOr[Double] = js.undefined): PositionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionOptions]
  }
}

