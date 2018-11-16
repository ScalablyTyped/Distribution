package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel
  extends nodeLib.streamMod.Duplex {
  /** If `true` only sends `EOF` when `end()` is called. */
  var allowHalfOpen: scala.Boolean = js.native
  /** Indicates whether this is a server or client channel. */
  var server: scala.Boolean = js.native
  /** Standard error for the Channel. */
  var stderr: nodeLib.streamMod.Readable | nodeLib.streamMod.Writable = js.native
  /** Standard input for the Channel. */
  var stdin: this.type = js.native
  /** Standard output for the Channel. */
  var stdout: this.type = js.native
  /** The channel subtype, usually "exec", "shell", or undefined. */
  var subtype: js.UndefOr[java.lang.String] = js.native
  /** The channel type, usually "session". */
  var `type`: js.UndefOr[java.lang.String] = js.native
  /**
       * Closes the channel on both sides.
       *
       * Returns false if you should wait for the continue event before sending any more traffic.
       */
  def close(): scala.Boolean = js.native
  /**
       * Sends EOF to the remote side.
       *
       * Returns false if you should wait for the continue event before sending any more traffic.
       */
  def eof(): scala.Boolean = js.native
}

