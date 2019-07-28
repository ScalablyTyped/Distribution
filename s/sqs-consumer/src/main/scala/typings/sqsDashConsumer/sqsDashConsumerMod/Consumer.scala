package typings.sqsDashConsumer.sqsDashConsumerMod

import typings.node.NodeJSNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Consumer extends EventEmitter {
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

