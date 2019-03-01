package typings
package reactDashBigDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: js.UndefOr[
    reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
  var header: js.UndefOr[
    reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element
  ] = js.undefined
}

object Anon_Event {
  @scala.inline
  def apply(
    event: reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null,
    header: reactLib.reactMod.ReactNs.SFC[js.Object] | (reactLib.reactMod.Component[js.Object, js.Object, _]) | (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.Global.JSXNs.Element = null
  ): Anon_Event = {
    val __obj = js.Dynamic.literal()
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Event]
  }
}

