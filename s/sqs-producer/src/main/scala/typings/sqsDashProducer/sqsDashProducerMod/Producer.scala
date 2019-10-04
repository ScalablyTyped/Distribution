package typings.sqsDashProducer.sqsDashProducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Producer extends js.Object {
  def queueSize(cb: ProducerCallback[Double]): Unit = js.native
  def send(messages: String, cb: ProducerCallback[Unit]): Unit = js.native
  def send(messages: js.Array[ProducerMessage | String], cb: ProducerCallback[Unit]): Unit = js.native
  def send(messages: ProducerMessage, cb: ProducerCallback[Unit]): Unit = js.native
}

