package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.day
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.hour
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.minute
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.week
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schedule extends js.Object {
  var fireDate: Double
  var repeatInterval: js.UndefOr[minute | hour | day | week] = js.undefined
}

object Schedule {
  @scala.inline
  def apply(fireDate: Double, repeatInterval: minute | hour | day | week = null): Schedule = {
    val __obj = js.Dynamic.literal(fireDate = fireDate)
    if (repeatInterval != null) __obj.updateDynamic("repeatInterval")(repeatInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
}

