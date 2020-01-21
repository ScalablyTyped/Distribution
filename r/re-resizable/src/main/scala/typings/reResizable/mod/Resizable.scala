package typings.reResizable.mod

import typings.reResizable.AnonHeightWidthNumber
import typings.react.mod.Component
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resizable
  extends Component[ResizableProps, ResizableState, js.Any] {
  var resizable: HTMLElement = js.native
  var size: AnonHeightWidthNumber = js.native
  def updateSize(hasWidthHeight: Size): Unit = js.native
}

