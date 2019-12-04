package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.CheckboxSelectColumn")
@js.native
class CheckboxSelectColumn[T /* <: SlickData */] () extends Plugin[T] {
  def this(options: SlickGridCheckBoxSelectColumnOptions) = this()
  def getColumnDefinition(): ColumnMetadata[T] = js.native
}

