package typings
package sipDotJsLib.libSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Subscription", "Subscription")
@js.native
class Subscription protected ()
  extends sipDotJsLib.libClientContextMod.ClientContext {
  /**
    * Constructor.
    * @param ua User agent.
    * @param target Subscription target.
    * @param event Subscription event.
    * @param options Options bucket.
    */
  def this(ua: sipDotJsLib.libUAMod.UA, target: java.lang.String, event: java.lang.String) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, target: sipDotJsLib.libCoreMod.URI, event: java.lang.String) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, target: java.lang.String, event: java.lang.String, options: SubscriptionOptions) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, target: sipDotJsLib.libCoreMod.URI, event: java.lang.String, options: SubscriptionOptions) = this()
  var context: js.Any = js.native
  var disposed: js.Any = js.native
  var event: js.Any = js.native
  var expires: js.Any = js.native
  var extraHeaders: js.Any = js.native
  var id: js.Any = js.native
  var initContext: js.Any = js.native
  var retryAfterTimer: js.Any = js.native
  var subscription: js.Any = js.native
  var uri: js.Any = js.native
  /**
    * Gracefully terminate.
    */
  def close(): scala.Unit = js.native
  /**
    * Destructor.
    */
  def dispose(): scala.Unit = js.native
  @JSName("emit")
  def emit_accepted(
    event: sipDotJsLib.sipDotJsLibStrings.accepted,
    message: sipDotJsLib.libCoreMod.IncomingResponseMessage,
    cause: java.lang.String
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_failed(
    event: sipDotJsLib.sipDotJsLibStrings.failed,
    message: sipDotJsLib.libCoreMod.IncomingResponseMessage,
    cause: java.lang.String
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_notify(event: sipDotJsLib.sipDotJsLibStrings.notify, notification: sipDotJsLib.Anon_Request): scala.Boolean = js.native
  @JSName("emit")
  def emit_rejected(
    event: sipDotJsLib.sipDotJsLibStrings.rejected,
    message: sipDotJsLib.libCoreMod.IncomingResponseMessage,
    cause: java.lang.String
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_terminated(event: sipDotJsLib.sipDotJsLibStrings.terminated): scala.Boolean = js.native
  /* protected */ def onAccepted(response: sipDotJsLib.libCoreMessagesIncomingDashResponseMod.IncomingResponse): scala.Unit = js.native
  /* protected */ def onFailed(): scala.Unit = js.native
  /* protected */ def onFailed(response: sipDotJsLib.libCoreMessagesIncomingDashResponseMod.IncomingResponse): scala.Unit = js.native
  /* protected */ def onNotify(request: sipDotJsLib.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest): scala.Unit = js.native
  /* protected */ def onRefresh(request: sipDotJsLib.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest): scala.Unit = js.native
  /* protected */ def onTerminated(): scala.Unit = js.native
  /**
    * Registration of event listeners.
    *
    * The following events are emitted...
    *  - "accepted" A 200-class final response to a SUBSCRIBE request was received.
    *  - "failed" A non-200-class final response to a SUBSCRIBE request was received.
    *  - "rejected" Emitted immediately after a "failed" event (yes, it's redundant).
    *  - "notify" A NOTIFY request was received.
    *  - "terminated" The subscription is moving to or has moved to a terminated state.
    *
    * More than one SUBSCRIBE request may be sent, so "accepted", "failed" and "rejected"
    * may be emitted multiple times. However these event will NOT be emitted for SUBSCRIBE
    * requests with expires of zero (unsubscribe requests).
    *
    * Note that a "terminated" event does NOT indicate the subscription is in the "terminated"
    * state as described in RFC 6665. Instead, a "terminated" event indicates that this class
    * is no longer usable and/or is in the process of becoming no longer usable.
    *
    * The order the events are emitted in is not deterministic. Some examples...
    *  - "accepted" may occur multiple times
    *  - "accepted" may follow "notify" and "notify" may follow "accepted"
    *  - "terminated" may follow "accepted" and "accepted" may follow "terminated"
    *  - "terminated" may follow "notify" and "notify" may follow "terminated"
    *
    * Hint: Experience suggests one workable approach to utilizing these events
    * is to make use of "notify" and "terminated" only. That is, call `subscribe()`
    * and if a "notify" occurs then you have a subscription. If a "terminated"
    * event occurs then either a new subscription failed to be established or an
    * established subscription has terminated or is in the process of terminating.
    * Note that "notify" events may follow a "terminated" event, but experience
    * suggests it is reasonable to discontinue usage of this class after receipt
    * of a "terminated" event. The other events are informational, but as they do not
    * arrive in a deterministic manner it is difficult to make use of them otherwise.
    *
    * @param name Event name.
    * @param callback Callback.
    */
  @JSName("on")
  def on_accepted(
    name: sipDotJsLib.sipDotJsLibStrings.accepted,
    callback: js.Function2[
      /* message */ sipDotJsLib.libCoreMod.IncomingResponseMessage, 
      /* cause */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_failed(
    name: sipDotJsLib.sipDotJsLibStrings.failed,
    callback: js.Function2[
      /* message */ sipDotJsLib.libCoreMod.IncomingResponseMessage, 
      /* cause */ java.lang.String, 
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
      /* message */ sipDotJsLib.libCoreMod.IncomingResponseMessage, 
      /* cause */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_terminated(name: sipDotJsLib.sipDotJsLibStrings.terminated, callback: js.Function0[scala.Unit]): this.type = js.native
  def receiveResponse(): scala.Unit = js.native
  /**
    * Send a re-SUBSCRIBE request if there is an "active" subscription.
    */
  def refresh(): scala.Unit = js.native
  /**
    * Send an initial SUBSCRIBE request if no subscription.
    * Send a re-SUBSCRIBE request if there is an "active" subscription.
    */
  def subscribe(): this.type = js.native
  /**
    * Send a re-SUBSCRIBE request if there is a "pending" or "active" subscription.
    */
  def unsubscribe(): scala.Unit = js.native
}

