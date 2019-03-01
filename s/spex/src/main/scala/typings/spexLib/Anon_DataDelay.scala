package typings
package spexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataDelay extends js.Object {
  var dest: js.UndefOr[
    js.Function3[/* index */ scala.Double, /* data */ js.Any, /* delay */ scala.Double, _]
  ] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var track: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DataDelay {
  @scala.inline
  def apply(
    dest: js.Function3[/* index */ scala.Double, /* data */ js.Any, /* delay */ scala.Double, _] = null,
    limit: scala.Int | scala.Double = null,
    track: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DataDelay = {
    val __obj = js.Dynamic.literal()
    if (dest != null) __obj.updateDynamic("dest")(dest)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(track)) __obj.updateDynamic("track")(track)
    __obj.asInstanceOf[Anon_DataDelay]
  }
}

