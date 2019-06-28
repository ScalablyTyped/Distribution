package typings
package reactDashBigDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var date: js.UndefOr[
    reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  var event: js.UndefOr[
    reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  var time: js.UndefOr[
    reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
}

object Anon_Date {
  @scala.inline
  def apply(
    date: reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null,
    event: reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null,
    time: reactLib.reactMod.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null
  ): Anon_Date = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Date]
  }
}

