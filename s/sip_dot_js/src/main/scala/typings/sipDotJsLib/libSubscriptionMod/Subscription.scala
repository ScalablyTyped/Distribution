package typings
package sipDotJsLib.libSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Subscription", "Subscription")
@js.native
class Subscription protected ()
  extends sipDotJsLib.libClientContextMod.ClientContext {
  def this(ua: sipDotJsLib.libUAMod.UA, target: java.lang.String, event: java.lang.String) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, target: sipDotJsLib.libURIMod.URI, event: java.lang.String) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, target: java.lang.String, event: java.lang.String, options: js.Any) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, target: sipDotJsLib.libURIMod.URI, event: java.lang.String, options: js.Any) = this()
  var contact: js.Any = js.native
  var createConfirmedDialog: js.Any = js.native
  var dialog: js.Any = js.native
  var errorCodes: js.Any = js.native
  var event: js.Any = js.native
  var expires: js.Any = js.native
  var extraHeaders: js.Any = js.native
  var failed: js.Any = js.native
  var id: js.Any = js.native
  var matchEvent: js.Any = js.native
  var requestedExpires: js.Any = js.native
  var state: js.Any = js.native
  var terminateDialog: js.Any = js.native
  var timer_fire: js.Any = js.native
  var timers: js.Any = js.native
  def close(): scala.Unit = js.native
  def onDialogError(response: sipDotJsLib.libSIPMessageMod.IncomingResponse): scala.Unit = js.native
  @JSName("on")
  def on_accepted(
    name: sipDotJsLib.sipDotJsLibStrings.accepted,
    callback: js.Function2[
      /* response */ js.Any, 
      /* cause */ sipDotJsLib.libConstantsMod.CNs.causes, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_failed(
    name: sipDotJsLib.sipDotJsLibStrings.failed,
    callback: js.Function2[
      /* messageOrResponse */ js.UndefOr[js.Any], 
      /* cause */ js.UndefOr[sipDotJsLib.libConstantsMod.CNs.causes], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_notify(
    name: sipDotJsLib.sipDotJsLibStrings.notify,
    callback: js.Function1[/* notification */ sipDotJsLib.Anon_Request, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rejected(
    name: sipDotJsLib.sipDotJsLibStrings.rejected,
    callback: js.Function2[
      /* messageOrResponse */ js.UndefOr[js.Any], 
      /* cause */ js.UndefOr[sipDotJsLib.libConstantsMod.CNs.causes], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_terminated(
    name: sipDotJsLib.sipDotJsLibStrings.terminated,
    callback: js.Function2[
      /* messageOrResponse */ js.UndefOr[js.Any], 
      /* cause */ js.UndefOr[sipDotJsLib.libConstantsMod.CNs.causes], 
      scala.Unit
    ]
  ): this.type = js.native
  def receiveRequest(request: sipDotJsLib.libSIPMessageMod.IncomingRequest): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def subscribe(): Subscription = js.native
  def unsubscribe(): scala.Unit = js.native
}

