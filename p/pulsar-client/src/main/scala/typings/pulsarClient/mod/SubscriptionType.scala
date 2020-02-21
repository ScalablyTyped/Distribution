package typings.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pulsarClient.pulsarClientStrings.Exclusive
  - typings.pulsarClient.pulsarClientStrings.Shared
  - typings.pulsarClient.pulsarClientStrings.Failover
*/
trait SubscriptionType extends js.Object

object SubscriptionType {
  @scala.inline
  def Exclusive: typings.pulsarClient.pulsarClientStrings.Exclusive = this.cast("Exclusive")
  @scala.inline
  def Failover: typings.pulsarClient.pulsarClientStrings.Failover = this.cast("Failover")
  @scala.inline
  def Shared: typings.pulsarClient.pulsarClientStrings.Shared = this.cast("Shared")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

