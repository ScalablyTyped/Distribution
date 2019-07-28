package typings.atReachTooltip.atReachTooltipMod

import typings.react.Element
import typings.react.reactMod.ReactEventHandler
import typings.react.reactMod.Ref
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
    onBlur: ReactEventHandler[Element],
    onFocus: ReactEventHandler[Element],
    onKeyDown: ReactEventHandler[Element],
    onMouseDown: ReactEventHandler[Element],
    onMouseEnter: ReactEventHandler[Element],
    onMouseLeave: ReactEventHandler[Element],
    onMouseMove: ReactEventHandler[Element],
    ref: Ref[_]
  ): TriggerParams = {
    val __obj = js.Dynamic.literal(onBlur = onBlur, onFocus = onFocus, onKeyDown = onKeyDown, onMouseDown = onMouseDown, onMouseEnter = onMouseEnter, onMouseLeave = onMouseLeave, onMouseMove = onMouseMove, ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-describedby")(`aria-describedby`)
    __obj.updateDynamic("data-reach-tooltip-trigger")(`data-reach-tooltip-trigger`)
    __obj.asInstanceOf[TriggerParams]
  }
}

