package typings.sipDotJs.libPlatformWebSimpleDashUserSimpleDashUserDashOptionsMod

import typings.sipDotJs.libApiUserDashAgentDashOptionsMod.UserAgentOptions
import typings.sipDotJs.libPlatformWebSimpleDashUserSimpleDashUserDashDelegateMod.SimpleUserDelegate
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
    userAgentOptions: UserAgentOptions = null
  ): SimpleUserOptions = {
    val __obj = js.Dynamic.literal()
    if (aor != null) __obj.updateDynamic("aor")(aor.asInstanceOf[js.Any])
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (userAgentOptions != null) __obj.updateDynamic("userAgentOptions")(userAgentOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleUserOptions]
  }
}

