package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ServerContext")
@js.native
class ServerContext () extends Context {
  def accept(): scala.Unit = js.native
  def accept(options: sipDotJsLib.sipDotJsMod.SessionNs.AcceptOptions): scala.Unit = js.native
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
  // This exists on all Context, but I cant make it work right
  @JSName("on")
  def on_progress(
    name: sipDotJsLib.sipDotJsLibStrings.progress,
    callback: js.Function2[/* response */ IncomingMessage, /* cause */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_referAccepted(
    name: sipDotJsLib.sipDotJsLibStrings.referAccepted,
    callback: js.Function1[/* ServerContext */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_referInviteSent(
    name: sipDotJsLib.sipDotJsLibStrings.referInviteSent,
    callback: js.Function1[/* ServerContext */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_referProgress(
    name: sipDotJsLib.sipDotJsLibStrings.referProgress,
    callback: js.Function1[/* ServerContext */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_referRejected(
    name: sipDotJsLib.sipDotJsLibStrings.referRejected,
    callback: js.Function1[/* ServerContext */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_referRequestAccepted(
    name: sipDotJsLib.sipDotJsLibStrings.referRequestAccepted,
    callback: js.Function1[/* ServerContext */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_referRequestRejected(
    name: sipDotJsLib.sipDotJsLibStrings.referRequestRejected,
    callback: js.Function1[/* ServerContext */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_rejected(
    name: sipDotJsLib.sipDotJsLibStrings.rejected,
    callback: js.Function2[/* response */ IncomingMessage, /* cause */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def progress(): scala.Unit = js.native
  def progress(options: sipDotJsLib.sipDotJsMod.SessionNs.ProgressOptions): scala.Unit = js.native
  def reject(): scala.Unit = js.native
  def reject(options: sipDotJsLib.sipDotJsMod.SessionNs.CommonOptions): scala.Unit = js.native
  def reply(): scala.Unit = js.native
  def reply(options: sipDotJsLib.sipDotJsMod.SessionNs.CommonOptions): scala.Unit = js.native
}

