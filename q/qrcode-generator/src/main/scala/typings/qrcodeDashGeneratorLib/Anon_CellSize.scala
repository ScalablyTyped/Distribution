package typings
package qrcodeDashGeneratorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellSize extends js.Object {
  var cellSize: js.UndefOr[scala.Double] = js.undefined
  var margin: js.UndefOr[scala.Double] = js.undefined
  var scalable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CellSize {
  @scala.inline
  def apply(
    cellSize: scala.Int | scala.Double = null,
    margin: scala.Int | scala.Double = null,
    scalable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CellSize = {
    val __obj = js.Dynamic.literal()
    if (cellSize != null) __obj.updateDynamic("cellSize")(cellSize.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(scalable)) __obj.updateDynamic("scalable")(scalable)
    __obj.asInstanceOf[Anon_CellSize]
  }
}

