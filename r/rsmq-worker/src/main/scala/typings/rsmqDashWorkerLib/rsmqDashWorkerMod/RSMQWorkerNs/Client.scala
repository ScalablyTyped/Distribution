package typings
package rsmqDashWorkerLib.rsmqDashWorkerMod.RSMQWorkerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client
  extends eventsLib.eventsMod.EventEmitter {
  def changeInterval(interval: js.Array[scala.Double]): Client = js.native
  def changeInterval(interval: scala.Double): Client = js.native
  def del(id: java.lang.String): Client = js.native
  def del(id: java.lang.String, cb: CallbackT[scala.Unit]): Client = js.native
  def send(message: java.lang.String): Client = js.native
  def send(message: java.lang.String, cb: CallbackT[java.lang.String]): Client = js.native
  def send(message: java.lang.String, delay: scala.Double): Client = js.native
  def send(message: java.lang.String, delay: scala.Double, cb: CallbackT[java.lang.String]): Client = js.native
  def start(): Client = js.native
  def stop(): Client = js.native
}

