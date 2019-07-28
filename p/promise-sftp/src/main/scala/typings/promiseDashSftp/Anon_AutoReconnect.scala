package typings.promiseDashSftp

import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoReconnect extends js.Object {
  /**
    * Whether to attempt to automatically reconnect using the existing
    * config if the connection is unexpectedly closed. Auto-reconnection is
    * lazy, and so will wait until a command needs to be issued before
    * attempting to reconnect.
    */
  var autoReconnect: js.UndefOr[Boolean] = js.undefined
  /**
    * When using password-based user authentication, set this option to
    * handle password change requests. If this option isn't set, and the
    * server requests a password change, I haven't tested what will happen.
    */
  var changePassword: js.UndefOr[js.Function2[/* message */ String, /* language */ String, ^[String]]] = js.undefined
  /** Alias for `readyTimeout` */
  var connTimeout: js.UndefOr[Double] = js.undefined
  /** Alias for `keepaliveInterval` */
  var keepalive: js.UndefOr[Double] = js.undefined
  /** Alias for `readyTimeout` */
  var pasvTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Path and name of a file containing a private key as would be passed
    * to the privateKey option. If privateKey is also set, priority is
    * given to the privateKey option.
    */
  var privateKeyFile: js.UndefOr[String] = js.undefined
  /**
    * Set this option to a function to try keyboard-interactive user
    * authentication if primary user authentication method fails.
    *
    * NOTE: This function may be called more than once, with the same or different prompts.
    * @param name - is generally what you'd use as a header or GUI window
    * title to describe the purpose of the `prompts`
    */
  var tryKeyboard: js.UndefOr[
    js.Function4[
      /* name */ String, 
      /* instructions */ String, 
      /* instructionsLang */ String, 
      /* prompts */ js.Array[Anon_Echo], 
      (js.Array[String | ^[String]]) | ^[js.Array[String]]
    ]
  ] = js.undefined
  /** Alias for `username` */
  var user: js.UndefOr[String] = js.undefined
}

object Anon_AutoReconnect {
  @scala.inline
  def apply(
    autoReconnect: js.UndefOr[Boolean] = js.undefined,
    changePassword: (/* message */ String, /* language */ String) => ^[String] = null,
    connTimeout: Int | Double = null,
    keepalive: Int | Double = null,
    pasvTimeout: Int | Double = null,
    privateKeyFile: String = null,
    tryKeyboard: (/* name */ String, /* instructions */ String, /* instructionsLang */ String, /* prompts */ js.Array[Anon_Echo]) => (js.Array[String | ^[String]]) | ^[js.Array[String]] = null,
    user: String = null
  ): Anon_AutoReconnect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect)
    if (changePassword != null) __obj.updateDynamic("changePassword")(js.Any.fromFunction2(changePassword))
    if (connTimeout != null) __obj.updateDynamic("connTimeout")(connTimeout.asInstanceOf[js.Any])
    if (keepalive != null) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (pasvTimeout != null) __obj.updateDynamic("pasvTimeout")(pasvTimeout.asInstanceOf[js.Any])
    if (privateKeyFile != null) __obj.updateDynamic("privateKeyFile")(privateKeyFile)
    if (tryKeyboard != null) __obj.updateDynamic("tryKeyboard")(js.Any.fromFunction4(tryKeyboard))
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Anon_AutoReconnect]
  }
}

