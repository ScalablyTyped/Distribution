package typings.reactSwipeable.mod

import typings.react.mod.MouseEventHandler
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeableHandlers extends js.Object {
  var onMouseDown: js.UndefOr[MouseEventHandler[Element]] = js.native
  def ref(): Unit = js.native
  def ref(element: HTMLElement): Unit = js.native
}

