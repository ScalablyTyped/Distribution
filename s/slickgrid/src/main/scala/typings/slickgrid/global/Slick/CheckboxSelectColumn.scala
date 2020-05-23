package typings.slickgrid.global.Slick

import typings.slickgrid.Slick.ColumnMetadata
import typings.slickgrid.Slick.SlickData
import typings.slickgrid.Slick.SlickGridCheckBoxSelectColumnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.CheckboxSelectColumn")
@js.native
class CheckboxSelectColumn[T /* <: SlickData */] ()
  extends typings.slickgrid.Slick.CheckboxSelectColumn[T] {
  def this(options: SlickGridCheckBoxSelectColumnOptions) = this()
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def getColumnDefinition(): ColumnMetadata[T] = js.native
  /* CompleteClass */
  override def init(grid: typings.slickgrid.Slick.Grid[T]): Unit = js.native
}

