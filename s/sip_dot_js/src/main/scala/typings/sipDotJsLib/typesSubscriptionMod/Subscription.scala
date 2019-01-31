package typings
package sipDotJsLib.typesSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/subscription", "Subscription")
@js.native
class Subscription protected ()
  extends sipDotJsLib.typesClientDashContextMod.ClientContext {
  def this(ua: sipDotJsLib.typesUaMod.UA, target: java.lang.String, event: java.lang.String, options: js.Any) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, target: sipDotJsLib.typesUriMod.URI, event: java.lang.String, options: js.Any) = this()
  def close(): scala.Unit = js.native
  def onDialogError(response: sipDotJsLib.typesSipDashMessageMod.IncomingResponse): scala.Unit = js.native
  @JSName("on")
  def on_accepted(
    name: sipDotJsLib.sipDotJsLibStrings.accepted,
    callback: js.Function2[
      /* response */ js.Any, 
      /* cause */ sipDotJsLib.typesConstantsMod.CNs.causes, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_failed(
    name: sipDotJsLib.sipDotJsLibStrings.failed,
    callback: js.Function2[
      /* response */ js.UndefOr[js.Any], 
      /* cause */ js.UndefOr[sipDotJsLib.typesConstantsMod.CNs.causes], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_notify(
    name: sipDotJsLib.sipDotJsLibStrings.notify,
    callback: js.Function1[/* notification */ Notification, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rejected(
    name: sipDotJsLib.sipDotJsLibStrings.rejected,
    callback: js.Function2[
      /* response */ js.UndefOr[js.Any], 
      /* cause */ js.UndefOr[sipDotJsLib.typesConstantsMod.CNs.causes], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_terminated(
    name: sipDotJsLib.sipDotJsLibStrings.terminated,
    callback: js.Function2[
      /* message */ js.UndefOr[js.Any], 
      /* cause */ js.UndefOr[sipDotJsLib.typesConstantsMod.CNs.causes], 
      scala.Unit
    ]
  ): this.type = js.native
  def receiveRequest(request: sipDotJsLib.typesSipDashMessageMod.IncomingRequest): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def subscribe(): Subscription = js.native
  def unsubscribe(): scala.Unit = js.native
}

