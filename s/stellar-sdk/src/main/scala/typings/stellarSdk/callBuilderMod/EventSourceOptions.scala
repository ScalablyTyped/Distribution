package typings.stellarSdk.callBuilderMod

import typings.std.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSourceOptions[T] extends js.Object {
  var onerror: js.UndefOr[js.Function1[/* event */ MessageEvent, Unit]] = js.undefined
  var onmessage: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  var reconnectTimeout: js.UndefOr[Double] = js.undefined
}

object EventSourceOptions {
  @scala.inline
  def apply[T](
    onerror: /* event */ MessageEvent => Unit = null,
    onmessage: /* value */ T => Unit = null,
    reconnectTimeout: Int | Double = null
  ): EventSourceOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1(onerror))
    if (onmessage != null) __obj.updateDynamic("onmessage")(js.Any.fromFunction1(onmessage))
    if (reconnectTimeout != null) __obj.updateDynamic("reconnectTimeout")(reconnectTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceOptions[T]]
  }
}

