package typings.sipJs.simpleUserDelegateMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleUserDelegate extends js.Object {
  /**
    * Called when a call is answered.
    * @remarks
    * Callback for handling establishment of a new Session.
    */
  var onCallAnswered: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when a call is created.
    * @remarks
    * Callback for handling the creation of a new Session.
    */
  var onCallCreated: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when a call receives an incoming DTMF tone.
    * @remarks
    * Callback for handling an incoming INFO request with content type application/dtmf-relay.
    */
  var onCallDTMFReceived: js.UndefOr[js.Function2[/* tone */ String, /* duration */ Double, Unit]] = js.native
  /**
    * Called when a call is hung up.
    * @remarks
    * Callback for handling termination of a Session.
    */
  var onCallHangup: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when a call is put on hold or taken off hold.
    * @remarks
    * Callback for handling re-INVITE responses.
    */
  var onCallHold: js.UndefOr[js.Function1[/* held */ Boolean, Unit]] = js.native
  /**
    * Called when a call is received.
    * @remarks
    * Callback for handling incoming INVITE requests.
    * The callback must either accept or reject the incoming call by calling `answer()` or `decline()` respectively.
    */
  var onCallReceived: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called upon receiving a message.
    * @remarks
    * Callback for handling incoming MESSAGE requests.
    * @param message - The message received.
    */
  var onMessageReceived: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  /**
    * Called when user is registered to received calls.
    */
  var onRegistered: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when user is connected to server.
    * @remarks
    * Callback for handling user becomes connected.
    */
  var onServerConnect: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when user is no longer connected.
    * @remarks
    * Callback for handling user becomes disconnected.
    *
    * @param error - An Error if server caused the disconnect. Otherwise undefined.
    */
  var onServerDisconnect: js.UndefOr[js.Function1[/* error */ js.UndefOr[Error], Unit]] = js.native
  /**
    * Called when user is no longer registered to received calls.
    */
  var onUnregistered: js.UndefOr[js.Function0[Unit]] = js.native
}

object SimpleUserDelegate {
  @scala.inline
  def apply(): SimpleUserDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleUserDelegate]
  }
  @scala.inline
  implicit class SimpleUserDelegateOps[Self <: SimpleUserDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnCallAnswered(value: () => Unit): Self = this.set("onCallAnswered", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCallAnswered: Self = this.set("onCallAnswered", js.undefined)
    @scala.inline
    def setOnCallCreated(value: () => Unit): Self = this.set("onCallCreated", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCallCreated: Self = this.set("onCallCreated", js.undefined)
    @scala.inline
    def setOnCallDTMFReceived(value: (/* tone */ String, /* duration */ Double) => Unit): Self = this.set("onCallDTMFReceived", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnCallDTMFReceived: Self = this.set("onCallDTMFReceived", js.undefined)
    @scala.inline
    def setOnCallHangup(value: () => Unit): Self = this.set("onCallHangup", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCallHangup: Self = this.set("onCallHangup", js.undefined)
    @scala.inline
    def setOnCallHold(value: /* held */ Boolean => Unit): Self = this.set("onCallHold", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCallHold: Self = this.set("onCallHold", js.undefined)
    @scala.inline
    def setOnCallReceived(value: () => Unit): Self = this.set("onCallReceived", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCallReceived: Self = this.set("onCallReceived", js.undefined)
    @scala.inline
    def setOnMessageReceived(value: /* message */ String => Unit): Self = this.set("onMessageReceived", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMessageReceived: Self = this.set("onMessageReceived", js.undefined)
    @scala.inline
    def setOnRegistered(value: () => Unit): Self = this.set("onRegistered", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRegistered: Self = this.set("onRegistered", js.undefined)
    @scala.inline
    def setOnServerConnect(value: () => Unit): Self = this.set("onServerConnect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnServerConnect: Self = this.set("onServerConnect", js.undefined)
    @scala.inline
    def setOnServerDisconnect(value: /* error */ js.UndefOr[Error] => Unit): Self = this.set("onServerDisconnect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnServerDisconnect: Self = this.set("onServerDisconnect", js.undefined)
    @scala.inline
    def setOnUnregistered(value: () => Unit): Self = this.set("onUnregistered", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnUnregistered: Self = this.set("onUnregistered", js.undefined)
  }
  
}

