package typings.qrcodeGenerator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSize extends js.Object {
  var cellSize: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var scalable: js.UndefOr[Boolean] = js.undefined
}

object CellSize {
  @scala.inline
  def apply(
    cellSize: js.UndefOr[Double] = js.undefined,
    margin: js.UndefOr[Double] = js.undefined,
    scalable: js.UndefOr[Boolean] = js.undefined
  ): CellSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cellSize)) __obj.updateDynamic("cellSize")(cellSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scalable)) __obj.updateDynamic("scalable")(scalable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellSize]
  }
}

