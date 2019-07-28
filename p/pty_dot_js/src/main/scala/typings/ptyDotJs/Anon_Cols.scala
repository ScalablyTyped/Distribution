package typings.ptyDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cols extends js.Object {
  var cols: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
}

object Anon_Cols {
  @scala.inline
  def apply(cols: Int | Double = null, rows: Int | Double = null): Anon_Cols = {
    val __obj = js.Dynamic.literal()
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cols]
  }
}

