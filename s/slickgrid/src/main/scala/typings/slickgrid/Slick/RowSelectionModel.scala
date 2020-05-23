package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowSelectionModel[T /* <: SlickData */, E] extends SelectionModel[T, E] {
  def getSelectedRanges(): js.Array[Double]
  def getSelectedRows(): js.Array[Double]
  def setSelectedRanges(ranges: js.Array[Double]): Unit
  def setSelectedRows(rows: js.Array[Double]): Unit
}

object RowSelectionModel {
  @scala.inline
  def apply[T, E](
    destroy: () => Unit,
    getSelectedRanges: () => js.Array[Double],
    getSelectedRows: () => js.Array[Double],
    init: Grid[T] => Unit,
    onSelectedRangesChanged: Event[E],
    setSelectedRanges: js.Array[Double] => Unit,
    setSelectedRows: js.Array[Double] => Unit
  ): RowSelectionModel[T, E] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getSelectedRanges = js.Any.fromFunction0(getSelectedRanges), getSelectedRows = js.Any.fromFunction0(getSelectedRows), init = js.Any.fromFunction1(init), onSelectedRangesChanged = onSelectedRangesChanged.asInstanceOf[js.Any], setSelectedRanges = js.Any.fromFunction1(setSelectedRanges), setSelectedRows = js.Any.fromFunction1(setSelectedRows))
    __obj.asInstanceOf[RowSelectionModel[T, E]]
  }
}

