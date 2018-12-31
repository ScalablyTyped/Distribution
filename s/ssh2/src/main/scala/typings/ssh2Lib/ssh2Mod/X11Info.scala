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

