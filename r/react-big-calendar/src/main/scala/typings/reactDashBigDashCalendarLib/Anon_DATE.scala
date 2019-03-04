package typings
package reactDashBigDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DATE extends js.Object {
  var DATE: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.DATE
  var NEXT: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.NEXT
  var PREVIOUS: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.PREV
  var TODAY: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.TODAY
}

trait Anon_Date extends js.Object {
  var date: js.UndefOr[
    reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  var event: js.UndefOr[
    reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  var time: js.UndefOr[
    reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
}

object Anon_DATE {
  @scala.inline
  def apply(
    DATE: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.DATE,
    NEXT: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.NEXT,
    PREVIOUS: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.PREV,
    TODAY: reactDashBigDashCalendarLib.reactDashBigDashCalendarLibStrings.TODAY
  ): Anon_DATE = {
    val __obj = js.Dynamic.literal(DATE = DATE, NEXT = NEXT, PREVIOUS = PREVIOUS, TODAY = TODAY)
  
    __obj.asInstanceOf[Anon_DATE]
  }
}

object Anon_Date {
  @scala.inline
  def apply(
    date: reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null,
    event: reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null,
    time: reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null
  ): Anon_Date = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Date]
  }
}

