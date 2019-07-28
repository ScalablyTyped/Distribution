package typings.spex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataDelay extends js.Object {
  var dest: js.UndefOr[js.Function3[/* index */ Double, /* data */ js.Any, /* delay */ Double, _]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var track: js.UndefOr[Boolean] = js.undefined
}

object Anon_DataDelay {
  @scala.inline
  def apply(
    dest: (/* index */ Double, /* data */ js.Any, /* delay */ Double) => _ = null,
    limit: Int | Double = null,
    track: js.UndefOr[Boolean] = js.undefined
  ): Anon_DataDelay = {
    val __obj = js.Dynamic.literal()
    if (dest != null) __obj.updateDynamic("dest")(js.Any.fromFunction3(dest))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(track)) __obj.updateDynamic("track")(track)
    __obj.asInstanceOf[Anon_DataDelay]
  }
}

