package typings.reactDashRange.libTypesMod

import typings.react.Element
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThumbProps extends js.Object {
  var `aria-valuemax`: Double
  var `aria-valuemin`: Double
  var `aria-valuenow`: Double
  var draggable: Boolean
  var key: Double
  var role: String
  var style: CSSProperties
  var tabIndex: js.UndefOr[Double] = js.undefined
  def onKeyDown(e: KeyboardEvent[Element]): Unit
  def onKeyUp(e: KeyboardEvent[Element]): Unit
}

object IThumbProps {
  @scala.inline
  def apply(
    `aria-valuemax`: Double,
    `aria-valuemin`: Double,
    `aria-valuenow`: Double,
    draggable: Boolean,
    key: Double,
    onKeyDown: KeyboardEvent[Element] => Unit,
    onKeyUp: KeyboardEvent[Element] => Unit,
    role: String,
    style: CSSProperties,
    tabIndex: Int | Double = null
  ): IThumbProps = {
    val __obj = js.Dynamic.literal(draggable = draggable, key = key, onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), role = role, style = style)
    __obj.updateDynamic("aria-valuemax")(`aria-valuemax`)
    __obj.updateDynamic("aria-valuemin")(`aria-valuemin`)
    __obj.updateDynamic("aria-valuenow")(`aria-valuenow`)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThumbProps]
  }
}

