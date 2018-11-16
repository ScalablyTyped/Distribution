package typings
package promiseDashSftpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ConnTimeout extends js.Object {
  /**
           * Whether to attempt to automatically reconnect using the existing
           * config if the connection is unexpectedly closed. Auto-reconnection is
           * lazy, and so will wait until a command needs to be issued before
           * attempting to reconnect.
           */
  var autoReconnect: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * When using password-based user authentication, set this option to
           * handle password change requests. If this option isn't set, and the
           * server requests a password change, I haven't tested what will happen.
           */
  var changePassword: js.UndefOr[
    js.Function2[
      /* message */ java.lang.String, 
      /* language */ java.lang.String, 
      bluebirdLib.bluebirdMod.namespaced[java.lang.String]
    ]
  ] = js.undefined
  /** Alias for `readyTimeout` */
  var connTimeout: js.UndefOr[scala.Double] = js.undefined
  /** Alias for `keepaliveInterval` */
  var keepalive: js.UndefOr[scala.Double] = js.undefined
  /** Alias for `readyTimeout` */
  var pasvTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
           * Path and name of a file containing a private key as would be passed
           * to the privateKey option. If privateKey is also set, priority is
           * given to the privateKey option.
           */
  var privateKeyFile: js.UndefOr[java.lang.String] = js.undefined
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
      /* name */ java.lang.String, 
      /* instructions */ java.lang.String, 
      /* instructionsLang */ java.lang.String, 
      /* prompts */ js.Array[Anon_Prompt], 
      (js.Array[java.lang.String | bluebirdLib.bluebirdMod.namespaced[java.lang.String]]) | bluebirdLib.bluebirdMod.namespaced[js.Array[java.lang.String]]
    ]
  ] = js.undefined
  /** Alias for `username` */
  var user: js.UndefOr[java.lang.String] = js.undefined
}

