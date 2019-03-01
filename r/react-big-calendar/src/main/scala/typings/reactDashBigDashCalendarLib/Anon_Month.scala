package typings
package reactDashBigDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Month extends js.Object {
  var month: scala.Boolean | reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _])
  var myweek: scala.Boolean | reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _])
  var week: scala.Boolean | reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _])
}

object Anon_Month {
  @scala.inline
  def apply(
    month: scala.Boolean | reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]),
    myweek: scala.Boolean | reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]),
    week: scala.Boolean | reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _])
  ): Anon_Month = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    __obj.updateDynamic("myweek")(myweek.asInstanceOf[js.Any])
    __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Month]
  }
}

