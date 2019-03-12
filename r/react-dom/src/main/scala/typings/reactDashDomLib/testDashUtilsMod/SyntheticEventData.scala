package typings
package reactDashDomLib.testDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntheticEventData extends OptionalEventProperties {
  var altKey: js.UndefOr[scala.Boolean] = js.undefined
  var button: js.UndefOr[scala.Double] = js.undefined
  var buttons: js.UndefOr[scala.Double] = js.undefined
  var changedTouches: js.UndefOr[stdLib.TouchList] = js.undefined
  var charCode: js.UndefOr[scala.Boolean] = js.undefined
  var clientX: js.UndefOr[scala.Double] = js.undefined
  var clientY: js.UndefOr[scala.Double] = js.undefined
  var clipboardData: js.UndefOr[stdLib.DataTransfer] = js.undefined
  var ctrlKey: js.UndefOr[scala.Boolean] = js.undefined
  var deltaMode: js.UndefOr[scala.Double] = js.undefined
  var deltaX: js.UndefOr[scala.Double] = js.undefined
  var deltaY: js.UndefOr[scala.Double] = js.undefined
  var deltaZ: js.UndefOr[scala.Double] = js.undefined
  var detail: js.UndefOr[scala.Double] = js.undefined
  var getModifierState: js.UndefOr[js.Function1[/* key */ java.lang.String, scala.Boolean]] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var keyCode: js.UndefOr[scala.Double] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[scala.Double] = js.undefined
  var metaKey: js.UndefOr[scala.Boolean] = js.undefined
  var pageX: js.UndefOr[scala.Double] = js.undefined
  var pageY: js.UndefOr[scala.Double] = js.undefined
  var relatedTarget: js.UndefOr[stdLib.EventTarget] = js.undefined
  var repeat: js.UndefOr[scala.Boolean] = js.undefined
  var screenX: js.UndefOr[scala.Double] = js.undefined
  var screenY: js.UndefOr[scala.Double] = js.undefined
  var shiftKey: js.UndefOr[scala.Boolean] = js.undefined
  var targetTouches: js.UndefOr[stdLib.TouchList] = js.undefined
  var touches: js.UndefOr[stdLib.TouchList] = js.undefined
  var view: js.UndefOr[reactLib.reactMod.ReactNs.AbstractView] = js.undefined
  var which: js.UndefOr[scala.Double] = js.undefined
}

object SyntheticEventData {
  @scala.inline
  def apply(
    altKey: js.UndefOr[scala.Boolean] = js.undefined,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    button: scala.Int | scala.Double = null,
    buttons: scala.Int | scala.Double = null,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    changedTouches: stdLib.TouchList = null,
    charCode: js.UndefOr[scala.Boolean] = js.undefined,
    clientX: scala.Int | scala.Double = null,
    clientY: scala.Int | scala.Double = null,
    clipboardData: stdLib.DataTransfer = null,
    ctrlKey: js.UndefOr[scala.Boolean] = js.undefined,
    currentTarget: stdLib.EventTarget = null,
    defaultPrevented: js.UndefOr[scala.Boolean] = js.undefined,
    deltaMode: scala.Int | scala.Double = null,
    deltaX: scala.Int | scala.Double = null,
    deltaY: scala.Int | scala.Double = null,
    deltaZ: scala.Int | scala.Double = null,
    detail: scala.Int | scala.Double = null,
    eventPhase: scala.Int | scala.Double = null,
    getModifierState: /* key */ java.lang.String => scala.Boolean = null,
    isTrusted: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    keyCode: scala.Int | scala.Double = null,
    locale: java.lang.String = null,
    location: scala.Int | scala.Double = null,
    metaKey: js.UndefOr[scala.Boolean] = js.undefined,
    nativeEvent: stdLib.Event = null,
    pageX: scala.Int | scala.Double = null,
    pageY: scala.Int | scala.Double = null,
    preventDefault: () => scala.Unit = null,
    relatedTarget: stdLib.EventTarget = null,
    repeat: js.UndefOr[scala.Boolean] = js.undefined,
    screenX: scala.Int | scala.Double = null,
    screenY: scala.Int | scala.Double = null,
    shiftKey: js.UndefOr[scala.Boolean] = js.undefined,
    stopPropagation: () => scala.Unit = null,
    target: stdLib.EventTarget = null,
    targetTouches: stdLib.TouchList = null,
    timeStamp: stdLib.Date = null,
    touches: stdLib.TouchList = null,
    `type`: java.lang.String = null,
    view: reactLib.reactMod.ReactNs.AbstractView = null,
    which: scala.Int | scala.Double = null
  ): SyntheticEventData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (changedTouches != null) __obj.updateDynamic("changedTouches")(changedTouches)
    if (!js.isUndefined(charCode)) __obj.updateDynamic("charCode")(charCode)
    if (clientX != null) __obj.updateDynamic("clientX")(clientX.asInstanceOf[js.Any])
    if (clientY != null) __obj.updateDynamic("clientY")(clientY.asInstanceOf[js.Any])
    if (clipboardData != null) __obj.updateDynamic("clipboardData")(clipboardData)
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey)
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget)
    if (!js.isUndefined(defaultPrevented)) __obj.updateDynamic("defaultPrevented")(defaultPrevented)
    if (deltaMode != null) __obj.updateDynamic("deltaMode")(deltaMode.asInstanceOf[js.Any])
    if (deltaX != null) __obj.updateDynamic("deltaX")(deltaX.asInstanceOf[js.Any])
    if (deltaY != null) __obj.updateDynamic("deltaY")(deltaY.asInstanceOf[js.Any])
    if (deltaZ != null) __obj.updateDynamic("deltaZ")(deltaZ.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (eventPhase != null) __obj.updateDynamic("eventPhase")(eventPhase.asInstanceOf[js.Any])
    if (getModifierState != null) __obj.updateDynamic("getModifierState")(js.Any.fromFunction1(getModifierState))
    if (!js.isUndefined(isTrusted)) __obj.updateDynamic("isTrusted")(isTrusted)
    if (key != null) __obj.updateDynamic("key")(key)
    if (keyCode != null) __obj.updateDynamic("keyCode")(keyCode.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKey)) __obj.updateDynamic("metaKey")(metaKey)
    if (nativeEvent != null) __obj.updateDynamic("nativeEvent")(nativeEvent)
    if (pageX != null) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (pageY != null) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    if (preventDefault != null) __obj.updateDynamic("preventDefault")(js.Any.fromFunction0(preventDefault))
    if (relatedTarget != null) __obj.updateDynamic("relatedTarget")(relatedTarget)
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat)
    if (screenX != null) __obj.updateDynamic("screenX")(screenX.asInstanceOf[js.Any])
    if (screenY != null) __obj.updateDynamic("screenY")(screenY.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey)
    if (stopPropagation != null) __obj.updateDynamic("stopPropagation")(js.Any.fromFunction0(stopPropagation))
    if (target != null) __obj.updateDynamic("target")(target)
    if (targetTouches != null) __obj.updateDynamic("targetTouches")(targetTouches)
    if (timeStamp != null) __obj.updateDynamic("timeStamp")(timeStamp)
    if (touches != null) __obj.updateDynamic("touches")(touches)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (view != null) __obj.updateDynamic("view")(view)
    if (which != null) __obj.updateDynamic("which")(which.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntheticEventData]
  }
}

