package typings.reactDashDom.testDashUtilsMod

import typings.react.reactMod.AbstractView
import typings.std.DataTransfer
import typings.std.Date
import typings.std.Event
import typings.std.EventTarget
import typings.std.TouchList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntheticEventData extends OptionalEventProperties {
  var altKey: js.UndefOr[Boolean] = js.undefined
  var button: js.UndefOr[Double] = js.undefined
  var buttons: js.UndefOr[Double] = js.undefined
  var changedTouches: js.UndefOr[TouchList] = js.undefined
  var charCode: js.UndefOr[Double] = js.undefined
  var clientX: js.UndefOr[Double] = js.undefined
  var clientY: js.UndefOr[Double] = js.undefined
  var clipboardData: js.UndefOr[DataTransfer] = js.undefined
  var ctrlKey: js.UndefOr[Boolean] = js.undefined
  var deltaMode: js.UndefOr[Double] = js.undefined
  var deltaX: js.UndefOr[Double] = js.undefined
  var deltaY: js.UndefOr[Double] = js.undefined
  var deltaZ: js.UndefOr[Double] = js.undefined
  var detail: js.UndefOr[Double] = js.undefined
  var getModifierState: js.UndefOr[js.Function1[/* key */ String, Boolean]] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var keyCode: js.UndefOr[Double] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[Double] = js.undefined
  var metaKey: js.UndefOr[Boolean] = js.undefined
  var pageX: js.UndefOr[Double] = js.undefined
  var pageY: js.UndefOr[Double] = js.undefined
  var relatedTarget: js.UndefOr[EventTarget] = js.undefined
  var repeat: js.UndefOr[Boolean] = js.undefined
  var screenX: js.UndefOr[Double] = js.undefined
  var screenY: js.UndefOr[Double] = js.undefined
  var shiftKey: js.UndefOr[Boolean] = js.undefined
  var targetTouches: js.UndefOr[TouchList] = js.undefined
  var touches: js.UndefOr[TouchList] = js.undefined
  var view: js.UndefOr[AbstractView] = js.undefined
  var which: js.UndefOr[Double] = js.undefined
}

object SyntheticEventData {
  @scala.inline
  def apply(
    altKey: js.UndefOr[Boolean] = js.undefined,
    bubbles: js.UndefOr[Boolean] = js.undefined,
    button: Int | Double = null,
    buttons: Int | Double = null,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    changedTouches: TouchList = null,
    charCode: Int | Double = null,
    clientX: Int | Double = null,
    clientY: Int | Double = null,
    clipboardData: DataTransfer = null,
    ctrlKey: js.UndefOr[Boolean] = js.undefined,
    currentTarget: EventTarget = null,
    defaultPrevented: js.UndefOr[Boolean] = js.undefined,
    deltaMode: Int | Double = null,
    deltaX: Int | Double = null,
    deltaY: Int | Double = null,
    deltaZ: Int | Double = null,
    detail: Int | Double = null,
    eventPhase: Int | Double = null,
    getModifierState: /* key */ String => Boolean = null,
    isTrusted: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    keyCode: Int | Double = null,
    locale: String = null,
    location: Int | Double = null,
    metaKey: js.UndefOr[Boolean] = js.undefined,
    nativeEvent: Event = null,
    pageX: Int | Double = null,
    pageY: Int | Double = null,
    preventDefault: () => Unit = null,
    relatedTarget: EventTarget = null,
    repeat: js.UndefOr[Boolean] = js.undefined,
    screenX: Int | Double = null,
    screenY: Int | Double = null,
    shiftKey: js.UndefOr[Boolean] = js.undefined,
    stopPropagation: () => Unit = null,
    target: EventTarget = null,
    targetTouches: TouchList = null,
    timeStamp: Date = null,
    touches: TouchList = null,
    `type`: String = null,
    view: AbstractView = null,
    which: Int | Double = null
  ): SyntheticEventData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (changedTouches != null) __obj.updateDynamic("changedTouches")(changedTouches)
    if (charCode != null) __obj.updateDynamic("charCode")(charCode.asInstanceOf[js.Any])
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

