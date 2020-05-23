package typings.sipJs.simpleUserOptionsMod

import typings.sipJs.simpleUserDelegateMod.SimpleUserDelegate
import typings.sipJs.userAgentOptionsMod.UserAgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleUserOptions extends js.Object {
  /**
    * User's SIP Address of Record (AOR).
    * @remarks
    * The AOR is registered to receive incoming calls.
    * If not specified, a random anonymous address is created for the user.
    */
  var aor: js.UndefOr[String] = js.undefined
  /**
    * Delegate for SimpleUser.
    */
  var delegate: js.UndefOr[SimpleUserDelegate] = js.undefined
  /**
    * Media options.
    */
  var media: js.UndefOr[SimpleUserMedia] = js.undefined
  /**
    * Maximum number of times to attempt to reconnection.
    * @remarks
    * When the transport connection is lost (WebSocket disconnects),
    * reconnection will be attempted immediately. If that fails,
    * reconnection will be attempted again when the browser indicates
    * the application has come online. See:
    * https://developer.mozilla.org/en-US/docs/Web/API/NavigatorOnLine
    * @defaultValue 3
    */
  var reconnectionAttempts: js.UndefOr[Double] = js.undefined
  /**
    * Seconds to wait between reconnection attempts.
    * @defaultValue 4
    */
  var reconnectionDelay: js.UndefOr[Double] = js.undefined
  /**
    * Options for UserAgent.
    */
  var userAgentOptions: js.UndefOr[UserAgentOptions] = js.undefined
}

object SimpleUserOptions {
  @scala.inline
  def apply(
    aor: String = null,
    delegate: SimpleUserDelegate = null,
    media: SimpleUserMedia = null,
    reconnectionAttempts: js.UndefOr[Double] = js.undefined,
    reconnectionDelay: js.UndefOr[Double] = js.undefined,
    userAgentOptions: UserAgentOptions = null
  ): SimpleUserOptions = {
    val __obj = js.Dynamic.literal()
    if (aor != null) __obj.updateDynamic("aor")(aor.asInstanceOf[js.Any])
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectionAttempts)) __obj.updateDynamic("reconnectionAttempts")(reconnectionAttempts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectionDelay)) __obj.updateDynamic("reconnectionDelay")(reconnectionDelay.get.asInstanceOf[js.Any])
    if (userAgentOptions != null) __obj.updateDynamic("userAgentOptions")(userAgentOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleUserOptions]
  }
}

