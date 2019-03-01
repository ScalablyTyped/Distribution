package typings
package smoothDashScrollbarLib.interfacesScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarOptions extends js.Object {
  var alwaysShowTracks: scala.Boolean
  var continuousScrolling: scala.Boolean
  var damping: scala.Double
  var delegateTo: stdLib.EventTarget | scala.Null
  var plugins: js.Any
  var renderByPixels: scala.Boolean
  var thumbMinSize: scala.Double
  var wheelEventTarget: stdLib.EventTarget | scala.Null
}

object ScrollbarOptions {
  @scala.inline
  def apply(
    alwaysShowTracks: scala.Boolean,
    continuousScrolling: scala.Boolean,
    damping: scala.Double,
    plugins: js.Any,
    renderByPixels: scala.Boolean,
    thumbMinSize: scala.Double,
    delegateTo: stdLib.EventTarget = null,
    wheelEventTarget: stdLib.EventTarget = null
  ): ScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alwaysShowTracks")(alwaysShowTracks)
    __obj.updateDynamic("continuousScrolling")(continuousScrolling)
    __obj.updateDynamic("damping")(damping)
    __obj.updateDynamic("plugins")(plugins)
    __obj.updateDynamic("renderByPixels")(renderByPixels)
    __obj.updateDynamic("thumbMinSize")(thumbMinSize)
    if (delegateTo != null) __obj.updateDynamic("delegateTo")(delegateTo)
    if (wheelEventTarget != null) __obj.updateDynamic("wheelEventTarget")(wheelEventTarget)
    __obj.asInstanceOf[ScrollbarOptions]
  }
}

