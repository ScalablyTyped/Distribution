package typings.qrcodeGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCellSize extends js.Object {
  var cellSize: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Double] = js.undefined
  var scalable: js.UndefOr[Boolean] = js.undefined
}

object AnonCellSize {
  @scala.inline
  def apply(
    cellSize: Int | Double = null,
    margin: Int | Double = null,
    scalable: js.UndefOr[Boolean] = js.undefined
  ): AnonCellSize = {
    val __obj = js.Dynamic.literal()
    if (cellSize != null) __obj.updateDynamic("cellSize")(cellSize.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(scalable)) __obj.updateDynamic("scalable")(scalable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCellSize]
  }
}

