package typings.ssh2.mod

import typings.node.streamMod.Readable
import typings.ssh2.ssh2Booleans.`false`
import typings.ssh2.ssh2Strings.exit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientChannel extends Channel {
  
  /**
    * An `exit` event *may* (the SSH2 spec says it is optional) be emitted when the process
    * finishes. If the process finished normally, the process's return value is passed to
    * the `exit` callback.
    */
  @JSName("on")
  def on_exit(event: exit, listener: js.Function1[/* code */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_exit(
    event: exit,
    listener: js.Function4[/* code */ Null, /* signal */ String, /* dump */ String, /* desc */ String, Unit]
  ): this.type = js.native
  
  /** Indicates whether this is a server or client channel. */
  @JSName("server")
  var server_ClientChannel: `false` = js.native
  
  /** Standard error for the Channel. */
  @JSName("stderr")
  var stderr_ClientChannel: Readable = js.native
}
