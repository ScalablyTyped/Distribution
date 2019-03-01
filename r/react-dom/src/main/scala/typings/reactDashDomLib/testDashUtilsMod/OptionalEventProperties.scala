package typings
package reactDashDomLib.testDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalEventProperties extends js.Object {
  var bubbles: js.UndefOr[scala.Boolean] = js.undefined
  var cancelable: js.UndefOr[scala.Boolean] = js.undefined
  var currentTarget: js.UndefOr[reactLib.EventTarget] = js.undefined
  var defaultPrevented: js.UndefOr[scala.Boolean] = js.undefined
  var eventPhase: js.UndefOr[scala.Double] = js.undefined
  var isTrusted: js.UndefOr[scala.Boolean] = js.undefined
  var nativeEvent: js.UndefOr[reactLib.Event] = js.undefined
  var preventDefault: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var stopPropagation: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var target: js.UndefOr[reactLib.EventTarget] = js.undefined
  var timeStamp: js.UndefOr[stdLib.Date] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object OptionalEventProperties {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    currentTarget: reactLib.EventTarget = null,
    defaultPrevented: js.UndefOr[scala.Boolean] = js.undefined,
    eventPhase: scala.Int | scala.Double = null,
    isTrusted: js.UndefOr[scala.Boolean] = js.undefined,
    nativeEvent: reactLib.Event = null,
    preventDefault: js.Function0[scala.Unit] = null,
    stopPropagation: js.Function0[scala.Unit] = null,
    target: reactLib.EventTarget = null,
    timeStamp: stdLib.Date = null,
    `type`: java.lang.String = null
  ): OptionalEventProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget)
    if (!js.isUndefined(defaultPrevented)) __obj.updateDynamic("defaultPrevented")(defaultPrevented)
    if (eventPhase != null) __obj.updateDynamic("eventPhase")(eventPhase.asInstanceOf[js.Any])
    if (!js.isUndefined(isTrusted)) __obj.updateDynamic("isTrusted")(isTrusted)
    if (nativeEvent != null) __obj.updateDynamic("nativeEvent")(nativeEvent)
    if (preventDefault != null) __obj.updateDynamic("preventDefault")(preventDefault)
    if (stopPropagation != null) __obj.updateDynamic("stopPropagation")(stopPropagation)
    if (target != null) __obj.updateDynamic("target")(target)
    if (timeStamp != null) __obj.updateDynamic("timeStamp")(timeStamp)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OptionalEventProperties]
  }
}

