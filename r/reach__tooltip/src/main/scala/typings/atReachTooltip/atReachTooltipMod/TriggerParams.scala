package typings.atReachTooltip.atReachTooltipMod

import typings.react.reactMod.ReactEventHandler
import typings.react.reactMod.Ref
import typings.react.reactMod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerParams extends js.Object {
  var `aria-describedby`: String
  var `data-reach-tooltip-trigger`: String
  var onBlur: ReactEventHandler[Element]
  var onFocus: ReactEventHandler[Element]
  var onKeyDown: ReactEventHandler[Element]
  var onMouseDown: ReactEventHandler[Element]
  var onMouseEnter: ReactEventHandler[Element]
  var onMouseLeave: ReactEventHandler[Element]
  var onMouseMove: ReactEventHandler[Element]
  var ref: Ref[_]
}

object TriggerParams {
  @scala.inline
  def apply(
    `aria-describedby`: String,
    `data-reach-tooltip-trigger`: String,
    onBlur: SyntheticEvent[Element, Event] => Unit,
    onFocus: SyntheticEvent[Element, Event] => Unit,
    onKeyDown: SyntheticEvent[Element, Event] => Unit,
    onMouseDown: SyntheticEvent[Element, Event] => Unit,
    onMouseEnter: SyntheticEvent[Element, Event] => Unit,
    onMouseLeave: SyntheticEvent[Element, Event] => Unit,
    onMouseMove: SyntheticEvent[Element, Event] => Unit,
    ref: Ref[_] = null
  ): TriggerParams = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseMove = js.Any.fromFunction1(onMouseMove))
    __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-reach-tooltip-trigger")(`data-reach-tooltip-trigger`.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerParams]
  }
}

