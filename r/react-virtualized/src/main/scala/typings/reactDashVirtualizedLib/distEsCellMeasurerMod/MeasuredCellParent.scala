package typings
package reactDashVirtualizedLib.distEsCellMeasurerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeasuredCellParent extends js.Object {
  var invalidateCellSizeAfterRender: js.UndefOr[js.Function1[/* cell */ CellPosition, scala.Unit]] = js.undefined
  var recomputeGridSize: js.UndefOr[js.Function1[/* cell */ CellPosition, scala.Unit]] = js.undefined
}

