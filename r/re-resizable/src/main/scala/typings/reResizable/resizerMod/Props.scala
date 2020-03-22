package typings.reResizable.resizerMod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  var className: js.UndefOr[String] = js.undefined
  var direction: Direction
  var onResizeStart: OnStartCallback
  var replaceStyles: js.UndefOr[CSSProperties] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    direction: Direction,
    onResizeStart: (/* e */ (MouseEvent[HTMLDivElement, NativeMouseEvent]) | TouchEvent[HTMLDivElement], /* dir */ Direction) => Unit,
    children: ReactNode = null,
    className: String = null,
    replaceStyles: CSSProperties = null
  ): Props = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], onResizeStart = js.Any.fromFunction2(onResizeStart))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (replaceStyles != null) __obj.updateDynamic("replaceStyles")(replaceStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

