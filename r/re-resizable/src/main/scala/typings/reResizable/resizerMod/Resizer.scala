package typings.reResizable.resizerMod

import typings.react.mod.Component
import typings.react.mod.TouchEvent
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("re-resizable/lib/resizer", "Resizer")
@js.native
class Resizer ()
  extends Component[Props, js.Object, js.Any] {
  def onMouseDown(e: typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent]): Unit = js.native
  def onTouchStart(e: TouchEvent[HTMLDivElement]): Unit = js.native
}

