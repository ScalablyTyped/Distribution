package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var localIdentity: NameAddrHeader = js.native
  var method: java.lang.String = js.native
  var remoteIdentity: NameAddrHeader = js.native
  var request: OutgoingRequest = js.native
  var ua: UA = js.native
  def on(name: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_accepted(
    name: sipDotJsLib.sipDotJsLibStrings.accepted,
    callback: js.Function2[/* response */ IncomingMessage, /* cause */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_failed(
    name: sipDotJsLib.sipDotJsLibStrings.failed,
    callback: js.Function2[/* response */ IncomingMessage, /* cause */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_notify(
    name: sipDotJsLib.sipDotJsLibStrings.notify,
    callback: js.Function1[/* request */ IncomingRequest, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_progress(
    name: sipDotJsLib.sipDotJsLibStrings.progress,
    callback: js.Function2[/* response */ IncomingMessage, /* cause */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_rejected(
    name: sipDotJsLib.sipDotJsLibStrings.rejected,
    callback: js.Function2[/* response */ IncomingMessage, /* cause */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

