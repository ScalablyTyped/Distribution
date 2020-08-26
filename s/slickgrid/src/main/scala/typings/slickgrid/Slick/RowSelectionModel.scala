package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowSelectionModel[T /* <: SlickData */, E] extends SelectionModel[T, E] {
  def getSelectedRanges(): js.Array[Double] = js.native
  def getSelectedRows(): js.Array[Double] = js.native
  def setSelectedRanges(ranges: js.Array[Double]): Unit = js.native
  def setSelectedRows(rows: js.Array[Double]): Unit = js.native
}

object RowSelectionModel {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T, E](
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
  @scala.inline
  implicit class RowSelectionModelOps[Self <: RowSelectionModel[_, _], /* <: typings.slickgrid.Slick.SlickData */ T, E] (val x: Self with (RowSelectionModel[T, E])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetSelectedRanges(value: () => js.Array[Double]): Self = this.set("getSelectedRanges", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSelectedRows(value: () => js.Array[Double]): Self = this.set("getSelectedRows", js.Any.fromFunction0(value))
    @scala.inline
    def setSetSelectedRanges(value: js.Array[Double] => Unit): Self = this.set("setSelectedRanges", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSelectedRows(value: js.Array[Double] => Unit): Self = this.set("setSelectedRows", js.Any.fromFunction1(value))
  }
  
}

