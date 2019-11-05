package typings.reactDashRnd.reactDashRndMod

import typings.reactDashRnd.Anon_Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var bounds: Anon_Bottom
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  var original: Position
}

object State {
  @scala.inline
  def apply(
    bounds: Anon_Bottom,
    original: Position,
    maxHeight: Double | String = null,
    maxWidth: Double | String = null
  ): State = {
    val __obj = js.Dynamic.literal(bounds = bounds, original = original)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

