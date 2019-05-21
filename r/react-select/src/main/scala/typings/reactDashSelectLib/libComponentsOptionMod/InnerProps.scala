package typings
package reactDashSelectLib.libComponentsOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InnerProps extends js.Object {
  var id: java.lang.String
  var key: java.lang.String
  var onClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLDivElement]
  var onMouseMove: reactLib.reactMod.MouseEventHandler[stdLib.HTMLDivElement]
  var onMouseOver: reactLib.reactMod.MouseEventHandler[stdLib.HTMLDivElement]
  var tabIndex: scala.Double
}

object InnerProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    key: java.lang.String,
    onClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLDivElement],
    onMouseMove: reactLib.reactMod.MouseEventHandler[stdLib.HTMLDivElement],
    onMouseOver: reactLib.reactMod.MouseEventHandler[stdLib.HTMLDivElement],
    tabIndex: scala.Double
  ): InnerProps = {
    val __obj = js.Dynamic.literal(id = id, key = key, onClick = onClick, onMouseMove = onMouseMove, onMouseOver = onMouseOver, tabIndex = tabIndex)
  
    __obj.asInstanceOf[InnerProps]
  }
}

