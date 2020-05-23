package typings.reactRange.typesMod

import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.RefObject
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThumbProps extends js.Object {
  var `aria-valuemax`: Double
  var `aria-valuemin`: Double
  var `aria-valuenow`: Double
  var draggable: Boolean
  var key: Double
  var ref: RefObject[_]
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
    ref: RefObject[_],
    role: String,
    style: CSSProperties,
    tabIndex: js.UndefOr[Double] = js.undefined
  ): IThumbProps = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), ref = ref.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThumbProps]
  }
}

