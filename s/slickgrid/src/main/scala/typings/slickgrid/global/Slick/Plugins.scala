package typings.slickgrid.global.Slick

import typings.slickgrid.Slick.OnCommandEventArgs
import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Plugins")
@js.native
object Plugins extends js.Object {
  @js.native
  class HeaderButtons[T /* <: SlickData */] ()
    extends typings.slickgrid.Slick.Plugins.HeaderButtons[T] {
    /* CompleteClass */
    override var onCommand: typings.slickgrid.Slick.Event[OnCommandEventArgs[T]] = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def init(grid: typings.slickgrid.Slick.Grid[T]): Unit = js.native
  }
  
}

