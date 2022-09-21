package typings.ssh2.mod

import typings.node.streamMod.Writable
import typings.ssh2.ssh2Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerChannel extends Channel {
  
  /** Indicates whether this is a server or client channel. */
  @JSName("server")
  var server_ServerChannel: `true` = js.native
  
  /** Standard error for the Channel. */
  @JSName("stderr")
  var stderr_ServerChannel: Writable = js.native
}
