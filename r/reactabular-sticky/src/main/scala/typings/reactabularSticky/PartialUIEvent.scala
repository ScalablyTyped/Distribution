package typings.reactabularSticky

import typings.std.EventTarget
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.UIEvent> */
trait PartialUIEvent extends js.Object {
  var AT_TARGET: js.UndefOr[Double] = js.undefined
  var BUBBLING_PHASE: js.UndefOr[Double] = js.undefined
  var CAPTURING_PHASE: js.UndefOr[Double] = js.undefined
  var NONE: js.UndefOr[Double] = js.undefined
  var bubbles: js.UndefOr[Boolean] = js.undefined
  var cancelBubble: js.UndefOr[Boolean] = js.undefined
  var cancelable: js.UndefOr[Boolean] = js.undefined
  var composed: js.UndefOr[Boolean] = js.undefined
  var composedPath: js.UndefOr[js.Function0[js.Array[EventTarget]]] = js.undefined
  var currentTarget: js.UndefOr[EventTarget] = js.undefined
  var defaultPrevented: js.UndefOr[Boolean] = js.undefined
  var detail: js.UndefOr[Double] = js.undefined
  var eventPhase: js.UndefOr[Double] = js.undefined
  var initEvent: js.UndefOr[js.Function1[/* type */ String, Unit]] = js.undefined
  var isTrusted: js.UndefOr[Boolean] = js.undefined
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
  var returnValue: js.UndefOr[Boolean] = js.undefined
  var srcElement: js.UndefOr[EventTarget] = js.undefined
  var stopImmediatePropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
  var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
  var target: js.UndefOr[EventTarget] = js.undefined
  var timeStamp: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[Window_] = js.undefined
  var which: js.UndefOr[Double] = js.undefined
}

object PartialUIEvent {
  @scala.inline
  def apply(
    AT_TARGET: Int | Double = null,
    BUBBLING_PHASE: Int | Double = null,
    CAPTURING_PHASE: Int | Double = null,
    NONE: Int | Double = null,
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelBubble: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined,
    composedPath: () => js.Array[EventTarget] = null,
    currentTarget: EventTarget = null,
    defaultPrevented: js.UndefOr[Boolean] = js.undefined,
    detail: Int | Double = null,
    eventPhase: Int | Double = null,
    initEvent: /* type */ String => Unit = null,
    isTrusted: js.UndefOr[Boolean] = js.undefined,
    preventDefault: () => Unit = null,
    returnValue: js.UndefOr[Boolean] = js.undefined,
    srcElement: EventTarget = null,
    stopImmediatePropagation: () => Unit = null,
    stopPropagation: () => Unit = null,
    target: EventTarget = null,
    timeStamp: Int | Double = null,
    `type`: String = null,
    view: Window_ = null,
    which: Int | Double = null
  ): PartialUIEvent = {
    val __obj = js.Dynamic.literal()
    if (AT_TARGET != null) __obj.updateDynamic("AT_TARGET")(AT_TARGET.asInstanceOf[js.Any])
    if (BUBBLING_PHASE != null) __obj.updateDynamic("BUBBLING_PHASE")(BUBBLING_PHASE.asInstanceOf[js.Any])
    if (CAPTURING_PHASE != null) __obj.updateDynamic("CAPTURING_PHASE")(CAPTURING_PHASE.asInstanceOf[js.Any])
    if (NONE != null) __obj.updateDynamic("NONE")(NONE.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelBubble)) __obj.updateDynamic("cancelBubble")(cancelBubble.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (composedPath != null) __obj.updateDynamic("composedPath")(js.Any.fromFunction0(composedPath))
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultPrevented)) __obj.updateDynamic("defaultPrevented")(defaultPrevented.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (eventPhase != null) __obj.updateDynamic("eventPhase")(eventPhase.asInstanceOf[js.Any])
    if (initEvent != null) __obj.updateDynamic("initEvent")(js.Any.fromFunction1(initEvent))
    if (!js.isUndefined(isTrusted)) __obj.updateDynamic("isTrusted")(isTrusted.asInstanceOf[js.Any])
    if (preventDefault != null) __obj.updateDynamic("preventDefault")(js.Any.fromFunction0(preventDefault))
    if (!js.isUndefined(returnValue)) __obj.updateDynamic("returnValue")(returnValue.asInstanceOf[js.Any])
    if (srcElement != null) __obj.updateDynamic("srcElement")(srcElement.asInstanceOf[js.Any])
    if (stopImmediatePropagation != null) __obj.updateDynamic("stopImmediatePropagation")(js.Any.fromFunction0(stopImmediatePropagation))
    if (stopPropagation != null) __obj.updateDynamic("stopPropagation")(js.Any.fromFunction0(stopPropagation))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (timeStamp != null) __obj.updateDynamic("timeStamp")(timeStamp.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (which != null) __obj.updateDynamic("which")(which.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialUIEvent]
  }
}

