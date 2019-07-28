package typings.ssh2DashStreams.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X11ForwardingConfig extends js.Object {
  /**
    * The X11 authentication cookie encoded in hexadecimal.
    */
  var cookie: String
  /**
    * The name of the X11 authentication method used (e.g. MIT-MAGIC-COOKIE-1).
    */
  var protocol: String
  /**
    * The screen number to forward X11 connections for.
    */
  var screen: Double
  /**
    * true if only a single connection should be forwarded.
    */
  var single: Boolean
}

object X11ForwardingConfig {
  @scala.inline
  def apply(cookie: String, protocol: String, screen: Double, single: Boolean): X11ForwardingConfig = {
    val __obj = js.Dynamic.literal(cookie = cookie, protocol = protocol, screen = screen, single = single)
  
    __obj.asInstanceOf[X11ForwardingConfig]
  }
}

