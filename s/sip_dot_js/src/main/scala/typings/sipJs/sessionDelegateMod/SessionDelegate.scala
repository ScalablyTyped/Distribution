package typings.sipJs.sessionDelegateMod

import typings.sipJs.byeMod.Bye
import typings.sipJs.coreMod.IncomingRequestMessage
import typings.sipJs.infoMod.Info
import typings.sipJs.messageMod.Message
import typings.sipJs.notificationMod.Notification
import typings.sipJs.referralMod.Referral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionDelegate extends js.Object {
  /**
    * Called upon receiving an incoming in dialog BYE request.
    * @param bye - The bye.
    */
  var onBye: js.UndefOr[js.Function1[/* bye */ Bye, Unit]] = js.undefined
  /**
    * Called upon receiving an incoming in dialog INFO request.
    * @param info - The info.
    */
  var onInfo: js.UndefOr[js.Function1[/* info */ Info, Unit]] = js.undefined
  /**
    * Called upon receiving an incoming in dialog INVITE request.
    * @param invite - The invite.
    */
  var onInvite: js.UndefOr[
    js.Function3[
      /* request */ IncomingRequestMessage, 
      /* response */ String, 
      /* statusCode */ Double, 
      Unit
    ]
  ] = js.undefined
  /**
    * Called upon receiving an incoming in dialog MESSAGE request.
    * @param message - The message.
    */
  var onMessage: js.UndefOr[js.Function1[/* message */ Message, Unit]] = js.undefined
  /**
    * Called upon receiving an incoming in dialog NOTIFY request.
    *
    * @remarks
    * If a refer is in progress notifications are delivered to the referrers delegate.
    *
    * @param notification - The notification.
    */
  var onNotify: js.UndefOr[js.Function1[/* notification */ Notification, Unit]] = js.undefined
  /**
    * Called upon receiving an incoming in dialog REFER request.
    * @param referral - The referral.
    */
  var onRefer: js.UndefOr[js.Function1[/* referral */ Referral, Unit]] = js.undefined
}

object SessionDelegate {
  @scala.inline
  def apply(
    onBye: /* bye */ Bye => Unit = null,
    onInfo: /* info */ Info => Unit = null,
    onInvite: (/* request */ IncomingRequestMessage, /* response */ String, /* statusCode */ Double) => Unit = null,
    onMessage: /* message */ Message => Unit = null,
    onNotify: /* notification */ Notification => Unit = null,
    onRefer: /* referral */ Referral => Unit = null
  ): SessionDelegate = {
    val __obj = js.Dynamic.literal()
    if (onBye != null) __obj.updateDynamic("onBye")(js.Any.fromFunction1(onBye))
    if (onInfo != null) __obj.updateDynamic("onInfo")(js.Any.fromFunction1(onInfo))
    if (onInvite != null) __obj.updateDynamic("onInvite")(js.Any.fromFunction3(onInvite))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    if (onNotify != null) __obj.updateDynamic("onNotify")(js.Any.fromFunction1(onNotify))
    if (onRefer != null) __obj.updateDynamic("onRefer")(js.Any.fromFunction1(onRefer))
    __obj.asInstanceOf[SessionDelegate]
  }
}

