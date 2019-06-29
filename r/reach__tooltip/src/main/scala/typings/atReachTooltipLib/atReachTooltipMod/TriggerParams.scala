package typings
package atReachTooltipLib.atReachTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerParams extends js.Object {
  var `aria-describedby`: java.lang.String
  var `data-reach-tooltip-trigger`: java.lang.String
  var onBlur: reactLib.reactMod.ReactEventHandler[reactLib.Element]
  var onFocus: reactLib.reactMod.ReactEventHandler[reactLib.Element]
  var onKeyDown: reactLib.reactMod.ReactEventHandler[reactLib.Element]
  var onMouseDown: reactLib.reactMod.ReactEventHandler[reactLib.Element]
  var onMouseEnter: reactLib.reactMod.ReactEventHandler[reactLib.Element]
  var onMouseLeave: reactLib.reactMod.ReactEventHandler[reactLib.Element]
  var onMouseMove: reactLib.reactMod.ReactEventHandler[reactLib.Element]
  var ref: reactLib.reactMod.Ref[_]
}

object TriggerParams {
  @scala.inline
  def apply(
    `aria-describedby`: java.lang.String,
    `data-reach-tooltip-trigger`: java.lang.String,
    onBlur: reactLib.reactMod.ReactEventHandler[reactLib.Element],
    onFocus: reactLib.reactMod.ReactEventHandler[reactLib.Element],
    onKeyDown: reactLib.reactMod.ReactEventHandler[reactLib.Element],
    onMouseDown: reactLib.reactMod.ReactEventHandler[reactLib.Element],
    onMouseEnter: reactLib.reactMod.ReactEventHandler[reactLib.Element],
    onMouseLeave: reactLib.reactMod.ReactEventHandler[reactLib.Element],
    onMouseMove: reactLib.reactMod.ReactEventHandler[reactLib.Element],
    ref: reactLib.reactMod.Ref[_]
  ): TriggerParams = {
    val __obj = js.Dynamic.literal(onBlur = onBlur, onFocus = onFocus, onKeyDown = onKeyDown, onMouseDown = onMouseDown, onMouseEnter = onMouseEnter, onMouseLeave = onMouseLeave, onMouseMove = onMouseMove, ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-describedby")(`aria-describedby`)
    __obj.updateDynamic("data-reach-tooltip-trigger")(`data-reach-tooltip-trigger`)
    __obj.asInstanceOf[TriggerParams]
  }
}

