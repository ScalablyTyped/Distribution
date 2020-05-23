package typings.slickgrid.global.Slick

import typings.slickgrid.Slick.PluginOptions
import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Plugin")
@js.native
class Plugin[T /* <: SlickData */] ()
  extends typings.slickgrid.Slick.Plugin[T] {
  def this(options: PluginOptions) = this()
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def init(grid: typings.slickgrid.Slick.Grid[T]): Unit = js.native
}

