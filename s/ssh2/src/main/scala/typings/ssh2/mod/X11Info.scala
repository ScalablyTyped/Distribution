package typings.ssh2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X11Info extends js.Object {
  /** The X11 authentication cookie encoded in hexadecimal. */
  var cookie: String
  /** The name of the X11 authentication method used. */
  var protocol: String
  /** The screen number for which to forward X11 connections. */
  var screen: Double
  /** true if only a single connection should be forwarded. */
  var single: Boolean
}

object X11Info {
  @scala.inline
  def apply(cookie: String, protocol: String, screen: Double, single: Boolean): X11Info = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[X11Info]
  }
}

