package typings.stompit.transactionMod

import typings.node.streamMod.Writable
import typings.stompit.clientMod.SendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends js.Object {
  
  def abort(): Unit = js.native
  def abort(options: SendOptions): Unit = js.native
  
  def commit(): Unit = js.native
  def commit(options: SendOptions): Unit = js.native
  
  def send(): Writable = js.native
  def send(headers: js.UndefOr[scala.Nothing], options: SendOptions): Writable = js.native
  def send(headers: js.Any): Writable = js.native
  def send(headers: js.Any, options: SendOptions): Writable = js.native
}
