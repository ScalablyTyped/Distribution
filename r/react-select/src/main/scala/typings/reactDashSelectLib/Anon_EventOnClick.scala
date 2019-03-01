package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventOnClick extends js.Object {
  def onClick(event: js.Any): scala.Unit
  def onMouseDown(event: js.Any): scala.Unit
  def onTouchEnd(event: js.Any): scala.Unit
}

object Anon_EventOnClick {
  @scala.inline
  def apply(
    onClick: js.Function1[js.Any, scala.Unit],
    onMouseDown: js.Function1[js.Any, scala.Unit],
    onTouchEnd: js.Function1[js.Any, scala.Unit]
  ): Anon_EventOnClick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onClick")(onClick)
    __obj.updateDynamic("onMouseDown")(onMouseDown)
    __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    __obj.asInstanceOf[Anon_EventOnClick]
  }
}

