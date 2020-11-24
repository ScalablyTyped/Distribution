package typings.ssh2.mod

import typings.node.streamMod.Duplex
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel extends Duplex {
  
  /** If `true` only sends `EOF` when `end()` is called. */
  var allowHalfOpen: Boolean = js.native
  
  /**
    * Closes the channel on both sides.
    *
    * Returns false if you should wait for the continue event before sending any more traffic.
    */
  def close(): Boolean = js.native
  
  /**
    * Sends EOF to the remote side.
    *
    * Returns false if you should wait for the continue event before sending any more traffic.
    */
  def eof(): Boolean = js.native
  
  /** Indicates whether this is a server or client channel. */
  var server: Boolean = js.native
  
  /** Standard error for the Channel. */
  var stderr: Readable | Writable = js.native
  
  /** Standard input for the Channel. */
  var stdin: this.type = js.native
  
  /** Standard output for the Channel. */
  var stdout: this.type = js.native
  
  /** The channel subtype, usually "exec", "shell", or undefined. */
  var subtype: js.UndefOr[String] = js.native
  
  /** The channel type, usually "session". */
  var `type`: js.UndefOr[String] = js.native
}
