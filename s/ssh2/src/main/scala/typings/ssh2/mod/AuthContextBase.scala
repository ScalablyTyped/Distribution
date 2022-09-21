package typings.ssh2.mod

import typings.node.eventsMod.EventEmitter
import typings.ssh2.ssh2Strings.abort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthContextBase extends EventEmitter {
  
  /**
    * Accepts the authentication request.
    */
  def accept(): Unit = js.native
  
  /** The method of authentication. */
  var method: AuthenticationType = js.native
  
  /**
    * Emitted when the client aborts the authentication request.
    */
  @JSName("on")
  def on_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Rejects the authentication request.
    */
  def reject(): Unit = js.native
  def reject(authMethodsLeft: js.Array[AuthenticationType]): Unit = js.native
  def reject(authMethodsLeft: js.Array[AuthenticationType], isPartialSuccess: Boolean): Unit = js.native
  def reject(authMethodsLeft: Unit, isPartialSuccess: Boolean): Unit = js.native
  
  /** The service requesting authentication. */
  var service: String = js.native
  
  /** The client's username. */
  var username: String = js.native
}
