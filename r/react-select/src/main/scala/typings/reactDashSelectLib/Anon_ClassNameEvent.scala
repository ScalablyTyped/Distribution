package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameEvent extends js.Object {
  var className: java.lang.String
  def onClick(event: js.Any): scala.Unit
  def onMouseDown(event: js.Any): scala.Unit
  def onTouchEnd(event: js.Any): scala.Unit
}

object Anon_ClassNameEvent {
  @scala.inline
  def apply(
    className: java.lang.String,
    onClick: js.Function1[js.Any, scala.Unit],
    onMouseDown: js.Function1[js.Any, scala.Unit],
    onTouchEnd: js.Function1[js.Any, scala.Unit]
  ): Anon_ClassNameEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("onClick")(onClick)
    __obj.updateDynamic("onMouseDown")(onMouseDown)
    __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    __obj.asInstanceOf[Anon_ClassNameEvent]
  }
}

