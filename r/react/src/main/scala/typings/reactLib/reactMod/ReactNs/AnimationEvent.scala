package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationEvent[T]
  extends BaseSyntheticEvent[reactLib.NativeAnimationEvent, reactLib.EventTarget with T, reactLib.EventTarget] {
  var animationName: java.lang.String
  var elapsedTime: scala.Double
  var pseudoElement: java.lang.String
}

object AnimationEvent {
  @scala.inline
  def apply[T](
    animationName: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    currentTarget: reactLib.EventTarget with T,
    defaultPrevented: scala.Boolean,
    elapsedTime: scala.Double,
    eventPhase: scala.Double,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    isTrusted: scala.Boolean,
    nativeEvent: reactLib.NativeAnimationEvent,
    persist: js.Function0[scala.Unit],
    preventDefault: js.Function0[scala.Unit],
    pseudoElement: java.lang.String,
    stopPropagation: js.Function0[scala.Unit],
    target: reactLib.EventTarget,
    timeStamp: scala.Double,
    `type`: java.lang.String
  ): AnimationEvent[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("animationName")(animationName)
    __obj.updateDynamic("bubbles")(bubbles)
    __obj.updateDynamic("cancelable")(cancelable)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("defaultPrevented")(defaultPrevented)
    __obj.updateDynamic("elapsedTime")(elapsedTime)
    __obj.updateDynamic("eventPhase")(eventPhase)
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped)
    __obj.updateDynamic("isTrusted")(isTrusted)
    __obj.updateDynamic("nativeEvent")(nativeEvent)
    __obj.updateDynamic("persist")(persist)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("pseudoElement")(pseudoElement)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.asInstanceOf[AnimationEvent[T]]
  }
}

