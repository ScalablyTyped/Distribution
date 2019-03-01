package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositionEvent[T]
  extends BaseSyntheticEvent[reactLib.NativeCompositionEvent, reactLib.EventTarget with T, reactLib.EventTarget] {
  var data: java.lang.String
}

object CompositionEvent {
  @scala.inline
  def apply[T](
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: reactLib.EventTarget with T,
    data: java.lang.String,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    isTrusted: scala.Boolean,
    nativeEvent: reactLib.NativeCompositionEvent,
    persist: js.Function0[scala.Unit],
    preventDefault: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: reactLib.EventTarget,
    timeStamp: scala.Double,
    `type`: java.lang.String
  ): CompositionEvent[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bubbles")(bubbles)
    __obj.updateDynamic("cancelable")(cancelable)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("defaultPrevented")(defaultPrevented)
    __obj.updateDynamic("eventPhase")(eventPhase)
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped)
    __obj.updateDynamic("isTrusted")(isTrusted)
    __obj.updateDynamic("nativeEvent")(nativeEvent)
    __obj.updateDynamic("persist")(persist)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.asInstanceOf[CompositionEvent[T]]
  }
}

