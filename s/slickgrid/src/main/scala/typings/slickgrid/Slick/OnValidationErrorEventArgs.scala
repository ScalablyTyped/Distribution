package typings.slickgrid.Slick

import typings.slickgrid.Slick.Editors.Editor
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnValidationErrorEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  
  var cell: Double = js.native
  
  var cellNode: HTMLElement = js.native
  
  var column: Column[T] = js.native
  
  var editor: Editor[T] = js.native
  
  var row: Double = js.native
  
  var validationResults: ValidateResults = js.native
}
object OnValidationErrorEventArgs {
  
  @scala.inline
  def apply[T /* <: SlickData */](
    cell: Double,
    cellNode: HTMLElement,
    column: Column[T],
    editor: Editor[T],
    grid: Grid[T],
    row: Double,
    validationResults: ValidateResults
  ): OnValidationErrorEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], cellNode = cellNode.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], validationResults = validationResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnValidationErrorEventArgs[T]]
  }
  
  @scala.inline
  implicit class OnValidationErrorEventArgsOps[Self <: OnValidationErrorEventArgs[_], T /* <: SlickData */] (val x: Self with OnValidationErrorEventArgs[T]) extends AnyVal {
    
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
    def setCell(value: Double): Self = this.set("cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellNode(value: HTMLElement): Self = this.set("cellNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Column[T]): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor(value: Editor[T]): Self = this.set("editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationResults(value: ValidateResults): Self = this.set("validationResults", value.asInstanceOf[js.Any])
  }
}
