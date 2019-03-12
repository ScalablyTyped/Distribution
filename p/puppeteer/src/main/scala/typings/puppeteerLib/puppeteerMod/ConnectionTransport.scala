package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionTransport extends js.Object {
  var onclose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onmessage: js.UndefOr[js.Function1[/* message */ java.lang.String, scala.Unit]] = js.undefined
  def close(): scala.Unit
  def send(message: java.lang.String): scala.Unit
}

object ConnectionTransport {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    send: java.lang.String => scala.Unit,
    onclose: () => scala.Unit = null,
    onmessage: /* message */ java.lang.String => scala.Unit = null
  ): ConnectionTransport = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), send = js.Any.fromFunction1(send))
    if (onclose != null) __obj.updateDynamic("onclose")(js.Any.fromFunction0(onclose))
    if (onmessage != null) __obj.updateDynamic("onmessage")(js.Any.fromFunction1(onmessage))
    __obj.asInstanceOf[ConnectionTransport]
  }
}

