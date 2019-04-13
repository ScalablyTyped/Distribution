package typings
package stompitLib.libClientTransactionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  def abort(): scala.Unit = js.native
  def abort(options: stompitLib.libClientMod.SendOptions): scala.Unit = js.native
  def commit(): scala.Unit = js.native
  def commit(options: stompitLib.libClientMod.SendOptions): scala.Unit = js.native
  def send(): nodeLib.streamMod.Writable = js.native
  def send(headers: js.Any): nodeLib.streamMod.Writable = js.native
  def send(headers: js.Any, options: stompitLib.libClientMod.SendOptions): nodeLib.streamMod.Writable = js.native
}

