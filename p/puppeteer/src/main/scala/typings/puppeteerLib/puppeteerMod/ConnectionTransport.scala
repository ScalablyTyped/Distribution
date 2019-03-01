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
    close: js.Function0[scala.Unit],
    send: js.Function1[java.lang.String, scala.Unit],
    onclose: js.Function0[scala.Unit] = null,
    onmessage: js.Function1[/* message */ java.lang.String, scala.Unit] = null
  ): ConnectionTransport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("send")(send)
    if (onclose != null) __obj.updateDynamic("onclose")(onclose)
    if (onmessage != null) __obj.updateDynamic("onmessage")(onmessage)
    __obj.asInstanceOf[ConnectionTransport]
  }
}

