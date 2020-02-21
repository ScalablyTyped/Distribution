package typings.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pulsarClient.pulsarClientStrings.RoundRobinPartition
  - typings.pulsarClient.pulsarClientStrings.SinglePartition
  - typings.pulsarClient.pulsarClientStrings.CustomPartition
*/
trait MessageRoutingModes extends js.Object

object MessageRoutingModes {
  @scala.inline
  def CustomPartition: typings.pulsarClient.pulsarClientStrings.CustomPartition = this.cast("CustomPartition")
  @scala.inline
  def RoundRobinPartition: typings.pulsarClient.pulsarClientStrings.RoundRobinPartition = this.cast("RoundRobinPartition")
  @scala.inline
  def SinglePartition: typings.pulsarClient.pulsarClientStrings.SinglePartition = this.cast("SinglePartition")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

