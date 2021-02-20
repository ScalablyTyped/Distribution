package typings.slickgrid.Slick

import typings.slickgrid.Slick.Editors.Editor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
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
  implicit class OnValidationErrorEventArgsMutableBuilder[Self <: OnValidationErrorEventArgs[_], T /* <: SlickData */] (val x: Self with OnValidationErrorEventArgs[T]) extends AnyVal {
    
    @scala.inline
    def setCell(value: Double): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellNode(value: HTMLElement): Self = StObject.set(x, "cellNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Column[T]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor(value: Editor[T]): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationResults(value: ValidateResults): Self = StObject.set(x, "validationResults", value.asInstanceOf[js.Any])
  }
}
