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
  def apply(navigate: (stdLib.Date, Navigate, js.Any) => stdLib.Date): ViewStatic = {
    val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction3(navigate))
  
    __obj.asInstanceOf[ViewStatic]
  }
}

