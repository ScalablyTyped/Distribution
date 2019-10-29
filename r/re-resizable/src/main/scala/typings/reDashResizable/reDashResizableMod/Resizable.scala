package typings.reDashResizable.reDashResizableMod

import typings.reDashResizable.Anon_HeightWidthNumber
import typings.react.reactMod.Component
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resizable
  extends Component[ResizableProps, ResizableState, js.Any] {
  var resizable: HTMLElement = js.native
  var size: Anon_HeightWidthNumber = js.native
  def updateSize(hasWidthHeight: Size): Unit = js.native
}

