package typings.sqsProducer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Producer extends js.Object {
  
  def queueSize(cb: ProducerCallback[Double]): Unit = js.native
  
  def send(messages: String, cb: ProducerCallback[Unit]): Unit = js.native
  def send(messages: js.Array[ProducerMessage | String], cb: ProducerCallback[Unit]): Unit = js.native
  def send(messages: ProducerMessage, cb: ProducerCallback[Unit]): Unit = js.native
}
