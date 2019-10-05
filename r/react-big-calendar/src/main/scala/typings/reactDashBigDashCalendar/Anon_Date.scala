package typings.reactDashBigDashCalendar

import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var date: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.undefined
  var event: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.undefined
  var time: js.UndefOr[
    SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element
  ] = js.undefined
}

object Anon_Date {
  @scala.inline
  def apply(
    date: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element = null,
    event: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element = null,
    time: SFC[js.Object] | (Component[js.Object, js.Object, _]) | (ComponentClass[js.Object, ComponentState]) | Element = null
  ): Anon_Date = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Date]
  }
}

