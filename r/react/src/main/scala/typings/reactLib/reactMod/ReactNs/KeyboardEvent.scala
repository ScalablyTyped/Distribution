package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardEvent[T]
  extends BaseSyntheticEvent[reactLib.NativeKeyboardEvent, reactLib.EventTarget with T, reactLib.EventTarget] {
  var altKey: scala.Boolean
  var charCode: scala.Double
  var ctrlKey: scala.Boolean
  /**
    * See the [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#named-key-attribute-values). for possible values
    */
  var key: java.lang.String
  var keyCode: scala.Double
  var locale: java.lang.String
  var location: scala.Double
  var metaKey: scala.Boolean
  var repeat: scala.Boolean
  var shiftKey: scala.Boolean
  var which: scala.Double
  /**
    * See [DOM Level 3 Events spec](https://www.w3.org/TR/uievents-key/#keys-modifier). for a list of valid (case-sensitive) arguments to this method.
    */
  def getModifierState(key: java.lang.String): scala.Boolean
}

object KeyboardEvent {
  @scala.inline
  def apply[T](
    altKey: scala.Boolean,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    charCode: scala.Double,
    ctrlKey: scala.Boolean,
    currentTarget: reactLib.EventTarget with T,
    defaultPrevented: scala.Boolean,
    eventPhase: scala.Double,
    getModifierState: js.Function1[java.lang.String, scala.Boolean],
    isDefaultPrevented: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    isTrusted: scala.Boolean,
    key: java.lang.String,
    keyCode: scala.Double,
    locale: java.lang.String,
    location: scala.Double,
    metaKey: scala.Boolean,
    nativeEvent: reactLib.NativeKeyboardEvent,
    persist: js.Function0[scala.Unit],
    preventDefault: js.Function0[scala.Unit],
    repeat: scala.Boolean,
    shiftKey: scala.Boolean,
    stopPropagation: js.Function0[scala.Unit],
    target: reactLib.EventTarget,
    timeStamp: scala.Double,
    `type`: java.lang.String,
    which: scala.Double
  ): KeyboardEvent[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("altKey")(altKey)
    __obj.updateDynamic("bubbles")(bubbles)
    __obj.updateDynamic("cancelable")(cancelable)
    __obj.updateDynamic("charCode")(charCode)
    __obj.updateDynamic("ctrlKey")(ctrlKey)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("defaultPrevented")(defaultPrevented)
    __obj.updateDynamic("eventPhase")(eventPhase)
    __obj.updateDynamic("getModifierState")(getModifierState)
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped)
    __obj.updateDynamic("isTrusted")(isTrusted)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("keyCode")(keyCode)
    __obj.updateDynamic("locale")(locale)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("metaKey")(metaKey)
    __obj.updateDynamic("nativeEvent")(nativeEvent)
    __obj.updateDynamic("persist")(persist)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("repeat")(repeat)
    __obj.updateDynamic("shiftKey")(shiftKey)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.updateDynamic("which")(which)
    __obj.asInstanceOf[KeyboardEvent[T]]
  }
}

