package typings.slickgrid.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Plugin")
@js.native
class Plugin[T /* <: SlickData */] () extends js.Object {
  def this(options: PluginOptions) = this()
  def destroy(): Unit = js.native
  def init(grid: Grid[T]): Unit = js.native
}

