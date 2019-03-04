package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X11Info extends js.Object {
  /** The X11 authentication cookie encoded in hexadecimal. */
  var cookie: java.lang.String
  /** The name of the X11 authentication method used. */
  var protocol: java.lang.String
  /** The screen number for which to forward X11 connections. */
  var screen: scala.Double
  /** true if only a single connection should be forwarded. */
  var single: scala.Boolean
}

object X11Info {
  @scala.inline
  def apply(cookie: java.lang.String, protocol: java.lang.String, screen: scala.Double, single: scala.Boolean): X11Info = {
    val __obj = js.Dynamic.literal(cookie = cookie, protocol = protocol, screen = screen, single = single)
  
    __obj.asInstanceOf[X11Info]
  }
}

