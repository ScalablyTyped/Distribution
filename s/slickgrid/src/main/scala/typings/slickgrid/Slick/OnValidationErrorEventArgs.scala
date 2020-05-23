package typings.slickgrid.Slick

import typings.slickgrid.Slick.Editors.Editor
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnValidationErrorEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var cell: Double
  var cellNode: HTMLElement
  var column: Column[T]
  var editor: Editor[T]
  var row: Double
  var validationResults: ValidateResults
}

object OnValidationErrorEventArgs {
  @scala.inline
  def apply[T](
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
}

