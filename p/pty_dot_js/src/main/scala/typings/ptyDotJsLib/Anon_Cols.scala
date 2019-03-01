package typings
package ptyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cols extends js.Object {
  var cols: js.UndefOr[scala.Double] = js.undefined
  var rows: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Cols {
  @scala.inline
  def apply(cols: scala.Int | scala.Double = null, rows: scala.Int | scala.Double = null): Anon_Cols = {
    val __obj = js.Dynamic.literal()
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cols]
  }
}

