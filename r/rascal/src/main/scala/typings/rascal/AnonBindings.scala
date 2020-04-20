package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBindings extends js.Object {
  var bindings: AnonBindingKey
  var connection: AnonHostname
  var connectionStrategy: String
  var exchanges: AnonAssert
  var publicationChannelPools: AnonConfirmPool
  var queues: AnonAssertBoolean
}

object AnonBindings {
  @scala.inline
  def apply(
    bindings: AnonBindingKey,
    connection: AnonHostname,
    connectionStrategy: String,
    exchanges: AnonAssert,
    publicationChannelPools: AnonConfirmPool,
    queues: AnonAssertBoolean
  ): AnonBindings = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], connectionStrategy = connectionStrategy.asInstanceOf[js.Any], exchanges = exchanges.asInstanceOf[js.Any], publicationChannelPools = publicationChannelPools.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBindings]
  }
}

