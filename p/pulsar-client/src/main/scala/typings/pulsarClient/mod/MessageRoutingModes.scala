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
  def CustomPartition: typings.pulsarClient.pulsarClientStrings.CustomPartition = "CustomPartition".asInstanceOf[typings.pulsarClient.pulsarClientStrings.CustomPartition]
  @scala.inline
  def RoundRobinPartition: typings.pulsarClient.pulsarClientStrings.RoundRobinPartition = "RoundRobinPartition".asInstanceOf[typings.pulsarClient.pulsarClientStrings.RoundRobinPartition]
  @scala.inline
  def SinglePartition: typings.pulsarClient.pulsarClientStrings.SinglePartition = "SinglePartition".asInstanceOf[typings.pulsarClient.pulsarClientStrings.SinglePartition]
}

