package typings.ssh2.mod

import typings.node.eventsMod.EventEmitter
import typings.ssh2.ssh2Strings.abort
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthContextBase extends EventEmitter {
  /** The method of authentication. */
  var method: String = js.native
  /** The service requesting authentication. */
  var service: String = js.native
  /** The client's username. */
  var username: String = js.native
  /**
    * Accepts the authentication request.
    */
  def accept(): Unit = js.native
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
    * Emitted when the client aborts the authentication request.
    */
  @JSName("on")
  def on_abort(event: abort, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  /**
    * Rejects the authentication request.
    */
  def reject(): Unit = js.native
  def reject(authMethodsLeft: js.Array[String]): Unit = js.native
  def reject(authMethodsLeft: js.Array[String], isPartialSuccess: Boolean): Unit = js.native
  /**
    * Rejects the authentication request.
    */
  def reject(isPartialSuccess: Boolean): Unit = js.native
}

