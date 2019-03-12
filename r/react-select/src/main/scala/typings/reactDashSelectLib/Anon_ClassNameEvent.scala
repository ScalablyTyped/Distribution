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
    onClick: js.Any => scala.Unit,
    onMouseDown: js.Any => scala.Unit,
    onTouchEnd: js.Any => scala.Unit
  ): Anon_ClassNameEvent = {
    val __obj = js.Dynamic.literal(className = className, onClick = js.Any.fromFunction1(onClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onTouchEnd = js.Any.fromFunction1(onTouchEnd))
  
    __obj.asInstanceOf[Anon_ClassNameEvent]
  }
}

