package typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewStatic extends js.Object {
  def navigate(date: Date, action: NavigateAction, props: js.Any): Date
}

object ViewStatic {
  @scala.inline
  def apply(navigate: (Date, NavigateAction, js.Any) => Date): ViewStatic = {
    val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction3(navigate))
  
    __obj.asInstanceOf[ViewStatic]
  }
}

