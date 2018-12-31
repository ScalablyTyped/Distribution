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

