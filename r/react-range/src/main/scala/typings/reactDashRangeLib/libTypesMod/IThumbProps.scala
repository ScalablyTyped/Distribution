package typings
package reactDashRangeLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThumbProps extends js.Object {
  var `aria-valuemax`: scala.Double
  var `aria-valuemin`: scala.Double
  var `aria-valuenow`: scala.Double
  var draggable: scala.Boolean
  var key: scala.Double
  var role: java.lang.String
  var style: reactLib.reactMod.CSSProperties
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  def onKeyDown(e: reactLib.reactMod.KeyboardEvent[reactLib.Element]): scala.Unit
  def onKeyUp(e: reactLib.reactMod.KeyboardEvent[reactLib.Element]): scala.Unit
}

object IThumbProps {
  @scala.inline
  def apply(
    `aria-valuemax`: scala.Double,
    `aria-valuemin`: scala.Double,
    `aria-valuenow`: scala.Double,
    draggable: scala.Boolean,
    key: scala.Double,
    onKeyDown: reactLib.reactMod.KeyboardEvent[reactLib.Element] => scala.Unit,
    onKeyUp: reactLib.reactMod.KeyboardEvent[reactLib.Element] => scala.Unit,
    role: java.lang.String,
    style: reactLib.reactMod.CSSProperties,
    tabIndex: scala.Int | scala.Double = null
  ): IThumbProps = {
    val __obj = js.Dynamic.literal(draggable = draggable, key = key, onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), role = role, style = style)
    __obj.updateDynamic("aria-valuemax")(`aria-valuemax`)
    __obj.updateDynamic("aria-valuemin")(`aria-valuemin`)
    __obj.updateDynamic("aria-valuenow")(`aria-valuenow`)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThumbProps]
  }
}

