package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthContextBase
  extends nodeLib.eventsMod.EventEmitter {
  /** The method of authentication. */
  var method: java.lang.String = js.native
  /** The service requesting authentication. */
  var service: java.lang.String = js.native
  /** The client's username. */
  var username: java.lang.String = js.native
  /**
    * Accepts the authentication request.
    */
  def accept(): scala.Unit = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def on(event: js.Symbol, listener: js.Function): this.type = js.native
  /**
    * Emitted when the client aborts the authentication request.
    */
  @JSName("on")
  def on_abort(event: ssh2Lib.ssh2LibStrings.abort, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  /**
    * Rejects the authentication request.
    */
  def reject(): scala.Unit = js.native
  def reject(authMethodsLeft: js.Array[java.lang.String]): scala.Unit = js.native
  def reject(authMethodsLeft: js.Array[java.lang.String], isPartialSuccess: scala.Boolean): scala.Unit = js.native
  /**
    * Rejects the authentication request.
    */
  def reject(isPartialSuccess: scala.Boolean): scala.Unit = js.native
}

