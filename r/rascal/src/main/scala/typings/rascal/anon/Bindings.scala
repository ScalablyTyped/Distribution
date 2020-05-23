package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bindings extends js.Object {
  var bindings: BindingKey
  var connection: Hostname
  var connectionStrategy: String
  var exchanges: Assert
  var publicationChannelPools: ConfirmPool
  var queues: AssertBoolean
}

object Bindings {
  @scala.inline
  def apply(
    bindings: BindingKey,
    connection: Hostname,
    connectionStrategy: String,
    exchanges: Assert,
    publicationChannelPools: ConfirmPool,
    queues: AssertBoolean
  ): Bindings = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], connectionStrategy = connectionStrategy.asInstanceOf[js.Any], exchanges = exchanges.asInstanceOf[js.Any], publicationChannelPools = publicationChannelPools.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bindings]
  }
}

