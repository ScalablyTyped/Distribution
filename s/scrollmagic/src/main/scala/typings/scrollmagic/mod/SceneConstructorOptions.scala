package typings.scrollmagic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneConstructorOptions extends js.Object {
  var duration: js.UndefOr[(js.Function0[Double | String]) | Double | String] = js.undefined
  var loglevel: js.UndefOr[LogLevel] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var triggerElement: js.UndefOr[ElementOrSelector | Null] = js.undefined
  var triggerHook: js.UndefOr[TriggerHook] = js.undefined
}

object SceneConstructorOptions {
  @scala.inline
  def apply(
    duration: (js.Function0[Double | String]) | Double | String = null,
    loglevel: LogLevel = null,
    offset: js.UndefOr[Double] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    triggerElement: js.UndefOr[Null | ElementOrSelector] = js.undefined,
    triggerHook: TriggerHook = null
  ): SceneConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (loglevel != null) __obj.updateDynamic("loglevel")(loglevel.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerElement)) __obj.updateDynamic("triggerElement")(triggerElement.asInstanceOf[js.Any])
    if (triggerHook != null) __obj.updateDynamic("triggerHook")(triggerHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneConstructorOptions]
  }
}

