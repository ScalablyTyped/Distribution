package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewStatic extends js.Object {
  def navigate(date: stdLib.Date, action: Navigate, props: js.Any): stdLib.Date
}

object ViewStatic {
  @scala.inline
  def apply(navigate: js.Function3[stdLib.Date, Navigate, js.Any, stdLib.Date]): ViewStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("navigate")(navigate)
    __obj.asInstanceOf[ViewStatic]
  }
}

