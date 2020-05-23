package typings.slickgrid.global.Slick

import typings.slickgrid.Slick.Column
import typings.slickgrid.Slick.Controls.SlickColumnPickerOptions
import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Controls")
@js.native
object Controls extends js.Object {
  @js.native
  class ColumnPicker[T /* <: SlickData */] protected ()
    extends typings.slickgrid.Slick.Controls.ColumnPicker[T] {
    def this(
      columns: js.Array[Column[T]],
      grid: typings.slickgrid.Slick.Grid[T],
      options: SlickColumnPickerOptions
    ) = this()
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def getAllColumns(): js.Array[Column[T]] = js.native
  }
  
}

