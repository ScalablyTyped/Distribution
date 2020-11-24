package typings.reResizable.resizerMod

import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("re-resizable/lib/resizer", "Resizer")
@js.native
class Resizer ()
  extends Component[Props, js.Object, js.Any] {
  
  def onMouseDown(e: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
  
  def onTouchStart(e: TouchEvent[HTMLDivElement]): Unit = js.native
}
