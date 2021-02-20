package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowSelectionModel[T /* <: SlickData */, E] extends SelectionModel[T, E] {
  
  def getSelectedRanges(): js.Array[Double] = js.native
  
  def getSelectedRows(): js.Array[Double] = js.native
  
  def setSelectedRanges(ranges: js.Array[Double]): Unit = js.native
  
  def setSelectedRows(rows: js.Array[Double]): Unit = js.native
}
object RowSelectionModel {
  
  @scala.inline
  def apply[T /* <: SlickData */, E](
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
  implicit class RowSelectionModelMutableBuilder[Self <: RowSelectionModel[_, _], T /* <: SlickData */, E] (val x: Self with (RowSelectionModel[T, E])) extends AnyVal {
    
    @scala.inline
    def setGetSelectedRanges(value: () => js.Array[Double]): Self = StObject.set(x, "getSelectedRanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectedRows(value: () => js.Array[Double]): Self = StObject.set(x, "getSelectedRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSelectedRanges(value: js.Array[Double] => Unit): Self = StObject.set(x, "setSelectedRanges", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSelectedRows(value: js.Array[Double] => Unit): Self = StObject.set(x, "setSelectedRows", js.Any.fromFunction1(value))
  }
}
