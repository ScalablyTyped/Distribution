package typings.rockset.rocksetMod

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
  def apply(elapsed_time_ms: Int | Double = null, rows_scanned: Int | Double = null): QueryResponseStats = {
    val __obj = js.Dynamic.literal()
    if (elapsed_time_ms != null) __obj.updateDynamic("elapsed_time_ms")(elapsed_time_ms.asInstanceOf[js.Any])
    if (rows_scanned != null) __obj.updateDynamic("rows_scanned")(rows_scanned.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResponseStats]
  }
}

