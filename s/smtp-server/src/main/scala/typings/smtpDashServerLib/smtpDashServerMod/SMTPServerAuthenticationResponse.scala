package typings
package smtpDashServerLib.smtpDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SMTPServerAuthenticationResponse extends js.Object {
  /**
       * an object to return if XOAUTH2 authentication failed (do not set the error object in this case).
       * This value is serialized to JSON and base64 encoded automatically, so you can just return the object
       */
  var data: js.UndefOr[js.Object] = js.undefined
  /**
       * can be any value - if this is set then the user is considered logged in
       * and this value is used later with the session data to identify the user.
       * If this value is empty, then the authentication is considered failed
       */
  var user: js.Any
}

