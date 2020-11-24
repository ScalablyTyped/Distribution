package typings.rsmqWorker.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends EventEmitter {
  
  def changeInterval(interval: js.Array[Double]): Client = js.native
  def changeInterval(interval: Double): Client = js.native
  
  def del(id: String): Client = js.native
  def del(id: String, cb: CallbackT[Unit]): Client = js.native
  
  def send(message: String): Client = js.native
  def send(message: String, cb: CallbackT[String]): Client = js.native
  def send(message: String, delay: js.UndefOr[scala.Nothing], cb: CallbackT[String]): Client = js.native
  def send(message: String, delay: Double): Client = js.native
  def send(message: String, delay: Double, cb: CallbackT[String]): Client = js.native
  
  def start(): Client = js.native
  
  def stop(): Client = js.native
}
