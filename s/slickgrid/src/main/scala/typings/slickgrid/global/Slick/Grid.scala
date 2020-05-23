package typings.slickgrid.global.Slick

import typings.jquery.JQuery
import typings.slickgrid.Slick.Column
import typings.slickgrid.Slick.DataProvider
import typings.slickgrid.Slick.GridOptions
import typings.slickgrid.Slick.SlickData
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Grid")
@js.native
class Grid[T /* <: SlickData */] protected ()
  extends typings.slickgrid.Slick.Grid[T] {
  /**
    * Create an instance of the grid.
    * @param container Container node to create the grid in. This can be a DOM Element, a jQuery node, or a jQuery selector.
    * @param data Databinding source. This can either be a regular JavaScript array or a custom object exposing getItem(index) and getLength() functions.
    * @param columns An array of column definition objects. See Column Options for a list of options that can be included on each column definition object.
    * @param options Additional options.  See Grid Options for a list of options that can be included.
    **/
  def this(container: String, data: js.Array[T], columns: js.Array[Column[T]], options: GridOptions[T]) = this()
  def this(container: String, data: DataProvider[T], columns: js.Array[Column[T]], options: GridOptions[T]) = this()
  def this(
    container: JQuery[HTMLElement],
    data: js.Array[T],
    columns: js.Array[Column[T]],
    options: GridOptions[T]
  ) = this()
  def this(
    container: JQuery[HTMLElement],
    data: DataProvider[T],
    columns: js.Array[Column[T]],
    options: GridOptions[T]
  ) = this()
  def this(container: HTMLElement, data: js.Array[T], columns: js.Array[Column[T]], options: GridOptions[T]) = this()
  def this(
    container: HTMLElement,
    data: DataProvider[T],
    columns: js.Array[Column[T]],
    options: GridOptions[T]
  ) = this()
}

