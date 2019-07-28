package typings.reactDashDom.testDashUtilsMod

import typings.std.Date
import typings.std.Event
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalEventProperties extends js.Object {
  var bubbles: js.UndefOr[Boolean] = js.undefined
  var cancelable: js.UndefOr[Boolean] = js.undefined
  var currentTarget: js.UndefOr[EventTarget] = js.undefined
  var defaultPrevented: js.UndefOr[Boolean] = js.undefined
  var eventPhase: js.UndefOr[Double] = js.undefined
  var isTrusted: js.UndefOr[Boolean] = js.undefined
  var nativeEvent: js.UndefOr[Event] = js.undefined
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
  var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
  var target: js.UndefOr[EventTarget] = js.undefined
  var timeStamp: js.UndefOr[Date] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object OptionalEventProperties {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    currentTarget: EventTarget = null,
    defaultPrevented: js.UndefOr[Boolean] = js.undefined,
    eventPhase: Int | Double = null,
    isTrusted: js.UndefOr[Boolean] = js.undefined,
    nativeEvent: Event = null,
    preventDefault: () => Unit = null,
    stopPropagation: () => Unit = null,
    target: EventTarget = null,
    timeStamp: Date = null,
    `type`: String = null
  ): OptionalEventProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget)
    if (!js.isUndefined(defaultPrevented)) __obj.updateDynamic("defaultPrevented")(defaultPrevented)
    if (eventPhase != null) __obj.updateDynamic("eventPhase")(eventPhase.asInstanceOf[js.Any])
    if (!js.isUndefined(isTrusted)) __obj.updateDynamic("isTrusted")(isTrusted)
    if (nativeEvent != null) __obj.updateDynamic("nativeEvent")(nativeEvent)
    if (preventDefault != null) __obj.updateDynamic("preventDefault")(js.Any.fromFunction0(preventDefault))
    if (stopPropagation != null) __obj.updateDynamic("stopPropagation")(js.Any.fromFunction0(stopPropagation))
    if (target != null) __obj.updateDynamic("target")(target)
    if (timeStamp != null) __obj.updateDynamic("timeStamp")(timeStamp)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OptionalEventProperties]
  }
}

