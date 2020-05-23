package typings.sipJs.simpleUserDelegateMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleUserDelegate extends js.Object {
  /**
    * Called when a call is answered.
    * @remarks
    * Callback for handling establishment of a new Session.
    */
  var onCallAnswered: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called when a call is created.
    * @remarks
    * Callback for handling the creation of a new Session.
    */
  var onCallCreated: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called when a call receives an incoming DTMF tone.
    * @remarks
    * Callback for handling an incoming INFO request with content type application/dtmf-relay.
    */
  var onCallDTMFReceived: js.UndefOr[js.Function2[/* tone */ String, /* duration */ Double, Unit]] = js.undefined
  /**
    * Called when a call is hung up.
    * @remarks
    * Callback for handling termination of a Session.
    */
  var onCallHangup: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called when a call is put on hold or taken off hold.
    * @remarks
    * Callback for handling re-INVITE responses.
    */
  var onCallHold: js.UndefOr[js.Function1[/* held */ Boolean, Unit]] = js.undefined
  /**
    * Called when a call is received.
    * @remarks
    * Callback for handling incoming INVITE requests.
    * The callback must either accept or reject the incoming call by calling `answer()` or `decline()` respectively.
    */
  var onCallReceived: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called upon receiving a message.
    * @remarks
    * Callback for handling incoming MESSAGE requests.
    * @param message - The message received.
    */
  var onMessageReceived: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  /**
    * Called when user is registered to received calls.
    */
  var onRegistered: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called when user is connected to server.
    * @remarks
    * Callback for handling user becomes connected.
    */
  var onServerConnect: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called when user is no longer connected.
    * @remarks
    * Callback for handling user becomes disconnected.
    *
    * @param error - An Error if server caused the disconnect. Otherwise undefined.
    */
  var onServerDisconnect: js.UndefOr[js.Function1[/* error */ js.UndefOr[Error], Unit]] = js.undefined
  /**
    * Called when user is no longer registered to received calls.
    */
  var onUnregistered: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SimpleUserDelegate {
  @scala.inline
  def apply(
    onCallAnswered: () => Unit = null,
    onCallCreated: () => Unit = null,
    onCallDTMFReceived: (/* tone */ String, /* duration */ Double) => Unit = null,
    onCallHangup: () => Unit = null,
    onCallHold: /* held */ Boolean => Unit = null,
    onCallReceived: () => Unit = null,
    onMessageReceived: /* message */ String => Unit = null,
    onRegistered: () => Unit = null,
    onServerConnect: () => Unit = null,
    onServerDisconnect: /* error */ js.UndefOr[Error] => Unit = null,
    onUnregistered: () => Unit = null
  ): SimpleUserDelegate = {
    val __obj = js.Dynamic.literal()
    if (onCallAnswered != null) __obj.updateDynamic("onCallAnswered")(js.Any.fromFunction0(onCallAnswered))
    if (onCallCreated != null) __obj.updateDynamic("onCallCreated")(js.Any.fromFunction0(onCallCreated))
    if (onCallDTMFReceived != null) __obj.updateDynamic("onCallDTMFReceived")(js.Any.fromFunction2(onCallDTMFReceived))
    if (onCallHangup != null) __obj.updateDynamic("onCallHangup")(js.Any.fromFunction0(onCallHangup))
    if (onCallHold != null) __obj.updateDynamic("onCallHold")(js.Any.fromFunction1(onCallHold))
    if (onCallReceived != null) __obj.updateDynamic("onCallReceived")(js.Any.fromFunction0(onCallReceived))
    if (onMessageReceived != null) __obj.updateDynamic("onMessageReceived")(js.Any.fromFunction1(onMessageReceived))
    if (onRegistered != null) __obj.updateDynamic("onRegistered")(js.Any.fromFunction0(onRegistered))
    if (onServerConnect != null) __obj.updateDynamic("onServerConnect")(js.Any.fromFunction0(onServerConnect))
    if (onServerDisconnect != null) __obj.updateDynamic("onServerDisconnect")(js.Any.fromFunction1(onServerDisconnect))
    if (onUnregistered != null) __obj.updateDynamic("onUnregistered")(js.Any.fromFunction0(onUnregistered))
    __obj.asInstanceOf[SimpleUserDelegate]
  }
}

