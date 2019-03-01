package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusEvent[T]
  extends BaseSyntheticEvent[reactLib.NativeFocusEvent, reactLib.EventTarget with T, reactLib.EventTarget] {
  var relatedTarget: reactLib.EventTarget
  @JSName("target")
  var target_FocusEvent: reactLib.EventTarget with T
}

object FocusEvent {
  @scala.inline
  def apply[T](
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: reactLib.EventTarget with T,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    isTrusted: scala.Boolean,
    nativeEvent: reactLib.NativeFocusEvent,
    persist: js.Function0[scala.Unit],
    preventDefault: js.Function0[scala.Unit],
    relatedTarget: reactLib.EventTarget,
    stopPropagation: js.Function0[scala.Unit],
    target: reactLib.EventTarget with T,
    timeStamp: scala.Double,
    `type`: java.lang.String
  ): FocusEvent[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bubbles")(bubbles)
    __obj.updateDynamic("cancelable")(cancelable)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("defaultPrevented")(defaultPrevented)
    __obj.updateDynamic("eventPhase")(eventPhase)
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped)
    __obj.updateDynamic("isTrusted")(isTrusted)
    __obj.updateDynamic("nativeEvent")(nativeEvent)
    __obj.updateDynamic("persist")(persist)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("relatedTarget")(relatedTarget)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.asInstanceOf[FocusEvent[T]]
  }
}

