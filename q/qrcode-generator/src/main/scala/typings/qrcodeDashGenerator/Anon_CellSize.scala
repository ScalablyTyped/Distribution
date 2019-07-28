package typings.qrcodeDashGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellSize extends js.Object {
  var cellSize: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var scalable: js.UndefOr[Boolean] = js.undefined
}

object Anon_CellSize {
  @scala.inline
  def apply(
    cellSize: Int | Double = null,
    margin: Int | Double = null,
    scalable: js.UndefOr[Boolean] = js.undefined
  ): Anon_CellSize = {
    val __obj = js.Dynamic.literal()
    if (cellSize != null) __obj.updateDynamic("cellSize")(cellSize.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(scalable)) __obj.updateDynamic("scalable")(scalable)
    __obj.asInstanceOf[Anon_CellSize]
  }
}

