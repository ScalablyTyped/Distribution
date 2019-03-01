package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnValidationErrorEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var cell: scala.Double
  var cellNode: stdLib.HTMLElement
  var column: Column[T]
  var editor: slickgridLib.SlickNs.EditorsNs.Editor[T]
  var row: scala.Double
  var validationResults: ValidateResults
}

object OnValidationErrorEventArgs {
  @scala.inline
  def apply[T /* <: SlickData */](
    cell: scala.Double,
    cellNode: stdLib.HTMLElement,
    column: Column[T],
    editor: slickgridLib.SlickNs.EditorsNs.Editor[T],
    grid: Grid[T],
    row: scala.Double,
    validationResults: ValidateResults
  ): OnValidationErrorEventArgs[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cell")(cell)
    __obj.updateDynamic("cellNode")(cellNode)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("editor")(editor)
    __obj.updateDynamic("grid")(grid)
    __obj.updateDynamic("row")(row)
    __obj.updateDynamic("validationResults")(validationResults)
    __obj.asInstanceOf[OnValidationErrorEventArgs[T]]
  }
}

