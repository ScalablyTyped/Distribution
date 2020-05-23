package typings.reactDom.testUtilsMod

import typings.react.mod.AbstractView
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
    button: js.UndefOr[Double] = js.undefined,
    buttons: js.UndefOr[Double] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    changedTouches: TouchList = null,
    charCode: js.UndefOr[Double] = js.undefined,
    clientX: js.UndefOr[Double] = js.undefined,
    clientY: js.UndefOr[Double] = js.undefined,
    clipboardData: DataTransfer = null,
    ctrlKey: js.UndefOr[Boolean] = js.undefined,
    currentTarget: EventTarget = null,
    defaultPrevented: js.UndefOr[Boolean] = js.undefined,
    deltaMode: js.UndefOr[Double] = js.undefined,
    deltaX: js.UndefOr[Double] = js.undefined,
    deltaY: js.UndefOr[Double] = js.undefined,
    deltaZ: js.UndefOr[Double] = js.undefined,
    detail: js.UndefOr[Double] = js.undefined,
    eventPhase: js.UndefOr[Double] = js.undefined,
    getModifierState: /* key */ String => Boolean = null,
    isTrusted: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    keyCode: js.UndefOr[Double] = js.undefined,
    locale: String = null,
    location: js.UndefOr[Double] = js.undefined,
    metaKey: js.UndefOr[Boolean] = js.undefined,
    nativeEvent: Event = null,
    pageX: js.UndefOr[Double] = js.undefined,
    pageY: js.UndefOr[Double] = js.undefined,
    preventDefault: () => Unit = null,
    relatedTarget: EventTarget = null,
    repeat: js.UndefOr[Boolean] = js.undefined,
    screenX: js.UndefOr[Double] = js.undefined,
    screenY: js.UndefOr[Double] = js.undefined,
    shiftKey: js.UndefOr[Boolean] = js.undefined,
    stopPropagation: () => Unit = null,
    target: EventTarget = null,
    targetTouches: TouchList = null,
    timeStamp: Date = null,
    touches: TouchList = null,
    `type`: String = null,
    view: AbstractView = null,
    which: js.UndefOr[Double] = js.undefined
  ): SyntheticEventData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button.get.asInstanceOf[js.Any])
    if (!js.isUndefined(buttons)) __obj.updateDynamic("buttons")(buttons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (changedTouches != null) __obj.updateDynamic("changedTouches")(changedTouches.asInstanceOf[js.Any])
    if (!js.isUndefined(charCode)) __obj.updateDynamic("charCode")(charCode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientX)) __obj.updateDynamic("clientX")(clientX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientY)) __obj.updateDynamic("clientY")(clientY.get.asInstanceOf[js.Any])
    if (clipboardData != null) __obj.updateDynamic("clipboardData")(clipboardData.asInstanceOf[js.Any])
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey.get.asInstanceOf[js.Any])
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultPrevented)) __obj.updateDynamic("defaultPrevented")(defaultPrevented.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deltaMode)) __obj.updateDynamic("deltaMode")(deltaMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deltaX)) __obj.updateDynamic("deltaX")(deltaX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deltaY)) __obj.updateDynamic("deltaY")(deltaY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deltaZ)) __obj.updateDynamic("deltaZ")(deltaZ.get.asInstanceOf[js.Any])
    if (!js.isUndefined(detail)) __obj.updateDynamic("detail")(detail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(eventPhase)) __obj.updateDynamic("eventPhase")(eventPhase.get.asInstanceOf[js.Any])
    if (getModifierState != null) __obj.updateDynamic("getModifierState")(js.Any.fromFunction1(getModifierState))
    if (!js.isUndefined(isTrusted)) __obj.updateDynamic("isTrusted")(isTrusted.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(keyCode)) __obj.updateDynamic("keyCode")(keyCode.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(location)) __obj.updateDynamic("location")(location.get.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKey)) __obj.updateDynamic("metaKey")(metaKey.get.asInstanceOf[js.Any])
    if (nativeEvent != null) __obj.updateDynamic("nativeEvent")(nativeEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(pageX)) __obj.updateDynamic("pageX")(pageX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageY)) __obj.updateDynamic("pageY")(pageY.get.asInstanceOf[js.Any])
    if (preventDefault != null) __obj.updateDynamic("preventDefault")(js.Any.fromFunction0(preventDefault))
    if (relatedTarget != null) __obj.updateDynamic("relatedTarget")(relatedTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenX)) __obj.updateDynamic("screenX")(screenX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenY)) __obj.updateDynamic("screenY")(screenY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey.get.asInstanceOf[js.Any])
    if (stopPropagation != null) __obj.updateDynamic("stopPropagation")(js.Any.fromFunction0(stopPropagation))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetTouches != null) __obj.updateDynamic("targetTouches")(targetTouches.asInstanceOf[js.Any])
    if (timeStamp != null) __obj.updateDynamic("timeStamp")(timeStamp.asInstanceOf[js.Any])
    if (touches != null) __obj.updateDynamic("touches")(touches.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (!js.isUndefined(which)) __obj.updateDynamic("which")(which.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntheticEventData]
  }
}

