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
  def apply[T /* <: SlickData */](
    cell: Double,
    cellNode: HTMLElement,
    column: Column[T],
    editor: Editor[T],
    grid: Grid[T],
    row: Double,
    validationResults: ValidateResults
  ): OnValidationErrorEventArgs[T] = {
    val __obj = js.Dynamic.literal(cell = cell, cellNode = cellNode, column = column, editor = editor, grid = grid, row = row, validationResults = validationResults)
  
    __obj.asInstanceOf[OnValidationErrorEventArgs[T]]
  }
}

