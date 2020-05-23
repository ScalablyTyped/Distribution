package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResponseStats extends js.Object {
  // query time in milliseconds
  var elapsed_time_ms: js.UndefOr[Double] = js.undefined
  // rows scanned as part of query execution
  var rows_scanned: js.UndefOr[Double] = js.undefined
}

object QueryResponseStats {
  @scala.inline
  def apply(
    elapsed_time_ms: js.UndefOr[Double] = js.undefined,
    rows_scanned: js.UndefOr[Double] = js.undefined
  ): QueryResponseStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(elapsed_time_ms)) __obj.updateDynamic("elapsed_time_ms")(elapsed_time_ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rows_scanned)) __obj.updateDynamic("rows_scanned")(rows_scanned.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResponseStats]
  }
}

