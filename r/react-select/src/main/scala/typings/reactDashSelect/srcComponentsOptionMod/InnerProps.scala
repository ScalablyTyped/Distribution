package typings.reactDashSelect.srcComponentsOptionMod

import typings.react.reactMod.MouseEventHandler
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InnerProps extends js.Object {
  var id: String
  var key: String
  var onClick: MouseEventHandler[HTMLDivElement]
  var onMouseMove: MouseEventHandler[HTMLDivElement]
  var onMouseOver: MouseEventHandler[HTMLDivElement]
  var tabIndex: Double
}

object InnerProps {
  @scala.inline
  def apply(
    id: String,
    key: String,
    onClick: MouseEventHandler[HTMLDivElement],
    onMouseMove: MouseEventHandler[HTMLDivElement],
    onMouseOver: MouseEventHandler[HTMLDivElement],
    tabIndex: Double
  ): InnerProps = {
    val __obj = js.Dynamic.literal(id = id, key = key, onClick = onClick, onMouseMove = onMouseMove, onMouseOver = onMouseOver, tabIndex = tabIndex)
  
    __obj.asInstanceOf[InnerProps]
  }
}

